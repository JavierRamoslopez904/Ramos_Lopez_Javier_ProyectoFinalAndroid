package com.example.lastproyectjrl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DbJugadores extends  DbHelper{

    Context context;

    public DbJugadores(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    /**
     * Método para la insercción de jugadores a la BBDD
     * @param identificador
     * @param nombre
     * @param edad
     * @param ciudad
     * @return
     */
    public long insertarJugadores(String identificador, String nombre, String edad, String ciudad){

        long id = 0;

        try {

            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("identificador", identificador);
            values.put("nombre", nombre);
            values.put("edad", edad);
            values.put("ciudad", ciudad);

            id = db.insert(TABLE_JUGADORES, null, values);
        }catch (Exception ex){
            ex.toString();
        }

        return id;
    }

    public ArrayList<DatosJugadores> mostrarJugadores(){

        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ArrayList<DatosJugadores> listaJugadores = new ArrayList<>();
        DatosJugadores jugadores = null;

        Cursor cursor = null;

        cursor = db.rawQuery("SELECT * FROM " + TABLE_JUGADORES, null);

        if(cursor.moveToFirst()){
            do{
                jugadores = new DatosJugadores();
                jugadores.setIdentificador(cursor.getString(0));
                jugadores.setNombre(cursor.getString(1));
                jugadores.setEdad(cursor.getString(2));
                jugadores.setCiudad(cursor.getString(3));

                listaJugadores.add(jugadores);
            }while(cursor.moveToNext());
        }

        cursor.close();

        return listaJugadores;

    }
}
