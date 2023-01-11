package com.sundxin.loader;


import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FActy2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acty_f);

        Toast.makeText(this, "All Done", Toast.LENGTH_SHORT).show();

    }
}