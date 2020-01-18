package com.example.task_sir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   static MediaPlayer mpl;
    Thread timer;


    @Override
    protected void onPause()
    {
        super.onPause();
        mpl.release();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpl = MediaPlayer.create(this, R.raw.song);
        mpl.start();

        timer = new Thread() {
            public void run() {
                try {

                    sleep(10000);


                } catch (InterruptedException e)
                {

                } finally {
                   Intent on = new Intent(getApplicationContext(),SecondActivit.class);
                    startActivity(on);
                }
            }
        };
        timer.start();
    }


}
