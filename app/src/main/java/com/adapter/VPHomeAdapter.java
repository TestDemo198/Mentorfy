package com.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fragments.LoginWithNumber;
import com.mentorfy.HomeActivity;

public class VPHomeAdapter extends FragmentPagerAdapter {
    public VPHomeAdapter(HomeActivity homeActivity, FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return new LoginWithNumber();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
