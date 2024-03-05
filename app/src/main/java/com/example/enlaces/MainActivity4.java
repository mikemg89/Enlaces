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

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.translucent));
        }
        setContentView(R.layout.activity_main4);

        Button btn_trans_sur = findViewById(R.id.btn_trans_sur);
        Button btn_trans_norte = findViewById(R.id.btn_trans_norte);
        Button btn_trans_centro = findViewById(R.id.btn_trans_centro);
        Button btn_trans_ori = findViewById(R.id.btn_trans_ori);
        Button btn_trans_occ = findViewById(R.id.btn_trans_occ);
        Button btn_trans_ura = findViewById(R.id.btn_trans_ura);
        Button btn_trans_sem = findViewById(R.id.btn_trans_sem);
        Button btn_trans_valle = findViewById(R.id.btn_trans_valle);
        Button btn_trans_cun = findViewById(R.id.btn_trans_cun);
        Button btn_trans_coor = findViewById(R.id.btn_trans_coor);
        Button btn_trans_exp = findViewById(R.id.btn_trans_exp);
        Button btn_trans_yenn = findViewById(R.id.btn_trans_yenn);
        Button btn_trans_micro1 = findViewById(R.id.btn_trans_micro1);
        Button btn_trans_micro2 = findViewById(R.id.btn_trans_micro2);
        ImageButton btnback_trans = findViewById(R.id.btnback_trans);

        ImageView imageView6 = findViewById(R.id.imageView6);

        Animation rotateAnimation = new RotateAnimation(0f, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setDuration(1000);
        rotateAnimation.setRepeatCount(0);
        imageView6.startAnimation(rotateAnimation);

        btn_trans_sur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1Sm2afwQyT1kjEg1Ntqxw4EJeHldjcJ62Wheeh6uHnYQ/edit?usp=sharing");
            }
        });

        btn_trans_norte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1zlBqX0kkoATLtsWdPzkgcfUh61D0WBM-ZCwPFWFMjqQ/edit?usp=sharing");
            }
        });

        btn_trans_centro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/155xlZnwwEmXL0Y7RZjA42uwd8jLix7Wgo3OHUSA9L4o/edit?usp=sharing");
            }
        });

        btn_trans_ori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1Tj3Y44ItXqO-ctldqxUN0IEWN5yQUJsfUrmUetxbmn4/edit?usp=sharing");
            }
        });

        btn_trans_occ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1zaoiVP4UczkC4YDXsNNH2yI1XcSTvyiqQtFRpxJPtM4/edit?usp=sharing");
            }
        });

        btn_trans_ura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1JeksFrtXrYQSVjNQuanL8kq9UjS9hAkA8fp1CxDlAxI/edit?usp=sharing");
            }
        });

        btn_trans_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1vPHP1IaUCuvToCe_Mb6v1gDX25uKC2PT5dGkyPGxBrQ/edit?usp=sharing");
            }
        });

        btn_trans_valle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/161cAsyHlN7766kXIy4DXfQ3zQs5lcWcx62fo9u-emlE/edit?usp=sharing");
            }
        });

        btn_trans_cun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1uT_gBKsSm8CnBiE11eU2Mr1f0LS59Fl3Buth33zwGmA/edit?usp=sharing");
            }
        });

        btn_trans_coor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1SAAS-twMvYFDlub3VLXawCxRvDdcCFe9ffTXNaW1CUY/edit?usp=sharing");
            }
        });

        btn_trans_exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1Dufo60ZebFMTZ9dIPuv1Uva12depFqr1KjsWJgMWeWQ/edit?usp=sharing");
            }
        });

        btn_trans_yenn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1twTr8I4E4pIfDM56lNwpozbRU0n48-djEpPD6DBdDaA/edit?usp=sharing");
            }
        });

        btn_trans_micro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1RVzrsSH3b3vyDSPrpV44Tc6aowFswvU4hLwAtPe5wPI/edit?usp=sharing");
            }
        });

        btn_trans_micro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb("https://docs.google.com/spreadsheets/d/1VBLvrikLAgbD065SrbWxLrFOPMLVq8ZcuV9av0ukenE/edit?usp=sharing");
            }
        });

        btnback_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void abrirPaginaWeb(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}