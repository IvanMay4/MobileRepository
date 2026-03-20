package com.example.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    View rootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootView = findViewById(R.id.main);
    }

    public void ClickShowDialog(View view){
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "dialog");
    }

    public void ClickShowTimeDialog(View view){
        MyTimeDialogFragment timeDialogFragment = new MyTimeDialogFragment();
        timeDialogFragment.show(getSupportFragmentManager(), "timeDialog");
    }

    public void ClickShowDateDialog(View view){
        MyDateDialogFragment dateDialogFragment = new MyDateDialogFragment();
        dateDialogFragment.show(getSupportFragmentManager(), "dateDialog");
    }

    public void ClickShowProgressDialog(View view){
        MyProgressDialogFragment progressDialogFragment = new MyProgressDialogFragment();
        progressDialogFragment.show(getSupportFragmentManager(), "progressDialog");
    }

    public void ClickPositiveButton(){
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!", Toast.LENGTH_SHORT).show();
    }

    public void ClickNeutralButton(){
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!", Toast.LENGTH_SHORT).show();
    }

    public void ClickNegativeButton(){
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!", Toast.LENGTH_SHORT).show();
    }

    public void TimeSet(int hourOfDay, int minute){
        String time = String.format("Выбрано время: %02d:%02d", hourOfDay, minute);
        Snackbar.make(rootView, time, Snackbar.LENGTH_SHORT).show();
    }

    public void DateSet(int year, int month, int dayOfMonth){
        String date = String.format("Выбрана дата: %02d.%02d.%d", dayOfMonth, month + 1, year);
        Snackbar.make(rootView, date, Snackbar.LENGTH_SHORT).show();
    }

    public void ProgressFinish(){
        Snackbar.make(rootView, "Прогресс завершён", Snackbar.LENGTH_SHORT).show();}
}