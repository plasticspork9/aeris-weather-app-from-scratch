package com.example.aerisweatherapp.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aerisweatherapp.R;
import com.example.aerisweatherapp.model.AerisResponse;

import java.util.List;

public class AerisAdapter extends RecyclerView.Adapter<AerisViewholder> {
    private List<AerisResponse.Response.Period> periodList;

    public AerisAdapter(List<AerisResponse.Response.Period> periodList) {
        this.periodList = periodList;
    }

    @NonNull
    @Override
    public AerisViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View view = new AerisViewholder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.viewholder_aeris, viewGroup, false));
        return new AerisViewholder()
    }

    @Override
    public void onBindViewHolder(@NonNull AerisViewholder aerisViewholder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
