package com.example.lastproyectjrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

public class OperacionCompra extends AppCompatActivity {

    /** Objetos **/
    private RatingBar ratingBar;
    private EditText et1;
    private EditText et2;
    private RadioButton rb1;
    private RadioButton rb2;
    private CheckBox cb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion_compra);

        // Relación con la parte gráfica
        ratingBar = (RatingBar) findViewById(R.id.firstRatingBar);
        et1 = (EditText) findViewById(R.id.eigthEditText);
        et2 = (EditText) findViewById(R.id.ninthEditText);
        rb1 = (RadioButton) findViewById(R.id.firstRadioButton);
        rb2 = (RadioButton) findViewById(R.id.secondRadioButton);
        cb1 = (CheckBox) findViewById(R.id.firstCheckBox);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(OperacionCompra.this, "La votacion ha acabado con : " +v, Toast.LENGTH_SHORT).show();
            }
        });

    }

    /**
     * Método para ir a la compra realizada
     * @param vista
     */
    public void goToCompraRealizada(View vista){

        String edit1 = et1.getText().toString();
        String edit2 = et2.getText().toString();

        if(edit1.isEmpty() || edit2.isEmpty() || rb1.isChecked() == false && rb2.isChecked() == false || cb1.isChecked() == false){
            Toast.makeText(this, "ERROR, HAY UN CAMPO VACÍO", Toast.LENGTH_SHORT).show();
        }else{
            Intent i = new Intent(this, CompraRealizada.class);
            i.putExtra("usuario",et1.getText().toString());
            startActivity(i);
            this.finish();
        }
    }
}