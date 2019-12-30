package com.leo.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RocketActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView rocket_bg;
    ImageView bomb_bg;
    Button btn_fire;
    Button btn_send;
    AnimationDrawable animationDrawable1;
    AnimationDrawable animationDrawable2;

    Animation animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocket);

        rocket_bg = findViewById(R.id.rocket_bg);
        bomb_bg = findViewById(R.id.bomb_bg);

        btn_fire = findViewById(R.id.btn_fire);
        btn_send = findViewById(R.id.btn_send);

        animationDrawable1 = (AnimationDrawable) rocket_bg.getBackground();
        animationDrawable2 = (AnimationDrawable) bomb_bg.getBackground();

        animation = AnimationUtils.loadAnimation(this, R.anim.translate);
        btn_fire.setOnClickListener(this);
        btn_send.setOnClickListener(this);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                bomb_bg.setVisibility(View.VISIBLE);
                btn_send.setEnabled(false);
                btn_fire.setEnabled(false);
                btn_send.setVisibility(View.GONE);
                btn_fire.setVisibility(View.GONE);
                animationDrawable2.start();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_fire:
                if (animationDrawable1.isRunning()) {
                    Toast.makeText(getApplicationContext(), "已经点火！", Toast.LENGTH_SHORT).show();
                } else {
                    animationDrawable1.start();
                }
                break;

            case R.id.btn_send:
                if (animationDrawable1.isRunning()) {
                    rocket_bg.startAnimation(animation);
                } else {
                    Toast.makeText(getApplicationContext(), "先点火！", Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
}
