package com.subrata.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
    ImageView imageview4;
    Button bounce, blink, next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //Hide the action bar
        getSupportActionBar().hide();


        imageview4=(ImageView)findViewById(R.id.imageview4);
        blink=(Button)findViewById(R.id.blink);
        bounce=(Button)findViewById(R.id.bounce);
        next=(Button)findViewById(R.id.next);


        //Zoom In button click event  ..........................................
        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation a;
                a= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                imageview4.startAnimation(a);
            }
        });


        //Zoom out button click event  ..........................................
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation b;
                b= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                imageview4.startAnimation(b);
            }
        });


        //Next button click event  ..........................................
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(i);
            }
        });



    }
}
