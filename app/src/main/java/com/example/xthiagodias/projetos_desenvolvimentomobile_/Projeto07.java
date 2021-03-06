package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Projeto07 extends AppCompatActivity {
    private Button calcular;
    private TextInputEditText valorConta,nomeCliente;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto07);

        calcular = findViewById(R.id.btCalcularPeso);
        nomeCliente = findViewById(R.id.txtNome);
        valorConta = findViewById(R.id.txtValor);
        resultado = findViewById(R.id.Resultado);



      calcular.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              double conta = Double.parseDouble(valorConta.getText().toString());

              //Pega Letra Inicial do nome informado!
              String nome = nomeCliente.getText().toString().charAt(0)+"";

              if(nome.equals("A") || nome.equals("E") || nome.equals("I") || nome.equals("O") || nome.equals("U")){

                  double valorDesconto = conta * 0.3;

                  resultado.setText(String.valueOf("Resultado: R$ " +(conta-valorDesconto)));
              }else{
                  resultado.setText(String.valueOf("Que pena! Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará!" ));
              }

          }
      });



    }
}
