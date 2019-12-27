package com.leo.photowall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton relative1;
    ImageButton relative2;
    ImageButton relative3;
    ImageButton relative4;
    ImageButton relative5;
    ImageButton relative6;
    ImageButton relative7;
    ImageButton relative8;
    ImageButton relative9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        onClickImgBtn();
    }

    private void onClickImgBtn() {
        relative1.setOnClickListener(this);
        relative2.setOnClickListener(this);
        relative3.setOnClickListener(this);
        relative4.setOnClickListener(this);
        relative5.setOnClickListener(this);
        relative6.setOnClickListener(this);
        relative7.setOnClickListener(this);
        relative8.setOnClickListener(this);
        relative9.setOnClickListener(this);
    }

    private void initView() {
        relative1 = findViewById(R.id.relative1);
        relative2 = findViewById(R.id.relative2);
        relative3 = findViewById(R.id.relative3);
        relative4 = findViewById(R.id.relative4);
        relative5 = findViewById(R.id.relative5);
        relative6 = findViewById(R.id.relative6);
        relative7 = findViewById(R.id.relative7);
        relative8 = findViewById(R.id.relative8);
        relative9 = findViewById(R.id.relative9);
    }

    @Override
    public void onClick(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.animator.anim);
        switch (view.getId()) {
            case R.id.relative1:
                relative1.startAnimation(animation);
                break;
            case R.id.relative2:
                relative2.startAnimation(animation);
                break;
            case R.id.relative3:
                relative3.startAnimation(animation);
                break;
            case R.id.relative4:
                relative4.startAnimation(animation);
                break;
            case R.id.relative5:
                relative5.startAnimation(animation);
                break;
            case R.id.relative6:
                relative6.startAnimation(animation);
                break;
            case R.id.relative7:
                relative7.startAnimation(animation);
                break;
            case R.id.relative8:
                relative8.startAnimation(animation);
                break;
            case R.id.relative9:
                relative9.startAnimation(animation);
                break;
        }
    }
}
