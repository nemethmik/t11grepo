package com.tiva11.vm;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import android.app.Application;
import android.util.Patterns;

import com.tiva11.b1s.B1ServiceLayerIntf;
import com.tiva11.model.B1Activity;
import com.tiva11.model.B1BusinessPlace;
import com.tiva11.model.B1Document;
import com.tiva11.model.B1Session;
import com.tiva11.model.B1User;
import com.tiva11.model.Event;

// REMEMBER TO MAKE A VIEW MODEL CLASS PUBLIC OTHERWISE YOUR APPLICATION CRASHES
public class AppViewModelImpl extends AndroidViewModel implements AppViewModelIntf {
    private static final String TAG = "AppViewModelImpl";
    private MutableLiveData<B1Session> mldLoginResult = new MutableLiveData<>();
    @Override
    public LiveData<B1User.B1Users> getUserDetail() { return mldUserDetail; }
    @Override
    public LiveData<B1Document.B1Documents> getPurchaseOrders() { return mldPurchaseOrders; }
    private MutableLiveData<Integer> mldLogoutResult = new MutableLiveData<>();
    private MutableLiveData<Event<Throwable>> mldError = new MutableLiveData<>();
    private MutableLiveData<Event<NotificationsForUI>> mldCommand = new MutableLiveData<>();
    private MutableLiveData<String> mldUserName = new MutableLiveData<>();
    private MutableLiveData<String> mldPassword = new MutableLiveData<>();
    private MutableLiveData<String> mldCompanyDB = new MutableLiveData<>();
    private MutableLiveData<String> mldServerUrl = new MutableLiveData<>();
    private MutableLiveData<String> mldUserNameError = new MutableLiveData<>();
    private MutableLiveData<String> mldPasswordError = new MutableLiveData<>();
    private MutableLiveData<Boolean> mldProgressBarVisible = new MutableLiveData<>();
    private MutableLiveData<B1User.B1Users> mldUserDetail = new MutableLiveData<>();//It has only one user

    private void onUserDetailReceived(B1User.B1Users userDetail) {
        if(userDetail != null) {
            //TODO: If user is assigned only one Branch query that branch
            b1s().queryBusinessPlacesAsync(mldBusinessPlaces, mldError);
        }
    }
    private void onLoginResultReceived(B1Session b1Session) {
        mldBusinessPlace.setValue(null);
        mldBusinessPlaces.setValue(null);
        mldUserDetail.setValue(null);
        mldActivities.setValue(null);
        mldPurchaseOrders.setValue(null);
        b1s().queryUsersAsync("UserCode eq '" + mldUserName.getValue() + "'",null, mldUserDetail,mldError);
//        mldProgressBarVisible.setValue(false);
    }
    private void onLogoutResultReceived(Integer logoutResult) {
        mldProgressBarVisible.setValue(false);
        mldBusinessPlace.setValue(null);
    }
    private void onActivitesReceived(B1Activity.B1Activities b1Activities) {
        if(b1Activities != null) {
            mldCommand.setValue(new Event<>(NotificationsForUI.ProgressInfo_TasksDataArrived));
            prepareDataForWelcomeScreen();
        }
    }
    void prepareDataForWelcomeScreen(){
        if(mldPurchaseOrders.getValue() != null && mldActivities.getValue() != null) {
            //TODO: process purchase orders and tasks for welcome screen
            mldProgressBarVisible.setValue(false);
            mldCommand.setValue(new Event<>(NotificationsForUI.ShowOpenPurchaseOrdersTasksAndPendingTransactions));
        }
    }
    private void onPurchaseOrdersReceived(B1Document.B1Documents documents) {
        if(documents != null) {
            mldCommand.setValue(new Event<>(NotificationsForUI.ProgressInfo_PurchaseOrdersDataArrived));
            prepareDataForWelcomeScreen();
        }
    }
    private void onBusinessPlacesReceived(B1BusinessPlace.B1BusinessPlaces businessPlaces) {
        if(businessPlaces != null) {
            mldProgressBarVisible.setValue(false);
            if (businessPlaces.getValue() != null && businessPlaces.getValue().size() > 1) {
                mldCommand.setValue(new Event<>(NotificationsForUI.LogInOKPickBranch));
            } else {
                mldCommand.setValue(new Event<>(NotificationsForUI.LogInOKNoNeedToPickBranchProceedToWelcomeScreen));
            }
        }
    }
    private void onErrorReceived(Event<Throwable> error) {
        mldProgressBarVisible.setValue(false);
    }
    // REMEMBER TO MAKE A VIEW MODEL CLASS CONSTRUCTOR PUBLIC OTHERWISE YOUR APPLICATION CRASHES
    public AppViewModelImpl(@NonNull Application application) {
        super(application);
        //These observer are required only for real-time validation, otherwise they are not required at all
        mldUserName.observeForever(this::onUserNameChanged);
        mldPassword.observeForever(this::onPasswordChanged);
        mldLoginResult.observeForever(this::onLoginResultReceived);
        mldLogoutResult.observeForever(this::onLogoutResultReceived);
        mldActivities.observeForever(this::onActivitesReceived);
        mldBusinessPlaces.observeForever(this::onBusinessPlacesReceived);
        mldPurchaseOrders.observeForever(this::onPurchaseOrdersReceived);
        mldUserDetail.observeForever(this::onUserDetailReceived);
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

    // If user credentials will be cached in local storage, it is recommended it be encrypted
    // @see https://developer.android.com/training/articles/keystore
    private B1ServiceLayerIntf _b1SeriviceLayer;
    AppViewModelImpl setB1ServiceLayer(B1ServiceLayerIntf b1ServiceLayer) {
        this._b1SeriviceLayer = b1ServiceLayer;
        return this;
    }
    B1ServiceLayerIntf b1s(){
        if(_b1SeriviceLayer == null) mldError.setValue(new Event<>(new Exception("Service Layer not Initialized")));
        return _b1SeriviceLayer;
    }
    @Override
    public LiveData<B1Session> getLoginResult() {
        return mldLoginResult;
    }
    @Override
    public LiveData<Integer> getLogoutResult() { return mldLogoutResult; }
    @Override
    public LiveData<Event<NotificationsForUI>> getCommand() { return mldCommand; }
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
        //Login is the typical first call, so protect it
        if(b1s() != null) {
            b1s().loginAsync(serverUrl, username, password, companyDB, mldLoginResult, mldError);
        }
    }

