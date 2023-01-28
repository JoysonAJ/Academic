package com.example.fragmentapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addbtn,SubBtn,MulBtn,DivBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addbtn = findViewById(R.id.Btn1);
        SubBtn = findViewById(R.id.Sub);
        MulBtn = findViewById(R.id.Mul);
        DivBtn = findViewById(R.id.Div);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransferFragment(new additionFrag());
            }
        });

        SubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransferFragment(new SubtractionFragment());
            }
        });

        MulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransferFragment(new MultiplyFragment());
            }
        });

        DivBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransferFragment(new DivisionFrag());
            }
        });
    }

    private void TransferFragment(Fragment additionFrag) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,additionFrag).commit();
    }
}