package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name, Passwords;
    Button sbt;
    TextView ans;
    private int counter = 6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.Names);
        Passwords = findViewById(R.id.Pass);
        sbt = findViewById(R.id.Btn);

        ans = findViewById(R.id.lst);


        sbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validate(Name.getText().toString(), Passwords.getText().toString());
            }
        });

    }

    private void Validate(String username, String userpassword) {
        if (username.equals("Ashil") && userpassword.equals("123456")) {
            Intent intent = new Intent(MainActivity.this, LoginPage2.class);
            startActivity(intent);
        }else {
            counter -= 1;

            if (counter < 1){
                sbt.setEnabled(false);
                Toast.makeText(this,"Invalid credentials", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this," Chance left ->"+counter, Toast.LENGTH_LONG).show();
            }
        }
    }
}
