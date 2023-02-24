package com.example.converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Currency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        EditText curr_text = findViewById(R.id.curr_text);
        Button curr_btn = findViewById(R.id.curr_btn);
        curr_btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String a = curr_text.getText().toString();
                double b = Double.parseDouble(a);
                double res = b*132.45;
                String Final_result = Double.valueOf(res).toString();
                TextView curr_result = findViewById(R.id.curr_result);
                curr_result.setText("Dollar to NPR is : "+Final_result);
            }
        });
    }
}