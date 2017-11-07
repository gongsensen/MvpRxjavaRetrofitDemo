package com.zuiyou.mvprxjavaretrofitdemo.presenter;

import com.zuiyou.mvprxjavaretrofitdemo.model.RegisterModel;
import com.zuiyou.mvprxjavaretrofitdemo.view.IRegisterView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * 类描述：
 * 创建人:赵圣洁
 * 创建时间：2017/10/30 18:21
 */

public class RegisterPresenter extends IPresenter<IRegisterView> {
    private RegisterModel mRegisterModel;

    public RegisterPresenter(IRegisterView view) {
        super(view);
    }

    @Override
    protected void init() {
        mRegisterModel = new RegisterModel();
    }

    /**
     * presenter利用model返回的被观察者 ，用rxjava的形式处理请求结果
     */
    public void register() {

        //model提供对应的被观察者
        Observable<ResponseBody> registerObservable = mRegisterModel.register();

        //用rxjava的形式处理被观察者
        registerObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        new Consumer<ResponseBody>() {
                            @Override
                            public void accept(ResponseBody responseBody) throws Exception {
                                if (view != null) {
                                    view.registerSucceed();
                                }
                            }
                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                if (view != null) {
                                    view.registerFaild();
                                }
                            }
                        }
                );

    }
}
