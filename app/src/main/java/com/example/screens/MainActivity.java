package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "MainActivity onPostResume ran");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "MainActivity onStart ran");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "MainActivity onStop ran");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "MainActivity onDestroy ran");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("==>", "MainActivity onPostResume ran");
    }
}
