package com.example.externalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String SHARED_PREF_NAME = "Mypref";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";
    EditText name, email;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.username);
        email = findViewById(R.id.emailId);
        save = findViewById(R.id.btnSubmit);

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        String username = sharedPreferences.getString(KEY_NAME, null);
        if (username != null) {
            Intent intent = new Intent(MainActivity.this, SecondActivity2.class);
            startActivity(intent);
        }

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_NAME, name.getText().toString());
                editor.putString(KEY_EMAIL, email.getText().toString());
                editor.apply();
                Intent intent = new Intent(MainActivity.this, SecondActivity2.class);
                startActivity(intent);
            }
        });
    }


}