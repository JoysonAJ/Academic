package com.example.a01_fibonoci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText inputText;
    Button fiboButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.InputData);
        fiboButton = findViewById(R.id.fiboButton);

        fiboButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberLimit = Integer.parseInt(inputText.getText().toString());

                Intent nextPage = new Intent(MainActivity.this,Second.class);
                nextPage.putExtra("limitFibo",numberLimit);
                startActivity(nextPage);
            }
        });
    }
}