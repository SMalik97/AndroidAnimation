package com.subrata.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageview2;
    Button zoomIn, zoomOut, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Hide the action bar
        getSupportActionBar().hide();


        imageview2=(ImageView)findViewById(R.id.imageview2);
        zoomIn=(Button)findViewById(R.id.zoomIn);
        zoomOut=(Button)findViewById(R.id.zoomOut);
        next=(Button)findViewById(R.id.next);


        //Zoom In button click event  ..........................................
        zoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation a;
                a= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
                imageview2.startAnimation(a);
            }
        });


        //Zoom out button click event  ..........................................
        zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation b;
                b= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
                imageview2.startAnimation(b);
            }
        });


        //Next button click event  ..........................................
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(i);
            }
        });




    }
}
