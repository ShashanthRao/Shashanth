package com.example.shashanth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    public static String pref_name= "MyPrefFile";
    EditText username,password;
    private Button btnLogin;
    String user ="123",pass ="123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.submit);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences(login.pref_name,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();


                if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty((password.getText().toString()))) {
                    Toast.makeText(login.this, "Invalid Inputs", Toast.LENGTH_SHORT).show();
                } else if (username.getText().toString().equals(user)) {
                    if (password.getText().toString().equals(pass)) {
                        Toast.makeText(login.this, "Success", Toast.LENGTH_SHORT).show();
                        editor.putBoolean("hasLoggedIn",true);
                        editor.commit();
                        startActivity(new Intent(login.this,postLogin.class));
                        finish();
                    }
                    else {
                        Toast.makeText(login.this, "Invalid Username/Password", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(login.this, "Invalid Username/Password", Toast.LENGTH_SHORT).show();
                }
            }
            public void openMainActivity2(){
                Intent second = new Intent(login.this, postLogin.class);
                startActivity(second);
            }
        });
    }
}
