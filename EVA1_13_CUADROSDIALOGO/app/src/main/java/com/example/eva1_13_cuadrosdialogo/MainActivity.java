package com.example.eva1_13_cuadrosdialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //EVENTOS CLICK

    public void onClickCDSistema(View v){
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de diálogo de Android")
                .setMessage("Hola Mundo!!!")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton Ok", Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton NO", Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNeutralButton("CANCELAR",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton CANCELAR", Toast.LENGTH_SHORT).show();
                            }
                        })
                .show();

    }

    public void onClickCDCustom(View v){
        Dialog miCuadroDialogo = new Dialog(this);
        //Asignar el layout
        miCuadroDialogo.setContentView(R.layout.cuadro_dialogo);
        //VINCULAR LOS COMPONENTES
        TextView titulo;
        EditText datos;
        Button accion;
        titulo = miCuadroDialogo.findViewById(R.id.txtTitulo);
        datos = miCuadroDialogo.findViewById(R.id.editDatos);
        accion = miCuadroDialogo.findViewById(R.id.btnAccion);
        titulo.setText("ESTE ES UN CUADRO DE DIÁLOGO PERSONALIZADO!!!");
        accion.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), datos.getText().toString(),
                                Toast.LENGTH_SHORT).show();
                        miCuadroDialogo.dismiss();
                    }
                }
        );
        miCuadroDialogo.show();

    }



}