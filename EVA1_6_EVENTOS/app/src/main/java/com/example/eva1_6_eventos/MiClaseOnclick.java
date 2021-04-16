package com.example.eva1_6_eventos;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MiClaseOnclick implements View.OnClickListener{
    Context context;

    @Override
    public void onClick(View v) {
        Toast.makeText(context, "EVENTO POR CLASE", Toast.LENGTH_LONG).show();
        Log.wtf("APP", "EVENTO POR CLASE");
    }

    public void setContext(Context context){
        this.context=context;
    }
}
