package com.codesking.designui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        getSupportActionBar().hide();
    }
}