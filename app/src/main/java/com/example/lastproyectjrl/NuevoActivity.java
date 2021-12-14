package com.example.lastproyectjrl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NuevoActivity extends AppCompatActivity {

    /** Objetos **/
    EditText txtIdentificador, txtNombre, txtEdad, txtCiudad;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);

        txtIdentificador = findViewById(R.id.txtIdentificador);
        txtNombre = findViewById(R.id.txtNombre);
        txtEdad = findViewById(R.id.txtEdad);
        txtCiudad = findViewById(R.id.txtCiudad);
        bt1 = findViewById(R.id.btnInsertar);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbJugadores dj = new DbJugadores(NuevoActivity.this);
                long id = dj.insertarJugadores(txtIdentificador.getText().toString(), txtNombre.getText().toString(),txtEdad.getText().toString(),txtCiudad.getText().toString());

                if(id > 0){
                    Toast.makeText(NuevoActivity.this, "REGISTRO GUARDADO", Toast.LENGTH_SHORT).show();
                    limpiar();
                }else{
                    Toast.makeText(NuevoActivity.this, "REGISTRO ERRÓNEO", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void limpiar(){
        txtIdentificador.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtCiudad.setText("");
    }
}