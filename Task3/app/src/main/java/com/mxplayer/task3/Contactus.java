package com.mxplayer.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Contactus extends AppCompatActivity {
    MediaPlayer myplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus);
    }

    public void start1(View v) {
        if(myplayer == null) {
            myplayer = MediaPlayer.create(this, R.raw.closer);
            myplayer.setOnCompletionListener(myplayer -> stopSong());
        }
        myplayer.start();
    }

    public void stop1(View v) {
        stopSong();
    }

    public void start2(View v) {
        if(myplayer == null) {
            myplayer = MediaPlayer.create(this, R.raw.perfect);
            myplayer.setOnCompletionListener(myplayer -> stopSong());
        }
        myplayer.start();
    }

    public void stop2(View v) {
        stopSong();
    }

    private void stopSong() {
        if(myplayer != null) {
            myplayer.release();
            myplayer = null;
            Toast.makeText(this, "Song Stops", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        stopSong();
    }





}