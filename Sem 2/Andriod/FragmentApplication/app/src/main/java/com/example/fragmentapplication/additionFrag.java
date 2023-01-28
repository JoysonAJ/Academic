package com.example.fragmentapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class additionFrag extends Fragment {

        View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_addition, container, false);
        Button Adds = view.findViewById(R.id.Addbtn);
        TextView t1,t2,t3;
        t1 = view.findViewById(R.id.n1);
        t2 = view.findViewById(R.id.n2);
        t3 = view.findViewById(R.id.ans);

        Adds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(t1.getText().toString()) + Integer.parseInt(t2.getText().toString());
                t3.setText(""+num1);
            }
        });

        return view;
    }
}