package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GASAPP extends AppCompatActivity {

    private TextInputEditText Modelo;
    private TextInputEditText Distancia;
    private TextInputEditText Potencia;
    private TextInputEditText Gasolina;

    private Button Calcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasapp);

        Modelo = findViewById(R.id.inputModelo);
        Distancia = findViewById(R.id.inputDistancia);
        Potencia = findViewById(R.id.inputPotencia);
        Gasolina = findViewById(R.id.inputGasolina);
        Calcular = findViewById(R.id.btCalcular);


        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Resultado.class);

                i.putExtra("Modelo", Modelo.getText().toString());

                Double distanciaPercorrida = Double.parseDouble(Distancia.getText().toString());
                i.putExtra("Distancia", distanciaPercorrida);

                Double potenciaCarro = Double.parseDouble(Potencia.getText().toString());
                i.putExtra("Potencia", potenciaCarro);

                Double valorGasolina = Double.parseDouble(Gasolina.getText().toString());
                i.putExtra("Gasolina", valorGasolina);


                startActivity(i);

            }
        });

    }

}
