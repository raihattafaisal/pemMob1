package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Barang extends AppCompatActivity {
    ListView LvBarang;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);

        LvBarang = findViewById(R.id.LvBarang);

    }
    public void dataBarang(){
        ArrayList<String> dataB = new ArrayList<>();
        dataB.add("Monitor");
        dataB.add("Mouse");
        dataB.add("Processor");
        dataB.add("Printer");

        ArrayAdapter<String>adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, dataB);

        LvBarang.setAdapter(adapter);

    }
}