package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Vertical extends RecyclerView.Adapter<HorizontalAdapter> {

    public int sz_v;
    public List<Card> data;

    public Vertical(int sz, List<Card> d){
        this.sz_v = sz;
        this.data = d;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @NonNull
    @Override
    public HorizontalAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.horizontal, viewGroup, false);
        HorizontalAdapter hz = new HorizontalAdapter(v);
        return hz;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalAdapter hz, int i) {
        hz.fillData(this.data, i, "Строка");
    }

    @Override
    public int getItemCount() {
        return sz_v;
    }
}
