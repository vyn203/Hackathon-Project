package com.example.ambigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FAQPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpage);
    }

    public void home(View v) {
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }

    public void locations(View v){
        Intent i = new Intent(this, Location.class);
        startActivity(i);
    }

    public void message(View v) {
        Intent i = new Intent(this, MessagePage.class);
        startActivity(i);
    }
}