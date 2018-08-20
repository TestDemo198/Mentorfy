package com.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mentorfy.R;

public class RVMentorsAdator extends RecyclerView.Adapter<RVMentorsAdator.RVMentorsHolder> {
    MentorRequest request;
    public RVMentorsAdator(FragmentActivity activity,MentorRequest request) {
        this.request=request;
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

    public class RVMentorsHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvMentorMe;
        public RVMentorsHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvMentorMe=itemView.findViewById(R.id.tvMentorMe);
            tvMentorMe.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (view.getId()==R.id.tvMentorMe)
            request.mentorRequestSend(getAdapterPosition());
            else
                request.mentorProfile(getAdapterPosition());
        }
    }
    public interface MentorRequest{
        public void mentorRequestSend(int pos);
        public  void mentorProfile(int pos);
    }
}
