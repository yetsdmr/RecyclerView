package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<mesajModel> list;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    adapter adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        listDoldur();
    }

    public void tanimla(){
        recyclerView = findViewById(R.id.rView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
    public void listDoldur(){
        mesajModel m1 = new mesajModel("Niloya","mehaba",R.drawable.niloya);
        mesajModel m2 = new mesajModel("Mete","merhaba",R.drawable.mete);
        list.add(m1);
        list.add(m2);
        adp = new adapter(this,list);
        recyclerView.setAdapter(adp);

    }
}