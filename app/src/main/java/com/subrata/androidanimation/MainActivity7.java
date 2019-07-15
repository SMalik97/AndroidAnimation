package com.subrata.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity7 extends AppCompatActivity {
    ImageView imageview7;
    Button slideup, slidedown, slideleft, slideright, next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);




        //Hide the action bar
        getSupportActionBar().hide();


        imageview7=(ImageView)findViewById(R.id.imageview7);
        slideup=(Button)findViewById(R.id.slideup);
        slidedown=(Button)findViewById(R.id.slidedown);
        slideleft=(Button)findViewById(R.id.slideleft);
        slideright=(Button)findViewById(R.id.slideright);
        next=(Button)findViewById(R.id.next);


        //Slide up button click event  ..........................................
        slideup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation a;
                a= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_top);
                imageview7.startAnimation(a);
            }
        });


        //Slide down button click event  ..........................................
        slidedown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation b;
                b= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_bottom);
                imageview7.startAnimation(b);
            }
        });


        //Slide left button click event  ..........................................

        slideleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation c;
                c= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_left);
                imageview7.startAnimation(c);
            }
        });

        //Slide right button click event  ..........................................
        slideright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation d;
                d= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_right);
                imageview7.startAnimation(d);
            }
        });


        //Next button click event  ..........................................
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity8.class);
                startActivity(i);
            }
        });






    }
}
