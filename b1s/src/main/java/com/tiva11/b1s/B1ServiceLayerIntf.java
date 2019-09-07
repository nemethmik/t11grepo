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
import com.tiva11.model.B1Session;
import com.tiva11.model.B1User;
import com.tiva11.model.Event;

import java.io.IOException;

import retrofit2.HttpException;
import retrofit2.Retrofit;

public interface B1ServiceLayerIntf {
    void loginAsync(String serverUrl, String username, String password, String companyDB,
               @NonNull final MutableLiveData<B1Session> mldSession,
               @NonNull final MutableLiveData<Event<Throwable>> mldError);
    //This is synchronous, don't call it from the main UI thread
    //B1Session login(String serverUrl, String username, String password, String companyDB) throws IOException, B1Exception;
    void logoutAsync(@NonNull final MutableLiveData<Integer> mldLogoutResult, @NonNull final MutableLiveData<Event<Throwable>> mldError);
    void queryBusinessPlacesAsync(@NonNull final MutableLiveData<B1BusinessPlace.B1BusinessPlaces> mldBusinessPlaces, @NonNull final MutableLiveData<Event<Throwable>> mldError);
    void queryPurchaseOrdersAsync(String filter, String orderBy, @NonNull final MutableLiveData<B1Document.B1Documents> mldDocuments, @NonNull final MutableLiveData<Event<Throwable>> mldError);
    void queryUsersAsync(String filter, String orderBy, @NonNull final MutableLiveData<B1User.B1Users> mldUsers,@NonNull final MutableLiveData<Event<Throwable>> mldError);
    void queryActivitiesAsync(String filters,
                              @NonNull final MutableLiveData<B1Activity.B1Activities> mldActivities,
                              @NonNull final MutableLiveData<Event<Throwable>> mldError);
}
