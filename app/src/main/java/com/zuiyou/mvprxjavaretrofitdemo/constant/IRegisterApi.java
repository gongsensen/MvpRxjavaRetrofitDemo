package com.zuiyou.mvprxjavaretrofitdemo.constant;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;

/**
 * 类描述：
 * 创建人:赵圣洁
 * 创建时间：2017/10/30 18:34
 */

public interface IRegisterApi {
    @GET("http://www.baidu.com")
    Observable<ResponseBody> register();
}
