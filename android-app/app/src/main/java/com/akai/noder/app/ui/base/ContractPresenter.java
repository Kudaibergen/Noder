package com.akai.noder.app.ui.base;

public interface ContractPresenter<V extends ContractView> {

    void onAttach(V contractView);

    void onDetach();
}
