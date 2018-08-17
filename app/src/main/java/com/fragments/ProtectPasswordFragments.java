package com.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mentorfy.HomeActivity;
import com.mentorfy.R;

public class ProtectPasswordFragments extends Fragment implements View.OnClickListener {
    Button bDone;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_protect_password,container,false);
        bDone=view.findViewById(R.id.bDone);
        bDone.setOnClickListener(this);
       return view;
    }

    @Override
    public void onClick(View view) {
        getActivity().startActivity(new Intent(getActivity(), HomeActivity.class));
    }
}
