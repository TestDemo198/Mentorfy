package com.fragments;

import android.app.Dialog;
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
import android.view.Window;
import android.widget.LinearLayout;

import com.adapter.RVMentorsAdator;
import com.mentorfy.CommanActivity;
import com.mentorfy.R;

public class MentorFragment extends Fragment implements View.OnClickListener, RVMentorsAdator.MentorRequest {
    RecyclerView rvMentors;
    LinearLayout llExperienceLevel,llProfession;
    Intent intent;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.mentor_fragment,container,false);
        rvMentors=view.findViewById(R.id.rvMentors);
        llExperienceLevel=view.findViewById(R.id.llExperienceLevel);
        llProfession=view.findViewById(R.id.llProfession);
        llProfession.setOnClickListener(this);
        llExperienceLevel.setOnClickListener(this);
        rvMentors.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rvMentors.setAdapter(new RVMentorsAdator(getActivity(),this));
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
            case R.id.llProfession:
                intent=new Intent(getActivity(), CommanActivity.class);
                intent.putExtra("type","Professions");
                startActivity(intent);
                break;
        }
    }

    @Override
    public void mentorRequestSend(int pos) {
        final Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.mentor_request_dialog);
        dialog.show();
    }

    @Override
    public void mentorProfile(int pos) {
        intent=new Intent(getActivity(),CommanActivity.class);
        intent.putExtra("type","Mentor Profile");
        startActivity(intent);
    }
}
