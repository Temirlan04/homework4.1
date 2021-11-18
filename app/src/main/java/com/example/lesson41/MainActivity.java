package com.example.lesson41;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Model_of_Continet>arrayList;
    private Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();
        arrayList.add(new Model_of_Continet(R.drawable.ic_africa,"Africa", 111));

        arrayList.add(new Model_of_Continet(R.drawable.ic_eurasia,"Eurasia",222));

        arrayList.add(new Model_of_Continet(R.drawable.ic_north_america,"America", 333));

        arrayList.add(new Model_of_Continet(R.drawable.ic_south_america,"NAmerica",444));

        arrayList.add(new Model_of_Continet(R.drawable.antardica,"Antardica",555));

        arrayList.add(new Model_of_Continet(R.drawable.australia,"Australia", 666));

        RecyclerView recyclerView = findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.setList(arrayList);
        recyclerView.setAdapter(adapter);

        adapter.setListener(model_of_continet -> {
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("key1",model_of_continet.getId());
            startActivity(intent);
        });


    }
}