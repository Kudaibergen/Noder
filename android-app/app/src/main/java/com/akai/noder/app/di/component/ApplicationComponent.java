package com.akai.noder.app.di.component;

import com.akai.noder.app.App;
import com.akai.noder.app.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App app);
}
