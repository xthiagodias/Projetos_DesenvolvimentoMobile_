package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Projeto06 extends AppCompatActivity {
    private Button categoria;
    private TextInputEditText idade;
    private TextView resultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoria = findViewById(R.id.bt);
        idade = findViewById(R.id.txtIdade);
        resultado = findViewById(R.id.idCategoria);


    categoria.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        double i = Double.parseDouble(idade.getText().toString());

        if ( i == 5 && i <= 7 ) {

            resultado.setText("Infantil A");


        } else {

            if ( i == 8 && i <=10){
                resultado.setText("Infantil B");

            }else{

                if( i == 11 && i <=13){
                    resultado.setText("Juvenil A");

                }else{
                    if(i == 14 && i <=17){
                        resultado.setText("Juvenil B");

                    }else{
                        if(i >=18){
                            resultado.setText("Sênior");
                        }

                    }


                }

            }
        }


        }
    });


    }
}
