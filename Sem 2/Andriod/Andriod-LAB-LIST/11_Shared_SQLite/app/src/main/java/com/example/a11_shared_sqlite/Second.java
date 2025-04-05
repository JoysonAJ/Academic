package com.example.a11_shared_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Second extends AppCompatActivity {
    EditText regno, name;
    Button logout;

    SharedPreferences sharedPreferences;

    public static final String SHARED_PREF_NAME = "My_Pref";
    public static final String KEY_REG_NO = "REG_NO";
    public static final String KEY_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        regno = findViewById(R.id.number);
        name = findViewById(R.id.nameS);
        logout = findViewById(R.id.logout);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        String strRegno = sharedPreferences.getString(KEY_REG_NO, null);
        String strName = sharedPreferences.getString(KEY_NAME, null);

        name.setText(strName);
        regno.setText(strRegno);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Intent intent = new Intent(Second.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}