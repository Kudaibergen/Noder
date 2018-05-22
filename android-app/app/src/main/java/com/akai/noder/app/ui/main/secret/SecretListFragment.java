package com.akai.noder.app.ui.main.secret;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akai.noder.app.R;
import com.akai.noder.app.ui.BaseFragment;
import com.akai.noder.app.ui.BaseTabFragment;

public class SecretListFragment extends BaseTabFragment {
    private final static String TAG = "SecretListFragment";

    public static SecretListFragment newInstance() {
        SecretListFragment fragment = new SecretListFragment();
        fragment.setTitle("Fragment 2");
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_secret_notes, container, false);
        return view;
    }
}
