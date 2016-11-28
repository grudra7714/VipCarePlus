package com.core.vipcareplus;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation animBlink = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
        ImageView emergency =(ImageView)findViewById(R.id.emergency_button);
        emergency.setVisibility(View.VISIBLE);
        emergency.startAnimation(animBlink);

    }

    public void openAbuseLog(View v){

        Intent intent = new Intent(this, abuselog.class);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void openEmergency(View v){

        Intent intent = new Intent(this, emergency.class);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
