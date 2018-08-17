package com.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mentorfy.R;

public class RVMessagesAdater extends RecyclerView.Adapter<RVMessagesAdater.RVMessagesHolder> {
    public RVMessagesAdater(FragmentActivity activity) {
    }

    @NonNull
    @Override
    public RVMessagesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_messages,parent,false);
        return new RVMessagesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVMessagesHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class RVMessagesHolder extends RecyclerView.ViewHolder {
        public RVMessagesHolder(View itemView) {
            super(itemView);
        }
    }
}
