package com.thonyindustry.tigom.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.thonyindustry.tigom.R;
import com.thonyindustry.tigom.login.View.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent login = new Intent(MainActivity.this,  LoginActivity.class);
                startActivity(login);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}