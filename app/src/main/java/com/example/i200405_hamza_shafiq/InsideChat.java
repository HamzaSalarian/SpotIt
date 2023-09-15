package com.example.i200405_hamza_shafiq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class InsideChat extends AppCompatActivity {

ImageButton audio;
ImageButton video;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_inside);

        audio = findViewById(R.id.a_call);
        video = findViewById(R.id.v_call);

        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(InsideChat.this, AudioCall.class);
                startActivity(a);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(InsideChat.this, VideoCall.class);
                startActivity(v);
            }
        });

    }
}
