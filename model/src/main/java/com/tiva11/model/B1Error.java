package com.tiva11.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class B1Error implements Serializable
{
    @SerializedName("error")
    @Expose
    private Error error;
    private final static long serialVersionUID = 2879459101406560910L;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
    public static class Error implements Serializable
    {

        @SerializedName("code")
        @Expose
        private int code;
        @SerializedName("message")
        @Expose
        private Message message;
        private final static long serialVersionUID = -6071797092191175639L;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }

    }
    public static class Message implements Serializable
    {

        @SerializedName("lang")
        @Expose
        private String lang;
        @SerializedName("value")
        @Expose
        private String value;
        private final static long serialVersionUID = 7055271406251387765L;

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }
}
