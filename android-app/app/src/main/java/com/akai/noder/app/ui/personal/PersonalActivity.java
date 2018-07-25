package com.akai.noder.app.ui.personal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.akai.noder.app.App;
import com.akai.noder.app.R;
import com.akai.noder.app.data.dto.NoteDto;
import com.akai.noder.app.ui.base.BaseActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PersonalActivity extends BaseActivity {
    private static String TAG = "PersonalActivity";

    private EditText mEditText;
    private Button mButton;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, PersonalActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        setup();
    }

    View.OnClickListener listenerSend = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.e(TAG, "click send: " + mEditText.getText());

            App.getClient().getNoderApi().getNotes(new Callback<List<NoteDto>>() {
                @Override
                public void onResponse(@NonNull Call<List<NoteDto>> call, @NonNull Response<List<NoteDto>> response) {
                    if (call.isExecuted()) {
                        Log.e("TAG", "isExecuted");
                    } else {
                        Log.e("TAG", "not executed");
                    }
                    Log.e("TAG", "text: " + response.body().get(0).getText());
                }

                @Override
                public void onFailure(@NonNull Call<List<NoteDto>> call, @NonNull Throwable t) {
                    Log.e("TAG", "throwable " + t.getMessage());
                }
            });
        }
    };

    @Override
    protected void setup() {
        super.setup();
        mButton.setOnClickListener(listenerSend);
    }

    @Override
    protected void init() {
        mEditText = findViewById(R.id.editText);
        mButton = findViewById(R.id.button);
    }
}
