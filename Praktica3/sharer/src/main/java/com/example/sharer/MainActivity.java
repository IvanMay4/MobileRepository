package com.example.sharer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> pickLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pickLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == Activity.RESULT_OK) {
                Intent data = result.getData();
                Log.d(MainActivity.class.getSimpleName(), "Data: " + data.getDataString());
            }
        });
    }

    public void ClickButtonSend(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_TEXT, "МИРЭА");
        startActivity(Intent.createChooser(intent, "Выбор за вами!"));
    }

    public void ClickButtonChoice(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("*/*");
        pickLauncher.launch(intent);
    }
}