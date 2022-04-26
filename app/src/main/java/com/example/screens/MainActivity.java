package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText username;

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

        btn = findViewById(R.id.button);
        username = findViewById(R.id.username);
    }
}
