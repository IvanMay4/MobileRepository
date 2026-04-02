package com.example.favoritebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ShareActivity extends AppCompatActivity {
    EditText editTextUserBook;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        editTextUserBook = findViewById(R.id.editTextUserBook);
    }

    public void ClickButtonSend(View view) {
        String userBook = editTextUserBook.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("userBook", userBook);
        setResult(RESULT_OK, intent);
        finish();
    }
}
