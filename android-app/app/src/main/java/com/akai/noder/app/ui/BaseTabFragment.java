package com.akai.noder.app.ui;

import android.support.v4.app.Fragment;

public abstract class BaseTabFragment extends Fragment {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
