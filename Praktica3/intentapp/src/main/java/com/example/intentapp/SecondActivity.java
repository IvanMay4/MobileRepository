package com.example.intentapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView textResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textResult = findViewById(R.id.textResult);
        Intent intent = getIntent();
        int number = intent.getIntExtra("number", 0);
        String time = intent.getStringExtra("time");
        textResult.setText("Квадрат значения моего номера по списку в группе составляет " +
                number * number + ", а текущее время: " + time);
    }
}
