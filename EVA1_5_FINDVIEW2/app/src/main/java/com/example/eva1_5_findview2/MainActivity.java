package com.example.eva1_5_findview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgvw = findViewById(R.id.imgvw); //para conectar con el widget

        imgvw.setImageResource(R.drawable.oso); //buscamos en la categoría drawable nuestra imagen
    }
}