package com.example.bilal.edoo;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.netopen.hotbitmapgg.library.view.RingProgressBar;

public class SplashSignupActivity extends AppCompatActivity {

    /////////////////////////
    RingProgressBar ringProgressBar;

    int progress = 0;

    Handler myHandler = new Handler() {


        @Override
        public void handleMessage(Message msg) {
            if(msg.what == 0)
            {
                if(progress<100)
                {
                    progress++;
                    ringProgressBar.setProgress(progress);
                }
            }
        }

    };//////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_signup);

        ////////////////
        ringProgressBar = (RingProgressBar) findViewById(R.id.progress_bar);

        ringProgressBar.setOnProgressListener(new RingProgressBar.OnProgressListener() {
            @Override
            public void progressToComplete() {


                Intent i = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(i);
                finish();

            }

        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(50);
                        myHandler.sendEmptyMessage(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();///////////////////
    }
}
