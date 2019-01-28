package com.whj.ijkplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.whj.k12ijkplayer.K12IJKPlayer;


public class MainActivity extends AppCompatActivity {

    String mp4 = "http://file.kexinedu.net:8004/file/2019/01/20/22040035-ofy6yMGe.mp4";
    String mp3 = "http://other.web.nf01.sycdn.kuwo.cn/resource/n3/21/82/957599739.mp3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button_1 = findViewById(R.id.start_1);
        Button button_2 = findViewById(R.id.start_2);

        button_1.setOnClickListener(v ->
                K12IJKPlayer.builder(MainActivity.this)
                        .setTitle("测试视屏")
                        .setUrl(mp3)
                        .playForLandscape()
        );

        button_2.setOnClickListener(v ->
                K12IJKPlayer.builder(MainActivity.this)
                        .setTitle("测试视屏")
                        .setUrl(mp4)
                        .playForPortrait()
        );
    }

}
