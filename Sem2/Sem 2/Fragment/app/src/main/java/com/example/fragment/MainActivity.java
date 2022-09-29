package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fragBtn1,fragbt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragBtn1 = findViewById(R.id.Btn1);
        fragBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FunctionFragment(new Fragment1());
            }
        });
        /*fragbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replceFragment(new Fragment2());
            }
        });*/
    }


    private void FunctionFragment(Fragment fragment1) {
        FragmentManager fragment_manager = getSupportFragmentManager();
        FragmentTransaction fragment_Transaction = fragment_manager.beginTransaction();
        fragment_Transaction.replace(R.id.frame,fragment1).commit();

    }

//    public void replaceFragment(Fragment1 fragments) {
//        FragmentManager fragment_manager = getSupportFragmentManager();
//        FragmentTransaction fragment_Transaction = fragment_manager.beginTransaction();
//        fragment_Transaction.replace(R.id.Frame1,fragments);
//        fragment_Transaction.commit();
//    }
}