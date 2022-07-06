package com.devdroid.rotatebottle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView rotate_bottle;
    int currentPoint,nextPoint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotate_bottle = findViewById(R.id.rotate_bottle);

        rotate_bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateBottle();
            }
        });
    }
    private void rotateBottle(){
        nextPoint = new Random().nextInt(5000);
        int px = rotate_bottle.getWidth()/2;
        int py = rotate_bottle.getHeight()/2;

        Animation rotate_anim = new RotateAnimation(currentPoint,nextPoint,px,py);
        rotate_anim.setDuration(3000);
        rotate_anim.setFillAfter(true);
        currentPoint = nextPoint;
        rotate_bottle.startAnimation(rotate_anim);
    }
}