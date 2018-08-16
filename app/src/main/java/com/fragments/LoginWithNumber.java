package com.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mentorfy.R;

public class LoginWithNumber extends Fragment implements View.OnClickListener {
    Button bContinue;
    Fragment fragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login_number, container, false);
        bContinue = view.findViewById(R.id.bContinue);
        bContinue.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        fragment = new ProtectPasswordFragments();
        getActivity().getSupportFragmentManager()
                .beginTransaction().replace(R.id.container, fragment)
                .addToBackStack("")
                .commit();
    }
}
