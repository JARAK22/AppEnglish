package com.jarak.myapplicationjarak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void animales(View view){
        Intent MoverActivityAnimals = new Intent(Home.this, Animals.class);
        startActivity(MoverActivityAnimals);
    }

    public void numbers(View view){
        Intent MoverActivityNumbers = new Intent(Home.this, Numbers.class);
        startActivity(MoverActivityNumbers);
    }

    public void colors(View view){
        Intent MoverActivityColors = new Intent(Home.this, Colors.class);
        startActivity(MoverActivityColors);
    }

    public void fruits(View view){
        Intent MoverActivityFruits = new Intent(Home.this, Fruits.class);
        startActivity(MoverActivityFruits);
    }
}