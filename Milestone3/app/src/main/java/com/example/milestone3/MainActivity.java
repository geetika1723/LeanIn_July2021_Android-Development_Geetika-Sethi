package com.example.milestone3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button food,retail,travel,sports,entertainment,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food=findViewById(R.id.food);
        retail=findViewById(R.id.retail);
        travel=findViewById(R.id.travel);
        sports=findViewById(R.id.sport);
        entertainment=findViewById(R.id.entertainment);
        next=findViewById(R.id.next);

        food.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent)
            {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                    food.setBackground(getDrawable(R.drawable.circle));
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    food.setBackground(getDrawable(R.drawable.round_button));
                return false;
            }
        });

        retail.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent)
            {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                    retail.setBackground(getDrawable(R.drawable.circle));
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    retail.setBackground(getDrawable(R.drawable.roundbutton2));
                return false;
            }
        });

        travel.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent)
            {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                    travel.setBackground(getDrawable(R.drawable.circle));
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    travel.setBackground(getDrawable(R.drawable.roundbutton2));
                return false;
            }
        });

        sports.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent)
            {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                    sports.setBackground(getDrawable(R.drawable.circle));
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    sports.setBackground(getDrawable(R.drawable.round_button));
                return false;
            }
        });

        entertainment.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent)
            {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                    entertainment.setBackground(getDrawable(R.drawable.circle));
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    entertainment.setBackground(getDrawable(R.drawable.roundbutton2));
                return false;
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                finish();
            }
        });
    }
}