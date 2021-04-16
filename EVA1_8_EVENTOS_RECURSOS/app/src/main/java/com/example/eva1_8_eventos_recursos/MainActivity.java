package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    TextView txtNombre, txtApellido;
    EditText editNombre, editApellido;
    RadioGroup rGroupIdioma;
    RadioButton rBtnEspañol, rBtnIngles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        editNombre = findViewById(R.id.editNombre);
        editApellido = findViewById(R.id.editApellido);
        rGroupIdioma = findViewById(R.id.rGroupIdioma);
        rBtnEspañol = findViewById(R.id.rBtnEspañol);
        rBtnIngles = findViewById(R.id.rBtnIngles);
        rGroupIdioma.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.rBtnEspañol){
            txtNombre.setText(R.string.edt_txt_nom);


        }else{

        }

    }
}