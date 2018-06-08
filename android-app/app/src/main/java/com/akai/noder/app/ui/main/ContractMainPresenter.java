package com.akai.noder.app.ui.main;

import com.akai.noder.app.ui.base.Contract;

public interface ContractMainPresenter<V extends ContractMainView> extends Contract.Presenter<V> {

    void fabPersonalClick();

    void fabSecretClick();
}
