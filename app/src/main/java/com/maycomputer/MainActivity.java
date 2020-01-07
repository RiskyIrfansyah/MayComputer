package com.maycomputer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Switch mySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySwitch = (Switch) findViewById(R.id.mySwitch);

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