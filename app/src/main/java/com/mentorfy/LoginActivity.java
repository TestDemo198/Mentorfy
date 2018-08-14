package com.mentorfy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.fragments.ProtectPasswordFragments;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvLoginLinkedin, tvLoginPhoneNumber;
    Intent intent;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setVisibility(View.GONE);
        setSupportActionBar(toolbar);
        initUI();
    }

    private void initUI() {
        tvLoginLinkedin = findViewById(R.id.tvLoginLinkedin);
        tvLoginPhoneNumber = findViewById(R.id.tvLoginPhoneNumber);

        tvLoginLinkedin.setOnClickListener(this);
        tvLoginPhoneNumber.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            default:
                fragment = new ProtectPasswordFragments();
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).addToBackStack("").commit();
                break;
        }
    }
}
