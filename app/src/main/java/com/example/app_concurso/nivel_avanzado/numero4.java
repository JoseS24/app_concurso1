package com.example.app_concurso.nivel_avanzado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.app_concurso.R;

public class numero4 extends AppCompatActivity {

    ImageButton play;
    MediaPlayer mp2;
    Button pasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero4);

        pasar = (Button) findViewById(R.id.pasar5);
        play = (ImageButton) findViewById(R.id.num4);

        pasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(numero4.this, numero5.class));
            }
        });
    }
}