package com.example.bilal.edoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView txt_welcome;
    ImageView img_e,img_d,img_o,img_O_1;
    Animation anim_text, anim_img_e,anim_img_d,anim_img_o,anim_img_O_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        txt_welcome= (TextView)findViewById(R.id.textV_welcome);

        img_e = (ImageView) findViewById(R.id.imageView_e);
        img_d = (ImageView) findViewById(R.id.imageView_D);
        img_o = (ImageView) findViewById(R.id.imageView_o);
        img_O_1 = (ImageView) findViewById(R.id.imageView_O_1);


        anim_text= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up_to_down);
        anim_img_e= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_to_right);

        anim_img_d= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down_to_up);

        anim_img_O_1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up_to_down_img_o);

        anim_img_o= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_to_left);




        /////////////////////start Text Animation////////////////
        txt_welcome.startAnimation(anim_text);
        anim_text.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                txt_welcome.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                img_e.startAnimation(anim_img_e);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ///////////////////////End text Animation////////////////////////


        /////////////////////start image E Animation////////////////
        anim_img_e.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                img_e.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                img_d.startAnimation(anim_img_d);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ///////////////////////End text Animation////////////////////////

        /////////////////////start image D Animation////////////////
        anim_img_d.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                img_d.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                img_O_1.startAnimation(anim_img_O_1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ///////////////////////End img D Animation////////////////////////


        /////////////////////start image O 1 Animation////////////////

        anim_img_O_1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                img_O_1.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                img_o.startAnimation(anim_img_o);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });



        /////////////////////start image O Animation////////////////
        anim_img_o.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                img_o.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationEnd(Animation animation) {


                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);
                finish();


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ///////////////////////End Image Animation////////////////////////
    }
}
