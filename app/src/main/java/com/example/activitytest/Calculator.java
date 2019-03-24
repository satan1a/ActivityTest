package com.example.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);
        final TextView textView_1 = (TextView) findViewById(R.id.textView_1);
        final EditText editText_1 = (EditText) findViewById(R.id.editText_1);
        final EditText editText_2 = (EditText) findViewById(R.id.editText_2);
        final Editable input_1 = editText_1.getText();
        final Editable input_2 = editText_2.getText();

        /**
         * 加按钮的实现
         */
        Button button_plus = (Button) findViewById(R.id.button_plus);
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) throws NumberFormatException{

                    float inputFloat1 = (float) Float.parseFloat(String.valueOf(input_1));
                    float inputFloat2 = (float) Float.parseFloat(String.valueOf(input_2));
                    float sum = inputFloat1 + inputFloat2;

                    textView_1.setText("The additon result is " + sum);
                }

        });

        /**
         * 减按钮的实现
         */
        Button button_minus = (Button) findViewById(R.id.button_minus);
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float inputFloat1 = (float) Float.parseFloat(String.valueOf(input_1));
                float inputFloat2 = (float) Float.parseFloat(String.valueOf(input_2));
                float minus = inputFloat1 - inputFloat2;
                textView_1.setText("The minus result is " + minus);
            }
        });

        /**
         * 乘按钮的实现
         */
        Button button_multiply = (Button) findViewById(R.id.button_multiply);
        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float inputFloat1 = (float) Float.parseFloat(String.valueOf(input_1));
                float inputFloat2 = (float) Float.parseFloat(String.valueOf(input_2));
                float multiply = inputFloat1 * inputFloat2;
                textView_1.setText("The multiply result is " + multiply);
            }
        });

        /**
         * 除按钮的实现
         */
        Button button_division = (Button) findViewById(R.id.button_divide);
        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float inputFloat1 = (float) Float.parseFloat(String.valueOf(input_1));
                float inputFloat2 = (float) Float.parseFloat(String.valueOf(input_2));
                float division = inputFloat1 / inputFloat2;
                textView_1.setText("The division result is " + division);
            }
        });
    }

}
