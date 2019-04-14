package com.example.myapplication;

public class Card {
    int id;
    int photo_id;
    String name;

    Card(int id, int photo_id, String name) {
        this.id = id;
        this.photo_id = photo_id;
        this.name = name + id;
    }
}
