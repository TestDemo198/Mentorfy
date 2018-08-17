package com.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.mentorfy.CommanActivity;
import com.mentorfy.R;

public class ProfileFragment extends Fragment implements View.OnClickListener {
    LinearLayout llEditProfile,llSettings;
    Intent intent;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.profile_fragment,container,false);
        llEditProfile=view.findViewById(R.id.llEditProfile);
        llSettings=view.findViewById(R.id.llSettings);
        llEditProfile.setOnClickListener(this);
        llSettings.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.llSettings:
                intent=new Intent(getActivity(), CommanActivity.class);
                intent.putExtra("type","Settings");
                startActivity(intent);
                break;
            case R.id.llEditProfile:
                intent=new Intent(getActivity(), CommanActivity.class);
                intent.putExtra("type","Edit Profile");
                startActivity(intent);
                break;
        }

    }
}
