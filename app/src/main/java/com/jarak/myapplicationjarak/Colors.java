package com.jarak.myapplicationjarak;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Colors extends AppCompatActivity {

    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
    }


    public void sonarBlue(View view){
        sonido = MediaPlayer.create(Colors.this, R.raw.blue);
        sonido.start();
    }

    public void sonarGreen(View view){
        sonido = MediaPlayer.create(Colors.this, R.raw.green);
        sonido.start();
    }

    public void sonarOrange(View view){
        sonido = MediaPlayer.create(Colors.this, R.raw.orange);
        sonido.start();
    }

    public void sonarRed(View view){
        sonido = MediaPlayer.create(Colors.this, R.raw.blue);
        sonido.start();
    }

    public void sonarYellow(View view){
        sonido = MediaPlayer.create(Colors.this, R.raw.yellow);
        sonido.start();
    }
}