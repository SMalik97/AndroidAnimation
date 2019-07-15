package com.subrata.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    ImageView imageview3;
    Button rotate_clock, rotate_anticlock, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Hide the action bar
        getSupportActionBar().hide();


        imageview3=(ImageView)findViewById(R.id.imageview3);
        rotate_clock=(Button)findViewById(R.id.rotate_clock);
        rotate_anticlock=(Button)findViewById(R.id.rotate_anticlock);
        next=(Button)findViewById(R.id.next);


        //Rotate clockwise button click event  ..........................................
        rotate_clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation a;
                a= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
                imageview3.startAnimation(a);
            }
        });


        //rotate Anticlockwise button click event  ..........................................
        rotate_anticlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation b;
                b= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);
                imageview3.startAnimation(b);
            }
        });


        //Next button click event  ..........................................
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });



    }
}
