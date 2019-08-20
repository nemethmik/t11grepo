package com.tiva11.b1s;

import com.tiva11.model.B1Activities;
import com.tiva11.model.B1Activity;
import com.tiva11.model.B1LoginRequest;
import com.tiva11.model.B1Session;

import java.util.concurrent.CompletableFuture;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface B1ActivitiesRetrofitIntf {
    @GET("Activities")
    CompletableFuture<B1Activities> queryAllActivities(@Header("Cookie") String b1Cookies);
}
