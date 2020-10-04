package com.example.intentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarSecondaryActivity(View view) {
        /*Creamos el objeto Intent*/
        Intent intentSecondaryActivity = new Intent(this, SecondaryActivity.class);

        //Paso de parámetros
        intentSecondaryActivity.putExtra("nombre", "Manuel Rodríguez");
        intentSecondaryActivity.putExtra("edad", 40);
        intentSecondaryActivity.putExtra("telefono", "+34666112233");

        //Llamamos al método StartActivity, que recibe el objeto Intent creado
        startActivity(intentSecondaryActivity);
    }
}