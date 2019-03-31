package com.example.xthiagodias.projetos_desenvolvimentomobile_;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Projeto03 extends AppCompatActivity {

    private Button calcular;
    private TextInputEditText PesoTerra;
    private TextView resultado;
    private double res;
    private Spinner planetas;
    private String itemEscolhido;
    private double gravidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto03);

        calcular = findViewById(R.id.btCalcularPeso);
        PesoTerra = findViewById(R.id.inputPesoTerra);
        resultado = findViewById(R.id.idResultadoPeso);
        planetas = findViewById(R.id.spinner2);


        planetas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemEscolhido = planetas.getSelectedItem().toString();


                if (itemEscolhido.equals("Mercurio")) {

                    gravidade = 0.37;

                } else {

                    if (itemEscolhido.equals("Venus")) {

                        gravidade = 0.88;

                    } else {

                        if (itemEscolhido.equals("Marte")) {

                            gravidade = 0.38;

                        } else {

                            if (itemEscolhido.equals("Jupiter")) {

                                gravidade = 2.64;
                            } else {

                                if (itemEscolhido.equals("Saturno")) {

                                    gravidade = 1.15;
                                } else {

                                    if (itemEscolhido.equals("Urano")) {

                                        gravidade = 1.17;
                                    } else {

                                        if (itemEscolhido.equals("Escolha um Planeta")) {

                                            EnviaAlertaPlaneta();
                                            resultado.setText("Escolha um Planela!");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 String PesoT = PesoTerra.getText().toString();


                if (PesoT.equals("")) {
                    PesoTerra.requestFocus();
                    EnviaAlertaPeso();
                }


                double peso = Double.parseDouble(PesoTerra.getText().toString());


                itemEscolhido = planetas.getSelectedItem().toString();


                if (itemEscolhido.equals("Mercurio")) {

                    gravidade = 0.37;

                    res = (peso/10) * gravidade;
                    resultado.setText("O Peso no Planeta, " +itemEscolhido +" é: " +res);

                } else {

                    if (itemEscolhido.equals("Venus")) {

                        gravidade = 0.88;
                        res = (peso/10) * gravidade;
                        resultado.setText("O Peso no Planeta, " +itemEscolhido +" é: " +res);

                    } else {

                        if (itemEscolhido.equals("Marte")) {

                            gravidade = 0.38;
                            res = (peso/10) * gravidade;
                            resultado.setText("O Peso no Planeta, " +itemEscolhido +" é: " +res);

                        } else {

                            if (itemEscolhido.equals("Jupiter")) {

                                gravidade = 2.64;
                                res = (peso/10) * gravidade;
                                resultado.setText("O Peso no Planeta, " +itemEscolhido +" é: " +res);
                            } else {

                                if (itemEscolhido.equals("Saturno")) {

                                    gravidade = 1.15;
                                    res = (peso/10) * gravidade;
                                    resultado.setText("O Peso no Planeta, " +itemEscolhido +" é: " +res);
                                } else {

                                    if (itemEscolhido.equals("Urano")) {

                                        gravidade = 1.17;
                                        res = (peso/10) * gravidade;
                                        resultado.setText("O Peso no Planeta, " +itemEscolhido +" é: " +res);
                                    } else {

                                        if (itemEscolhido.equals("Escolha um Planeta")) {

                                            EnviaAlertaPlaneta();
                                            resultado.setText("Escolha um Planela!");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }

        });

    }

    protected void EnviaAlertaPeso() {
        Toast.makeText(getApplicationContext(),"Informe o Peso!", Toast.LENGTH_LONG).show();
    }

    protected void EnviaAlertaPlaneta() {
        Toast.makeText(getApplicationContext(),"Escolha um Planeta!", Toast.LENGTH_LONG).show();
    }




}
