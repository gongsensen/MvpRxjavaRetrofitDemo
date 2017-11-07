package com.zuiyou.mvprxjavaretrofitdemo.view.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zuiyou.mvprxjavaretrofitdemo.R;
import com.zuiyou.mvprxjavaretrofitdemo.presenter.RegisterPresenter;
import com.zuiyou.mvprxjavaretrofitdemo.view.IRegisterView;

public class MainActivity extends AppCompatActivity implements IRegisterView {
    private RegisterPresenter mRegisterPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRegisterPresenter = new RegisterPresenter(this);
    }

    public void register(View view) {
        mRegisterPresenter.register();
    }

    @Override
    public void registerSucceed() {
        Toast.makeText(MainActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void registerFaild() {
        Toast.makeText(MainActivity.this, "注册失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context context() {
        return null;
    }
}
