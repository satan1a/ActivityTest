package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 使用Intent，接收从FirstActivity传输来的信息
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Toast.makeText(ThirdActivity.this, "Data From FirstActivity: " + data, Toast.LENGTH_SHORT).show();
        Log.d("ThirdActivity", data);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        Button button4 = (Button)findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, FirstActivity.class);
                intent.putExtra("extra_data_1", "Hello, FirstActivity");
                startActivity(intent);
            }
        });

    }
}
