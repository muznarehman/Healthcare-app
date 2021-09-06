package com.example.basicsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bmi_calculator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        EditText weight=(EditText)findViewById(R.id.weight);
        EditText height=(EditText)findViewById(R.id.height);
        TextView bmi_value=(TextView)findViewById(R.id.result_bmi);
        Button bmiCalculate=(Button)findViewById(R.id.bmi_btn);

        bmiCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="";
                String s1,s2;
                s1=weight.getText().toString();
                s2=height.getText().toString();
                float weightValue, heightValue;
                weightValue=Float.parseFloat(s1);
                //heightValue=Integer.parseInt(i);
                heightValue=Float.parseFloat(s2);

                float bmi=weightValue/(heightValue*heightValue);

                if(bmi < 18){
                    value="Underweight";

                }
                else if(bmi>=18 && bmi<=24.9){
                    value="Normal weight";
                }
                else if(bmi>=25 && bmi<=29.9){
                    value="Overweight";
                }
                else if(bmi>=30){
                    value="Obese";
                }
                bmi_value.setText(value);

            }
        });

    }
}