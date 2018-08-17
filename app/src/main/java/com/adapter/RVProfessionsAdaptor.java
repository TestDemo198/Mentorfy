package com.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mentorfy.R;

public class RVProfessionsAdaptor extends RecyclerView.Adapter<RVProfessionsAdaptor.RVProfessionsHolder> {
    public RVProfessionsAdaptor(FragmentActivity activity) {
    }

    @NonNull
    @Override
    public RVProfessionsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_experience,parent,false);
       return new RVProfessionsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVProfessionsHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class RVProfessionsHolder extends RecyclerView.ViewHolder {
        public RVProfessionsHolder(View itemView) {
            super(itemView);
        }
    }
}
