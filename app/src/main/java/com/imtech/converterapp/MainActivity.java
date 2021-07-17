package com.imtech.converterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText DollarInput;
    private TextView NairaOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DollarInput = findViewById(R.id.dollar_input);
        Button convertButton = findViewById(R.id.convert_button);
        NairaOutput = findViewById(R.id.naira_output);

        convertButton.setOnClickListener(v -> convertMoney());
    }

    private void convertMoney() {
        if (DollarInput.length() != 0) {
            double tonaira = (Double.parseDouble(DollarInput.getText().toString().trim())) * 500;

            NairaOutput.setText("N"+String.valueOf(tonaira));
            NairaOutput.setVisibility(View.VISIBLE);
        } else {
            Toast.makeText(getBaseContext(), "Enter a value", Toast.LENGTH_SHORT).show();
        }

    }
}