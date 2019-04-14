package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public int sz_ld;
    public List<Card> data;
    RecyclerView rv;
    public int sz_lh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.sz_ld = 10;
        genListData();
        this.sz_lh = 7;
        this.rv=findViewById(R.id.rvVertical);

        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        this.rv.setLayoutManager(llm);
        this.rv.setHasFixedSize(true);

        Vertical adapter = new Vertical(this.sz_lh, this.data);
        this.rv.setAdapter(adapter);


        this.sz_lh = 10;


    }

    public void genListData(){
        this.data = new ArrayList<>();
        for(int i = 0; i < this.sz_ld; i++){
            this.data.add(new Card(i, R.drawable.ic_launcher_background, "Карточка"));
        }
    }

}
