package com.example.shashanth;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiInterface {
    @GET("/users")
    Call<List<userModel>> getUser();
}
