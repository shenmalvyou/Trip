package com.shenma.trip;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by zhouyf on 15/12/29.
 */
public class MyLeanCloudApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化参数依次为 this, AppId, AppKey
        AVOSCloud.initialize(this,"oeytp7xcekjpbk9mg68u20li6u3lcud68scme21bgun8zuwk","31hn73y885dnokpolk9iqbml78n5vffv1fer4mm4dpwvv7c1");
    }


}
