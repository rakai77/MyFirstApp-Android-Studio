package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread spTread = new Thread(){
            public void run(){
                try{
                    sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivities(new Intent[]{new Intent(SplashScreen.this, MainActivity.class)});
                    finish();
                }
            }
        };
        spTread.start();
    }
}