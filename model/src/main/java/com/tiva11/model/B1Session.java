package com.tiva11.model;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class B1Session implements Serializable
{
    //transient private String b1Cookies = null;
    transient private Date loginTime = null;
    transient private String serverUrl;
    transient private B1LoginRequest loginRequest;
    public String getB1Cookies() {
        //I have noticed that B1S may return multiple Set-Cookies, and Retrofit returns the last value
        // which is not the correct one.
        //return b1Cookies;
        return "B1SESSION=" + getSessionId();
    }
    public Date getLoginTime(){return loginTime;}
    public boolean isLoggedOut() {return loginTime == null;}
    public String getServerUrl(){return serverUrl;}
    public B1LoginRequest getLoginRequest(){return loginRequest;}
    public void _setSession(@NonNull final String serverUrl, @NonNull final B1LoginRequest loginRequest) {
        this.loginTime = new Date();
        //this.b1Cookies = cookies;
        this.serverUrl = serverUrl;
        this.loginRequest = loginRequest;
    }
    public void _logoutSession() {
        this.loginTime = null;
    }
    public boolean isSessionExpired() {
        return loginTime == null /*|| b1Cookies == null*/ ||
                (new Date().getTime() - loginTime.getTime()) >= (sessionTimeout * 60 * 1000);
    }
    @SerializedName("odata.metadata")
    @Expose
    private String odataMetadata;
    @SerializedName("SessionId")
    @Expose
    private String sessionId;
    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("SessionTimeout")
    @Expose
    private int sessionTimeout;
    private final static long serialVersionUID = -4053797000152977647L;

    public String getOdataMetadata() {
        return odataMetadata;
    }

    public void setOdataMetadata(String odataMetadata) {
        this.odataMetadata = odataMetadata;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(int sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

}