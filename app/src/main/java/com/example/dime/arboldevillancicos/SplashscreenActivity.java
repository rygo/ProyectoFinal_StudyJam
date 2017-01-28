package com.example.dime.arboldevillancicos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashscreenActivity extends AppCompatActivity {
    private ImageView vLogo;
    private Animation animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splashscreen);
        vLogo = (ImageView) findViewById(R.id.vLogo);
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animacion);
        vLogo.startAnimation(animacion);
        animacion.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                //finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
