package com.example.eva1_4_fileview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //carga la interfaz gráfica

        txtMensaje = findViewById(R.id.txtMensaje);
        
        txtMensaje.setText("Hola mundo cruel!!!");


    }
}