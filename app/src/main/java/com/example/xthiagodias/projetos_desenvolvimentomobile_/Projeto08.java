package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Projeto08 extends AppCompatActivity {

    private TextInputEditText Modelo;
    private TextInputEditText Distancia;
    private TextInputEditText Potencia;
    private TextInputEditText Gasolina;
    double valorGasto;

    private Button Calcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto08);

        Modelo = findViewById(R.id.inputModelo);
        Distancia = findViewById(R.id.inputDistancia);
        Potencia = findViewById(R.id.inputPotencia);
        Gasolina = findViewById(R.id.inputGasolina);
        Calcular = findViewById(R.id.btCalcularPeso);


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

                if( potenciaCarro <= 1.0 ){
                    valorGasto = (distanciaPercorrida/13.00)*valorGasolina;
                    i.putExtra("valorGasto", "Valor Total gasto: " +valorGasto);
                }else{
                    if( potenciaCarro >1.0 && potenciaCarro<=1.4){
                        valorGasto = (distanciaPercorrida/11.00)*valorGasolina;
                        i.putExtra("valorGasto", "Valor Total gasto: " +valorGasto);

                    }else{
                        if( potenciaCarro >1.4 && potenciaCarro <= 1.9){
                            valorGasto = (distanciaPercorrida/9.50)*valorGasolina;
                            i.putExtra("valorGasto", "Valor Total gasto: " +valorGasto);
                        }else{
                            if(potenciaCarro > 1.9 ){
                                valorGasto = (distanciaPercorrida/7.75)*valorGasolina;
                                i.putExtra("valorGasto", "Valor Total gasto: " +valorGasto);
                            }
                        }
                    }
                }


                startActivity(i);

            }
        });

    }

}
