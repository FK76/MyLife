package com.example.mylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginRegistrActivity extends AppCompatActivity {
    public EditText emailid, password;
    Button btnSingUp, btnRegisterUp, btnLoginIn;
    TextView singIn, error;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        emailid = findViewById(R.id.ETemail);
        password = findViewById(R.id.ETpassword);
        btnSingUp = findViewById(R.id.SignUp);
        btnRegisterUp = findViewById(R.id.Register);
        btnLoginIn = findViewById(R.id.Login);


            btnRegisterUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Register = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(Register);
            }
        });

    }

    public void Toast(View view) {
        if (emailid.length() > 5 && password.length() > 5)
        {
            btnLoginIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent Personal = new Intent(getApplicationContext(), PersonalActivity.class);
                    startActivity(Personal);
                }
            });
        }
        else {
            Toast.makeText(LoginRegistrActivity.this,"not password or email",Toast.LENGTH_SHORT).show();

        }
    }

}
