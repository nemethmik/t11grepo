package com.tiva11.model;

import androidx.annotation.NonNull;

public class B1Exception extends Exception {
    private B1Error b1Error = null;
    private int resposeCode;
    private String responseMessage;
    public B1Error getB1Error() {return b1Error;}
    public int getResposeCode() {return resposeCode;}
    public String getResponseMessage() {return responseMessage;}
    public B1Exception(final @NonNull B1Error b1Error,int responseCode,String responseMessage) {
        super(b1Error.getError().getMessage().getValue());
        this.b1Error = b1Error;
        this.responseMessage = responseMessage;
        this.resposeCode = responseCode;
    }
}
