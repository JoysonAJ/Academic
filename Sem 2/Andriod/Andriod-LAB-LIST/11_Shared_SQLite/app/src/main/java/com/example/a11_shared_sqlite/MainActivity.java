package com.example.a11_shared_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button PrefanceButton;
    SharedPreferences sharedPreferences;

    public static final String SHARED_PREF_NAME = "My_Pref";
    public static final String KEY_REG_NO = "REG_NO";
    public static final String KEY_NAME = "name";


    Button insert, delete, update, read;
    EditText regno, name, course;

    EditText multi;

    dbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new dbHelper(this);

        regno = findViewById(R.id.Regno);
        name = findViewById(R.id.Name);
        course = findViewById(R.id.course);

        multi = findViewById(R.id.Display);

        insert = findViewById(R.id.Insert);
        delete = findViewById(R.id.DELETE);
        update = findViewById(R.id.UPDATE);
        read = findViewById(R.id.READ);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Boolean data = dbHelper.insert(regno.getText().toString(), name.getText().toString(), course.getText().toString());
                if (data) {
                    Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_SHORT).show();
                }

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(regno.getText().toString());
                dbHelper.Delete(num);
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                long result = dbHelper.Update(regno.getText().toString(), name.getText().toString(), course.getText().toString());

                if (result == -1) {
                    Toast.makeText(MainActivity.this, "Not Updated", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Updated", Toast.LENGTH_SHORT).show();
                }
            }
        });

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor = dbHelper.fetch();
                String result = " ";
                if (cursor.moveToFirst()) {
                    do {
                        String RegNum = cursor.getString(cursor.getColumnIndexOrThrow("RegisterNumber"));
                        String name = cursor.getString(cursor.getColumnIndexOrThrow("Username"));
                        String course = cursor.getString(cursor.getColumnIndexOrThrow("Course"));
                        String answer = RegNum + " " + name + " " + course + "\n";
                        result = result + " " + answer;
                    } while (cursor.moveToNext());
                }
                multi.setText(result);
            }
        });

//        Shared Pref Logic
        PrefanceButton = findViewById(R.id.SharedPref);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        PrefanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String studentRegno = regno.getText().toString();
                String studentName = name.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_REG_NO,studentRegno);
                editor.putString(KEY_NAME,studentName);
                editor.commit();
                editor.apply();
                Intent intent = new Intent(MainActivity.this,Second.class);
                startActivity(intent);
            }
        });

    }
}