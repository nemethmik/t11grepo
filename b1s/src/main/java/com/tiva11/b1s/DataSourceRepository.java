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
}
