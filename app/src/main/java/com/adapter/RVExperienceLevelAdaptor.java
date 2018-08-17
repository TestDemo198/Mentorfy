package com.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mentorfy.R;

public class RVExperienceLevelAdaptor extends RecyclerView.Adapter<RVExperienceLevelAdaptor.RVExperienceLevelHolder> {
    public RVExperienceLevelAdaptor(FragmentActivity activity) {
    }

    @NonNull
    @Override
    public RVExperienceLevelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_experience,parent,false);
        return new RVExperienceLevelHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVExperienceLevelHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class RVExperienceLevelHolder extends RecyclerView.ViewHolder {
        public RVExperienceLevelHolder(View itemView) {
            super(itemView);
        }
    }
}
