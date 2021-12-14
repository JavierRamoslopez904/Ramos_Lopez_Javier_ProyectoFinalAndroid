package com.example.lastproyectjrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MusicaAthletic extends AppCompatActivity {

    /** Objetos **/
    ImageButton btn_pause;
    MediaPlayer mp;
    ImageView ig;
    int repetir = 1, posicion = 0;
    MediaPlayer vector[] = new MediaPlayer[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica_athletic);

        btn_pause = (ImageButton) findViewById(R.id.eigthImageButton);
        ig = (ImageView) findViewById(R.id.eleventhImage);

        vector[0] = MediaPlayer.create(this, R.raw.leones);
        vector[1] = MediaPlayer.create(this,R.raw.himno);
    }

    public void PlayPause(View view){
        if(vector[posicion].isPlaying()){
            vector[posicion].pause();
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
        } else {
            vector[posicion].start();
            Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
        }
    }

    public void Stop(View view){
        if(vector[posicion] != null){
            vector[posicion].stop();
            vector[0] = MediaPlayer. create(this, R.raw.leones);
            vector[1] = MediaPlayer. create(this, R.raw.himno);
            posicion = 0;
            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
        }
    }

    public void Siguiente(View view){
        if(posicion < vector.length -1){
            if(vector[posicion].isPlaying()){
                vector[posicion].stop();
                posicion++;
                vector[posicion].start();
                if(posicion == 0){
                    ig.setImageResource(R.drawable.el_androide_libre_497212199_179452761_1706x960_removebg_preview__1_);
                } else if(posicion == 1){
                    ig.setImageResource(R.drawable._75135834_removebg_preview__1_);
                }
            } else {
                posicion++;
                if(posicion == 0){
                    ig.setImageResource(R.drawable.el_androide_libre_497212199_179452761_1706x960_removebg_preview__1_);
                } else if(posicion == 1){
                    ig.setImageResource(R.drawable._75135834_removebg_preview__1_);
                }
            }
        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
    }

    public void Anterior(View view){
        if(posicion >= 1){
            if(vector[posicion].isPlaying()){
                vector[posicion].stop();
                vector[0] = MediaPlayer.create(this, R.raw.leones);
                vector[1] = MediaPlayer.create(this, R.raw.himno);
                posicion--;
                if(posicion == 0){
                    ig.setImageResource(R.drawable._75135834_removebg_preview__1_);
                } else if(posicion == 1){
                    ig.setImageResource(R.drawable._75135834_removebg_preview__1_);
                }
                vector[posicion].start();
            } else {
                posicion--;
                if(posicion == 0){
                    ig.setImageResource(R.drawable._75135834_removebg_preview__1_);
                } else if(posicion == 1){
                    ig.setImageResource(R.drawable._75135834_removebg_preview__1_);
                }
            }
        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
    }

    public void goBack(View vista){
        Intent i = new Intent(this,CompraRealizada.class);
        startActivity(i);
        this.finish();
    }
}