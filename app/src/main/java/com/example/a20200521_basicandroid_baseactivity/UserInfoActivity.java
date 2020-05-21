package com.example.a20200521_basicandroid_baseactivity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import com.example.a20200521_basicandroid_baseactivity.databinding.ActivityUserInfoBinding;

import java.util.Calendar;

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
        String name = getIntent().getStringExtra("userName");
        int birthYear = getIntent().getIntExtra("userBirthYear", -1);
        int age = Calendar.getInstance().get(Calendar.YEAR)-birthYear+1;
        // 타이핑한 값이 없다면 -1로 입력해줌.

        //받아온 정보 가공.
        binding.userInfoTxt.setText(String.format("%s(%d세)",name,age));
    }
}
