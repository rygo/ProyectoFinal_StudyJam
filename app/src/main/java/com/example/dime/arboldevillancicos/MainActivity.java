package com.example.dime.arboldevillancicos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    /**
     * @autor Guery Castaño
     * version 1.0
     *
     */
    private MediaPlayer mediaPlayer = new MediaPlayer();

    private ToggleButton tbEstrella, tbEsfera,tbEsfera2,tbEsfera3,tbEsfera4,
            tbEsfera5,tbEsfera6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        /**
         * getSupportActionBar().hide();
         * **/
        setContentView(R.layout.activity_main);
        initUI();

        tbEstrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbEstrella.isChecked()) {
                    try {
                        createMediaPlayer(1);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });

        tbEsfera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbEsfera.isChecked()) {
                    try {
                        createMediaPlayer(2);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });
        tbEsfera2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbEsfera2.isChecked()) {
                    try {
                        createMediaPlayer(3);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });
        tbEsfera3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbEsfera3.isChecked()) {
                    try {
                        createMediaPlayer(4);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });
        tbEsfera4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbEsfera4.isChecked()) {
                    try {
                        createMediaPlayer(5);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });
        tbEsfera5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbEsfera5.isChecked()) {
                    try {
                        createMediaPlayer(6);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });
        tbEsfera6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbEsfera6.isChecked()) {
                    try {
                        createMediaPlayer(7);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });

    }

    private void initUI() {
        tbEstrella = (ToggleButton)findViewById(R.id.avEstrella);
        tbEsfera = (ToggleButton)findViewById(R.id.avEsfera);
        tbEsfera2 = (ToggleButton)findViewById(R.id.avEsfera2);
        tbEsfera3 = (ToggleButton)findViewById(R.id.avEsfera3);
        tbEsfera4 = (ToggleButton)findViewById(R.id.avEsfera4);
        tbEsfera5 = (ToggleButton)findViewById(R.id.avEsfera5);
        tbEsfera6 = (ToggleButton)findViewById(R.id.avEsfera6);


    }
    public void createMediaPlayer(int val){
        switch (val){
            case 1:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.navidad);
                //mediaPlayer.setVolume(0.9f, 0.9f);

                tbEsfera.setChecked(false);
                tbEsfera2.setChecked(false);
                tbEsfera3.setChecked(false);
                tbEsfera4.setChecked(false);
                tbEsfera5.setChecked(false);
                tbEsfera6.setChecked(false);

                break;
            case 2:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.burrito_sabanero);
                tbEstrella.setChecked(false);
                tbEsfera2.setChecked(false);
                tbEsfera3.setChecked(false);
                tbEsfera4.setChecked(false);
                tbEsfera5.setChecked(false);
                tbEsfera6.setChecked(false);

                break;
            case 3:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nacio_ninio);
                tbEstrella.setChecked(false);
                tbEsfera.setChecked(false);
                tbEsfera3.setChecked(false);
                tbEsfera4.setChecked(false);
                tbEsfera5.setChecked(false);
                tbEsfera6.setChecked(false);

                break;
            case 4:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.noche_de_paz);
                tbEstrella.setChecked(false);
                tbEsfera2.setChecked(false);
                tbEsfera.setChecked(false);
                tbEsfera4.setChecked(false);
                tbEsfera5.setChecked(false);
                tbEsfera6.setChecked(false);

                break;
            case 5:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pastores);
                tbEstrella.setChecked(false);
                tbEsfera2.setChecked(false);
                tbEsfera3.setChecked(false);
                tbEsfera.setChecked(false);
                tbEsfera5.setChecked(false);
                tbEsfera6.setChecked(false);

                break;
            case 6:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.peces_en_el_rio);
                tbEstrella.setChecked(false);
                tbEsfera2.setChecked(false);
                tbEsfera3.setChecked(false);
                tbEsfera4.setChecked(false);
                tbEsfera.setChecked(false);
                tbEsfera6.setChecked(false);

                break;
            case 7:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.reyes);
                tbEstrella.setChecked(false);
                tbEsfera.setChecked(false);
                tbEsfera2.setChecked(false);
                tbEsfera3.setChecked(false);
                tbEsfera4.setChecked(false);
                tbEsfera5.setChecked(false);


                break;
        }
    }
}
