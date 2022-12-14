package com.example.soccernews.data_local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.soccernews.domain.News;

@Database(entities = {News.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NewsDao newsDao();
}
