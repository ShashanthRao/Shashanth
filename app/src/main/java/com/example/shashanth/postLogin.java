package com.example.shashanth;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Tag;

public class postLogin extends AppCompatActivity {
   public static String api="https://jsonplaceholder.typicode.com/users";
   List<userModel> allUsersList;
   RecyclerView rcvPL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_login);
        rcvPL = findViewById(R.id.rcvPL);
        rcvPL.setLayoutManager(new LinearLayoutManager(this));

        retrofitInstance.getInstance().apiInterface.getUser().enqueue(new Callback<List<userModel>>() {
            @Override
            public void onResponse(Call<List<userModel>> call, Response<List<userModel>> response) {
                allUsersList = response.body();
                rcvPL.setAdapter(new userAdapter(postLogin.this,allUsersList));

            }

            @Override
            public void onFailure(Call<List<userModel>> call, Throwable t) {
                Log.e("api","onFailure"+ t.getLocalizedMessage());

            }
        });

    }
}