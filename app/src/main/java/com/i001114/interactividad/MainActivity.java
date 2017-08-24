package com.i001114.interactividad;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // aqui se programa el float
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.flt_1); // <-- este codigo sirve para que obtenga el id del boton floating
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivitydos(view);
            }
        });
        //--------------------------------------------------
        //para hacer un menu desde un boton
        Button btn1 = (Button) findViewById(R.id.btn1);
        registerForContextMenu(btn1);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        menu.setHeaderTitle("Mis Opciones");
        inflater.inflate(R.menu.main, menu);
    }

    //para pasar de formulario
    //primero creamos un metodo
    // View view este metodo es la vista
    public void goActivitydos(View v){
        Intent intent = new Intent(this, MainDosActivity.class); // Intent = intenciones sirve para obtener todas las actividades que uno tiene y recibe dos parametros
        startActivity(intent);

    }



}
