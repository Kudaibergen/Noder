package com.akai.noder.app.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.akai.noder.app.App;
import com.akai.noder.app.di.component.ActivityComponent;
import com.akai.noder.app.di.component.DaggerActivityComponent;
import com.akai.noder.app.di.module.ActivityModule;

public abstract class BaseActivity extends AppCompatActivity implements Contract.View {
    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((App) getApplication()).getComponent())
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }

    protected abstract void init();

    protected void setup() {
        init();
    }
}
