package com.example.shashanth;

import static com.example.shashanth.postLogin.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofitInstance {
    public static retrofitInstance instance;
    apiInterface apiInterface;
    retrofitInstance(){
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(apiInterface.class);
    }
    public static retrofitInstance getInstance(){
        if (instance==null){
            instance = new retrofitInstance();
        }
        return instance;
    }


}
