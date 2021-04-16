package com.example.eva1_14_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcVista;

    String[] aDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //llenar(aDatos);
        aDatos = new String[100];
        for(int i = 0; i < 100; i++){
            aDatos[i] = "Elemento no. " + i;

        }
        rcVista = findViewById(R.id.recyclerVista);
        rcVista.setAdapter(new miAdaptador(aDatos));
        rcVista.setLayoutManager(new LinearLayoutManager(this));
        rcVista.setLayoutManager(new GridLayoutManager(this, 2));
    }

    public void llenar(String[] args){
        args = new String[100];
        for(int i = 0; i < 100; i++){
            args[i] = "Elemento no. " + i;

        }
    }
}