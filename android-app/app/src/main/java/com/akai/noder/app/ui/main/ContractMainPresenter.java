package com.akai.noder.app.ui.main;

import com.akai.noder.app.ui.base.ContractPresenter;

public interface ContractMainPresenter<V extends ContractMainView> extends ContractPresenter<V> {
    void fabPersonalClick();

    void fabSecretClick();
}
