package com.core.vipcareplus;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import java.io.IOException;

public class emergency extends AppCompatActivity {

//    final MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
    }

    public void ringAlarm(View v) throws IOException {
        Animation animation = new AlphaAnimation(1.0f, 0.0f);
        animation.setDuration(5000);
        v.startAnimation(animation);
        /*Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), notification);
        r.play();*/
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.alarm_alarm);
        mp.start();

    }

    public void callEmergency(View v){
        String phone = "8032615990";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }

}
