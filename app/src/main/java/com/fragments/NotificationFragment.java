package com.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mentorfy.CommanActivity;
import com.mentorfy.R;

public class NotificationFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.notification_setting,container,false);
        ((CommanActivity)getActivity()).setTitleTool("Notifications");
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ((CommanActivity)getActivity()).setTitleTool("Settings");
    }
}
