package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Horizontal extends RecyclerView.Adapter<CardAdapter> {

    public List<Card> data;

    public Horizontal(List<Card> data){
        this.data = data;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @NonNull
    @Override
    public CardAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        CardAdapter cd = new CardAdapter(v);
        return cd;
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter cd, int i) {
        cd.fillData(data.get(i));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
