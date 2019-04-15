package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Projeto01 extends AppCompatActivity {


    private Button calcularPeso;
    private TextInputEditText alturaPessoa;
    private TextInputEditText sexoPessoa;
    private TextView resultadoPeso;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto01);

        calcularPeso = findViewById(R.id.btCalcularPeso);
        alturaPessoa = findViewById(R.id.inputAlturaPessoa);
        sexoPessoa = findViewById(R.id.inputSexoPessoa);
        resultadoPeso = findViewById(R.id.idResultadoPeso);


        calcularPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              double vlrAltura = Double.parseDouble(alturaPessoa.getText().toString());

             String MF = sexoPessoa.getText().toString();
             String alt = alturaPessoa.getText().toString();


                if (alt.equals("")) {
                    alturaPessoa.requestFocus();
                    EnviaAlertaAltura();
                }


                if (MF.equals("")) {
                    sexoPessoa.requestFocus();
                    EnviaAlertaSexo();
                }


                if (MF.equals("m")) {

                    double res = (72.7 * vlrAltura) - 58;

                    resultadoPeso.setText("O Peso ideal para o Sexo Masculino é: " +res);


                }

                if (MF.equals("f")) {

                    double res = (62.1 * vlrAltura) - 44.7;

                    resultadoPeso.setText("O Peso ideal para o Sexo Feminino é: " +res);


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

