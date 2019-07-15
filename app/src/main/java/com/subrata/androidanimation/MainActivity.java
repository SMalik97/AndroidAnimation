package com.subrata.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageview1;
    Button fadeIn, fadeOut, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hide the action bar
        getSupportActionBar().hide();


        imageview1=(ImageView)findViewById(R.id.imageview1);
        fadeIn=(Button)findViewById(R.id.fadeIn);
        fadeOut=(Button)findViewById(R.id.fadeOut);
        next=(Button)findViewById(R.id.next);


        //Fade In button click event  ..........................................
        fadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation a;
                a= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                imageview1.startAnimation(a);
            }
        });


        //Fade out button click event  ..........................................
        fadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation b;
                b= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
                imageview1.startAnimation(b);
            }
        });


        //Next button click event  ..........................................
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });




    }
}
