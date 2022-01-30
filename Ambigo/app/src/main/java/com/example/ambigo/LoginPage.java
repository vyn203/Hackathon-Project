package com.example.ambigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void register(View v){
        Intent i = new Intent(this, RegisterPage.class);
        startActivity(i);
    }

    public void home(View v){
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }
}