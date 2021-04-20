package com.example.nnapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity<DatabaseReference> extends AppCompatActivity {

     EditText mEditTextNombre;
     EditText mEditTextApellido;
     EditText mEditTextCorreo;
     EditText mEditTextTextContraseña;
     Button mButtonRegistro;

    FirebaseAuth mAuth;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = (DatabaseReference) FirebaseDatabase.getInstance().getReference();

        mEditTextNombre = (EditText) findViewById(R.id.editTextTextNombre);
        mEditTextApellido = (EditText) findViewById(R.id.editTextTextApellido);
        mEditTextCorreo = (EditText) findViewById(R.id.editTextTextCorreo);
        mEditTextTextContraseña = (EditText) findViewById(R.id.editTextTextContraseña);
        mButtonRegistro = (Button) findViewById(R.id.buttonRegistro);



    }
    private void dameToastdeerror(String Error){

    }
}