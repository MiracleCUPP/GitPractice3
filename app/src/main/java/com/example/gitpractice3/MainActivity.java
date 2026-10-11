package com.example.gitpractice3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView message = new TextView(this);
        message.setGravity(Gravity.CENTER);
        message.setText(getString(R.string.welcome_message));
        message.setTextSize(24);
        setContentView(message);
    }
}
