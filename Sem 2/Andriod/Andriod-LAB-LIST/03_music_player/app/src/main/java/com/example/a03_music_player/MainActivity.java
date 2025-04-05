package com.example.a03_music_player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button startMusic,stopMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startMusic = findViewById(R.id.startMusic);
        stopMusic = findViewById(R.id.stopMusic);

        startMusic.setOnClickListener(this);
        stopMusic.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == startMusic){
            Toast.makeText(this, "Music Started", Toast.LENGTH_LONG).show();
            startService(new Intent(this,MyMusic.class));
        }
        else{
            Toast.makeText(this, "Music Stoped", Toast.LENGTH_LONG).show();
            stopService(new Intent(this,MyMusic.class));
        }
    }
}