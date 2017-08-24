package com.i001114.interactividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainDosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dos);
    }

    //para pasar de formulario
    //primero creamos un metodo
    // View view este metodo es la vista
    public void goActivityuno(View v) {
        Intent intent2 = new Intent(this, MainActivity.class); // Intent = intenciones sirve para obtener todas las actividades que uno tiene y recibe dos parametros
        startActivity(intent2);
    }
}
