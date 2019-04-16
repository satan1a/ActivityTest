package com.example.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TimePicker;
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
//                ------以下为隐式（Implicit）Intent------
                Intent intent = new Intent("com.example.activityest.ACTION_START");
                intent.addCategory("com.example.activityest.MY_CATEGORY");
                startActivity(intent);
//                ------以下为显式（Explicit）Intent------
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(intent);
            }
        });

        // 自己添加一个新的按钮测试
        Button button2 = (Button) findViewById(R.id.button_2);
        Intent intentButton2 = getIntent();
        String dataFromSecondActivity = intentButton2.getStringExtra("extra_data_1");
        if (dataFromSecondActivity != null) {
            Toast.makeText(FirstActivity.this, "Data from ThirdActivity: " + dataFromSecondActivity, Toast.LENGTH_SHORT).show();
        }
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(FirstActivity.this, "从当前活动传输信息到Third Activity", Toast.LENGTH_SHORT).show();
                // 从当前活动传输信息到Third Activity，利用Intent
                String data = "Hello Third Activity";
                Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
                // 放入数据：putExtra方法接收两个参数，第一个是键，用于后面从intent取值；第二个为真正要传的数据
                intent.putExtra("extra_data", data);
                startActivity(intent);
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


//        点击后显示一个Toast消息弹框
        Button buttonToast = (Button) findViewById(R.id.buttonToast);
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "Toast taste good!", Toast.LENGTH_SHORT).show();
            }
        });


//        分割线

        Button buttonRadioButtonTest = (Button) findViewById(R.id.radioButtonActive);
        buttonRadioButtonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, RadioButtonTest.class);
                startActivity(intent);
            }
        });

//        点击后显示文本编辑框
        Button  buttonText = (Button) findViewById(R.id.textEditButton);
        buttonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, TextEditActivity.class);
                startActivity(intent);
            }
        });

//            点击后显示RatingBar
        Button ratingBarButton = (Button) findViewById(R.id.ratingBarButton);
        ratingBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, RatingBarActivity.class);
                startActivity(intent);
            }
        });

//             点击后显示TimePicker
        Button timePickerButton = (Button) findViewById(R.id.timePickerButton);
        timePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, TimePickerActivity.class);
                startActivity(intent);
            }
        });

//              点击后显示TimePicker
        Button processPickerButton = (Button) findViewById(R.id.progressBarButton);
        processPickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, ProcessBarActivity.class);
                startActivity(intent);
            }
        });

//              点击后显示TimePicker
        Button webViewButton = (Button) findViewById(R.id.webViewButton);
        webViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

//             ViewStub Test
        Button viewStubButton = (Button) findViewById(R.id.viewStubButton);
        viewStubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, ViewStubActivity.class);
                startActivity(intent);
            }
        });


//             ImageSwitcher Test
        Button imageSwitcherButton = (Button) findViewById(R.id.imageSwitcherButton);
        imageSwitcherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, ImageSwitcherActivity.class);
                startActivity(intent);
            }
        });

        //            ImageSwitcher Test
        Button imageSliderButton = (Button) findViewById(R.id.imageSliderButton);
        imageSliderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, ImageSliderActivity.class);
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

