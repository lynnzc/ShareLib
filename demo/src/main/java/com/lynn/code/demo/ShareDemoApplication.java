package com.lynn.code.demo;

import android.app.Application;

import com.share.api.ShareEnv;
import com.squareup.leakcanary.LeakCanary;

/**
 * demo application
 * Created by Lynn on 3/25/16.
 */
public class ShareDemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化分享环境
        ShareEnv.init(getApplicationContext(),
                "weibo_key", "qq_key", "wechat_key", "alipay_key");
        // 测试内存泄漏
        LeakCanary.install(this);
    }
}