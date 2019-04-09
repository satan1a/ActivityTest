package com.example.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TextEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_edit_layout);
        TextView textView = (TextView) findViewById(R.id.textView_1);
        EditText editText = (EditText) findViewById(R.id.editText_1);
    }
}
