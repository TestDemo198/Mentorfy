package com.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.mentorfy.R;

public class RVBlockReportAdapter extends RecyclerView.Adapter<RVBlockReportAdapter.RVBlockReportHolder>{
    public RVBlockReportAdapter(FragmentActivity activity) {
    }

    @NonNull
    @Override
    public RVBlockReportHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_experience,parent,false);
       return new RVBlockReportHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVBlockReportHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class RVBlockReportHolder extends RecyclerView.ViewHolder {
        RadioButton rbBlockReport;
        public RVBlockReportHolder(View itemView) {
            super(itemView);
            rbBlockReport=itemView.findViewById(R.id.rbBlockReport);
            rbBlockReport.setText("Don't report abuse");
        }
    }
}
