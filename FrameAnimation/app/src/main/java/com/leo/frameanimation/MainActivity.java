package com.leo.frameanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView left = findViewById(R.id.image_left);
        final ImageView right = findViewById(R.id.image_right);

        Animation lanimation = AnimationUtils.loadAnimation(this, R.anim.translate_left);
        Animation ranimation = AnimationUtils.loadAnimation(this, R.anim.translate_right);

        left.startAnimation(lanimation);
        right.startAnimation(ranimation);

        lanimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                left.setVisibility(View.GONE);
                right.setVisibility(View.GONE);

                Intent intent = new Intent(MainActivity.this, RocketActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }
}
