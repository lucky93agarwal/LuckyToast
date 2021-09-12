package com.mslji.mytoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mslji.luckytoast.LuckyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LuckyToast.simpleToast(MainActivity.this,"Show New Data",1);
    }
}