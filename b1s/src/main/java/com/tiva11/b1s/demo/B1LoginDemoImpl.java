package com.tiva11.b1s.demo;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.tiva11.b1s.B1LoginDataSourceIntf;
import com.tiva11.model.B1BusinessPlace;
import com.tiva11.model.B1LoginRequest;
import com.tiva11.model.B1Session;
import com.tiva11.model.Event;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import retrofit2.Retrofit;

public class B1LoginDemoImpl implements B1LoginDataSourceIntf {
    private B1Session b1Session = new B1Session();
    public static void SleepAsync(int seconds) {
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
            SleepAsync(2);
            return b1Session;
        }).thenAccept(mldSession::postValue);
    }
    @Override
    public void logoutAsync(@NonNull MutableLiveData<Integer> mldLogoutResult, @NonNull MutableLiveData<Event<Throwable>> mldError) {
        b1Session._logoutSession();
        mldLogoutResult.postValue(201);
    }

    @Override
    public B1Session getB1Session() {
        return b1Session;
    }

    @Override
    public Retrofit getRetrofitClient() {
        throw new RuntimeException("Not implemented in Demo Data Sources");
    }
    @Override
    public void queryBusinessPlaces(@NonNull final MutableLiveData<B1BusinessPlace.B1BusinessPlaces> mldBusinessPlaces, @NonNull final MutableLiveData<Event<Throwable>> mldError){
        CompletableFuture.supplyAsync(()->{
            B1BusinessPlace.B1BusinessPlaces bp = new B1BusinessPlace.B1BusinessPlaces();
            bp.setValue(new ArrayList<>());
            bp.getValue().add(new B1BusinessPlace(1,"Budapest Branch"));
            bp.getValue().add(new B1BusinessPlace(2,"San Diego Branch"));
            bp.getValue().add(new B1BusinessPlace(3,"Bruxelles Branch"));
            return bp;
        }).thenAccept(mldBusinessPlaces::postValue);
    }

}
