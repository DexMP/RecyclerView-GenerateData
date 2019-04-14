package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.ViewHolder {

    public CardView card;
    public RecyclerView rv;

    TextView title1;
    TextView title2;

    public HorizontalAdapter(@NonNull View itemView) {
        super(itemView);
        this.card = (CardView)itemView.findViewById(R.id.Horizontal);
        this.rv = (RecyclerView)itemView.findViewById(R.id.rvHorizontal);
        this.title1 = (TextView)itemView.findViewById(R.id.title1);
        this.title2 = (TextView)itemView.findViewById(R.id.title2);
    }

    public void fillData(List<Card> d, int i, String title){
        LinearLayoutManager llm = new LinearLayoutManager(card.getContext(), LinearLayoutManager.HORIZONTAL, false);
        this.rv.setLayoutManager(llm);
        this.rv.setHasFixedSize(true);

        Horizontal adapter = new Horizontal(d);
        this.rv.setAdapter(adapter);

        this.title1.setText(title + i);
        this.title2.setText("ЕЩЁ:");
    }
}
