package com.whj.k12ijkplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import cn.jzvd.JZDataSource;
import cn.jzvd.JZMediaManager;
import cn.jzvd.JZUtils;
import cn.jzvd.JzvdStd;

/**
 * @author William
 * @Github WHuaJian
 * Created at 2019/1/28 上午8:25
 */
public class K12JzvdStd extends JzvdStd {

    public K12JzvdStd(Context context) {
        super(context);
    }

    public K12JzvdStd(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void init(Context context) {
        super.init(context);
        backButton.setImageResource(R.mipmap.ijk_back);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        int i = v.getId();
        if (i == cn.jzvd.R.id.fullscreen) {
            if (currentScreen == SCREEN_WINDOW_FULLSCREEN) {
                //click quit fullscreen
            } else {
                //click goto fullscreen
            }
        } else if (i == cn.jzvd.R.id.back) {
            //非全屏下结束当前播放页面，全屏下走之前逻辑退出全屏
            if (currentScreen != SCREEN_WINDOW_FULLSCREEN) {
                JZUtils.getAppCompActivity(getContext()).finish();
            }
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.jz_layout_std;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return super.onTouch(v, event);
    }

    @Override
    public void startVideo() {
        super.startVideo();
    }

    //onState 代表了播放器引擎的回调，播放视频各个过程的状态的回调
    @Override
    public void onStateNormal() {
        super.onStateNormal();
    }

    @Override
    public void onStatePreparing() {
        super.onStatePreparing();
    }

    @Override
    public void onStatePlaying() {
        super.onStatePlaying();
    }

    @Override
    public void onStatePause() {
        super.onStatePause();
    }

    @Override
    public void onStateError() {
        super.onStateError();
    }

    @Override
    public void onStateAutoComplete() {
        super.onStateAutoComplete();
    }

    //changeUiTo 真能能修改ui的方法
    @Override
    public void changeUiToNormal() {
        super.changeUiToNormal();
    }

    @Override
    public void changeUiToPreparing() {
        super.changeUiToPreparing();
    }

    @Override
    public void changeUiToPlayingShow() {
        super.changeUiToPlayingShow();
    }

    @Override
    public void changeUiToPlayingClear() {
        super.changeUiToPlayingClear();
    }

    @Override
    public void changeUiToPauseShow() {
        super.changeUiToPauseShow();
    }

    @Override
    public void changeUiToPauseClear() {
        super.changeUiToPauseClear();
    }

    @Override
    public void changeUiToComplete() {
        super.changeUiToComplete();
    }

    @Override
    public void changeUiToError() {
        super.changeUiToError();
    }

    @Override
    public void onInfo(int what, int extra) {
        super.onInfo(what, extra);
    }

    @Override
    public void onError(int what, int extra) {
        super.onError(what, extra);
    }

    @Override
    public void startWindowFullscreen() {
        super.startWindowFullscreen();
    }

    @Override
    public void startWindowTiny() {
        super.startWindowTiny();
    }

    @Override
    public void onAutoCompletion() {
        super.onAutoCompletion();
        //重复播放
        startVideo();
    }

    @Override
    public void setUp(JZDataSource jzDataSource, int screen) {
        super.setUp(jzDataSource, screen);
        //不管是否全屏 返回键都能看到
        backButton.setVisibility(View.VISIBLE);
        backButton.setClickable(true);
    }
}
