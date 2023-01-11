package com.sundxin.loader;


import static com.sundixan.loader.OErian.getadseetrytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


public class FActy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acty_f);


        getadseetrytn(this, new Intent(this, FActy2.class), getString(R.string.fail) + BuildConfig.APPLICATION_ID);

    }
}