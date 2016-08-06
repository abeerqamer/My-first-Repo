package com.example.android.righteyeglasses;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class selection_of_glass extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_of_glass);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


    }


    public void ovalClick(View view)
    {
        player = MediaPlayer.create(this,R.raw.stapler);
        player.start();


        Intent intent = new Intent(this,informationActivity_oval.class);
        startActivity(intent);

    }

    public void roundClick(View view)
    {
        player = MediaPlayer.create(this,R.raw.stapler);
        player.start();

        Intent intent = new Intent(this,informationActivity_round.class);
        startActivity(intent);

    }

    public void heartClick(View view)
    {
        player = MediaPlayer.create(this,R.raw.stapler);
        player.start();



        Intent intent = new Intent(this,informationActivity_heart.class);
        startActivity(intent);

    }
    public void squareClick(View view)
    {
        player = MediaPlayer.create(this,R.raw.stapler);
        player.start();


        Intent intent = new Intent(this,informationActivity_sqaure.class);
        startActivity(intent);

    }




}
