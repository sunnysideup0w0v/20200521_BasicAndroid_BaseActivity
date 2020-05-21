package com.example.a20200521_basicandroid_baseactivity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import com.example.a20200521_basicandroid_baseactivity.databinding.ActivityUserInfoBinding;

public class UserInfoActivity extends BaseActivity {
    ActivityUserInfoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_user_info);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
