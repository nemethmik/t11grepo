package com.tiva11.b1s;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.tiva11.b1s.demo.B1LoginDemoImpl;
import com.tiva11.model.B1Session;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class DataSourceRepository implements DataSourceRepoIntf {
    private static volatile DataSourceRepoIntf instance;
    private B1LoginDataSourceIntf loginDataSource = new B1LoginDataSourceImpl();
    public static DataSourceRepoIntf getInstance(boolean demo) {
        if (instance == null) {
            if (demo) {
                instance = new DataSourceRepository.Demo();
            } else {
                instance = new DataSourceRepository();
            }
        }
        return instance;
    }
    public B1LoginDataSourceIntf getLoginDS() {return loginDataSource;}
    private B1ActivitiesDataSourceImpl activitiesDataSource = null;
    public B1ActivitiesDataSourceIntf getActivitiesDS() {
        if(activitiesDataSource == null) activitiesDataSource = new B1ActivitiesDataSourceImpl(loginDataSource);
        return activitiesDataSource;
    }
    public static class Demo implements DataSourceRepoIntf {
        @Override public B1LoginDataSourceIntf getLoginDS(){
            return new B1LoginDemoImpl();
        }
        @Override
        public B1ActivitiesDataSourceIntf getActivitiesDS() {
            return null;
        }
    }
}
