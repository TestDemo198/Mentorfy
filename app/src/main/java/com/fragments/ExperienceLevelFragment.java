package com.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adapter.RVExperienceLevelAdaptor;
import com.mentorfy.R;

public class ExperienceLevelFragment extends Fragment {
    RecyclerView rvExperienceLevels;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.experience_level,container,false);
        rvExperienceLevels=view.findViewById(R.id.rvExperienceLevels);
        rvExperienceLevels.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvExperienceLevels.setAdapter(new RVExperienceLevelAdaptor(getActivity()));
        return view;
    }
}
