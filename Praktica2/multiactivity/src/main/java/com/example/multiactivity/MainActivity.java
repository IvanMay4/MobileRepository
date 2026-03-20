package com.example.multiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Create " + TAG);
    }

    public void onClickNewActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "МИРЭА - Майоров Иван Константинович");
        startActivity(intent);
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