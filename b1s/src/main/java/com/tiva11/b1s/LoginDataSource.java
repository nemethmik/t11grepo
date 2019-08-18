package com.tiva11.b1s;

import com.tiva11.model.User;
import com.tiva11.model.Result;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource implements ILoginDS{
    @Override
    public Result<User> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            User fakeUser =
                    new User(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }
    @Override
    public void logout() {
        // TODO: revoke authentication
    }
}
