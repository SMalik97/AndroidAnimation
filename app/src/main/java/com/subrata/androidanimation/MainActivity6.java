package com.subrata.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {
    ImageView imageview6;
    Button moveup, movedown, moveleft, moveright, next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);



        //Hide the action bar
        getSupportActionBar().hide();


        imageview6=(ImageView)findViewById(R.id.imageview6);
        moveup=(Button)findViewById(R.id.moveup);
        movedown=(Button)findViewById(R.id.movedown);
        moveleft=(Button)findViewById(R.id.moveleft);
        moveright=(Button)findViewById(R.id.moveright);
        next=(Button)findViewById(R.id.next);



        //Move up button click event  ..........................................
        moveup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation a;
                a= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_up);
                imageview6.startAnimation(a);
            }
        });


        //Move down button click event  ..........................................
        movedown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation b;
                b= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_down);
                imageview6.startAnimation(b);
            }
        });


        //Move left button click event  ..........................................
        moveleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation c;
                c= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_left);
                imageview6.startAnimation(c);
            }
        });

        //Move right button click event  ..........................................
        moveright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation d;
                d= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_right);
                imageview6.startAnimation(d);
            }
        });


        //Next button click event  ..........................................
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity7.class);
                startActivity(i);
            }
        });





    }
}
