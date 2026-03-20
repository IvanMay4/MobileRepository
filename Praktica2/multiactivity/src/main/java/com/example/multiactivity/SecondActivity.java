package com.example.multiactivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    final String TAG = SecondActivity.class.getSimpleName();
    TextView textViewSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG, "Create " + TAG);
        String text = (String)getIntent().getSerializableExtra("key");
        textViewSecond = findViewById(R.id.textViewSecond);
        textViewSecond.setText(text);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Start " + TAG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Resume " + TAG);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Pause " + TAG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Stop " + TAG);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Restart " + TAG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Destroy " + TAG);
    }
}