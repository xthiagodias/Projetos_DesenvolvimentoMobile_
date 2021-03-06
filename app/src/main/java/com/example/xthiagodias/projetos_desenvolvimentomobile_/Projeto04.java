package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Projeto04 extends AppCompatActivity {

    private Button calcular;
    private TextInputEditText valorX;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto04);


        calcular = findViewById(R.id.btCalcularY);
        valorX = findViewById(R.id.inputX);
        resultado = findViewById(R.id.idResultadoY);


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ValordoX = valorX.getText().toString();


                if (ValordoX.equals("")) {
                    valorX.requestFocus();
                    EnviaAlertaX();

                } else {

                    double valordeX = Double.parseDouble(valorX.getText().toString());

                    double y = (8) / (2 - valordeX);

                    resultado.setText("O resultado de Y: " + y);

                }

            }

            });

    }

    protected void EnviaAlertaX() {
        Toast.makeText(getApplicationContext(),"Informe o valor de X", Toast.LENGTH_LONG).show();
    }
}
