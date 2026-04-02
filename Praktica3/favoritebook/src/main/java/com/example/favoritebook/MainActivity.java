package com.example.favoritebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textFavoriteBook;
    ActivityResultLauncher<Intent> bookLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textFavoriteBook = findViewById(R.id.textFavoriteBook);

        bookLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), result -> {
                    if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                        String userBook = result.getData().getStringExtra("userBook");
                        textFavoriteBook.setText("Название Вашей любимой книги: " + userBook);
                    }
                });
    }

    public void ClickButtonOpen(View view) {
        Intent intent = new Intent(this, ShareActivity.class);
        bookLauncher.launch(intent);
    }
}