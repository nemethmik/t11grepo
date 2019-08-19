package com.tiva11.model;

import androidx.annotation.NonNull;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class B1LoginRequest implements Serializable
{
    public B1LoginRequest(){}
    public B1LoginRequest(@NonNull final String username, @NonNull final String password, @NonNull final String companyDB) {
        setCompanyDB(companyDB);
        setUserName(username);
        setPassword(password);
    }
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("Password")
    @Expose
    private String password;
    @SerializedName("CompanyDB")
    @Expose
    private String companyDB;
    private final static long serialVersionUID = -417191254628136368L;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyDB() {
        return companyDB;
    }

    public void setCompanyDB(String companyDB) {
        this.companyDB = companyDB;
    }

}