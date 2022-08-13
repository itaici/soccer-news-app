package com.example.soccernews.domain;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class News {
    @PrimaryKey
    public int cod;
    public String title;
    public String description;
    public String image;
    public String link;
    public boolean favorite;

}
