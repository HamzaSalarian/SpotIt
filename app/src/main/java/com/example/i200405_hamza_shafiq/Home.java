package com.example.i200405_hamza_shafiq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    ImageButton sera;
    ImageButton cha;
    ImageButton pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        sera = findViewById(R.id.hsearch);
        cha = findViewById(R.id.hchat);
        pro = findViewById(R.id.hprofile);
        sera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ser = new Intent(Home.this, Search.class);
                startActivity(ser);
            }
        });

        cha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ch = new Intent(Home.this, Chat.class);
                startActivity(ch);
            }
        });

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pr = new Intent(Home.this, Profile.class);
                startActivity(pr);
            }
        });


    }
}
