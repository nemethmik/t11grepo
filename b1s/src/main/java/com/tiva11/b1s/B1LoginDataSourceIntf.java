package com.tiva11.b1s;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.tiva11.model.B1Exception;
import com.tiva11.model.B1Session;

import java.io.IOException;

public interface B1LoginDataSourceIntf {
    void loginAsync(String serverUrl, String username, String password, String companyDB,
               @NonNull final MutableLiveData<B1Session> mldSession,
               @NonNull final MutableLiveData<Throwable> mldError);
    //This is synchronous, don't call it from the main UI thread
//    B1Session login(String serverUrl, String username, String password, String companyDB) throws IOException, B1Exception;
    void logoutAsync(@NonNull final MutableLiveData<Integer> mldLogoutResult, @NonNull final MutableLiveData<Throwable> mldError);
    B1Session getB1Session();
}
