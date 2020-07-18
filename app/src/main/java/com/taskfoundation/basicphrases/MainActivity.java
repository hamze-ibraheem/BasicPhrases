package com.taskfoundation.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playPhrase(View view) {
        Button buttonPressed = (Button) view;

        String tag = buttonPressed.getTag().toString();

        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(tag, "raw", getPackageName()));

        mediaPlayer.start();
    }
}