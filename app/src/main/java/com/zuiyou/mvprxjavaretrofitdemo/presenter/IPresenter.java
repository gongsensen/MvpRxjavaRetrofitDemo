package com.zuiyou.mvprxjavaretrofitdemo.presenter;

import android.content.Context;

import com.zuiyou.mvprxjavaretrofitdemo.app.MyApp;
import com.zuiyou.mvprxjavaretrofitdemo.view.IView;

/**
 * 类描述：
 * 创建人:赵圣洁
 * 创建时间：2017/10/30 18:20
 */

public class IPresenter<T extends IView> {
    protected T view;

    public IPresenter(T view) {
        this.view = view;
        init();
    }

    protected void init() {

    }

    public Context context() {
        if (view != null && view.context() != null) {
            return view.context();
        }
        return MyApp.context();
    }

}
