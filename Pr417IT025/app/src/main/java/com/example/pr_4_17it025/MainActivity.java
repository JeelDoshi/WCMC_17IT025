package com.example.pr_4_17it025;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tb;
    Button btn;
    EditText et;
    Double a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = (ToggleButton)findViewById(R.id.tb);
        btn = (Button)findViewById(R.id.btn);
        et = (EditText)findViewById(R.id.et);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter the temp",Toast.LENGTH_SHORT).show();
                }
                else if(tb.isChecked()){
                    a=Double.parseDouble(String.valueOf(et.getText()));
                    Double b= ((a * 9) / 5) + 32;
                    String r=String.valueOf(b);
                    Toast.makeText(MainActivity.this,r+"F",Toast.LENGTH_SHORT).show();

                }
                else {
                    a=Double.parseDouble(String.valueOf(et.getText()));
                    Double b= a-32;
                    Double c= (b * 5) / 9;
                    String r=String.valueOf(c);
                    Toast.makeText(MainActivity.this,r+"F",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}