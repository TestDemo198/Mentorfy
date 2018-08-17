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
import com.adapter.RVProfessionsAdaptor;
import com.mentorfy.R;

public class ProfessionsFragment extends Fragment{
    RecyclerView rvProfessions;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.professions,container,false);
        rvProfessions=view.findViewById(R.id.rvProfessions);
        rvProfessions.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvProfessions.setAdapter(new RVProfessionsAdaptor(getActivity()));
        return view;
    }
}
