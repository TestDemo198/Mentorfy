package com.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mentorfy.R;

public class RVMentorsAdator extends RecyclerView.Adapter<RVMentorsAdator.RVMentorsHolder> {
    public RVMentorsAdator(FragmentActivity activity) {
    }

    @NonNull
    @Override
    public RVMentorsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_mentors,parent,false);
       return new RVMentorsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVMentorsHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class RVMentorsHolder extends RecyclerView.ViewHolder {
        public RVMentorsHolder(View itemView) {
            super(itemView);
        }
    }
}
