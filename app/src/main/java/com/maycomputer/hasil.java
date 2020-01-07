package com.maycomputer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hasil extends AppCompatActivity {
    private TextView txtHasilProce, txtHasilMobo, txtHasilVga, txtHasilRam, txtHasilHdd, txtHasilSsd,txtHasilPsu, txtHasilCase, txtHasilCpu, txtHasilMonit, txtHasilKeybo, txtHasilMouse, txtHasilFan;
    private Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txtHasilProce = (TextView) findViewById(R.id.txtHasilProce);
        txtHasilMobo = (TextView) findViewById(R.id.txtHasilMobo);
        txtHasilVga = (TextView) findViewById(R.id.txtHasilVga);
        txtHasilRam = (TextView) findViewById(R.id.txtHasilRam);
        txtHasilHdd = (TextView) findViewById(R.id.txtHasilHdd);
        txtHasilSsd = (TextView) findViewById(R.id.txtHasilSsd);
        txtHasilPsu = (TextView) findViewById(R.id.txtHasilPsu);
        txtHasilCase = (TextView) findViewById(R.id.txtHasilCase);
        txtHasilCpu = (TextView) findViewById(R.id.txtHasilCpu);
        txtHasilMonit = (TextView) findViewById(R.id.txtHasilMonit);
        txtHasilKeybo = (TextView) findViewById(R.id.txtHasilKeybo);
        txtHasilMouse = (TextView) findViewById(R.id.txtHasilMouse);
        txtHasilFan = (TextView) findViewById(R.id.txtHasilFan);
        btnEdit = (Button) findViewById(R.id.btnEdit);



        }


    public void Edit(View view) {
        Intent iEdit = new Intent(hasil.this, Build.class);
        startActivity(iEdit);
    }
}
