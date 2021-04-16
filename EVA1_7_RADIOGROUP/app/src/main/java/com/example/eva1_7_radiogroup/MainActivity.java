package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioPeliculas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioPeliculas.findViewById(R.id.radioPeliculas);
        //ASIGNAR EL LISTENER
        radioPeliculas.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override                       //RADIO GROUP QUE GENERA EL EVENTO, ID DEL RADIO BUTTON SELECCIONADO
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //TOAST INDICANDO CUAL RADIO BUTTON FUE SELECCIONADO
                switch (checkedId){
                    case R.id.radioPeliculas:
                        Toast.makeText(getApplicationContext(), "PELICULAS", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioJuegos:
                        Toast.makeText(getApplicationContext(), "VIDEOJUEGOS", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioAnime:
                        Toast.makeText(getApplicationContext(), "ANIMES", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioMusica:
                        Toast.makeText(getApplicationContext(), "MÚSICA", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioLibro:
                        Toast.makeText(getApplicationContext(), "LIBROS", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioMangas:
                        Toast.makeText(getApplicationContext(), "MANGAS", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "NO SÉ, ESPERO HABERTE AYUDADO", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}