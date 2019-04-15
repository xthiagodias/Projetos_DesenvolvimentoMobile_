package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private Button Compartilhar;
    private TextView Modelo;
    private TextView Distancia;
    private TextView Potencia;
    private TextView Gasolina;
    private TextView valorGasto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        Compartilhar = findViewById(R.id.btCompartilhar);
        Modelo = findViewById(R.id.txModelo);
        Distancia = findViewById(R.id.txDistancia);
        Potencia = findViewById(R.id.txPotencia);
        Gasolina = findViewById(R.id.txGasolina);
        valorGasto = findViewById(R.id.vg);

        Bundle dados = getIntent().getExtras();
        Modelo.setText(dados.getString("Modelo"));
        Distancia.setText(String.valueOf(dados.getDouble("Distancia")));
        Potencia.setText(String.valueOf(dados.getDouble("Potencia")));
        Gasolina.setText(String.valueOf(dados.getDouble("Gasolina")));
        valorGasto.setText(dados.getString("VG"));


            Compartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, "Resultado");
                i.putExtra(Intent.EXTRA_TEXT, "Dados");
                startActivity(Intent.createChooser(i, "Compartilhar"));

            }
        });
    }
}
