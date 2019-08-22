package com.tiva11.b1s;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.tiva11.model.B1Activities;
import com.tiva11.model.B1Error;
import com.tiva11.model.B1Exception;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;

import retrofit2.Call;
import retrofit2.Response;

public class B1ActivitiesDataSourceImpl implements B1ActivitiesDataSourceIntf {
    private static final String TAG = "B1ActivitiesDataSourceImpl";
    private final B1LoginDataSourceIntf loginDataSource;
    private String b1Cookies(){return loginDataSource.getB1Session().getB1Cookies();}
    public B1ActivitiesDataSourceImpl(B1LoginDataSourceImpl loginDataSource) {
        this.loginDataSource = loginDataSource;
    }
    private B1ActivitiesRetrofitIntf _api = null;
    protected B1ActivitiesRetrofitIntf getApi() {
        if(_api == null) {
            _api = loginDataSource.getRetrofitClient().create(B1ActivitiesRetrofitIntf.class);
        }
        return _api;
    }
    public void queryActivitiesAsync(String filters,String select,
                                     @NonNull final MutableLiveData<B1Activities> mldActivities,
                                     @NonNull final MutableLiveData<Throwable> mldError) {
        try {
            getApi().queryAllActivities(b1Cookies())
            .handle((responseBody,e) -> handler(responseBody,e,mldActivities,mldError));
        } catch (Throwable e) {
            mldError.postValue(e instanceof CompletionException ? e.getCause() : e);
        }
}
    public static <T> T handler(T responseBody,Throwable e,MutableLiveData<T> mldOk,MutableLiveData<Throwable> mldError) {
        if(e == null && responseBody != null) mldOk.postValue(responseBody);
        else B1LoginDataSourceIntf.exceptionally(e,mldError);
        return responseBody;
    }
}
