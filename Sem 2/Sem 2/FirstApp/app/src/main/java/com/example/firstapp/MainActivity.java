package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, ans;
    Button Add, Sub, Mul, Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.N1);
        num2 = findViewById(R.id.N2);
        ans = findViewById(R.id.Ans);

        Add = findViewById(R.id.ADD);
        Sub = findViewById(R.id.Sub);
        Mul = findViewById(R.id.Mul);
        Div =findViewById(R.id.Div);



                Add.setOnClickListener(new View.OnClickListener() {
                    @Override

                    public void onClick(View v) {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt((num2.getText().toString()));
                        int sum = n1 + n2;
                        ans.setText(" " + sum + " ");
                    }
                });

                Sub.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt((num2.getText().toString()));
                        int Def = n1 - n2;
                        ans.setText(" " + Def + " ");
                    }
                });

                Div.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt((num2.getText().toString()));
                        int Div = n1 / n2;
                        ans.setText(" " + Div + " ");
                    }
                });

                Mul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt((num2.getText().toString()));
                        int mul = n1 * n2;
                        ans.setText(" " + mul + " ");
                    }
                });

    }
}