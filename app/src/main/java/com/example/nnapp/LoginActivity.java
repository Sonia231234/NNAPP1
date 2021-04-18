package com.example.nnapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

        Button acceder, registrarse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        acceder = findViewById(R.id.acceder);
        registrarse = findViewById(R.id.registrarse);

        acceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acceder = new Intent(LoginActivity.this, navigation_drawer.class);
                startActivity(acceder);
            }


        });

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrarse = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(registrarse);
            }


        });

    }
    //Los botones de imagenes los estoy poniendo solo con un texto porque nose como mandarlos a una liga de paginas web
    public void botonsito_de_facebook(View view){
        Toast.makeText(this, "El boton de facebook si sirve", Toast.LENGTH_SHORT).show();
    }

    public void botonsito_de_gmail(View view){
        Toast.makeText(this, "El boton de facebook si sirve", Toast.LENGTH_SHORT).show();
    }
    public void botonsito_de_instagram(View view){
        Toast.makeText(this, "El boton de facebook si sirve", Toast.LENGTH_SHORT).show();
    }
}