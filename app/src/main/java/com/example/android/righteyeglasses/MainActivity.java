package com.example.android.righteyeglasses;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        player = MediaPlayer.create(this,R.raw.accordion);
        player.start();

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }



    }

    public void firstPage(View view)
    {
        player = MediaPlayer.create(this,R.raw.stapler);
        player.start();

        Intent intent = new Intent(getApplicationContext(),selection_of_glass.class);
        startActivity(intent);
    }
}
