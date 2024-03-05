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

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.translucent));
        }
        setContentView(R.layout.activity_main2);

        Button btn_asis_centro = findViewById(R.id.btn_asis_centro);
        Button btn_asis_norte = findViewById(R.id.btn_asis_norte);
        Button btn_asis_sur = findViewById(R.id.btn_asis_sur);
        Button btn_asis_ori = findViewById(R.id.btn_asis_ori);
        Button btn_asis_occ = findViewById(R.id.btn_asis_occ);
        Button btn_asis_rio = findViewById(R.id.btn_asis_rio);
        Button btn_asis_ura = findViewById(R.id.btn_asis_ura);
        Button btn_asis_soa = findViewById(R.id.btn_asis_soa);
        Button btn_asis_cali = findViewById(R.id.btn_asis_cali);
        Button btn_asis_dor = findViewById(R.id.btn_asis_dor);
        Button btn_asis_boya = findViewById(R.id.btn_asis_boya);

        ImageView img_logo2 = findViewById(R.id.img_logo2);
        ImageButton btnback_asist = findViewById(R.id.btnback_asist);



        Animation rotateAnimation = new RotateAnimation(0f, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        // Establece la duración de la animación en milisegundos
        rotateAnimation.setDuration(1000);

        // Establece que la animación se repita indefinidamente
        rotateAnimation.setRepeatCount(0);

        // Inicia la animación en el ImageView
        img_logo2.startAnimation(rotateAnimation);

        btn_asis_centro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLScj-zo-ukVrg8rBf5BXzCw002UKJd87irD4jd4nHz0Dd5eFRQ/viewform?usp=sf_link");
            }
        });

        btn_asis_norte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLSdS8i5pJmKMvN91Uo2g1TsQrhsbz8SqT2OawMQoNRtxIqWS-A/viewform?usp=sf_link");
            }
        });

        btn_asis_sur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLSfYM63MOn2Plb9Qnya2_uADEnShAfjIhp1-jO7NngHrzRSYyA/viewform?usp=sf_link");
            }
        });

        btn_asis_ori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLSdldhqh1GJxite4EJSO9HbsURujB4EUXvTM8jcsbp2yvy3drA/viewform?usp=sf_link");
            }
        });

        btn_asis_occ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLSdWocEyopu06rdVQdGK2NverqbnRUpoi9wrM8t7rQmrxu0ABA/viewform?usp=sf_link");
            }
        });

        btn_asis_rio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLSeEo9ccdcytBvq8oNrlys2DitpkI3BE-y6WSsSy2zsd0gzyKg/viewform?usp=sf_link");
            }
        });

        btn_asis_ura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLSfcbvMiFUDRl8vVZ6gtFLFkLfzknb0ErV4GtOowGW5BNhhIcQ/viewform?usp=sf_link");
            }
        });

        btn_asis_soa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLSeKYpShB4JXCGqRh2cwjUwM-CN1eG0ohW3aWakAmkc_y3TYsw/viewform?usp=sf_link");
            }
        });

        btn_asis_cali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLSelPRGwyGIR7arKgcIfCdXYivHvGUuP-brrUlZyqx_oCmpAAA/viewform?usp=sf_link");
            }
        });

        btn_asis_dor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLSeD4vtSDE6gQPKdzV8drgaN4nSHknzaIrF5md8xpnFRi7oIHw/viewform?usp=sf_link");
            }
        });

        btn_asis_boya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/forms/d/e/1FAIpQLSd4J2WzyRBBxrAstUsF63YdZuR32fs-cvyzeFyKUWCcTUBTsQ/viewform?usp=sf_link");
            }
        });

        btnback_asist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
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