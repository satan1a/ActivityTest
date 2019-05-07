package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
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
        final ImageView imageView = (ImageView)findViewById(R.id.imageView1);
        Button buttonSlideUp = (Button)findViewById(R.id.button_slide_up);
        Button buttonSlideDown = (Button)findViewById(R.id.button_slide_down);
        Button buttonFadeIn = (Button)findViewById(R.id.button_fade_in);
        Button buttonFadeOut = (Button)findViewById(R.id.button_fade_out);
        Button buttonRotateClockWise = (Button)findViewById(R.id.button_rotate_clockwise);

        buttonSlideUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Slide_Up
                Animation animationSlideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);

                imageView.startAnimation(animationSlideUp);
            }
        });
        buttonSlideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Slide_Down
                Animation animationSlideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);

                imageView.startAnimation(animationSlideDown);
            }
        });
        buttonFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Fade In
                Animation animationSlideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);

                imageView.startAnimation(animationSlideDown);
            }
        });
        buttonFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Fade Out
                Animation animationSlideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);

                imageView.startAnimation(animationSlideDown);
            }
        });
        buttonRotateClockWise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Rotate CloseWise
                Animation animationSlideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);

                imageView.startAnimation(animationSlideDown);
            }
        });


    }
}
