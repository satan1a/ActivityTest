package com.example.activitytest;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

public class ImageSwitcherActivity extends AppCompatActivity {

    int imagesIDs[] = {R.drawable.apple_pic, R.drawable.banana_pic, R.drawable.cherry_pic};
    int count = imagesIDs.length;

    int currentIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_switcher_activity);

        Button btnNext = (Button) findViewById(R.id.button_next_image);
        final ImageSwitcher imageSwitcher = (ImageSwitcher)findViewById(R.id.simpleImageSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
                return  imageView;
            }
        });
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        imageSwitcher.setInAnimation(in);
        imageSwitcher.setOutAnimation(out);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex++;

                if (currentIndex == count)
                    currentIndex = 0;
                imageSwitcher.setImageResource(imagesIDs[currentIndex]);
            }
        });
    }
}
