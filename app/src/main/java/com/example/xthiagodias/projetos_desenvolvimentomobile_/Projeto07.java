package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ex10 extends AppCompatActivity {
    private Button calcular;
    private TextInputEditText valorConta,nomeCliente;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex10);

        calcular = findViewById(R.id.btCalcular);
        nomeCliente = findViewById(R.id.txtNome);
        valorConta = findViewById(R.id.txtValor);
        resultado = findViewById(R.id.Resultado);



      calcular.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              double conta = Double.parseDouble(valorConta.getText().toString());
              String nome = nomeCliente.getText().toString().charAt(0)+"";

              if(nome.equals("A") || nome.equals("E") || nome.equals("I") || nome.equals("O") || nome.equals("U")){

                  double valorDesconto = conta * 0.3;

                  resultado.setText(String.valueOf("Resultado:R$ " +(conta-valorDesconto)));
              }else{
                  resultado.setText(String.valueOf("Que pena! Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará!" ));
              }

          }
      });



    }
}
