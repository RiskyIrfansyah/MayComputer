package com.maycomputer;

import android.app.Application;

import androidx.room.Room;

public class MayComputer extends Application {

    public static AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "maycomputer").allowMainThreadQueries().build();
    }
}
