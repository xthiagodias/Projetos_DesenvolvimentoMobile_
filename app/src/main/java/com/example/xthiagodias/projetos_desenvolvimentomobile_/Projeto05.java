package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Projeto05 extends AppCompatActivity {

    private Button calcularMedia;
    private TextInputEditText nome;
    private TextInputEditText AV1;
    private TextInputEditText AV2;
    private TextView resultadoNome;
    private TextView resultadoMedia;
    private TextView resultadoStatus;
    private String status;
    private double media;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto05);

        calcularMedia = findViewById(R.id.btCalcularMedia);
        nome = findViewById(R.id.inputNome);
        AV1 = findViewById(R.id.inputAV1);
        AV2 = findViewById(R.id.inputAV2);
        resultadoNome = findViewById(R.id.idNome);
        resultadoMedia = findViewById(R.id.idMedia);
        resultadoStatus = findViewById(R.id.idStatus);


        calcularMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String QualNome = nome.getText().toString();
                String NotaAV1 = AV1.getText().toString();
                String NotaAV2 = AV2.getText().toString();


                if (QualNome.equals("")) {
                    nome.requestFocus();
                    EnviaAlertaNome();

                } else {

                if (NotaAV1.equals("")) {
                    AV1.requestFocus();
                    EnviaAlertaAV1();
                } else {

                    if (NotaAV2.equals("")) {
                        AV2.requestFocus();
                        EnviaAlertaAV2();
                    }
                }


                        double valorAV1 = Double.parseDouble(AV1.getText().toString());
                        double valorAV2 = Double.parseDouble(AV2.getText().toString());
                        String nomeAluno = nome.getText().toString();

                        media = (valorAV1+valorAV2)/2;

                        if (media >= 7) {
                            double mediaAprovado = media;
                            status = "Aluno Aprovado!";
                        } else {

                        if (media < 4) {

                            double mediaReprovado = media;
                            status = "Aluno Reprovado!";

                        } else {

                        if (media < 7 || media == 4)  {

                            double mediaProvaFinal = media;
                            status = "Aluno vai para Final!";

                            }

                        }

                        }

                       resultadoNome.setText("Nome do Aluno: " + nomeAluno);
                       resultadoMedia.setText("Média do Aluno: " + media);
                       resultadoStatus.setText(status);

                    }

            }

        });

    }

    protected void EnviaAlertaNome() {
        Toast.makeText(getApplicationContext(),"Informe o nome do Aluno", Toast.LENGTH_LONG).show();
    }

    protected void EnviaAlertaAV1() {
        Toast.makeText(getApplicationContext(),"Informe a primeira Nota", Toast.LENGTH_LONG).show();
    }

    protected void EnviaAlertaAV2() {
        Toast.makeText(getApplicationContext(),"Informe a segunda Nota", Toast.LENGTH_LONG).show();
    }
}
