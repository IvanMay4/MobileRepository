package com.example.toastapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText plainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plainText = findViewById(R.id.plainText);
    }

    public void ClickButton(View view){
        int countSymbols = plainText.getText().length();
        Toast toast = Toast.makeText(getApplicationContext(), String.format("Студент № " + countSymbols +
                ", Группа " + countSymbols + ", Количество символов - " + countSymbols), Toast.LENGTH_SHORT);
        toast.show();
    }
}