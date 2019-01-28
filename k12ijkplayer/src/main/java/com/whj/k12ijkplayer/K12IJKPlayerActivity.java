package com.whj.k12ijkplayer;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;

/**
 * @author William
 * @Github WHuaJian
 * Created at 2019/1/28 上午11:08
 */
public class K12IJKPlayerActivity extends AppCompatActivity {

    private String playUrl;
    private int activityInfo;
    private String playTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityInfo = getIntent().getIntExtra(K12IJKPlayer.KEY_PLAY_SCREEN,ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        playUrl = getIntent().getStringExtra(K12IJKPlayer.KEY_PLAY_URL);
        playTitle = getIntent().getStringExtra(K12IJKPlayer.KEY_PLAY_TITLE);

        setRequestedOrientation(activityInfo);
        setContentView(R.layout.k12ijkplayer_activity_layout);

        ijkPlay();
    }

    private void ijkPlay(){
        Jzvd.setMediaInterface(new JZMediaIjkplayer());  //  ijkMediaPlayer
        Jzvd.NORMAL_ORIENTATION = activityInfo;
        K12JzvdStd myJzvdStd= findViewById(R.id.videoplayer);
        myJzvdStd.setUp( playUrl, playTitle, JzvdStd.SCREEN_WINDOW_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Jzvd.releaseAllVideos();
    }

    @Override
    public void onBackPressed() {
        if (Jzvd.backPress()) {
            return;
        }
        super.onBackPressed();
    }
}
