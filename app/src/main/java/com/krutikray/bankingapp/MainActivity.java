package com.krutikray.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    private Button btnViewUsersHome;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        btnViewUsersHome = (Button) findViewById(R.id.btnViewUsersHm);
//        btnViewUsersHome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, Userlist.class));
//            }
//        });
//
//
//    }

    TextView designed, name, app_name;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        logo = findViewById(R.id.logo);
        designed = findViewById(R.id.designed);
        name = findViewById(R.id.name);
        app_name = findViewById(R.id.app_name);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startEnterAnimation();
            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                startActivity(new Intent(MainActivity.this, SplashScreen.class));
                finish();

            }
        }, 5500);
    }

    private void startEnterAnimation() {
//        app_name.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.bottom));
//        logo.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.p_in));

        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f,0.0f);

        alphaAnimation.setDuration(750);
        alphaAnimation.setRepeatCount(0);
        alphaAnimation.setRepeatMode(Animation.ABSOLUTE);

        app_name.setAnimation(alphaAnimation);
        logo.setAnimation(alphaAnimation);
        name.setAnimation(alphaAnimation);
        designed.setAnimation(alphaAnimation);

//        logo.setVisibility(View.VISIBLE);
//        designed.setVisibility(View.VISIBLE);
//        name.setVisibility(View.VISIBLE);
//        app_name.setVisibility(View.VISIBLE);
    }
}