package com.akai.noder.app.ui.main;

import com.akai.noder.app.ui.base.ContractPresenter;

public interface MainContractPresenter<V extends MainContractView> extends ContractPresenter<V> {
    void fabPersonalClick();

    void fabSecretClick();
}
