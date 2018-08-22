package com.mentorfy;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.fragments.LoginWithNumber;
import com.fragments.ProtectPasswordFragments;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvLoginLinkedin, tvLoginPhoneNumber;
    Intent intent;
    Fragment fragment;
    private TextView tvLogo,tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        tvLogo=findViewById(R.id.tvLogo);
        tvTitle=findViewById(R.id.tvTitle);
        toolbar.setVisibility(View.GONE);
        setSupportActionBar(toolbar);
        initUI();
    }

    private void initUI() {
        tvLoginLinkedin = findViewById(R.id.tvLoginLinkedin);
        tvLoginPhoneNumber = findViewById(R.id.tvLoginPhoneNumber);
        Typeface title = Typeface.createFromAsset(getAssets(),  "simplebold.otf");
        Typeface logo = Typeface.createFromAsset(getAssets(),  "simplebolditalic.otf");
        tvLoginLinkedin.setOnClickListener(this);
        tvLoginPhoneNumber.setOnClickListener(this);
        tvLogo.setTypeface(logo);
        tvTitle.setTypeface(title);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvLoginLinkedin:
                fragment = new ProtectPasswordFragments();
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).addToBackStack("").commit();
                break;
            case R.id.tvLoginPhoneNumber:
                fragment = new LoginWithNumber();
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).addToBackStack("").commit();
                break;
        }
    }
}
