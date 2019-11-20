package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCalculate;
    EditText etFirst, etSecond;
    RadioButton radioSum, radioSub, radioDivide,radioMultiply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculate=findViewById(R.id.btncal);
        etFirst=findViewById(R.id.etfirst);
        etSecond=findViewById(R.id.etsecond);
        radioSum=findViewById(R.id.radioSum);
        radioSub=findViewById(R.id.radioSub);
        radioDivide=findViewById(R.id.radioDivide);
        radioMultiply=findViewById(R.id.radioMulitply);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result=0;
                int first = Integer.parseInt(etFirst.getText().toString());
                int second = Integer.parseInt(etSecond.getText().toString());
                if(radioSub.isChecked())
                {
                    result=first-second;

                }
                else if(radioSum.isChecked())
                {
                    result=first+second;
                }
                else if(radioSub.isChecked())
                {
                    result=first-second;

                }
                else if(radioDivide.isChecked())
                {
                    result=first/second;

                }
                else if(radioMultiply.isChecked())
                {
                    result=first*second;

                }
                Toast.makeText(MainActivity.this, "the result is "+result, Toast.LENGTH_SHORT).show();
            }


        });



    }
}
