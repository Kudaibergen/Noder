package com.akai.noder.app.ui.secret;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.akai.noder.app.R;
import com.akai.noder.app.ui.base.BaseActivity;

public class SecretActivity extends BaseActivity {
    private static String TAG = "SecretActivity";

    private EditText mEditText;
    private Button mButton;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, SecretActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);
        setup();
    }

    View.OnClickListener listenerSend = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.e(TAG, "click 1: " + mEditText.getText());
        }
    };

    @Override
    protected void setup() {
        super.setup();
        mButton.setOnClickListener(listenerSend);
    }

    @Override
    protected void init() {
        mEditText = findViewById(R.id.editText2);
        mButton = findViewById(R.id.button2);
    }
}
