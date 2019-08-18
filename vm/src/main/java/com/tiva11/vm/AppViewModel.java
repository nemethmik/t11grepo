package com.tiva11.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import android.util.Patterns;

import com.tiva11.b1s.Repository;
import com.tiva11.model.Result;
import com.tiva11.model.User;

class AppViewModel extends ViewModel implements ILoginVM {

    private MutableLiveData<ILoginVM.LoginFormState> loginFormState = new MutableLiveData<>();
    private MutableLiveData<Result<User>> loginResult = new MutableLiveData<>();
    private Repository repository;

    // If user credentials will be cached in local storage, it is recommended it be encrypted
    // @see https://developer.android.com/training/articles/keystore
    private User user = null;

    AppViewModel setRepository(Repository repository) {
        this.repository = repository;
        return this;
    }
    @Override
    public LiveData<ILoginVM.LoginFormState> getLoginFormState() {
        return loginFormState;
    }
    @Override
    public LiveData<Result<User>> getLoginResult() {
        return loginResult;
    }
    @Override
    public void login(String username, String password) {
        // can be launched in a separate asynchronous job
        Result<User> result = repository.getLoginDS().login(username, password);

        if (result instanceof Result.Success) {
            User data = ((Result.Success<User>) result).getData();
            setLoggedInUser(data);
        }
        loginResult.setValue(result);
    }
    public boolean isLoggedIn() {
        return user != null;
    }
    @Override
    public void loginDataChanged(String username, String password) {
        if (!isUserNameValid(username)) {
            loginFormState.setValue(new ILoginVM.LoginFormState(R.string.invalid_username, null));
        } else if (!isPasswordValid(password)) {
            loginFormState.setValue(new ILoginVM.LoginFormState(null, R.string.invalid_password));
        } else {
            loginFormState.setValue(new ILoginVM.LoginFormState(true));
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
        return password != null && password.trim().length() > 5;
    }
    private void setLoggedInUser(User user) {
        this.user = user;
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
    }

}
