package com.tiva11.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class B1Activities implements Serializable
{

    @SerializedName("odata.metadata")
    @Expose
    private String odataMetadata;
    @SerializedName("value")
    @Expose
    private List<B1Activity> value = null;
    private final static long serialVersionUID = -7198309465636289876L;

    public String getOdataMetadata() {
        return odataMetadata;
    }

    public void setOdataMetadata(String odataMetadata) {
        this.odataMetadata = odataMetadata;
    }

    public List<B1Activity> getValue() {
        return value;
    }

    public void setValue(List<B1Activity> value) {
        this.value = value;
    }

}
