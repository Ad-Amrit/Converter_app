package com.example.converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        EditText area_text = findViewById(R.id.area_text);
        @SuppressLint({"WrongViewCast", "CutPasteId"}) Button area_btn = findViewById(R.id.area_text);
        area_btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String a = area_text.getText().toString();
                double b = Double.parseDouble(a);
                double res = b*9;
                String Final_result = Double.valueOf(res).toString();
                TextView area_result = findViewById(R.id.area_result);
                area_result.setText("Square Yard to Square Feet : "+Final_result);
            }
        });
    }
}