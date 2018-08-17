package com.mentorfy;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.fragments.EditProfileFragment;
import com.fragments.ExperienceLevelFragment;
import com.fragments.ProfessionsFragment;
import com.fragments.SettingsFragment;

public class CommanActivity extends AppCompatActivity {
    Toolbar toolbar;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comman);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.setTitleTextColor(Color.BLACK);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        startFragments(getIntent().getStringExtra("type"));
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

    }

    private void startFragments(String type) {
        switch (type){
            case "Experience Level":
                toolbar.setTitle(type);
                fragment=new ExperienceLevelFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                break;
            case "Professions":
                toolbar.setTitle(type);
                fragment=new ProfessionsFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                break;
            case "Settings":
                toolbar.setTitle(type);
                fragment=new SettingsFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                break;
            case "Edit Profile":
                toolbar.setTitle(type);
                fragment=new EditProfileFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                break;
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
