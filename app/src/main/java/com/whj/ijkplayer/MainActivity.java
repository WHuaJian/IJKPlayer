package com.whj.ijkplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.whj.k12ijkplayer.K12IJKPlayer;


public class MainActivity extends AppCompatActivity {

    String mp4 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button_1 = findViewById(R.id.start_1);
        Button button_2 = findViewById(R.id.start_2);

        //应用横屏播放（pad端）
        button_1.setOnClickListener(v -> K12IJKPlayer.builder(MainActivity.this)
                .setTitle("测试视屏")
                .setUrl(mp4)
                .setAutoPlay(true)
                .playForLandscape());

        //应用竖屏播放（phone端）
        button_2.setOnClickListener(v -> K12IJKPlayer.builder(MainActivity.this)
                .setTitle("测试视屏")
                .setUrl(mp4)
                .setFullScreen(true)
                .playForPortrait());
    }

}
