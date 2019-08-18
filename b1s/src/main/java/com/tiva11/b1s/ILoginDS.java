package com.tiva11.b1s;

import com.tiva11.model.User;
import com.tiva11.model.Result;

public interface ILoginDS {
    Result<User> login(String username, String password);
    void logout();
}
