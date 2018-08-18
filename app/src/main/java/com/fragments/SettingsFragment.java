package com.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.mentorfy.R;

public class SettingsFragment extends Fragment implements View.OnClickListener {
   LinearLayout llNotificationSetting,llContactFAQ;
   Fragment fragment;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.settings_frag,container,false);
        llContactFAQ=view.findViewById(R.id.llContactFAQ);
        llNotificationSetting=view.findViewById(R.id.llNotificationSetting);
        llNotificationSetting.setOnClickListener(this);
        llContactFAQ.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.llContactFAQ:
                fragment=new ContactFAQFragment();
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container,fragment)
                        .addToBackStack("")
                        .commit();
                break;
            case R.id.llNotificationSetting:
                fragment=new NotificationFragment();
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container,fragment)
                        .addToBackStack("")
                        .commit();
                break;
        }
    }
}
