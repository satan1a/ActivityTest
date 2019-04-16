package com.example.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class ViewStubActivity extends AppCompatActivity {
    Button show, hide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_stub_activity);
        Button show = (Button)findViewById(R.id.showImage);
        final Button hide = (Button)findViewById(R.id.hideImage);
        final ViewStub viewStub = (ViewStub)findViewById(R.id.viewStub1);
        viewStub.inflate();

//        ViewStub可设施其中内容的显示或隐藏，以下按钮就会显示和隐藏内容
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub.setVisibility(View.VISIBLE);
            }
        });
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub.setVisibility(View.GONE);
            }
        });
    }
}
