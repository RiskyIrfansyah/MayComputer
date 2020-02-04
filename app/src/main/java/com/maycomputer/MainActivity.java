package com.maycomputer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.cardview.widget.CardView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

public class MainActivity extends AppCompatActivity {

    private CardView btnBuild;
    private CardView btnHasil;
    private CardView btnSetting;
    private CardView btnAbout;

    public static AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button Start Build
        btnBuild = (CardView) findViewById(R.id.build1);
        //button Hasil
        btnHasil = (CardView) findViewById(R.id.hasil1);
        //button Setting
        btnSetting = (CardView) findViewById(R.id.setting1);
        //button about
        btnAbout = (CardView) findViewById((R.id.about1));

        btnBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBuild = new Intent(getApplicationContext(), Build.class);
                startActivity(iBuild);
            }
        });

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBuild = new Intent(getApplicationContext(), hasil.class);
                startActivity(iBuild);
            }
        });

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBuild = new Intent(getApplicationContext(), setting.class);
                startActivity(iBuild);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBuild = new Intent(getApplicationContext(), about.class);
                startActivity(iBuild);
            }
        });
    }

}