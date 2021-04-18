package com.example.nnapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Blusas extends AppCompatActivity {

    GridView gridView;
    String[] numberWord = {"Blusa 1","Blusa 2","Blusa 3","Blusa 4","Blusa 5","Blusa 6","Blusa 7","Blusa 8"};
    int[] numberImage = {R.drawable.blusauno,R.drawable.blusados,R.drawable.blusatres,R.drawable.blusacuatro,R.drawable.blusacinco,
            R.drawable.blusaseis,R.drawable.blusasiete,R.drawable.blusaocho};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blusas);

        gridView = findViewById(R.id.grid_view);

        MainAdapter adapter = new MainAdapter(Blusas.this,numberWord,numberImage);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You Clicked" + numberWord[+
                        position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}