package com.tiva11.b1s;

import com.tiva11.model.B1Activities;
import com.tiva11.model.B1Activity;
import com.tiva11.model.B1LoginRequest;
import com.tiva11.model.B1Session;

import java.util.concurrent.CompletableFuture;

import okhttp3.ResponseBody;
import retrofit2.Call;
import okhttp3.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface B1LoginRetrofitIntf {
//    @POST("Login")
//    Call<B1Session> login(@Body B1LoginRequest loginRequest);
    @POST("Login")
    CompletableFuture<B1Session> login(@Body B1LoginRequest loginRequest);
//    @GET("Logout")
//    Call<Void> logout(@Header("Cookie") String b1Cookies);
    //It is not possible to use Retrofit/okhttp3 Response type here, but you van use Void, and ResponseBody
    @GET("Logout")
    CompletableFuture<Void> logout(@Header("Cookie") String b1Cookies);
}
