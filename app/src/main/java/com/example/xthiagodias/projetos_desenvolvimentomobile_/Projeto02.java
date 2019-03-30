package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Projeto02 extends AppCompatActivity {


    private Button calcular;
    private TextInputEditText tempoLigacao;
    private TextView resultado;
    double res;
    private Spinner operadoras;
    private String itemEscolhido;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto02);

        calcular = findViewById(R.id.btCalcularTarifa);
        tempoLigacao = findViewById(R.id.inputTempo);
        resultado = findViewById(R.id.idResultadoTarifa);
        operadoras = findViewById(R.id.spinner);


        operadoras.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemEscolhido = operadoras.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // double vlrTempo = Double.parseDouble(tempoLigacao.getEditText().toString());




                if (tempoLigacao.equals("")) {
                    tempoLigacao.requestFocus();
                    EnviaAlertaTempo();
                }



                double tempo = Double.parseDouble(tempoLigacao.getText().toString());


                if (tempo > 0.05) {

                    if (itemEscolhido.equals("OP1")) {

                        res = (tempo/60) * 0.020;
                        resultado.setText("Valor da Tarífa: R$" + res);

                    } else {

                        if (itemEscolhido.equals("OP2")) {

                            res = (tempo/60) * 0.025;
                            resultado.setText("Valor da Tarífa: R$" + res);

                        } else {

                            if (itemEscolhido.equals("OP3")) {

                                res = (tempo/60) * 0.019;
                                resultado.setText("Valor da Tarífa: R$" + res);


                            } else {
                                if (itemEscolhido.equals("")) {
                                    resultado.setText("Escolha uma Operadora!");
                                    operadoras.requestFocus();
                                    EnviaAlertaOperadora();
                                }
                            }
                        }
                    }

                } else {
                    resultado.setText("Tempo de 5 segundos, nao tarífado!");
                }


            }
        });

    }

    protected void EnviaAlertaTempo() {
        Toast.makeText(getApplicationContext(),"Informe o Tempo da Ligação!", Toast.LENGTH_LONG).show();
    }

    protected void EnviaAlertaOperadora() {
        Toast.makeText(getApplicationContext(),"Escolha uma Operadora!", Toast.LENGTH_LONG).show();
    }


}
