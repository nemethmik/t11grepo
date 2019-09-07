package com.tiva11.b1s;

import com.tiva11.model.B1Activity;
import com.tiva11.model.B1BusinessPlace;
import com.tiva11.model.B1Document;
import com.tiva11.model.B1LoginRequest;
import com.tiva11.model.B1Session;
import com.tiva11.model.B1User;

import java.util.concurrent.CompletableFuture;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

interface B1RetrofitIntf {
//    @POST("Login")
//    Call<B1Session> login(@Body B1LoginRequest loginRequest);
    @POST("Login")
    CompletableFuture<B1Session> login(@Body B1LoginRequest loginRequest);
//    @GET("Logout")
//    Call<Void> logout(@Header("Cookie") String b1Cookies);
    //It is not possible to use Retrofit/okhttp3 Response type here, but you van use Void, and ResponseBody
    @GET("Logout")
    CompletableFuture<Void> logout(@Header("Cookie") String b1Cookies);
    @GET("BusinessPlaces")
    CompletableFuture<B1BusinessPlace.B1BusinessPlaces> queryBusinessPlaces(@Header("Cookie") String b1Cookies,
        @Query("$filter") String filter, @Query("$orderby") String orderBy);
    @GET("PurchaseOrders")
    CompletableFuture<B1Document.B1Documents> queryProductionOrders(@Header("Cookie") String b1Cookies,
        @Query("$filter") String filter, @Query("$orderby") String orderBy);
    @GET("Users")
    CompletableFuture<B1User.B1Users> queryUsers(@Header("Cookie") String b1Cookies,
        @Query("$filter") String filter, @Query("$orderby") String orderBy);
    @GET("Activities")
    CompletableFuture<B1Activity.B1Activities> queryActivities(@Header("Cookie") String b1Cookies,
                                                               @Query("$filter") String filter, @Query("$orderby") String orderBy);
}
