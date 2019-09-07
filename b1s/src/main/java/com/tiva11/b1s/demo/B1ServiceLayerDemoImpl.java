package com.tiva11.b1s.demo;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.tiva11.b1s.B1ServiceLayerIntf;
import com.tiva11.model.B1Activity;
import com.tiva11.model.B1BusinessPlace;
import com.tiva11.model.B1Document;
import com.tiva11.model.B1LoginRequest;
import com.tiva11.model.B1Session;
import com.tiva11.model.B1User;
import com.tiva11.model.Event;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class B1ServiceLayerDemoImpl implements B1ServiceLayerIntf {
    private B1Session b1Session = new B1Session();

    @Override
    public void queryUsersAsync(String filter, String orderBy, @NonNull MutableLiveData<B1User.B1Users> mldUsers, @NonNull MutableLiveData<Event<Throwable>> mldError) {
        mldError.postValue(new Event<>(new Exception("queryUsersAsync Not implemented")));
    }

    @Override
    public void queryActivitiesAsync(String filters, @NonNull MutableLiveData<B1Activity.B1Activities> mldActivities, @NonNull MutableLiveData<Event<Throwable>> mldError) {
        mldError.postValue(new Event<>(new Exception("queryUsersAsync Not implemented")));
    }

    public static void sleepAsync(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
    @Override
    public void loginAsync(String serverUrl, String username, String password, String companyDB, @NonNull MutableLiveData<B1Session> mldSession, @NonNull MutableLiveData<Event<Throwable>> mldError) {
        b1Session._setSession(serverUrl,new B1LoginRequest(username,password,companyDB));
        b1Session.setSessionTimeout(30);
        b1Session.setSessionId(Long.toString(new Date().getTime()));
        CompletableFuture.supplyAsync(()->{
            sleepAsync(2);
            return b1Session;
        }).thenAccept(mldSession::postValue);
    }
    @Override
    public void logoutAsync(@NonNull MutableLiveData<Integer> mldLogoutResult, @NonNull MutableLiveData<Event<Throwable>> mldError) {
        b1Session._logoutSession();
        mldLogoutResult.postValue(201);
    }
    public B1Session getB1Session() {
        return b1Session;
    }

    @Override
    public void queryBusinessPlacesAsync(@NonNull final MutableLiveData<B1BusinessPlace.B1BusinessPlaces> mldBusinessPlaces, @NonNull final MutableLiveData<Event<Throwable>> mldError){
        try {
            final boolean add3BusinessPlaces = getB1Session().getLoginRequest().getUserName().equalsIgnoreCase("manager");
            CompletableFuture.supplyAsync(() -> {
                B1BusinessPlace.B1BusinessPlaces bp = new B1BusinessPlace.B1BusinessPlaces();
                bp.setValue(new ArrayList<>());
                if (add3BusinessPlaces) {
                    bp.getValue().add(new B1BusinessPlace(1, "Budapest Branch"));
                    bp.getValue().add(new B1BusinessPlace(2, "San Diego Branch"));
                    bp.getValue().add(new B1BusinessPlace(3, "Bruxelles Branch"));
                }
                return bp;
            }).thenAccept(mldBusinessPlaces::postValue);
        } catch(Throwable t) {
            mldError.postValue(new Event<>(t));
        }
    }
    @Override
    public void queryPurchaseOrdersAsync(String filter, String orderBy, @NonNull MutableLiveData<B1Document.B1Documents> mldDocuments, @NonNull MutableLiveData<Event<Throwable>> mldError) {
        mldError.postValue(new Event<>(new Exception("queryPurchaseOrdersAsync Not implemented")));
    }

}
