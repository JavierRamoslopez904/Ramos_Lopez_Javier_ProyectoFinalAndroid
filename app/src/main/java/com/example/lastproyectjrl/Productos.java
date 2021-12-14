package com.example.lastproyectjrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Productos extends AppCompatActivity {

    /** Objetos **/
    private Spinner sp1;
    private ArrayList<String> opciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        sp1 = (Spinner) findViewById(R.id.firstSpinner);

    }

    /**
     * Método que nos mandará a las distintas clases
     * @param vista
     */
    public void spinner(View vista){

        if(sp1.getSelectedItem().toString().equals("EQUIPACIÓN")){
            goToEquipacion();
        }
        if(sp1.getSelectedItem().toString().equals("SUDADERAS")){
            goToSudaderas();
        }
        if(sp1.getSelectedItem().toString().equals("GORRAS")){
            goToGorras();
        }
        if(sp1.getSelectedItem().toString().equals("BANDERAS")){
            goToBanderas();
        }

    }
    /**
     * Método para ir a la clase Equipación
     */
    public void goToEquipacion(){
        Intent i = new Intent(this,Equipacion.class);
        startActivity(i);
        this.finish();
    }

    /**
     * Método para ir a la clase Sudaderas
     */
    public void goToSudaderas(){
        Intent i = new Intent(this,Sudaderas.class);
        startActivity(i);
        this.finish();
    }

    /**
     * Método para ir a la clase Gorras
     */
    public void goToGorras(){
        Intent i = new Intent(this,Gorras.class);
        startActivity(i);
        this.finish();
    }

    /**
     * Método para ir a la clase Banderas
     */
    public void goToBanderas(){
        Intent i = new Intent(this,Banderas.class);
        startActivity(i);
        this.finish();
    }

    /**
     * Método para volver atrás
     * @param vista
     */
    public void goToBack(View vista){
        Intent in = new Intent(this,Tienda.class);
        startActivity(in);
        this.finish();

    }
}