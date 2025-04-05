package com.example.a02_fragment_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Add, sub, multiply, divBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Add = findViewById(R.id.add);
        sub = findViewById(R.id.subBtn);
        multiply = findViewById(R.id.mulBtn);
        divBtn = findViewById(R.id.div);

        Add.setOnClickListener(this);
        sub.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divBtn.setOnClickListener(this);
    }

    private void TransformFragment(Fragment Fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.FrameLayout, Fragment).commit();
    }

    @Override
    public void onClick(View v) {
        if (v == multiply)
            TransformFragment(new Mul());
        else if (v == divBtn)
            TransformFragment(new Div());
        else if (v == Add)
            TransformFragment(new Addition());
        else if (v == sub)
            TransformFragment(new Sub());
    }
}

