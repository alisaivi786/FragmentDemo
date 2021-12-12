package com.example.fragmentsdemo.API;

import com.example.fragmentsdemo.Model.LoginRequest;
import com.example.fragmentsdemo.Model.*;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserService {

    @POST("order/TestLogin")
    Call<JsonObject> loginUser(@Body LoginRequest loginRequest);

    @POST("order/create_user")
    Call<SignUpDetails> SaveOrder(

            @Body ResponseSignUp create

    );


}
