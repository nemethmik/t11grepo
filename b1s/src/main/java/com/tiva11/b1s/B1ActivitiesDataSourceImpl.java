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

import static com.tiva11.b1s.B1LoginDataSourceImpl.getGson;

public class B1ActivitiesDataSourceImpl implements B1ActivitiesDataSourceIntf {
    private static final String TAG = "B1ActivitiesDataSourceImpl";
    private final B1LoginDataSourceImpl loginDataSource;
    private String b1Cookies(){return loginDataSource.getB1Session().getB1Cookies();}
    public B1ActivitiesDataSourceImpl(B1LoginDataSourceImpl loginDataSource) {
        this.loginDataSource = loginDataSource;
    }
    private B1ActivitiesRetrofitIntf _api = null;
    protected B1ActivitiesRetrofitIntf getApi() {
        if(_api == null) {
            _api = loginDataSource.getHttpClient(null).create(B1ActivitiesRetrofitIntf.class);
        }
        return _api;
    }
    public void queryActivitiesAsync(String filters,String select,
                                     @NonNull final MutableLiveData<B1Activities> mldActivities,
                                     @NonNull final MutableLiveData<Throwable> mldError) {
            CompletableFuture.supplyAsync(() -> executeQuery(getApi().queryAllActivities(b1Cookies())))
            .handle((a,e) -> handler(a,e,mldActivities,mldError));
    }
    public static <T> T handler(T a,Throwable e,MutableLiveData<T> mldOk,MutableLiveData<Throwable> mldError) {
        if(e == null && a != null) mldOk.postValue(a);
        else mldError.postValue(e instanceof CompletionException ? e.getCause() : e);
        return a;
    }
    public static <T> T executeQuery(Call<T> call) throws CompletionException {
//        throw new CompletionException(new Exception("ERROR"));
        try {
            Response<T> response = call.execute();//May throw IOException
            if (response.isSuccessful() && response.body() != null) {
                return response.body();
            } else {
                if (response.errorBody() != null) {
                    //May throw IOException
                    B1Error b1Error = getGson().fromJson(response.errorBody().string(), B1Error.class);
                    if (b1Error != null) {
                        throw new CompletionException(new B1Exception(b1Error, response.code(), response.message()));
                    }
                }
                throw new CompletionException(new B1Exception(new B1Error(), response.code(), response.message()));
            }
        } catch (IOException e) {//This doesn'' catch CompletionExceptions
            throw new CompletionException(e);
        }
    }
}
