package com.maycomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Build extends AppCompatActivity {
    private Button btnProce, btnMobo, btnVga, btnRam, btnHdd, btnSsd, btnPsu, btnCase, btnCpuC,
            btnMonit, btnKeybo, btnMouse, btnFanC, btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);

        btnProce = (Button) findViewById(R.id.buttonProce);
        btnMobo = (Button) findViewById(R.id.buttonMobo);
        btnVga = (Button) findViewById(R.id.buttonVga);
        btnRam = (Button) findViewById(R.id.buttonRam);
        btnHdd = (Button) findViewById(R.id.buttonHdd);
        btnSsd = (Button) findViewById(R.id.buttonSsd);
        btnPsu = (Button) findViewById(R.id.buttonPsu);
        btnCase = (Button) findViewById(R.id.buttonCase);
        btnCpuC = (Button) findViewById(R.id.buttonCpuCooler);
        btnMonit = (Button) findViewById(R.id.buttonMonitor);
        btnKeybo = (Button) findViewById(R.id.buttonKeyboard);
        btnMouse = (Button) findViewById(R.id.buttonMouse);
        btnFanC = (Button) findViewById(R.id.buttonFanCase);
        btnSave = (Button) findViewById(R.id.buttonSave);

        btnProce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iProce = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iProce);
            }
        });

        btnMobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMobo = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iMobo);
            }
        });

        btnVga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iVga = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iVga);
            }
        });

        btnRam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iRam = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iRam);
            }
        });

        btnHdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iHdd = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iHdd);
            }
        });

        btnSsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSsd = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iSsd);
            }
        });

        btnPsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPsu = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iPsu);
            }
        });

        btnCase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCase = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iCase);
            }
        });

        btnCpuC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCpuC = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iCpuC);
            }
        });

        btnMonit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMonit = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iMonit);
            }
        });

        btnKeybo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iKeybo = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iKeybo);
            }
        });

        btnMouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMouse = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iMouse);
            }
        });

        btnFanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iFanC = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iFanC);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSave = new Intent(getApplicationContext(), ListBuild.class);
                startActivity(iSave);
            }
        });


    }


    public void Processor(View view) {
    }
}
