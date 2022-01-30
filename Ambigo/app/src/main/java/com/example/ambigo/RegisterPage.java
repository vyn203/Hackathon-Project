package com.example.ambigo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class RegisterPage extends AppCompatActivity{

    private FirebaseAuth mAuth;
    private TextView registerButton2;
    private EditText nameRegister, birthRegister, emailRegister, passwordRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        mAuth = FirebaseAuth.getInstance();

        registerButton2 = (Button)findViewById(R.id.registerButton2);

        nameRegister = (EditText)findViewById(R.id.nameRegister);
        birthRegister = (EditText)findViewById(R.id.birthRegister);
        emailRegister = (EditText)findViewById(R.id.emailRegister);
        passwordRegister = (EditText)findViewById(R.id.passwordRegister);


        registerButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser(){
        String name = nameRegister.getText().toString().trim();
        String birth = birthRegister.getText().toString().trim();
        String email = emailRegister.getText().toString().trim();
        String password = passwordRegister.getText().toString().trim();

        if(name.isEmpty()){
            nameRegister.setError("Full name required.");
            nameRegister.requestFocus();
            return;
        }

        if(birth.isEmpty()){
            birthRegister.setError("Month/Day/Year required.");
            birthRegister.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailRegister.setError("Provide valid email.");
            emailRegister.requestFocus();
            return;
        }

        if(password.isEmpty()){
            passwordRegister.setError("Please provide a password.");
            passwordRegister.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    User user = new User(name, birth, email);

                    FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(RegisterPage.this, "User has been registered successfully.", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(RegisterPage.this, "Failed to register. Try again.", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });
    }

    public void login(View v){
        Intent i = new Intent(this, LoginPage.class);
        startActivity(i);
    }

    public void home(View v){
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }

}