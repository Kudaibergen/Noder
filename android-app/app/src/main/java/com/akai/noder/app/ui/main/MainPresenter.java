package com.akai.noder.app.ui.main;

import android.util.Log;

import com.akai.noder.app.ui.base.BasePresenter;

import javax.inject.Inject;

public class MainPresenter<V extends MainContractView> extends BasePresenter<V> implements MainContractPresenter<V> {

    @Inject
    public MainPresenter() {}

    @Override
    public void fabPersonalClick() {
        Log.e("TAG", "click 0");
    }

    @Override
    public void fabSecretClick() {
        Log.e("TAG", "click 1");
    }
}
