package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    private TextView nameview;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "SecondaryActivity onPostResume ran");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "SecondaryActivity onStart ran");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "SecondaryActivity onStop ran");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "SecondaryActivity onDestroy ran");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        Log.d("==>", "SecondaryActivity onCreate ran");
        nameview = findViewById(R.id.usernameview);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String username = extras.getString("username");
        Log.d("==>", "Username from intent:"+username);

        nameview.setText(username);

    }
}