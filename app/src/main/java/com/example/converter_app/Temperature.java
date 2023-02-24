package com.example.converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        EditText Temp_text = findViewById(R.id.Temp_text);
        Button Temp_btn = findViewById(R.id.Temp_btn);
        Temp_btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String a = Temp_text.getText().toString();
                double b = Double.parseDouble(a);
                double res = b-273.15;
                String Final_result = Double.valueOf(res).toString();
                TextView Temp_result = findViewById(R.id.Temp_result);
                Temp_result.setText("KELVIN TO CELSIUS IS : "+Final_result);
            }
        });

    }
}