package com.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.adapter.RVMentorsAdator;
import com.mentorfy.CommanActivity;
import com.mentorfy.R;

public class MentorFragment extends Fragment implements View.OnClickListener {
    RecyclerView rvMentors;
    LinearLayout llExperienceLevel;
    Intent intent;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.mentor_fragment,container,false);
        rvMentors=view.findViewById(R.id.rvMentors);
        llExperienceLevel=view.findViewById(R.id.llExperienceLevel);
        llExperienceLevel.setOnClickListener(this);
        rvMentors.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rvMentors.setAdapter(new RVMentorsAdator(getActivity()));
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.llExperienceLevel:
                intent=new Intent(getActivity(), CommanActivity.class);
                intent.putExtra("type","Experience Level");
                startActivity(intent);
                break;
        }
    }
}
