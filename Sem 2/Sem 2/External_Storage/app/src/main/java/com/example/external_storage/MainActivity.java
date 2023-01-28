package com.example.external_storage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    EditText fileName, fileText;
    String filePath = "MyFileDir";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fileName = findViewById(R.id.filename);
        fileText = findViewById(R.id.filText);
    }

    public boolean isExternalStrogeWritable() {
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
            return true;
        } else {
            return false;
        }
    }

    public void savedata(View view) {
        if (isExternalStrogeWritable()) {
            if (ContextCompat.checkSelfPermission(this, (Manifest.permission.WRITE_EXTERNAL_STORAGE)) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);
            }

            File textFile = new File(getExternalFilesDir(filePath), fileName.getText().toString());

           try{
               FileOutputStream fos = new FileOutputStream(textFile);
               fos.write(fileText.getText().toString().getBytes());
               fos.close();
               Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();
           }catch (FileNotFoundException e){
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           }

           fileText.setText(" ");


        }
        else{
            Toast.makeText(this, "Cannot save the text file ", Toast.LENGTH_LONG).show();
        }
    }

    public void loaddata(View view) {
        if (ContextCompat.checkSelfPermission(this, (Manifest.permission.WRITE_EXTERNAL_STORAGE)) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);
        }

        FileReader fileReader = null;
        File textFile = new File(getExternalFilesDir(filePath),fileName.getText().toString());
        StringBuilder stringBuilder = new StringBuilder();

        try{
            fileReader = new FileReader(textFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            while (text != null){
                stringBuilder.append(text).append("\n");
                text = bufferedReader.readLine();
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String content = "File Content is : "+stringBuilder.toString();
        fileText.setText(content);


    }
}