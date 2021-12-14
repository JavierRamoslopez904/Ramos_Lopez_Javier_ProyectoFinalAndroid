package com.example.lastproyectjrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import org.w3c.dom.Text;

public class CompraRealizada extends AppCompatActivity {

    /** Objetos **/
    private TextView tv1;
    private ViewFlipper vf;
    MediaPlayer mp;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra_realizada);

        ib = (ImageButton) findViewById(R.id.fifthImageButton);

        mp = MediaPlayer.create(this, R.raw.leones);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(mp.isPlaying()){
                   mp.pause();
                   Toast.makeText(CompraRealizada.this, "PAUSA", Toast.LENGTH_SHORT).show();
               }else{
                   mp.start();
                   Toast.makeText(CompraRealizada.this, "PLAY", Toast.LENGTH_SHORT).show();
               }
            }
        });

        int images[] = {R.drawable.bilbaooo,R.drawable.sanmamo,R.drawable.nuevoo};

        // Conexión con la parte gráfica XML
        tv1 = (TextView) findViewById(R.id.eleventhEditText);
        vf = findViewById(R.id.firstViewFlipper);

        for(int image: images){
            flipperImages(image);
        }

        String informacion = getIntent().getStringExtra("usuario");
        tv1.setText(informacion);
    }

    public void flipperImages(int image){
        ImageView image1 = new ImageView(this);
        image1.setBackgroundResource(image);

        vf.addView(image1);
        vf.setFlipInterval(3000);
        vf.setAutoStart(true);
        vf.setInAnimation(this, android.R.anim.slide_out_right);
        vf.setOutAnimation(this, android.R.anim.slide_in_left);
    }

    /**
     * Método para abandonar la aplicación
     * @param vista
     */
    public void volver(View vista){

        Intent i = new Intent(this,Productos.class);
        startActivity(i);
        this.finish();

    }

    /**
     * Método para seguir comprando productos
     * @param vista
     */
    public void seguirComprando(View vista){
        Intent i = new Intent(this,Productos.class);
        startActivity(i);
        this.finish();
    }

    public void musicaAthletic(View vista){
        Intent i = new Intent(this, MusicaAthletic.class);
        startActivity(i);
        this.finish();
    }
}