package com.example.enlaces;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.translucent));
        }
        setContentView(R.layout.activity_main);

        Button btn_icso1 = findViewById(R.id.btn_icso1);
        Button btn_asist = findViewById(R.id.btn_asist);
        Button btn_karing = findViewById(R.id.btn_karing);
        Button btn_olivos = findViewById(R.id.btn_olivos);
        Button btn_trans = findViewById(R.id.btn_trans);

        ImageView img_logo1 = findViewById(R.id.img_logo1);

        Animation rotateAnimation = new RotateAnimation(0f, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        // Establece la duración de la animación en milisegundos
        rotateAnimation.setDuration(1000);

        // Establece que la animación se repita indefinidamente
        rotateAnimation.setRepeatCount(0);

        // Inicia la animación en el ImageView
        img_logo1.startAnimation(rotateAnimation);

        // Configurar clics en los botones
        btn_icso1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        btn_asist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        btn_karing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://losolivosmedellin.co/KaringPrevision/Login/LoginDo");
            }
        });

        btn_olivos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLSftBmhHtLpyfol8uL0mmepvrwd5k9nPTXu7HYXgayMGr44GqQ/viewform");
            }
        });

        btn_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPaginaWeb("https://transportes.fomentamos.org/#/");
            }
        });

    }

    private void abrirPaginaWeb(String url) {
        // Crear un intent implícito para abrir una URL
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}
