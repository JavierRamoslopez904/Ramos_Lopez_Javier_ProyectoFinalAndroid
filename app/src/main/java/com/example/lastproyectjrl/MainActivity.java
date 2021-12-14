package com.example.lastproyectjrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    /** Objetos **/
    private ImageButton imgb1;
    private ImageButton imgb2;
    private ImageButton imgb3;

    String url = "https://www.instagram.com/carter__0/";
    String url2 = "https://twitter.com/Javier53201752";
    String url3 = "https://github.com/JavierRamoslopez904?tab=repositories";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgb1 = findViewById(R.id.secondImageButton);
        imgb2 = findViewById(R.id.thirdImageButton);
        imgb3 = findViewById(R.id.fourthImageButton);

        imgb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW,link);
                startActivity(i);
            }
        });

        imgb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link2 = Uri.parse(url2);
                Intent i2 = new Intent(Intent.ACTION_VIEW,link2);
                startActivity(i2);
            }
        });

        imgb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link3 = Uri.parse(url3);
                Intent i3 = new Intent(Intent.ACTION_VIEW,link3);
                startActivity(i3);
            }
        });
    }

    /**
     * Método para ir a la página de los jugadores
     * @param vista
     */
    public void goToJugadores(View vista){
        Intent siguiente = new Intent(this,Jugadores.class);
        startActivity(siguiente);
        this.finish();
    }

    /**
     * Método para ir a la tienda
     * @param vista
     */
    public void goToTienda(View vista){
        Intent siguiente = new Intent(this,Tienda.class);
        startActivity(siguiente);
        this.finish();
    }

}