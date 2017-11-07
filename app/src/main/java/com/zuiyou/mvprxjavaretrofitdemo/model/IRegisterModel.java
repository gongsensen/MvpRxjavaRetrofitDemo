package com.zuiyou.mvprxjavaretrofitdemo.model;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * 类描述：
 * 创建人:赵圣洁
 * 创建时间：2017/10/30 18:25
 */

public interface IRegisterModel {
    Observable<ResponseBody> register();
}
