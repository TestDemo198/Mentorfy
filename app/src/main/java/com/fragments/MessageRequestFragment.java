package com.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.adapter.RVMessagesAdater;
import com.mentorfy.R;

public class MessageRequestFragment extends Fragment implements View.OnClickListener {
    RecyclerView rvMessageRequest;
    TextView tvMessage,tvRequest;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_message_request,container,false);
        rvMessageRequest=view.findViewById(R.id.rvMessageRequest);
        rvMessageRequest.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvMessageRequest.setAdapter(new RVMessagesAdater(getActivity()));
        tvMessage=view.findViewById(R.id.tvMessage);
        tvRequest=view.findViewById(R.id.tvRequest);
        tvMessage.setOnClickListener(this);
        tvRequest.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvMessage:
                tvMessage.setTextColor(Color.parseColor("#3598DB"));
                tvRequest.setTextColor(Color.parseColor("#FF434343"));
                break;
            case R.id.tvRequest:
                tvRequest.setTextColor(Color.parseColor("#3598DB"));
                tvMessage.setTextColor(Color.parseColor("#FF434343"));
                break;
        }
    }
}
