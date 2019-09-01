package com.tiva11.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.tiva11.model.B1BusinessPlace;
import com.tiva11.model.B1Session;
import com.tiva11.model.Event;

public interface B1LoginVMIntf {
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
    void onBusinessPlaceChosen(int businessPlace);
    LiveData<Event<Command>> getCommand();
    LiveData<B1BusinessPlace.B1BusinessPlaces> getBusinessPlaces();

}

