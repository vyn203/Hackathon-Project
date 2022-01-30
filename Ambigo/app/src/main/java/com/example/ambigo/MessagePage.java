package com.example.ambigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MessagePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_page);
    }

    public void home(View v){
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }

    public void location(View v){
        Intent i = new Intent(this, Location.class);
        startActivity(i);
    }
}