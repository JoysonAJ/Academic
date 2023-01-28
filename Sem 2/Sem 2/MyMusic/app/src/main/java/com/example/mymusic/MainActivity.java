package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button start,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.startId);
        stop = findViewById(R.id.stopId);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if(v == start){
            Toast.makeText(this,"Music started",Toast.LENGTH_SHORT).show();
            startService(new Intent(this,Mymusic.class));
        }else{
            if(v == stop){
                Toast.makeText(this,"Music stop",Toast.LENGTH_SHORT).show();
                stopService(new Intent(this,Mymusic.class));
            }
        }
    }
}