package com.akai.noder.app;

import android.app.Application;

import com.akai.noder.app.data.network.RestClient;
import com.akai.noder.app.di.component.ApplicationComponent;
import com.akai.noder.app.di.component.DaggerApplicationComponent;

public class App extends Application {
    private static RestClient client;
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        client = new RestClient();
        mApplicationComponent = DaggerApplicationComponent.create();

        mApplicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

    public void setComponent(ApplicationComponent applicationComponent) {
        this.mApplicationComponent = applicationComponent;
    }

    public static RestClient getClient() {
        return client;
    }
}
