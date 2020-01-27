package com.maycomputer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.cardview.widget.CardView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnBuild;
    private Button btnHasil;
    private Button btnSetting;
    private Button btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button Start Build
        btnBuild = (Button) findViewById(R.id.build);
        //button Hasil
        btnHasil = (Button) findViewById(R.id.hasil);
        //button Setting
        btnSetting = (Button) findViewById(R.id.setting);
        //button about
        btnAbout = (Button) findViewById((R.id.about));

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