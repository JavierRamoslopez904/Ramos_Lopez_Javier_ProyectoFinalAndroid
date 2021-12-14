package com.example.lastproyectjrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Tienda extends AppCompatActivity {

    /** Objetos **/
    private EditText et1;
    private EditText et2;
    private EditText et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);

        et1 = (EditText) findViewById(R.id.fifthEditText);
        et2 = (EditText) findViewById(R.id.sixthEditText);
        et3 = (EditText) findViewById(R.id.seventhEditText);

    }


    /**
     * Método para registrar el usuario
     * @param vista
     */
    public void Registrar(View vista){

        String primero = et1.getText().toString();
        String segundo = et2.getText().toString();
        String tercero = et3.getText().toString();

        if(primero.isEmpty() || segundo.isEmpty() || tercero.isEmpty()){
            Toast.makeText(this, "ERROR, HAY UN CAMPO VACÍO", Toast.LENGTH_SHORT).show();
        }else if(primero.length() > 14) {
            Toast.makeText(this, "INTRODUZCA UN NOMBRE CON MENOS DE 14 CARACTERES", Toast.LENGTH_SHORT).show();
        }else{
            Intent i = new Intent(this, Productos.class);
            i.putExtra("dato", et1.getText().toString());
            startActivity(i);
            this.finish();
        }
    }

    /**
     * Método para volver atrás
     * @param vista
     */
    public void back(View vista){
        Intent back= new Intent(this,MainActivity.class);
        startActivity(back);
        this.finish();
    }
}