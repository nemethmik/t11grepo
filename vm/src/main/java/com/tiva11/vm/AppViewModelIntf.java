package com.tiva11.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.tiva11.model.B1Activity;
import com.tiva11.model.B1BusinessPlace;
import com.tiva11.model.B1Document;
import com.tiva11.model.B1Session;
import com.tiva11.model.B1User;
import com.tiva11.model.Event;

public interface AppViewModelIntf {
    LiveData<B1Session> getLoginResult();
    LiveData<Integer> getLogoutResult();
    LiveData<Event<Throwable>> getError();
    MutableLiveData<String> getUserName();//These four are required bafore calling loginAsinc
    MutableLiveData<String> getPassword();
    MutableLiveData<String> getCompanyDB();
    MutableLiveData<String> getServerUrl();
    LiveData<String> getUserNameError();
    LiveData<String> getPasswordError();
    LiveData<Boolean> getProgressBarVisible();
    void onLoginAsync();//Before calling this, userName and password had to be streamed into the VM
    void onLogoutAsync();
    LiveData<B1BusinessPlace> getBusinessPlace();
    void onBusinessPlaceChosen(B1BusinessPlace businessPlace);
    LiveData<Event<NotificationsForUI>> getCommand();
    LiveData<B1BusinessPlace.B1BusinessPlaces> getBusinessPlaces();
    LiveData<B1Activity.B1Activities> getActivities();
    LiveData<B1User.B1Users> getUserDetail();
    LiveData<B1Document.B1Documents> getPurchaseOrders();
    void onQueryActivitiesAsync(String filters, String select);
    void onWelcomeScreenOpened();
}

