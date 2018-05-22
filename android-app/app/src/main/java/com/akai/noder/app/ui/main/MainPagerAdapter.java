package com.akai.noder.app.ui.main;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.akai.noder.app.ui.base.BaseFragment;
import com.akai.noder.app.ui.base.BaseTabFragment;
import com.akai.noder.app.ui.main.personal.PersonalListFragment;
import com.akai.noder.app.ui.main.secret.SecretListFragment;

import java.util.ArrayList;
import java.util.List;

public class MainPagerAdapter extends FragmentPagerAdapter {
    private List<BaseTabFragment> tabs;

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
        tabs = new ArrayList<>();
        tabs.add(PersonalListFragment.newInstance());
        tabs.add(SecretListFragment.newInstance());
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }
}
