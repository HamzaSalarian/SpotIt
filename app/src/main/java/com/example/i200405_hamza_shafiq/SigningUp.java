package com.example.i200405_hamza_shafiq;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SigningUp extends AppCompatActivity {

    Button sign;
    Button log;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        sign = findViewById(R.id.signup);
        log = findViewById(R.id.log_in);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent si = new Intent(SigningUp.this, Reset.class);
                startActivity(si);
            }

        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lo = new Intent(SigningUp.this , MainActivity.class);
                startActivity(lo);
            }
        });
    }


}
