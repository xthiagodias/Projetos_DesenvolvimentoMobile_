package com.example.xthiagodias.projetos_desenvolvimentomobile_;

//Exemplo de INTENT;


import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button buttonimplicito;
    private Button buttonexplicito;
    private Button buttonCamera;
    public static final int CAMERA_CODE = 1888;
    private ImageView imagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonimplicito = findViewById(R.id.bt);
        buttonCamera = findViewById(R.id.btCamera);
        imagem = findViewById(R.id.img);
        buttonexplicito = findViewById(R.id.bt1);


        buttonimplicito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, "Assunto01");
                i.putExtra(Intent.EXTRA_TEXT,"Dados");
                startActivity(Intent.createChooser(i,"Compartilhar..."));

            }
        });


        buttonexplicito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), OutraJanela.class);
                i.putExtra("nome", "Thiago Dias");
                startActivity(i);

            }
        });


        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE);
                startActivityForResult(i,CAMERA_CODE);
              //  startActivity(Intent.createChooser(i,"Compartilhar..."));

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
  if (requestCode == CAMERA_CODE) {
        Bitmap photo = (Bitmap) data.getExtras().get("data");
        imagem.setImageBitmap(photo);
    }}
}
