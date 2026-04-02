package com.example.intentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button buttonSendTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSendTime = findViewById(R.id.buttonSendTime);
    }

    public void ClickButtonSendTime(View view) {
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateString = sdf.format(new Date(dateInMillis));
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("number", 14);
        intent.putExtra("time", dateString);
        startActivity(intent);
    }
}