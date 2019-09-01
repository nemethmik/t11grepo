package com.tiva11.b1s;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tiva11.model.B1BusinessPlace;
import com.tiva11.model.B1Error;
import com.tiva11.model.B1Exception;
import com.tiva11.model.B1Session;
import com.tiva11.model.Event;

import java.io.IOException;

import retrofit2.HttpException;
import retrofit2.Retrofit;

public interface B1LoginDataSourceIntf {
    void loginAsync(String serverUrl, String username, String password, String companyDB,
               @NonNull final MutableLiveData<B1Session> mldSession,
               @NonNull final MutableLiveData<Event<Throwable>> mldError);
    //This is synchronous, don't call it from the main UI thread
    //B1Session login(String serverUrl, String username, String password, String companyDB) throws IOException, B1Exception;
    void logoutAsync(@NonNull final MutableLiveData<Integer> mldLogoutResult, @NonNull final MutableLiveData<Event<Throwable>> mldError);
    void queryBusinessPlaces(@NonNull final MutableLiveData<B1BusinessPlace.B1BusinessPlaces> mldBusinessPlaces,@NonNull final MutableLiveData<Event<Throwable>> mldError);
    B1Session getB1Session();
    Retrofit getRetrofitClient();
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
}
