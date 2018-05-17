package com.akai.noder.app.ui.main;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.akai.noder.app.ui.BaseFragment;
import com.akai.noder.app.ui.main.personal.PersonalNoteFragment;
import com.akai.noder.app.ui.main.secret.SecretNoteFragment;

import java.util.ArrayList;
import java.util.List;

class MainPagerAdapter extends FragmentPagerAdapter {
    private List<BaseFragment> tabs;

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
        tabs = new ArrayList<>();

        tabs.add(PersonalNoteFragment.newInstance());
        tabs.add(SecretNoteFragment.newInstance());
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }
}
