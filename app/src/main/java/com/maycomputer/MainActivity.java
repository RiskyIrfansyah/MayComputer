package com.maycomputer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Switch mySwitch;
    private Button btnBuild, btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySwitch = (Switch) findViewById(R.id.mySwitch);

        //button Build
        btnBuild = (Button) findViewById(R.id.build);

        //button hasil

        btnBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBuild = new Intent(getApplicationContext(), Build.class);
                startActivity(iBuild);
            }
        });



    }

    public void ButtonOnClick(View view) {
    }

    public void setting(View view) {
        Intent intent = new Intent(MainActivity.this, setting.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent = new Intent(MainActivity.this, about.class);
        startActivity(intent);
    }





}