package com.akai.noder.app.di.module;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.akai.noder.app.di.PerActivity;
import com.akai.noder.app.ui.main.ContractMainPresenter;
import com.akai.noder.app.ui.main.ContractMainView;
import com.akai.noder.app.ui.main.MainPagerAdapter;
import com.akai.noder.app.ui.main.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    FragmentPagerAdapter proviedMainPagerAdapter(AppCompatActivity activity) {
        return new MainPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    @PerActivity
    ContractMainPresenter<ContractMainView> provideMainPresenter(MainPresenter<ContractMainView> presenter) {
        return presenter;
    }
}
