package com.example.control_lesson1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView editTextFIO = findViewById(R.id.editTextFIO);
        editTextFIO.setText("Майоров И.К.");
        TextView editTextOrganisation = findViewById(R.id.editTextOrganisation);
        editTextOrganisation.setText("МИРЭА");
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);
        TextView editTextPhone = findViewById(R.id.editTextPhone);
        editTextPhone.setText("+7 (926) 620-24-61");
        Button buttonConfirm = findViewById(R.id.buttonConfirm);
        buttonConfirm.setText("Подтвердить");
    }
}