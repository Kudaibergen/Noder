package com.akai.noder.app.di.component;

import com.akai.noder.app.di.PerActivity;
import com.akai.noder.app.di.module.ActivityModule;
import com.akai.noder.app.ui.main.MainActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);
}
