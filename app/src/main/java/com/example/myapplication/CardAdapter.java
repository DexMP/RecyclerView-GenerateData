package com.example.myapplication;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CardAdapter extends RecyclerView.ViewHolder {
    CardView cv;
    TextView id;
    ImageView photo_id;
    TextView name;

    public CardAdapter(View itemView) {
        super(itemView);
        this.cv = (CardView)itemView.findViewById(R.id.cv);
        this.id = (TextView)itemView.findViewById(R.id.id);
        this.photo_id = (ImageView)itemView.findViewById(R.id.photo_id);
        this.name = (TextView)itemView.findViewById(R.id.name);
    }

    public void fillData(Card d){
        this.id.setText(String.valueOf(d.id));
        this.photo_id.setImageResource(d.photo_id);
        this.name.setText(d.name);
    }
}
