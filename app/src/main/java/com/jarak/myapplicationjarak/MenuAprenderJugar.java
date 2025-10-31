package com.jarak.myapplicationjarak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MenuAprenderJugar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_aprender_jugar);
    }


    public void aprender(View view){
        Intent MoverActivity = new Intent(MenuAprenderJugar.this, Home.class);
        startActivity(MoverActivity);
    }

    public void jugar(View view){
        Intent MoverActivity = new Intent(MenuAprenderJugar.this, Jugar.class);
        startActivity(MoverActivity);
    }
}