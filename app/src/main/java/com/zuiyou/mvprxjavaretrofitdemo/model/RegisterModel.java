package com.zuiyou.mvprxjavaretrofitdemo.model;

import com.zuiyou.mvprxjavaretrofitdemo.constant.IRegisterApi;
import com.zuiyou.mvprxjavaretrofitdemo.model.utils.RetrofitManager;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * 类描述： model里面利用retrofit构造了一个被观察者
 * 创建人:赵圣洁
 * 创建时间：2017/10/30 18:25
 */

public class RegisterModel implements IRegisterModel {
    @Override
    public Observable<ResponseBody> register() {
        //需要拿到一个Observable ，从retrofit中拿
        return RetrofitManager.getDefault().create(IRegisterApi.class).register();

    }
}
