package com.example.practicejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String hello = "わ！！！";
        int age = 19;
        double weight = 55.5;
        //boolean math = True;

        Log.d("MainActivity",hello+"!!!");
        Log.d("MainActivity",age+"歳だお");
        //Log.d("MainActivity",ma

    }
}