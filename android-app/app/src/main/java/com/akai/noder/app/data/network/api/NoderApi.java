package com.akai.noder.app.data.network.api;

import com.akai.noder.app.data.dto.NoteDto;

import java.util.List;

import retrofit2.Callback;
import retrofit2.http.GET;

public interface NoderApi {

    @GET("notes")
    void getNotes(Callback<List<NoteDto>> callback);
}
