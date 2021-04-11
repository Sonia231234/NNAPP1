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

    }
}