    @Override
    public void onLogoutAsync() {
        mldProgressBarVisible.setValue(true);
        b1s().logoutAsync(mldLogoutResult, mldError);
    }
    private MutableLiveData<B1BusinessPlace> mldBusinessPlace = new MutableLiveData<>();
    @Override
    public LiveData<B1BusinessPlace> getBusinessPlace() {
        return mldBusinessPlace;
    }

    @Override
    public void onBusinessPlaceChosen(B1BusinessPlace businessPlace) {
        if(businessPlace != null) {
            mldBusinessPlace.setValue(businessPlace);
            mldCommand.setValue(new Event<>(NotificationsForUI.BranchPickedProceedToWelcomeScreen));
        }
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
    private MutableLiveData<B1Activity.B1Activities> mldActivities = new MutableLiveData<>();
    @Override public LiveData<B1Activity.B1Activities> getActivities() { return mldActivities; }
    @Override public void onQueryActivitiesAsync(String filters, String select) {
        mldProgressBarVisible.setValue(true);
        b1s().queryActivitiesAsync(filters, mldActivities, mldError);
    }
    private MutableLiveData<B1Document.B1Documents> mldPurchaseOrders = new MutableLiveData<>();
    @Override
    public void onWelcomeScreenOpened() {
        try {
            mldProgressBarVisible.setValue(true);
            String filter = "DocumentStatus eq 'bost_Open'";
            if (mldBusinessPlace.getValue() != null) {
                int branch = mldBusinessPlace.getValue().getBPLID();
                filter += " and BPL_IDAssignedToInvoice eq " + branch;
            }
            int userId = mldUserDetail.getValue().getValue().get(0).getInternalKey();
            b1s().queryPurchaseOrdersAsync(filter, "DocDueDate", mldPurchaseOrders, mldError);
            b1s().queryActivitiesAsync(
                    "Activity eq 'cn_Task' and Status eq -2 and DocType eq '22' and HandledBy eq " + userId, mldActivities, mldError);
        } catch(Throwable t) {
            mldError.setValue(new Event<>(t));
        }
    }
}
