package com.mentorfy;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 3000;
    Toolbar toolbar;
    private TextView tvLogo,tvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initUI();
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setVisibility(View.GONE);
        setSupportActionBar(toolbar);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },SPLASH_DISPLAY_LENGTH);
    }

    private void initUI() {
        tvLogo=findViewById(R.id.tvLogo);
        tvTitle=findViewById(R.id.tvTitle);
        Typeface title = Typeface.createFromAsset(getAssets(),  "simplebold.otf");
        Typeface logo = Typeface.createFromAsset(getAssets(),  "simplebolditalic.otf");
        tvLogo.setTypeface(logo);
        tvTitle.setTypeface(title);

    }
}
