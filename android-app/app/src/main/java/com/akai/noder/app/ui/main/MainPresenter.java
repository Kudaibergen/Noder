package com.akai.noder.app.ui.main;

import android.util.Log;

import com.akai.noder.app.ui.base.BasePresenter;

import javax.inject.Inject;

public class MainPresenter<V extends ContractMainView> extends BasePresenter<V> implements ContractMainPresenter<V> {
    private static String TAG = "MainPresenter";

    @Inject
    public MainPresenter() {}

    @Override
    public void fabPersonalClick() {
        Log.e(TAG, "click 0");
        getContractView().openPersonalActivity();
    }

    @Override
    public void fabSecretClick() {
        Log.e(TAG, "click 1");
        getContractView().openSecretActivity();
    }
}
