package com.tiva11.vm;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import android.app.Application;
import android.util.Patterns;

import com.tiva11.b1s.DataSourceRepoIntf;
import com.tiva11.model.B1Activities;
import com.tiva11.model.B1BusinessPlace;
import com.tiva11.model.B1Session;
import com.tiva11.model.Event;

// REMEMBER TO MAKE A VIEW MODEL CLASS PUBLIC OTHERWISE YOUR APPLICATION CRASHES
public class AppViewModel extends AndroidViewModel implements B1LoginVMIntf, B1ActivitiesVMIntf {
    private static final String TAG = "AppViewModel";
    private MutableLiveData<B1Session> mldLoginResult = new MutableLiveData<>();
    private MutableLiveData<Integer> mldLogoutResult = new MutableLiveData<>();
    private MutableLiveData<Event<Throwable>> mldError = new MutableLiveData<>();
    private MutableLiveData<Event<Command>> mldCommand = new MutableLiveData<>();
    private MutableLiveData<String> mldUserName = new MutableLiveData<>();
    private MutableLiveData<String> mldPassword = new MutableLiveData<>();
    private MutableLiveData<String> mldCompanyDB = new MutableLiveData<>();
    private MutableLiveData<String> mldServerUrl = new MutableLiveData<>();
    private MutableLiveData<String> mldUserNameError = new MutableLiveData<>();
    private MutableLiveData<String> mldPasswordError = new MutableLiveData<>();
    private MutableLiveData<Boolean> mldProgressBarVisible = new MutableLiveData<>();


    private void onLoginResultReceived(B1Session b1Session) {
        mldBusinessPlace.setValue(null);
        mldBusinessPlaces.setValue(null);
        getDataSourceRepository().getLoginDS().queryBusinessPlaces(mldBusinessPlaces,mldError);
//        mldProgressBarVisible.setValue(false);
    }
    private void onLogoutResultReceived(Integer logoutResult) {
        mldProgressBarVisible.setValue(false);
        mldBusinessPlace.setValue(null);
    }
    private void onActivitesReceived(B1Activities b1Activities) {
        mldProgressBarVisible.setValue(false);
    }
    private void onBusinessPlacesReceived(B1BusinessPlace.B1BusinessPlaces businessPlaces) {
        if(businessPlaces != null) {
            mldProgressBarVisible.setValue(false);
            if (businessPlaces.getValue() != null && businessPlaces.getValue().size() > 1) {
                mldCommand.setValue(new Event<>(Command.LogInOKPickBranch));
            } else {
                mldCommand.setValue(new Event<>(Command.LogInOKNoNeedToPickBranchProceedToWelcomeScreen));
            }
        }
    }
    private void onErrorReceived(Event<Throwable> error) {
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
        mldBusinessPlaces.observeForever(this::onBusinessPlacesReceived);
        mldError.observeForever(this::onErrorReceived);
        mldServerUrl.postValue("http://192.168.103.206:50001/b1s/v1/");
        mldCompanyDB.postValue("SBODEMOUS");
        mldUserName.postValue("manager");
        mldPassword.postValue("123qwe");
        mldProgressBarVisible.postValue(false);
    }

    @Override public MutableLiveData<String> getUserName() {return mldUserName;}
    @Override public MutableLiveData<String> getPassword() {return mldPassword;}
    @Override public MutableLiveData<String> getCompanyDB() {return mldCompanyDB;}
    @Override public MutableLiveData<String> getServerUrl() {return mldServerUrl;}
    @Override public LiveData<String> getUserNameError() {return mldUserNameError;}
    @Override public LiveData<String> getPasswordError() {return mldPasswordError;}
    @Override public LiveData<Boolean> getProgressBarVisible() {return mldProgressBarVisible;}

    private void onUserNameChanged(String userName) {
        mldUserNameError.setValue(isUserNameValid(userName) ? null : getApplication().getResources().getString(R.string.invalid_username));
    }
    private void onPasswordChanged(String password) {
        mldPasswordError.setValue(isPasswordValid(password) ? null : getApplication().getResources().getString(R.string.invalid_password));
    }

    private DataSourceRepoIntf _dataSourceRepository;
    private DataSourceRepoIntf getDataSourceRepository() {
        if(_dataSourceRepository == null) {
            mldError.setValue(new Event<>(new Exception("Data Source Repository Not Initialized")));
        }
        return _dataSourceRepository;
    }

    // If user credentials will be cached in local storage, it is recommended it be encrypted
    // @see https://developer.android.com/training/articles/keystore

    AppViewModel setDataSourceRepository(DataSourceRepoIntf dataSourceRepository) {
        this._dataSourceRepository = dataSourceRepository;
        return this;
    }
    @Override
    public LiveData<B1Session> getLoginResult() {
        return mldLoginResult;
    }
    @Override
    public LiveData<Integer> getLogoutResult() { return mldLogoutResult; }
    @Override
    public LiveData<Event<Command>> getCommand() { return mldCommand; }
    @Override
    public LiveData<Event<Throwable>> getError() {
        return mldError;
    }

    @Override
//    public void onLoginAsync(String username, String password) {
    public void onLoginAsync() {
        String companyDB = getCompanyDB().getValue();
        String username = getUserName().getValue();
        String password = getPassword().getValue();
        String serverUrl = getServerUrl().getValue();
        mldProgressBarVisible.setValue(true);
        if(getDataSourceRepository() != null) {
            getDataSourceRepository().getLoginDS().loginAsync(serverUrl, username, password, companyDB, mldLoginResult, mldError);
        }
    }

    @Override
    public void onLogoutAsync() {
        mldProgressBarVisible.setValue(true);
        if(getDataSourceRepository() != null) {
            getDataSourceRepository().getLoginDS().logoutAsync(mldLogoutResult, mldError);
        }
    }
    private MutableLiveData<B1BusinessPlace> mldBusinessPlace = new MutableLiveData<>();
    @Override
    public LiveData<B1BusinessPlace> getBusinessPlace() {
        return mldBusinessPlace;
    }

    @Override
    public void onBusinessPlaceChosen(int businessPlace) {
        if(getBusinessPlaces().getValue() != null && getBusinessPlaces().getValue().getValue() != null) {
            for (B1BusinessPlace bp : getBusinessPlaces().getValue().getValue()) {
                if (bp.getBPLID() == businessPlace) {
                    mldBusinessPlace.setValue(bp);
                    mldCommand.setValue(new Event<>(Command.BranchPickedProceedToWelcomeScreen));
                    return;
                }
            }
            mldError.setValue(new Event<>(new Exception("No business places found with ID " + businessPlace)));
        } else mldError.setValue(new Event<>(new Exception("No business places are available")));
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
    private MutableLiveData<B1BusinessPlace.B1BusinessPlaces> mldBusinessPlaces = new MutableLiveData<>();
    @Override public LiveData<B1BusinessPlace.B1BusinessPlaces> getBusinessPlaces() { return mldBusinessPlaces; }
    private MutableLiveData<B1Activities> mldActivities = new MutableLiveData<>();
    @Override public LiveData<B1Activities> getActivities() { return mldActivities; }
    @Override public void onQueryActivitiesAsync(String filters, String select) {
        mldProgressBarVisible.setValue(true);
        if(getDataSourceRepository() != null) {
            getDataSourceRepository().getActivitiesDS().queryActivitiesAsync(filters, select, mldActivities, mldError);
        }
    }
}
