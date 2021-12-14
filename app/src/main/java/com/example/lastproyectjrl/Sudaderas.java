package com.example.lastproyectjrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sudaderas extends Productos {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudaderas);
    }

    /**
     * Método para ir a la clase de los productos
     * @param vista
     */
    public void goToProductos(View vista){
        Intent i = new Intent(this,Productos.class);
        startActivity(i);
        this.finish();
    }

    /**
     * Método para realizar la compra
     * @param vista
     */
    public void goToOperacionCompra(View vista){
        Intent i = new Intent(this,OperacionCompra.class);
        startActivity(i);
        this.finish();
    }

}