package com.subrata.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
    ImageView imageview8;
    Button red, green;
    LinearLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        //hide the actionbar
        getSupportActionBar().hide();

        imageview8=(ImageView)findViewById(R.id.imageview8);
        red=(Button)findViewById(R.id.red);
        green=(Button)findViewById(R.id.green);
        background=(LinearLayout)findViewById(R.id.background);


        //red button click event
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#e72418"));
            }
        });


        //green button click event
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#29e74a"));
            }
        });






    }
}
