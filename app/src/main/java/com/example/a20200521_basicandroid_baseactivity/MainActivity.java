package com.example.a20200521_basicandroid_baseactivity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import com.example.a20200521_basicandroid_baseactivity.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


    }
    @Override
    public void setupData() {

    }

    @Override
    public void setValues() {

    }
}
