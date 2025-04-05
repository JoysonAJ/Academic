package com.example.a01_fibonoci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Second extends AppCompatActivity {

    int[] fiboSeries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int fiboLimit = getIntent().getIntExtra("limitFibo", 1);
        fiboSeries = new int[fiboLimit];

        fiboSeries[0] = 0;
        fiboSeries[1] = 1;
        for (int i = 2; i < fiboLimit; i++) {
            fiboSeries[i] = fiboSeries[i - 1] + fiboSeries[i - 2];
        }

        List<Integer> fiboNumbers = new ArrayList<>();
        for (int i = 0; i < fiboLimit; i++) {
            fiboNumbers.add(fiboSeries[i]);
        }

        ListView listView = findViewById(R.id.fiboViewList);
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, fiboNumbers);
        listView.setAdapter(adapter);


    }
}
