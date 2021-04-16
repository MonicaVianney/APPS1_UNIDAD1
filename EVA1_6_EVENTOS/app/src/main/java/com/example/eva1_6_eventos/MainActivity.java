package com.example.eva1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn2;
    Button btn3;
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "EVENTO POR CLASE ANONIMA",Toast.LENGTH_LONG).show();
                    }
                });
        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(
                new MiClaseOnclick());

        MiClaseOnclick objClick = new MiClaseOnclick();
        objClick.setContext(this);
        btn4.setOnClickListener(objClick);

    }
    //USANDO LA PROPIEDAD android:onclick DEL WIDGET
    //public void NOMBREDELMETODO (view arg) {}

    public void miClick(View arg) {
        //MOSTRAR UN MENSAJE (TOAST)
        Toast.makeText(this, "EVENTO POR ONCLICK XML", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "EVENTO POR LISTENER", Toast.LENGTH_LONG).show();

    }
}