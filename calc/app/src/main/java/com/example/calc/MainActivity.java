package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.calc.R;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2;
    Button add, sub, mul, div;
    float value1, value2;

    //boolean add, sub, mul, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {

        edt1 = (EditText) findViewById(R.id.editText4);
        edt2 = (EditText) findViewById(R.id.editText5);
        add = (Button) findViewById(R.id.button);
        sub = (Button) findViewById(R.id.button2);
        mul = (Button) findViewById(R.id.button3);
        div = (Button) findViewById(R.id.button4);


        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String value1 = edt1.getText().toString();
                String value2 = edt2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a + b;
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String value1 = edt1.getText().toString();
                String value2 = edt2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a - b;
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String value1 = edt1.getText().toString();
                String value2 = edt2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a * b;
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String value1 = edt1.getText().toString();
                String value2 = edt2.getText().toString();
                float a = Integer.parseInt(value1);
                float b = Integer.parseInt(value2);
                float sum = a / b;
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
    }
}