package com.example.intentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        //Recogida de parámetros que recibimos del activity principal
        Bundle datos = getIntent().getExtras();

        Toast.makeText(this, "Nombre: " + datos.getString("nombre") + " Edad: "
                + datos.getInt("edad") + " Teléfono: "
                +datos.getString("telefono"), Toast.LENGTH_LONG).show();
    }
}