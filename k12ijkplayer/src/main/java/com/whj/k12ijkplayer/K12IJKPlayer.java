package com.whj.k12ijkplayer;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;

import java.lang.ref.WeakReference;

/**
 * @author William
 * @Github WHuaJian
 * Created at 2019/1/28 上午10:02
 */
public class K12IJKPlayer {

    public static final String KEY_PLAY_URL = "KEY_PLAY_URL";
    public static final String KEY_PLAY_TITLE = "KEY_PLAY_TITLE";
    public static final String KEY_PLAY_SCREEN = "KEY_PLAY_SCREEN";

    private WeakReference<Activity> activity;

    private String url;
    private String title;

    protected K12IJKPlayer() {

    }

    public static Builder builder(Activity activity){
        return new Builder(activity);
    }


    public static class Builder {

        private K12IJKPlayer picker = new K12IJKPlayer();

        private Builder(Activity activity) {
            picker.activity = new WeakReference<>(activity);
        }

        public Builder setUrl(String url){
            picker.url = url;
            return this;
        }

        public Builder setTitle(String title){
            picker.title = title;
            return this;
        }

        /**
         * 横屏应用播放
         */
        public void playForLandscape(){
            play(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        }

        /**
         * 竖屏应用播放
         */
        public void playForPortrait(){
            play(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
        }

        private void play(int activityInfo){
            Intent intent = new Intent(picker.activity.get(),K12IJKPlayerActivity.class);
            intent.putExtra(KEY_PLAY_URL,picker.url);
            intent.putExtra(KEY_PLAY_TITLE,picker.title);
            intent.putExtra(KEY_PLAY_SCREEN,activityInfo);
            picker.activity.get().startActivity(intent);
        }
    }
}
