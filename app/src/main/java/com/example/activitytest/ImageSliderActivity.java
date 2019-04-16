package com.example.activitytest;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ImageSliderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_slider_activity);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPage);
        ImageAdapter imageAdapter = new ImageAdapter(this);
        viewPager.setAdapter(imageAdapter);
    }
}
