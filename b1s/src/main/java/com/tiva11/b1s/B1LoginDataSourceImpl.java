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
    /*
    * Only the first user has to define the server url, subsequent calls can simply call
    * with null argument.
     */
    @Override
    public void loginAsync(final String serverUrl, String username, String password, String companyDB,
                           @NonNull final MutableLiveData<B1Session> mldSession,
                           @NonNull final MutableLiveData<Throwable> mldError) {
        Throwable anyError = null;
        try {
            final B1LoginRequest lr = new B1LoginRequest();
            lr.setCompanyDB(companyDB);
            lr.setUserName(username);
            lr.setPassword(password);
            Call<B1Session> call = getApi(serverUrl).login(lr);
            Log.i(TAG, "login: " + serverUrl + "DB = " + lr.getCompanyDB());
            call.enqueue(new Callback<B1Session>() {
                @Override
                public void onResponse(Call<B1Session> call, Response<B1Session> response) {
                    Throwable anyError = null;
                    if (response.isSuccessful() && response.body() != null) {
                        B1LoginDataSourceImpl.this.b1Session = response.body();
                        B1LoginDataSourceImpl.this.b1Session._setSession(serverUrl,lr);
                        mldSession.postValue(B1LoginDataSourceImpl.this.b1Session);
                    } else {
                        if (response.errorBody() != null) {
                            try { //It's interesting that errorBody().string is declared with throws IOException, funny
                                B1Error b1Error = getGson().fromJson(response.errorBody().string(), B1Error.class);
                                if (b1Error != null) {
                                    anyError = new B1Exception(b1Error,response.code(),response.message());
                                } else {
                                    anyError = new Exception(response.errorBody().string(),new HttpException(response));
                                }
                            } catch (IOException e) {
                                anyError = e;
                            }
                        } else {
                            anyError = new Exception("No error body in failed response",new HttpException(response));
                        }
                    }
                    if(anyError != null) mldError.postValue(anyError);
                }
                @Override
                public void onFailure(Call<B1Session> call, Throwable t) {
                    mldError.postValue(t);
                }
            });
        } catch(Throwable t) {
            anyError = t;
        }
        if(anyError != null) {
            //anyError.printStackTrace();
            mldError.postValue(anyError);
        }
    }
    /*
     *  Don't call this function on the UI thread. Call it from a Runnable or Callable.
     */
    @Override
    public B1Session login(@NonNull String serverUrl,@NonNull String username,@NonNull String password,@NonNull String companyDB)
        throws IOException, B1Exception {
        final B1LoginRequest lr = new B1LoginRequest(username,password,companyDB);
        Call<B1Session> call = getApi(serverUrl).login(lr);
        //Log.i(TAG, "login: " + serverUrl + "DB = " + lr.getCompanyDB());
        Response<B1Session> response = call.execute();
        if (response.isSuccessful() && response.body() != null) {
            this.b1Session = response.body();
            this.b1Session._setSession(serverUrl,lr);
            return this.b1Session;
        } else {
            if (response.errorBody() != null) {
                B1Error b1Error = getGson().fromJson(response.errorBody().string(), B1Error.class);
                if (b1Error != null) {
                    throw new B1Exception(b1Error,response.code(),response.message());
                }
            }
            throw  new B1Exception(new B1Error(), response.code(),response.message());
        }
    }

    @Override
    public void logoutAsync(@NonNull final MutableLiveData<Integer> mldLogoutResult,
                       @NonNull final MutableLiveData<Throwable> mldError) {
        try {
            CompletableFuture.supplyAsync(() -> {
                try {
                    Log.i(TAG, "logoutAsync: B1 Cookies " + b1Session.getB1Cookies());
                    Call<Void> call = getApi(null).logout(b1Session.getB1Cookies());
                    Response<Void> response = call.execute();
                    if (response.isSuccessful()) {
                        b1Session._logoutSession();
                        return response.code();
                    } else {
                        if (response.errorBody() != null) {
                            B1Error b1Error = getGson().fromJson(response.errorBody().string(), B1Error.class);
                            if (b1Error != null) {
                                throw new CompletionException(new B1Exception(b1Error, response.code(), response.message()));
                            }
                        }
                        throw new CompletionException(new B1Exception(new B1Error(), response.code(), response.message()));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new CompletionException(e);
                }
            })
            .thenApply((httpStatusCode) -> {
                mldLogoutResult.postValue(httpStatusCode);
                return 0;
            });
        } catch(Throwable e) {
            if(e instanceof CompletionException) {
                e = e.getCause();
            }
            mldError.postValue(e);
        }
    }
}
