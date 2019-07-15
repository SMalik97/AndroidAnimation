package com.subrata.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {
    ImageView imageview5;
    Button sequential, together, next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        //Hide the action bar
        getSupportActionBar().hide();


        imageview5=(ImageView)findViewById(R.id.imageview5);
        sequential=(Button)findViewById(R.id.sequential);
        together=(Button)findViewById(R.id.together);
        next=(Button)findViewById(R.id.next);


        //Zoom In button click event  ..........................................
        sequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation a;
                a= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);
                imageview5.startAnimation(a);
            }
        });


        //Zoom out button click event  ..........................................
        together.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation b;
                b= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.together);
                imageview5.startAnimation(b);
            }
        });


        //Next button click event  ..........................................
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(i);
            }
        });




    }
}
