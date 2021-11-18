package com.example.lesson41;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private Adapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Model_of_Continet> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int id = getIntent().getIntExtra("key1",1);
        if (id == 111){
            arrayList.add(new Model_of_Continet(R.drawable.ic_abidjan,"Abidjan"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_kano,"Kano"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_laynda,"Laynda"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_giza,"Giza"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_dar_as_salam,"Dar-as-salam"));



        }else if (id == 222){
            arrayList.add(new Model_of_Continet(R.drawable.ic_kz,"Kazakhstan"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_pt,"Portugal"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_kg,"Kyrgyzstan"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_kr,"Korea"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_mn,"Mongolia"));


        }else if (id == 333){
            arrayList.add(new Model_of_Continet(R.drawable.ic_bm,"Bermuda"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_fr,"France"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_ca,"Canada"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_gb,"United Kingdom"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_us,"USA"));


        }else if (id == 444){
            arrayList.add(new Model_of_Continet(R.drawable.ic_bo,"Bolivia"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_py,"Paraguay"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_ar,"Argentina"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_br,"Brazil"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_co,"Colombia"));


        }else if (id == 666){
            arrayList.add(new Model_of_Continet(R.drawable.ic_au,"Sidney"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_pw,"Palau"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_to,"Tonga"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_vu,"Vanuatu"));
            arrayList.add(new Model_of_Continet(R.drawable.ic_ws,"Samoa"));


        }

        recyclerView = findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.setList(arrayList);
        recyclerView.setAdapter(adapter);
    }
}