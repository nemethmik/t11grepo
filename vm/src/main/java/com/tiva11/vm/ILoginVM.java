package com.tiva11.vm;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

import com.tiva11.model.User;
import com.tiva11.model.Result;

public interface ILoginVM {
    LiveData<LoginFormState> getLoginFormState();
    LiveData<Result<User>> getLoginResult();
    void login(String username, String password);
    void loginDataChanged(String username, String password);
    public static class LoginFormState {
        @Nullable
        private Integer usernameError;
        @Nullable
        private Integer passwordError;
        private boolean isDataValid;

        LoginFormState(@Nullable Integer usernameError, @Nullable Integer passwordError) {
            this.usernameError = usernameError;
            this.passwordError = passwordError;
            this.isDataValid = false;
        }

        LoginFormState(boolean isDataValid) {
            this.usernameError = null;
            this.passwordError = null;
            this.isDataValid = isDataValid;
        }

        @Nullable
        public Integer getUsernameError() {
            return usernameError;
        }

        @Nullable
        public Integer getPasswordError() {
            return passwordError;
        }

        public boolean isDataValid() {
            return isDataValid;
        }
    }
}
