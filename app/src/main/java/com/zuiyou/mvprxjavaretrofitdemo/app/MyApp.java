package com.zuiyou.mvprxjavaretrofitdemo.app;

import android.app.Application;
import android.content.Context;

/**
 * 类描述：
 * 创建人:赵圣洁
 * 创建时间：2017/10/30 18:30
 */

public class MyApp extends Application {
    private static MyApp context;

    @Override
    public void onCreate() {
        super.onCreate();
        this.context = this;
    }

    public static Context context() {
        return context;
    }
}
