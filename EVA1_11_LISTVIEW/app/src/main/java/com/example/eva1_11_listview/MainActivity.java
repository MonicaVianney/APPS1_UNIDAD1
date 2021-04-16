package com.example.eva1_11_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listDatos;
    String[] aDatos = {
            "Oso",
            "Gato",
            "Ardilla",
            "Lobo",
            "Tigre",
            "Mono araña",
            "Lemur ratón",
            "Caballo",
            "Pingüino",
            "Panda",
            "Perro",
            "Pájaro",
            "Pato",
            "Dinosaurio",
            "Nintendo 64",
            "Nintendo Switch",
            "SNES",
            "Gamecube",
            "Wii",
            "NES",
            "Wii U",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        listDatos = findViewById(R.id.listDatos);
        listDatos.setAdapter(new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                aDatos
        ));
        listDatos.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, aDatos[position],Toast.LENGTH_SHORT).show();

    }
}