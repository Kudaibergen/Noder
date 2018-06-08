package com.akai.noder.app.ui.base;

public interface Contract {

    interface Presenter<V extends Contract.View> {

        void onAttach(V contractView);

        void onDetach();
    }

    interface View {

    }
}
