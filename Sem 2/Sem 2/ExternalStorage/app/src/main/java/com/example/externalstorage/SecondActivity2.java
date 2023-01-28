package com.example.externalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity2 extends AppCompatActivity {

    EditText userName, userEmail;
    Button logoutButton;

    public static final String SHARED_PREF_NAME = "Mypref";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        userName = findViewById(R.id.editName);
        userEmail = findViewById(R.id.emailId);
        logoutButton = findViewById(R.id.logOut);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        String name = sharedPreferences.getString(KEY_NAME, null);
        String email = sharedPreferences.getString(KEY_EMAIL, null);

        if (name != null && email != null) {
            userName.setText(name);
            userEmail.setText(email);
        }

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                finish();
                Toast.makeText(SecondActivity2.this,"Logout Sucessfully",Toast.LENGTH_LONG).show();
            }
        });

    }
}