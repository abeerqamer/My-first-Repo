package com.example.android.righteyeglasses;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class informationActivity_heart extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_activity_heart);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void done_click(View view)
    {
        player = MediaPlayer.create(this,R.raw.stapler);
        player.start();


        Intent intent = new Intent(getApplicationContext(),doneReading.class);
        startActivity(intent);

    }
}
