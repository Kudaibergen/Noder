package com.akai.noder.app.ui.base;

public abstract class BasePresenter<V extends Contract.View> implements Contract.Presenter<V> {

    private V mContractView;

    protected BasePresenter(){}

    protected V getContractView() {
        return mContractView;
    }

    @Override
    public void onAttach(V contractView) {
        this.mContractView = contractView;
    }

    @Override
    public void onDetach() {
        mContractView = null;
    }
}
