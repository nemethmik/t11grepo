package com.tiva11.b1s;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tiva11.model.B1Activity;
import com.tiva11.model.B1BusinessPlace;
import com.tiva11.model.B1Document;
import com.tiva11.model.B1Error;
import com.tiva11.model.B1Exception;
import com.tiva11.model.B1LoginRequest;
import com.tiva11.model.B1Session;
import com.tiva11.model.B1User;
import com.tiva11.model.Event;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.HttpException;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class B1ServiceLayerImpl implements B1ServiceLayerIntf {
    private static final String TAG = "B1ServiceLayerImpl";
    private Retrofit _httpClient = null;
    private static OkHttpClient createOkHttpClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .build();
    }
    private String b1Cookies(){return getB1Session().getB1Cookies();}

    /*
     * Only the first user has to define the server url, subsequent calls can simply call
     * with null argument.
     */
    public Retrofit getRetrofitClient(){
        if(_httpClient == null) throw new RuntimeException("No B1 Server URL Defined. Not logged in");
        return _httpClient;
    }
    private Retrofit initRetrofitClient(@NonNull final String serverUrl) {
        if(_httpClient == null) {
            OkHttpClient okHttpClient = createOkHttpClient();
            _httpClient = new Retrofit.Builder().baseUrl(serverUrl)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(getGson()))
                    .build();
        }
        return _httpClient;
    }
    private B1RetrofitIntf _api = null;
    private B1RetrofitIntf getRetrofitApiForLogin(final String serverUrl) {
        if(_api == null) {
            _api = initRetrofitClient(serverUrl).create(B1RetrofitIntf.class);
        }
        return _api;
    }
    private B1RetrofitIntf getApi() {
        if(_api == null) throw new RuntimeException("No Retrofit Interface Initialized");
        return _api;
    }
    private B1Session b1Session = null;
    public B1Session getB1Session() {
        if(b1Session == null) throw new RuntimeException("No B1 Session");
        return b1Session;
    }
    // STATIC UTILITIES SECTION
    final static Gson theGson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    public static Gson getGson() {return theGson;}
    public static <T> T exceptionally(Throwable e,@NonNull final MutableLiveData<Event<Throwable>> mldError) {
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
        mldError.postValue(new Event<>(e));
        return null;
    }
    public static <T> T handler(T responseBody,Throwable e,MutableLiveData<T> mldOk,MutableLiveData<Event<Throwable>> mldError) {
        if(e == null && responseBody != null) mldOk.postValue(responseBody);
        else exceptionally(e,mldError);
        return responseBody;
    }

    @Override
    public void loginAsync(@NonNull final String serverUrl, @NonNull String username,
                           @NonNull String password, @NonNull String companyDB,
                                   @NonNull final MutableLiveData<B1Session> mldSession,
                                   @NonNull final MutableLiveData<Event<Throwable>> mldError) {
        try {
            final B1LoginRequest lr = new B1LoginRequest(username,password, companyDB);
            getRetrofitApiForLogin(serverUrl).login(lr)
            .thenAccept(responseBody -> {
                this.b1Session = responseBody;
                b1Session._setSession(serverUrl,lr);
                mldSession.postValue(b1Session);
            })
            .exceptionally(e -> exceptionally(e,mldError));
        } catch (Throwable e) {
            mldError.postValue(new Event<>(e instanceof CompletionException ? e.getCause() : e));
        }
    }
    @Override
    public void logoutAsync(@NonNull final MutableLiveData<Integer> mldLogoutResult,
                            @NonNull final MutableLiveData<Event<Throwable>> mldError) {
        try {
            CompletableFuture<Void> call = getApi().logout(getB1Session().getB1Cookies());
            call.thenAccept((v) -> {
                b1Session._logoutSession();
                mldLogoutResult.postValue(200);
            }).exceptionally((e) -> {
                mldError.postValue(new Event<>(e instanceof CompletionException ? e.getCause() : e));
                return null;
            });
        } catch (Throwable e) {
            mldError.postValue(new Event<>(e instanceof CompletionException ? e.getCause() : e));
        }
    }
    @Override
    public void queryBusinessPlacesAsync(@NonNull final MutableLiveData<B1BusinessPlace.B1BusinessPlaces> mldBusinessPlaces, @NonNull final MutableLiveData<Event<Throwable>> mldError) {
        //http://hana93srv:50001/b1s/v1/BusinessPlaces?$filter=Disabled eq 'tNO'
        //mldError.postValue(new Event<>(new Exception("queryBusinessPlacesAsync Not implemented")));
        try {
            getApi().queryBusinessPlaces(b1Cookies(),"Disabled eq 'tNO'",null)
                    .handle((responseBody,e) -> handler(responseBody,e,mldBusinessPlaces,mldError));
        } catch (Throwable e) {
            mldError.postValue(new Event<>(e instanceof CompletionException ? e.getCause() : e));
        }
    }

    @Override
    public void queryUsersAsync(String filter, String orderBy, @NonNull MutableLiveData<B1User.B1Users> mldUsers, @NonNull MutableLiveData<Event<Throwable>> mldError) {
        try {
            getApi().queryUsers(b1Cookies(),filter,orderBy)
                    .handle((responseBody,e) -> handler(responseBody,e,mldUsers,mldError));
        } catch (Throwable e) {
            mldError.postValue(new Event<>(e instanceof CompletionException ? e.getCause() : e));
        }
    }

    @Override
    public void queryPurchaseOrdersAsync(String filter, String orderBy, @NonNull MutableLiveData<B1Document.B1Documents> mldDocuments, @NonNull MutableLiveData<Event<Throwable>> mldError) {
        try {
            getApi().queryProductionOrders(b1Cookies(),filter,orderBy)
                    .handle((responseBody,e) -> handler(responseBody,e,mldDocuments,mldError));
        } catch (Throwable e) {
            mldError.postValue(new Event<>(e instanceof CompletionException ? e.getCause() : e));
        }
    }
    @Override
    public void queryActivitiesAsync(String filters,
                                     @NonNull final MutableLiveData<B1Activity.B1Activities> mldActivities,
                                     @NonNull final MutableLiveData<Event<Throwable>> mldError) {
        try {
            getApi().queryActivities(b1Cookies(),filters,"StartDate")
                    .handle((responseBody,e) -> handler(responseBody,e,mldActivities,mldError));
        } catch (Throwable e) {
            mldError.postValue(new Event<>(e instanceof CompletionException ? e.getCause() : e));
        }
    }

}
