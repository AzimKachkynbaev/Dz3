package com.example.dz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

     RecyclerView recyclerView;
     AdapterBook adapterBook;
     List<Model> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        recyclerView = findViewById(R.id.rv);

        adapterBook = new AdapterBook(list, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterBook);

        list.add(new Model("NARUTO","7 - хокаге",R.drawable.naruto1));
        list.add(new Model("DANZO","придатель",R.drawable.danzo1));
        list.add(new Model("ITACHI","придатель",R.drawable.itachi1));
        list.add(new Model("LEE","спортцмен",R.drawable.lee1));
        list.add(new Model("CACAWI","учитель",R.drawable.kaka1));
    }
}