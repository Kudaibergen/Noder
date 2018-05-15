package com.akai.noder.app.ui.main.personal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akai.noder.app.R;
import com.akai.noder.app.ui.BaseFragment;

public class PersonalNoteFragment extends BaseFragment {

    public static PersonalNoteFragment newInstance() {
        PersonalNoteFragment fragment = new PersonalNoteFragment();
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
