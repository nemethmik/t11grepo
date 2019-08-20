package com.tiva11.b1s;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.tiva11.model.B1Session;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class DataSourceRepository {
    private static volatile DataSourceRepository instance;
    private B1LoginDataSourceImpl loginDataSource = new B1LoginDataSourceImpl();
    public static DataSourceRepository getInstance() {
        if (instance == null) {
            instance = new DataSourceRepository();
        }
        return instance;
    }
    public B1LoginDataSourceIntf getLoginDS() {return loginDataSource;}
    private B1ActivitiesDataSourceImpl activitiesDataSource = null;
    public B1ActivitiesDataSourceIntf getActivitiesDS() {
        if(activitiesDataSource == null) activitiesDataSource = new B1ActivitiesDataSourceImpl(loginDataSource);
        return activitiesDataSource;
    }
    private static ScheduledExecutorService executorServiceThreadPool = Executors.newScheduledThreadPool(3);
    public static final int TIMEOUTINSECONDS = 10;
    public void loginAsync(@NonNull String serverUrl,@NonNull String username,@NonNull String password,@NonNull String companyDB,
                         @NonNull final MutableLiveData<B1Session> mldSession,
                         @NonNull final MutableLiveData<Throwable> mldError) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    B1Session session = getLoginDS().login(serverUrl,username,password,companyDB);
                    mldSession.postValue(session);
                } catch (Throwable e) {
                    mldError.postValue(e);
                }
            }
        };
        final Future scheduledJob = executorServiceThreadPool.schedule(r,0, TimeUnit.SECONDS);
        executorServiceThreadPool.schedule(new Runnable() {
            @Override public void run() { scheduledJob.cancel(true); }
        },TIMEOUTINSECONDS,TimeUnit.SECONDS);
        //It tries to kill the worker thread in a couple of seconds
        //Actually, it really kills the job and an interrupt exception is sent to the error handler via the mldError
    }

}
