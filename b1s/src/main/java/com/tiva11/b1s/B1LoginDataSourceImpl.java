package com.tiva11.b1s;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tiva11.model.B1Error;
import com.tiva11.model.B1Exception;
import com.tiva11.model.B1LoginRequest;
import com.tiva11.model.B1Session;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class B1LoginDataSourceImpl implements B1LoginDataSourceIntf {
    private static final String TAG = "B1LoginDataSourceImpl";
    private Retrofit _httpClient = null;
    private static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    public static Gson getGson() {return gson;}
    private static OkHttpClient createOkHttpClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .build();
    }

    /*
     * Only the first user has to define the server url, subsequent calls can simply call
     * with null argument.
     */
    Retrofit getHttpClient(final String serverUrl) {
        if(_httpClient == null) {
            if(serverUrl == null) throw new RuntimeException("No B1 Server URL Defined. Not logged in");
            OkHttpClient okHttpClient = createOkHttpClient();
            _httpClient = new Retrofit.Builder().baseUrl(serverUrl)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return _httpClient;
    }
    private B1LoginRetrofitIntf _api = null;
    private B1LoginRetrofitIntf getApi(final String serverUrl) {
        if(_api == null) {
            _api = getHttpClient(serverUrl).create(B1LoginRetrofitIntf.class);
        }
        return _api;
    }
    private B1Session b1Session = null;
    public B1Session getB1Session() {
        if(b1Session == null) throw new RuntimeException("No B1 Session");
        return b1Session;
    }
    public static <T> T exceptionally(Throwable e,@NonNull final MutableLiveData<Throwable> mldError) {
        if(e instanceof HttpException || e.getCause() instanceof HttpException) {
            try {
                HttpException httpException = e instanceof HttpException ? (HttpException)e : (HttpException)e.getCause();
                B1Error b1Error = getGson().fromJson(httpException.response().errorBody().string(), B1Error.class);
                if (b1Error != null) {
                    throw new B1Exception(b1Error,httpException.response().code(), httpException.response().message());
                }
            } catch(Throwable t){
                e = t;
            }
        }
        mldError.postValue(e);
        return null;
    }

    @Override
    public void loginAsync(@NonNull final String serverUrl, @NonNull String username,
                           @NonNull String password, @NonNull String companyDB,
                                   @NonNull final MutableLiveData<B1Session> mldSession,
                                   @NonNull final MutableLiveData<Throwable> mldError) {
        try {
            final B1LoginRequest lr = new B1LoginRequest(username,password, companyDB);
            getApi(serverUrl).login(lr)
            .thenAccept(responseBody -> {
                this.b1Session = responseBody;
                b1Session._setSession(serverUrl,lr);
                mldSession.postValue(b1Session);
            })
            .exceptionally(e -> exceptionally(e,mldError));
        } catch (Throwable e) {
            mldError.postValue(e instanceof CompletionException ? e.getCause() : e);
        }
    }
    @Override
    public void logoutAsync(@NonNull final MutableLiveData<Integer> mldLogoutResult,
                            @NonNull final MutableLiveData<Throwable> mldError) {
        try {
            CompletableFuture<Void> call = getApi(null).logout(getB1Session().getB1Cookies());
            call.thenAccept((v) -> {
                b1Session._logoutSession();
                mldLogoutResult.postValue(200);
            }).exceptionally((e) -> {
                mldError.postValue(e instanceof CompletionException ? e.getCause() : e);
                return null;
            });
        } catch (Throwable e) {
            mldError.postValue(e instanceof CompletionException ? e.getCause() : e);
        }
    }
}
