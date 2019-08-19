package com.tiva11.b1s;

import com.tiva11.model.B1Activities;
import com.tiva11.model.B1Activity;
import com.tiva11.model.B1LoginRequest;
import com.tiva11.model.B1Session;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface B1LoginRetrofitIntf {
    @GET("Activities")
    Call<B1Activities> queryAllActivities();
    @GET("Activities({code})")
    Call<B1Activity> getRecipe(@Path("code") int activityCode);
    @POST("Login")
    Call<B1Session> login(@Body B1LoginRequest loginRequest);
    @GET("Logout")
    Call<Void> logout(@Header("Cookie") String b1Cookies);
}
