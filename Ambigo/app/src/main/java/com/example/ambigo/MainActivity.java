package com.example.ambigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void main(View v){
        Intent i = new Intent(this, Disclaimer.class);
        startActivity(i);
    }

    public void login(View v){
        Intent i = new Intent(this, LoginPage.class);
        startActivity(i);
    }

    public void register(View v){
        Intent i = new Intent(this, RegisterPage.class);
        startActivity(i);
    }
}