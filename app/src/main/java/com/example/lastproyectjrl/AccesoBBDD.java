package com.example.lastproyectjrl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AccesoBBDD extends AppCompatActivity {

    /** Atributos **/
    RecyclerView listaJugadores;
    ArrayList<DatosJugadores> listaArrayJugadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso_bbdd);

        listaJugadores = (RecyclerView) findViewById(R.id.listaJugadores);

        listaJugadores.setLayoutManager(new LinearLayoutManager(this));

        DbJugadores dbJugadores = new DbJugadores(AccesoBBDD.this);

        listaArrayJugadores = new ArrayList<>();

        ListaJugadoresAdapter adapter = new ListaJugadoresAdapter(dbJugadores.mostrarJugadores());

        listaJugadores.setAdapter(adapter);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menuNuevo:
                nuevoRegistro();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void nuevoRegistro(){
        Intent i = new Intent(this, NuevoActivity.class);
        startActivity(i);
    }


}