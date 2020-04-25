package com.yt.khadamat.menu.plumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

import com.yt.khadamat.R;

import java.io.IOException;
import java.io.InputStream;

public class plumber extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumber);
        setTitle("Plombier");

        //getSupportActionBar().setBackgroundDrawable( new ColorDrawable(Color.parseColor("#5e9c00")));

        MyListData[] myListData = new MyListData[] {
                new MyListData("Yassin TAHRGUIT","La Médina de Rabat", R.drawable.bill_gates),
                new MyListData("Anass OUJRI","Les Oudayas", R.drawable.jeff_bezos),
                new MyListData("Nour eddine ELKAFFOU","Hassan", R.drawable.eddison),
                new MyListData("Nadir ADDAM","L'Océan ", R.drawable.henry_ford),
                new MyListData("Nouaman AYADI","Agdal", R.drawable.elon_musk),
                new MyListData("Said AMORSSOU","Hay Riad", R.drawable.steve_jobs),
                new MyListData("Mounir LAHYANI","Aakkari ", R.drawable.steve_wozniak),
                new MyListData("Marwan KHABBOUZ","Yacoub El Mansour", R.drawable.warren_buffet),
                new MyListData("Fouad BOUBKER","Massira", R.drawable.fouad_boubker),
                new MyListData("Rachid AYATLLAH","Souissi", R.drawable.nikola_tesla),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
