package com.example.cal_17it025;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private EditText Num1;
    private EditText Num2;
    private Button btn;
    private TextView addition;
    double val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Num1 = (EditText)findViewById(R.id.n1);
        Num2 = (EditText)findViewById(R.id.n2);
        btn = (Button)findViewById(R.id.btn);
        addition = (TextView)findViewById(R.id.ans);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String val1 = Num1.getText().toString();
               String val2 = Num2.getText().toString();
               double a = Double.parseDouble(val1);
               double b = Double.parseDouble(val2);
               double sum = a+b;

            addition.setText(Double.toString(sum));

            }
        });

    }


}
