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

import com.adapter.RVBlockReportAdapter;
import com.mentorfy.R;

public class BlockReportFragment extends Fragment {
    RecyclerView rvBlockReport;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.block_report_fragment,container,false);
        rvBlockReport=view.findViewById(R.id.rvBlockReport);
        rvBlockReport.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvBlockReport.setAdapter(new RVBlockReportAdapter(getActivity()));
        return view;
    }
}
