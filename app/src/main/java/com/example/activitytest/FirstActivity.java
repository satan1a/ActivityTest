package com.example.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        /**
         * 以下为设置添加一个按钮并监听
         * 触发后，显示一个Toast信息（短小的信息，一段时间后小时）
         */
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ------以下为隐式Intent------
                Intent intent = new Intent("com.example.activityest.ACTION_START");
                intent.addCategory("com.example.activityest.MY_CATEGORY");
                startActivity(intent);
//                ------以下为显式Intent------
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(intent);
            }
        });

        // 自己添加一个新的按钮测试
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "You click Button2 🐱", Toast.LENGTH_SHORT).show();
            }
        });

        Button buttonCalculator = (Button) findViewById(R.id.buttonCalculator);
        buttonCalculator.setOnClickListener(new View.OnClickListener() {
           @Override
           public void  onClick(View v) {
               Intent intentCalculator = new Intent(FirstActivity.this, Calculator.class);
               startActivity(intentCalculator);
           }
        });

//        一个点击后跳转到我的网站的按钮
        Button buttonMywebste = (Button) findViewById(R.id.buttonMyWebsite);
        buttonMywebste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intentMyWebsite = new Intent(Intent.ACTION_VIEW);
//                intentMyWebsite.setData(Uri.parse("http://www.thereroad.com"));
//                startActivity(intentMyWebsite);
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:400823823"));
                startActivity(intent);

            }
        });


    }




//     一个菜单
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
            default:
        }
        return true;
        }
    }

