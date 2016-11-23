package com.degtyar.sergey.firstapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by student on 09.11.2016.
 */

public class MainActivity extends AppCompatActivity {
    private TextView mOutputView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        mOutputView = (TextView) findViewById(R.id.output);
    }
    public void onPrintClick(View view){
        mOutputView.setText("Hi too!!");
        mOutputView.setTextSize(30);
        mOutputView.setGravity(1);
    }
}
