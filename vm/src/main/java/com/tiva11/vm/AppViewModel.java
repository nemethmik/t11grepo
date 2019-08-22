package com.tiva11.vm;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import android.app.Application;
import android.util.Log;
import android.util.Patterns;

import com.tiva11.b1s.DataSourceRepository;
import com.tiva11.model.B1Activities;
import com.tiva11.model.B1Session;

// REMEMBER TO MAKE A VIEW MODEL CLASS PUBLIC OTHERWISE YOUR APPLICATION CRASHES
public class AppViewModel extends AndroidViewModel implements B1LoginVMIntf, B1ActivitiesVMIntf {
    private static final String TAG = "AppViewModel";
    private MutableLiveData<B1Session> mldLoginResult = new MutableLiveData<>();
    private MutableLiveData<Integer> mldLogoutResult = new MutableLiveData<>();
    private MutableLiveData<Throwable> mldError = new MutableLiveData<>();
    private MutableLiveData<String> mldUserName = new MutableLiveData<>();
    private MutableLiveData<String> mldPassword = new MutableLiveData<>();
    private MutableLiveData<String> mldUserNameError = new MutableLiveData<>();
    private MutableLiveData<String> mldPasswordError = new MutableLiveData<>();
    private MutableLiveData<Boolean> mldProgressBarVisible = new MutableLiveData<>();

    private void onLoginResultReceived(B1Session b1Session) {
        mldProgressBarVisible.setValue(false);
    }
    private void onLogoutResultReceived(Integer logoutResult) {
        mldProgressBarVisible.setValue(false);
    }
    private void onActivitesReceived(B1Activities b1Activities) {
        mldProgressBarVisible.setValue(false);
    }
    private void onErrorReceived(Throwable error) {
        mldProgressBarVisible.setValue(false);
    }
    // REMEMBER TO MAKE A VIEW MODEL CLASS CONSTRUCTOR PUBLIC OTHERWISE YOUR APPLICATION CRASHES
    public AppViewModel(@NonNull Application application) {
        super(application);
        //These observer are required only for real-time validation, otherwise they are not required at all
        mldUserName.observeForever(this::onUserNameChanged);
        mldPassword.observeForever(this::onPasswordChanged);
        mldLoginResult.observeForever(this::onLoginResultReceived);
        mldLogoutResult.observeForever(this::onLogoutResultReceived);
        mldActivities.observeForever(this::onActivitesReceived);
        mldError.observeForever(this::onErrorReceived);
        mldUserName.postValue("manager");
        mldPassword.postValue("123qwe");
        mldProgressBarVisible.postValue(false);
    }

    @Override public MutableLiveData<String> getUserName() {return mldUserName;}
    @Override public MutableLiveData<String> getPassword() {return mldPassword;}
    @Override public LiveData<String> getUserNameError() {return mldUserNameError;}
    @Override public LiveData<String> getPasswordError() {return mldPasswordError;}
    @Override public LiveData<Boolean> getProgressBarVisible() {return mldProgressBarVisible;}

    private void onUserNameChanged(String userName) {
        Log.i(TAG, "onUserNameChanged: " + userName);
        if (!isUserNameValid(userName)) {
            mldUserNameError.setValue(getApplication().getResources().getString(R.string.invalid_username));
        }
    }
    private void onPasswordChanged(String password) {
        Log.i(TAG, "onPasswordChanged: " + password);
        if (!isPasswordValid(password)) {
            mldPasswordError.setValue(getApplication().getResources().getString(R.string.invalid_password));
        }
    }

    private DataSourceRepository dataSourceRepository;

    // If user credentials will be cached in local storage, it is recommended it be encrypted
    // @see https://developer.android.com/training/articles/keystore

    AppViewModel setDataSourceRepository(DataSourceRepository dataSourceRepository) {
        this.dataSourceRepository = dataSourceRepository;
        return this;
    }
    @Override
    public LiveData<B1Session> getLoginResult() {
        return mldLoginResult;
    }
    @Override
    public LiveData<Integer> getLogoutResult() { return mldLogoutResult; }
    @Override
    public LiveData<Throwable> getError() {
        return mldError;
    }

    @Override
//    public void onLoginAsync(String username, String password) {
    public void onLoginAsync() {
//        dataSourceRepository.getLoginDS().onLoginAsync("http://192.168.103.206:50001/b1s/v1/", username, password,"SBODEMOUS"
//                ,mldLoginResult,mldError);
        String vtcServer = "http://192.168.103.206:50001/b1s/v1/";
        String companyDB = "SBODEMOHU";
        String username = getUserName().getValue();
        String password = getPassword().getValue();
        mldProgressBarVisible.setValue(true);
        dataSourceRepository.getLoginDS().loginAsync(vtcServer, username, password,"SBODEMOUS"
//        dataSourceRepository.getLoginDS().onLoginAsync(initServer, terra, pwd,"SBODEMOHU"
        ,mldLoginResult,mldError);
    }

    @Override
    public void onLogoutAsync() {
        mldProgressBarVisible.setValue(true);
        dataSourceRepository.getLoginDS().logoutAsync(mldLogoutResult,mldError);
    }

    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 3;
    }

    private MutableLiveData<B1Activities> mldActivities = new MutableLiveData<>();
    @Override public LiveData<B1Activities> getActivities() { return mldActivities; }
    @Override public void onQueryActivitiesAsync(String filters, String select) {
        mldProgressBarVisible.setValue(true);
        dataSourceRepository.getActivitiesDS().queryActivitiesAsync(filters,select,mldActivities,mldError);
    }
}
