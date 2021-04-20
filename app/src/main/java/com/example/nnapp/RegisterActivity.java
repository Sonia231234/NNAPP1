package com.example.nnapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class RegisterActivity<DatabaseReference> extends AppCompatActivity {

     EditText editTextTextNombre;
     EditText editTextTextApellido;
     EditText editTextTextCorreo;
     EditText editTextTextContraseña;
     Button mButtonRegistro;

    AwesomeValidation awesomeValidation;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firebaseAuth = FirebaseAuth.getInstance();
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this, R.id.editTextTextCorreo, Patterns.EMAIL_ADDRESS, R.string.Email_invalido);
        awesomeValidation.addValidation(this, R.id.editTextTextContraseña, ".{6,}",R.string.Contra_invalida);

        editTextTextNombre = (EditText) findViewById(R.id.editTextTextNombre);
        editTextTextApellido = (EditText) findViewById(R.id.editTextTextApellido);
        editTextTextCorreo = (EditText) findViewById(R.id.editTextTextCorreo);
        editTextTextContraseña = (EditText) findViewById(R.id.editTextTextContraseña);
        mButtonRegistro = (Button) findViewById(R.id.buttonRegistro);

        mButtonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String mail = editTextTextCorreo.getText().toString();
                String password = editTextTextContraseña.getText().toString();

                if(awesomeValidation.validate()){
                    firebaseAuth.createUserWithEmailAndPassword(mail,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(RegisterActivity.this, "Usuario asignado correctamente", Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        }
                    });
                }else{
                    Toast.makeText(RegisterActivity.this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
                }
            }

        });



    }
}