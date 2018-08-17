package com.mentorfy;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.adapter.VPHomeAdapter;

public class HomeActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, TabLayout.OnTabSelectedListener {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager vpHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabLayout=findViewById(R.id.tabLayout);
        vpHome=findViewById(R.id.vpHome);
        addTab();
        vpHome.setAdapter(new VPHomeAdapter(HomeActivity.this,getSupportFragmentManager()));
        vpHome.addOnPageChangeListener(this);
        tabLayout.addOnTabSelectedListener(this);

    }

    private void addTab() {
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.problue));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.m));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.message));
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        tabLayout.getTabAt(position).select();

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public void setIcon(int i){
        switch (i){
            case 0:
                tabLayout.getTabAt(0).setIcon(R.mipmap.problue);
                tabLayout.getTabAt(1).setIcon(R.mipmap.m);
                tabLayout.getTabAt(2).setIcon(R.mipmap.message);
                break;

            case 1:
                tabLayout.getTabAt(0).setIcon(R.mipmap.pro);
                tabLayout.getTabAt(1).setIcon(R.mipmap.mblue);
                tabLayout.getTabAt(2).setIcon(R.mipmap.message);
                break;
            case  2:
                tabLayout.getTabAt(0).setIcon(R.mipmap.pro);
                tabLayout.getTabAt(1).setIcon(R.mipmap.m);
                tabLayout.getTabAt(2).setIcon(R.mipmap.messageblue);
                break;
        }

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        setIcon(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
