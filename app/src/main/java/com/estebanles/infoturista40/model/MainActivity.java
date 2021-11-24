package com.estebanles.infoturista40.model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.estebanles.infoturista40.R;
import com.estebanles.infoturista40.adapter.adapterRecycler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void destinos (View view){

        Intent intentMain = new Intent(MainActivity.this, adapterRecycler.class);
        startActivity(intentMain);
    }
}