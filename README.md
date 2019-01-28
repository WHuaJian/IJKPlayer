## 当前版本
<a href="https://bintray.com/whj/Maven/K12IJKPlayer/1.0.2/link"><img src="https://api.bintray.com/packages/whj/Maven/K12IJKPlayer/images/download.svg?version=1.0.2"/></a>

## 用法
```Java
        //应用横屏播放（pad端）
               button_1.setOnClickListener(v -> K12IJKPlayer.builder(MainActivity.this)
                       .setTitle("测试视屏")
                       .setUrl(mp4)
                       .playForLandscape());

        //应用竖屏播放（phone端）
               button_2.setOnClickListener(v -> K12IJKPlayer.builder(MainActivity.this)
                       .setTitle("测试视屏")
                       .setUrl(mp4)
                       .playForPortrait());
```

## 引入方式
```
   implementation 'com.whj.k12ijkplayer:K12IJKPlayer:version'

```
暂时jCenter还没过审，先在app目录build.gradle添加以下配置，过审之后删不删都行
```
   repositories {
       maven { url "https://dl.bintray.com/whj/Maven" }
   }

```

由于ijk中arm64的包，对最低版本有限制，可能跟我们项目的最低版本不一致，解决方法在AndroidManifest.xml添加
```
    <uses-sdk tools:overrideLibrary="tv.danmaku.ijk.media.player_arm64,tv.danmaku.ijk.media.player_x86_64,cn.jzvd" />

```
合并第三方和自己app的AndroidManifest.xml文件的时候忽略tv.danmaku.ijk.media.player_arm64和com.example.ijkplayer_x86_64以及cn.jzvd的最低版本限制。



## License
```
 Copyright 2019, WHuaJian

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
