=package com.example.demorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> list;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        list = new ArrayList<>();
        list.add(new Model("Title", R.drawable.ic_launcher_background));
        list.add(new Model("Title 2", R.drawable.shop));
        list.add(new Model("Title", R.drawable.ic_launcher_background));
        list.add(new Model("Title 2", R.drawable.shop));

        adapter = new Adapter(MainActivity.this,list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);

    }
}
