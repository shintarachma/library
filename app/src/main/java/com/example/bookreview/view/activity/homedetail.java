package com.example.bookreview.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bookreview.R;

public class homedetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homedetaill);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}