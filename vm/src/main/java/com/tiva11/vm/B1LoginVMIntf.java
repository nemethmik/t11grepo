package com.tiva11.vm;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.tiva11.model.B1Session;

public interface B1LoginVMIntf {
    LiveData<B1Session> getLoginResult();
    LiveData<Integer> getLogoutResult();
    LiveData<Throwable> getError();
    MutableLiveData<String> getUserName();//These four are required bafore calling loginAsinc
    MutableLiveData<String> getPassword();
    MutableLiveData<String> getCompanyDB();
    MutableLiveData<String> getServerUrl();
    LiveData<String> getUserNameError();
    LiveData<String> getPasswordError();
    LiveData<Boolean> getProgressBarVisible();
    void onLoginAsync();//Before calling this, userName and password had to be streamed into the VM
    void onLogoutAsync();
}

