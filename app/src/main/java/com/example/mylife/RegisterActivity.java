package com.example.mylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    public EditText emailid, password;
    Button btnSingUp, btnRegisterUp, btnLoginIn;
    TextView singIn;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registr_activity);
        emailid = findViewById(R.id.ETemail);
        password = findViewById(R.id.ETpassword);
        btnSingUp = findViewById(R.id.SignUp);
        btnRegisterUp = findViewById(R.id.Register);
        btnLoginIn = findViewById(R.id.Login);

        btnLoginIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Login = new Intent(getApplicationContext(), LoginRegistrActivity.class);
                startActivity(Login);
            }
        });

    }


}
