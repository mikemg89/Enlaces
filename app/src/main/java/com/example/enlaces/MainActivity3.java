package com.example.enlaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.translucent));
        }
        setContentView(R.layout.activity_main3);

        Button btn_icso_icso = findViewById(R.id.btn_icso_icso);
        Button btn_icso_pre = findViewById(R.id.btn_icso_pre);

        ImageView img_logo3 = findViewById(R.id.img_logo3);
        ImageButton btnback_icso = findViewById(R.id.btnback_icso);

        Animation rotateAnimation = new RotateAnimation(0f, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        // Establece la duración de la animación en milisegundos
        rotateAnimation.setDuration(1000);

        // Establece que la animación se repita indefinidamente
        rotateAnimation.setRepeatCount(0);

        // Inicia la animación en el ImageView
        img_logo3.startAnimation(rotateAnimation);

        // Configurar clics en los botones
        btn_icso_icso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://icso.fomentamos.com.co/auth/fom");
            }
        });

        btn_icso_pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://preregistro.fomentamos.com.co/");
            }
        });

        btnback_icso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void abrirPaginaWeb(String url) {
        // Crear un intent implícito para abrir una URL
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}