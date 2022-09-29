package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText userId, usrName, usrPass;
    Button insertData, deleteData, updateData, fetchData;
    dataBaseManger dbManger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userId = findViewById(R.id.ID);
        usrName = findViewById(R.id.userName);
        usrPass = findViewById(R.id.password);

        dbManger = new dataBaseManger(this);
        try {
            dbManger.open();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertData(View view) {
        dbManger.insert(usrName.getText().toString(), usrPass.getText().toString());
    }

    public void deleteData(View view) {
        dbManger.Delete(Long.parseLong(userId.getText().toString()));
    }

    public void updateData(View view) {
        dbManger.Update( int) (Long.parseLong(userId.getText().toString()), usrName.getText().toString(), usrPass.getText().toString());
    }

    public void fetch(View view) {
        Cursor cursor = dbManger.fetch();

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(cursor.getColumnIndexOrThrow(dataBaseHelper.USER_ID));
                String name = cursor.getString(cursor.getColumnIndexOrThrow(dataBaseHelper.USER_NAME));
                String password = cursor.getString(cursor.getColumnIndexOrThrow(dataBaseHelper.USER_PASSWORD));
                Log.i("DATABASE", "UserInformation" + id + "User Name" + name + "User Password" + password);
            } while (cursor.moveToNext());
        }
    }
}