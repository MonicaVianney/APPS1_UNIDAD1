package com.example.eva1_12_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    clima[] aClimacd = {
            new clima (R.drawable.cloudy, "Chihuahua",28, "Despejado con viento"),
            new clima (R.drawable.rainy, "Cuauhtémoc",28, "Lluvioso"),
            new clima (R.drawable.snow, "Madera",28, "Nevado"),
            new clima (R.drawable.sunny, "Parral",28, "Soleado asqueroso"),
            new clima (R.drawable.thunderstorm, "Batopilas",28, "Tormenta"),
            new clima (R.drawable.tornado, "Urique",28, "ASUMAQUINA"),
            new clima (R.drawable.light_rain, "Guachochi",28, "Bonito"),
            new clima (R.drawable.atmospher, "Meoqui",28, "No c"),
            new clima (R.drawable.cloudy, "Ciudad Juárez",28, "Nubes chulas"),
            new clima (R.drawable.cloudy, "Villa Ahumada",28, "Despejado con viento"),
            new clima (R.drawable.cloudy, "Creel",28, "Despejado con viento"),
            new clima (R.drawable.cloudy, "Jiménez",28, "Despejado con viento"),
            new clima (R.drawable.cloudy, "Camargo",28, "Despejado con viento"),
            new clima (R.drawable.cloudy, "Ojinaga",28, "Despejado con viento"),
            new clima (R.drawable.cloudy, "Casas Grandes",28, "A veces")
    };

    ListView listClima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        listClima = findViewById(R.id.listClima);
        listClima.setAdapter(new climaAdaptador(this, R.layout.mi_lista_clima,aClimacd));
    }
}