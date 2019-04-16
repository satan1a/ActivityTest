package com.example.activitytest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 *
 */

public class ImageAdapter extends PagerAdapter {
    Context context;
    ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == ((ImageView) o);
    }

    private int[] sliderImageId = new int[] {
            R.drawable.apple_pic, R.drawable.banana_pic, R.drawable.cherry_pic
    };

    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImageId[position]);
        ((ViewGroup) container).addView(imageView, 0);
        return  imageView;
    }

    public void destroyItem(ViewGroup container, int positon, Object object) {
        ((ViewPager)container).removeView((ImageView)object);
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }
}
