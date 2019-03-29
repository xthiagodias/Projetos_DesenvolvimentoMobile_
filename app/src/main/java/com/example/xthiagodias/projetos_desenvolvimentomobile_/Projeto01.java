package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Projeto01 extends AppCompatActivity {


    private Button calcular;
    private TextInputLayout altura;
    private TextInputLayout sexo;
    private TextView resultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto01);

        calcular = findViewById(R.id.btCalcular);
        altura = findViewById(R.id.inputAltura);
        sexo = findViewById(R.id.inputSexo);
        resultado = findViewById(R.id.idResultado);


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              double vlrAltura = Double.parseDouble(altura.getEditText().toString());

                sexo.getEditText().toString();



                if (altura.equals("")) {
                    altura.requestFocus();
                    EnviaAlertaAltura();
                }


                if (sexo.equals("")) {
                    sexo.requestFocus();
                    EnviaAlertaSexo();
                }


                if (sexo.equals("M")) {

                    double res = (72.7 * vlrAltura) - 58;

                    resultado.setText("O Peso ideal para o Sexo Masculino e: " +res);


                }

                if (sexo.equals("F")) {

                    double res = (62.1 * vlrAltura) - 44.7;

                    resultado.setText("O Peso ideal para o Sexo Feminino e: " +res);


                }


            }
        });

    }

    protected void EnviaAlertaAltura() {
        Toast.makeText(getApplicationContext(),"Informe a Altura", Toast.LENGTH_LONG).show();
    }


    protected void EnviaAlertaSexo() {
        Toast.makeText(getApplicationContext(),"Informe o Sexo", Toast.LENGTH_LONG).show();
    }

}

