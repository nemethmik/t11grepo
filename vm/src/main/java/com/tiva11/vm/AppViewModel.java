package com.tiva11.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import android.util.Patterns;

import com.tiva11.b1s.DataSourceRepository;
import com.tiva11.model.B1Activities;
import com.tiva11.model.B1Session;

class AppViewModel extends ViewModel implements B1LoginVMIntf, B1ActivitiesVMIntf {

    private MutableLiveData<B1LoginVMIntf.LoginFormState> mldLoginFormState = new MutableLiveData<>();
    private MutableLiveData<B1Session> mldLoginResult = new MutableLiveData<>();
    private MutableLiveData<Integer> mldLogoutResult = new MutableLiveData<>();
    private MutableLiveData<Throwable> mldError = new MutableLiveData<>();
    private DataSourceRepository dataSourceRepository;

    // If user credentials will be cached in local storage, it is recommended it be encrypted
    // @see https://developer.android.com/training/articles/keystore

    AppViewModel setDataSourceRepository(DataSourceRepository dataSourceRepository) {
        this.dataSourceRepository = dataSourceRepository;
        return this;
    }
    @Override
    public LiveData<B1LoginVMIntf.LoginFormState> getLoginFormState() {
        return mldLoginFormState;
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
    public void loginAsync(String username, String password) {
//        dataSourceRepository.getLoginDS().loginAsync("http://192.168.103.206:50001/b1s/v1/", username, password,"SBODEMOUS"
//                ,mldLoginResult,mldError);
        String vtcServer = "http://192.168.103.206:50001/b1s/v1/";
        String companyDB = "SBODEMOHU";
        dataSourceRepository.getLoginDS().loginAsync(vtcServer, username, password,"SBODEMOUS"
//        dataSourceRepository.getLoginDS().loginAsync(initServer, terra, pwd,"SBODEMOHU"
        ,mldLoginResult,mldError);
    }
    @Override
    public void loginDataChanged(String username, String password) {
        if (!isUserNameValid(username)) {
            mldLoginFormState.setValue(new B1LoginVMIntf.LoginFormState(R.string.invalid_username, null));
        } else if (!isPasswordValid(password)) {
            mldLoginFormState.setValue(new B1LoginVMIntf.LoginFormState(null, R.string.invalid_password));
        } else {
            mldLoginFormState.setValue(new B1LoginVMIntf.LoginFormState(true));
        }
    }

    @Override
    public void logoutAsync() {
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
        return password != null;// && password.trim().length() > 5;
    }

    private MutableLiveData<B1Activities> mldActivities = new MutableLiveData<>();
    @Override public LiveData<B1Activities> getActivities() { return mldActivities; }
    @Override public void queryActivitiesAsync(String filters, String select) {
        dataSourceRepository.getActivitiesDS().queryActivitiesAsync(filters,select,mldActivities,mldError);
    }
}
