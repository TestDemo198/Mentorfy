package com.mentorfy;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 3000;
    Toolbar toolbar;
    private TextView tvLogo,tvTitle;
    private LinearLayout llSplash;
    private Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initUI();
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setVisibility(View.GONE);
        setSupportActionBar(toolbar);
    }

    private void initUI() {
        tvLogo=findViewById(R.id.tvLogo);
        tvTitle=findViewById(R.id.tvTitle);
        llSplash=findViewById(R.id.llSplash);
        animation= AnimationUtils.loadAnimation(this,R.anim.splash);
        Typeface title = Typeface.createFromAsset(getAssets(),  "simplebold.otf");
        Typeface logo = Typeface.createFromAsset(getAssets(),  "simplebolditalic.otf");
        tvLogo.setTypeface(logo);
        tvTitle.setTypeface(title);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        llSplash.startAnimation(animation);
    }
}
