package com.akai.noder.app.ui.main.personal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akai.noder.app.R;
import com.akai.noder.app.ui.base.BaseTabFragment;

public class PersonalListFragment extends BaseTabFragment {
    private final static String TAG = "PersonalListFragment";

    public static PersonalListFragment newInstance() {
        PersonalListFragment fragment = new PersonalListFragment();
        fragment.setTitle("Fragment 1");
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_notes, container, false);
        return view;
    }
}
