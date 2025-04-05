package com.example.a10_internal_and_extenal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    Button internalSave, internalLoad, externalSave, externalLoad;
    EditText inputText;

    String INTERNAL_FILE = "Internal.txt";

    String EXTERNAL_FILE = "External.txt";
    String FILE_PATH = "Mydir";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.textInput);

        internalSave = findViewById(R.id.InterStore);
        internalLoad = findViewById(R.id.interLoad);

        externalLoad = findViewById(R.id.exLoad);
        externalSave = findViewById(R.id.exStore);


//        Internal Storage location
//        /data/data/com.example.a10_internal_and_extenal/files/Internal.txt
        internalSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = inputText.getText().toString();
                try {
                    FileOutputStream fileOutputStream = openFileOutput(INTERNAL_FILE, MODE_PRIVATE);
                    fileOutputStream.write(text.getBytes());
                    inputText.getText().clear();
                    Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        internalLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileInputStream fileInputStream = openFileInput(INTERNAL_FILE);
                    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    String text = "";
                    StringBuilder builderText = new StringBuilder();
                    while ((text = bufferedReader.readLine()) != null) {
                        builderText.append(text);
                    }
                    inputText.setText(builderText.toString());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        externalSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE}, 123);
                }

                File file = new File(getExternalFilesDir(FILE_PATH), EXTERNAL_FILE);

                String text = inputText.getText().toString();
                FileOutputStream fileOutputStream = null;
                try {
                    fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(text.getBytes());
                    inputText.getText().clear();
                    Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_LONG).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        externalLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(MainActivity.this, (Manifest.permission.READ_EXTERNAL_STORAGE)) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE,}, 0);
                }
                File file = new File(getExternalFilesDir(FILE_PATH), EXTERNAL_FILE);

                FileInputStream fileInputStream = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    String text = "";
                    StringBuilder builderText = new StringBuilder();
                    while ((text = bufferedReader.readLine()) != null) {
                        builderText.append(text);
                    }
                    inputText.setText(builderText.toString());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}