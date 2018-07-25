package com.akai.noder.app.data.network;

import com.akai.noder.app.BuildConfig;
import com.akai.noder.app.data.network.api.NoderApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    private final Retrofit retrofit;
    private NoderApi noderApi;

    public RestClient() {
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BuildConfig.BASE_URL)
                .build();
    }

    public NoderApi getNoderApi() {
        if (noderApi == null) {
            noderApi = retrofit.create(NoderApi.class);
        }
        return noderApi;
    }
}
