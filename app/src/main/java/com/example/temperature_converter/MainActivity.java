package com.example.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button cTof, fToc;
    private TextView result;
    private EditText enterTemp;
    double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cTof = findViewById(R.id.cTof);
        fToc = findViewById(R.id.fToc);
        result = findViewById(R.id.result);
        enterTemp = findViewById(R.id.enterTemp);
        cTof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                double result0 = ((temp * 1.8) + 32);
                result.setText(String.valueOf(result0));
            }
        });
        fToc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                double result0 = (temp -32) /1.8;
                result.setText(String.valueOf(result0));
            }
        });
    }
}