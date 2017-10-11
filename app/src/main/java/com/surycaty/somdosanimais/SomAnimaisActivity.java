package com.surycaty.somdosanimais;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;

import com.surycaty.somdosanimais.dao.AnimalDAO;
import com.surycaty.somdosanimais.entidade.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomAnimaisActivity extends AppCompatActivity {

    private List<Animal> animais = new ArrayList<Animal>();
    private boolean[] btnClicado = {false, false, false, false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som_animais);

        animais = AnimalDAO.getListaAnimais();
        Collections.shuffle(animais);

        GridLayout grid = new GridLayout(getApplicationContext());
        grid.setAlignmentMode(GridLayout.ALIGN_MARGINS);
        //grid.setTextAlignment();

        ImageButton img1 = (ImageButton) findViewById(R.id.imgButton01);
        img1.setImageResource(animais.get(0).getIdImagem());
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setEnabled(false);

                btnClicado[0] = true;

                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), animais.get(0).getIdSom());
                mp.start();

                if (btnClicado[0] && btnClicado[1] && btnClicado[2] && btnClicado[3]) {
                    Intent it = new Intent(SomAnimaisActivity.this, SomAnimaisActivity.class);
                    startActivity(it);
                }
            }
        });

        ImageButton img2 = (ImageButton) findViewById(R.id.imgButton02);
        img2.setImageResource(animais.get(1).getIdImagem());
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setEnabled(false);

                btnClicado[1] = true;

                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), animais.get(1).getIdSom());
                mp.start();

                if (btnClicado[0] && btnClicado[1] && btnClicado[2] && btnClicado[3]) {
                    Intent it = new Intent(SomAnimaisActivity.this, SomAnimaisActivity.class);
                    startActivity(it);
                }
            }
        });

        ImageButton img3 = (ImageButton) findViewById(R.id.imgButton03);
        img3.setImageResource(animais.get(2).getIdImagem());
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setEnabled(false);

                btnClicado[2] = true;

                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), animais.get(2).getIdSom());
                mp.start();

                if (btnClicado[0] && btnClicado[1] && btnClicado[2] && btnClicado[3]) {
                    Intent it = new Intent(SomAnimaisActivity.this, SomAnimaisActivity.class);
                    startActivity(it);
                }
            }
        });

        ImageButton img4 = (ImageButton) findViewById(R.id.imgButton04);
        img4.setImageResource(animais.get(3).getIdImagem());
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setEnabled(false);

                btnClicado[3] = true;

                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), animais.get(3).getIdSom());
                mp.start();

                if (btnClicado[0] && btnClicado[1] && btnClicado[2] && btnClicado[3]) {
                    Intent it = new Intent(SomAnimaisActivity.this, SomAnimaisActivity.class);
                    startActivity(it);
                }
            }
        });


    }
}
