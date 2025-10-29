package com.jarak.myapplicationjarak;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Animals extends AppCompatActivity {

    MediaPlayer sonido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
    }


    public void sonarKanguro(View view){
        sonido = MediaPlayer.create(Animals.this, R.raw.kangaroo);
        sonido.start();
    }

    public void sonarKoala(View view){
        sonido = MediaPlayer.create(Animals.this, R.raw.koala);
        sonido.start();
    }

    public void sonarMono(View view){
        sonido = MediaPlayer.create(Animals.this, R.raw.monkey);
        sonido.start();
    }

    public void sonarPanda(View view){
        sonido = MediaPlayer.create(Animals.this, R.raw.panda);
        sonido.start();
    }

    public void sonarSerpiente(View view){
        sonido = MediaPlayer.create(Animals.this, R.raw.snake);
        sonido.start();
    }
}