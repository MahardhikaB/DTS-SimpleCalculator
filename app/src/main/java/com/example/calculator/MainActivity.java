package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputAngka1 = (EditText) findViewById(R.id.inputAngka1);
        EditText inputAngka2 = (EditText) findViewById(R.id.inputAngka2);

        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        Button btnMinus = (Button) findViewById(R.id.btnMinus);
        Button btnTimes = (Button) findViewById(R.id.btnTimes);
        Button btnDivide = (Button) findViewById(R.id.btnDivide);

        EditText hasil = (EditText) findViewById(R.id.hasil);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double nilai_inputAngka1, nilai_inputAngka2, nilai_hasil;
                nilai_inputAngka1 = Double.valueOf(inputAngka1.getText().toString());
                nilai_inputAngka2 = Double.valueOf(inputAngka2.getText().toString());
                nilai_hasil = nilai_inputAngka1 + nilai_inputAngka2;
                hasil.setText(nilai_hasil.toString());
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double nilai_inputAngka1, nilai_inputAngka2, nilai_hasil;
                nilai_inputAngka1 = Double.valueOf(inputAngka1.getText().toString());
                nilai_inputAngka2 = Double.valueOf(inputAngka2.getText().toString());
                nilai_hasil = nilai_inputAngka1 - nilai_inputAngka2;
                hasil.setText(nilai_hasil.toString());
            }
        });

        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double nilai_inputAngka1, nilai_inputAngka2, nilai_hasil;
                nilai_inputAngka1 = Double.valueOf(inputAngka1.getText().toString());
                nilai_inputAngka2 = Double.valueOf(inputAngka2.getText().toString());
                nilai_hasil = nilai_inputAngka1 * nilai_inputAngka2;
                hasil.setText(nilai_hasil.toString());
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double nilai_inputAngka1, nilai_inputAngka2, nilai_hasil;
                nilai_inputAngka1 = Double.valueOf(inputAngka1.getText().toString());
                nilai_inputAngka2 = Double.valueOf(inputAngka2.getText().toString());
                nilai_hasil = nilai_inputAngka1 / nilai_inputAngka2;
                hasil.setText(nilai_hasil.toString());
            }
        });

        Button btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputAngka1.setText("");
                inputAngka2.setText("");
                hasil.setText("0");
            }
        });

        Button btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}