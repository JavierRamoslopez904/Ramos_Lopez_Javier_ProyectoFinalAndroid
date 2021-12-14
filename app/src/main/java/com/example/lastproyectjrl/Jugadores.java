package com.example.lastproyectjrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Jugadores extends AppCompatActivity {

    /** Objetos **/
    private TextView tv1;
    private ListView lv1;
    private ArrayList<String> nombre;
    private ArrayList<String> posicion;
    private ArrayList<Integer> goles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadores);

        // Conexión de la parte gráfica con la parte lógica
        lv1 = (ListView) findViewById(R.id.firstListView);
        tv1 = (TextView) findViewById(R.id.textVieww);

        // Añadido de jugadores al ArrayList
        nombre = new ArrayList<>();
        nombre.add("Unai Simón");
        nombre.add("Jokin Ezkieta");
        nombre.add("Íñigo Nuñez");
        nombre.add("Íñigo Martínez");
        nombre.add("Íñigo Lekue");
        nombre.add("Yuri Berchiche");
        nombre.add("Óscar de Marcos");
        nombre.add("Ander Capa");
        nombre.add("Perú Nolaskoain");
        nombre.add("Mikel Balenziaga");
        nombre.add("Mikel Vesga");
        nombre.add("Dani García");
        nombre.add("Oihan Sancet");
        nombre.add("Unai Vencedor");
        nombre.add("Jon Morcillo");
        nombre.add("Iñaki Williams");
        nombre.add("Iker Muniain");
        nombre.add("Álex Berenguer");
        nombre.add("Kenan Kodro");
        nombre.add("Asier Villalibre");
        nombre.add("Raul García");

        // Añadido de las posiciones al ArrayList
        posicion = new ArrayList<>();
        posicion.add("Portero");
        posicion.add("Portero");
        posicion.add("Defensa");
        posicion.add("Defensa");
        posicion.add("Defensa");
        posicion.add("Defensa");
        posicion.add("Defensa");
        posicion.add("Defensa");
        posicion.add("Defensa");
        posicion.add("Defensa");
        posicion.add("Centrocampista");
        posicion.add("Centrocampista");
        posicion.add("Centrocampista");
        posicion.add("Centrocampista");
        posicion.add("Delantero");
        posicion.add("Delantero");
        posicion.add("Delantero");
        posicion.add("Delantero");
        posicion.add("Delantero");
        posicion.add("Delantero");
        posicion.add("Delantero");

        // Añadido de los goles al ArrayList
        goles = new ArrayList<>();
        goles.add(0);
        goles.add(0);
        goles.add(3);
        goles.add(1);
        goles.add(4);
        goles.add(1);
        goles.add(8);
        goles.add(7);
        goles.add(3);
        goles.add(0);
        goles.add(2);
        goles.add(3);
        goles.add(7);
        goles.add(6);
        goles.add(3);
        goles.add(8);
        goles.add(7);
        goles.add(4);
        goles.add(12);
        goles.add(22);
        goles.add(3);

        // Creación de un ArrayAdapter que contendrá los nombres añadidos antes a la colleción, con un layout personalizado
        android.widget.ArrayAdapter<String> adapter = new android.widget.ArrayAdapter<String>(this, R.layout.estilos, nombre);

        lv1.setAdapter(adapter);

        // Método para mostrar el jugador clickado, junto con su posición en el terreno de juego y el número de los goles
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                tv1.setText("El jugador " +nombre.get(position) + ", que juega de " + posicion.get(position) + " ha metido " + goles.get(position) + " goles");
            }
        });
    }

    /**
     * Método para ir a la página principal
     * @param vista
     */
    public void goToMain(View vista){
        Intent atras = new Intent(this,MainActivity.class);
        startActivity(atras);
        this.finish();
    }

    /**
     * Método para ir a la página de añadir jugadores
     * @param vista
     */
    public void goToAnadirJugadores(View vista){
        Intent goToAnadir = new Intent(this,AccesoBBDD.class);
        startActivity(goToAnadir);
        Toast.makeText(this, "AHORA PODRÁS CREAR TU PROPIA PLANTILLA", Toast.LENGTH_SHORT).show();
    }


}