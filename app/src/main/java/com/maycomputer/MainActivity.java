package com.maycomputer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnBuild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button Start Build
        btnBuild = (Button) findViewById(R.id.build);

        btnBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBuild = new Intent(getApplicationContext(), Build.class);
                startActivity(iBuild);
            }
        });
    }


    //Button Setting
    public void ButtonOnClick(View view) {
    }

    public void setting(View view) {
        Intent intent = new Intent(MainActivity.this, setting.class);
        startActivity(intent);
    }

    //Button About
    public void about(View view) {
        Intent intent = new Intent(MainActivity.this, about.class);
        startActivity(intent);
    }

    //button Your Build
    public void hasil(View view){
        Intent intent = new Intent(MainActivity.this, hasil.class);
        startActivity(intent);
    }

}