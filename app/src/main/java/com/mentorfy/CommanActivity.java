package com.mentorfy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.fragments.ExperienceLevelFragment;

public class CommanActivity extends AppCompatActivity {
    Toolbar toolbar;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comman);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        startFragments(getIntent().getStringExtra("type"));

    }

    private void startFragments(String type) {
        switch (type){
            case "Experience Level":
                toolbar.setTitle(type);
                fragment=new ExperienceLevelFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack("").commit();
                break;
        }

    }

}
