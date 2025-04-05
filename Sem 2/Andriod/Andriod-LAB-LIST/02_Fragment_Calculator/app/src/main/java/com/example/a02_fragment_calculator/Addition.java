package com.example.a02_fragment_calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Addition extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_addition, container, false);

        EditText num1,num2,res;
        Button add;

        num1 = view.findViewById(R.id.num1);
        num2 =view.findViewById(R.id.num2);
        res = view.findViewById(R.id.ans);

        add = view.findViewById(R.id.addNum);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numb1 = Integer.parseInt(num1.getText().toString());
                int numb2 = Integer.parseInt(num2.getText().toString());
                res.setText(" " + (numb1 + numb2));
            }
        });
        return view;
    }
}