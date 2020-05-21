package com.example.a20200521_basicandroid_baseactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;

import com.example.a20200521_basicandroid_baseactivity.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }
    @Override
    public void setupEvents() {
        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = binding.nameEdt.getText().toString();
                Intent intent = new Intent(mContext,UserInfoActivity.class);
                intent.putExtra("userName",inputName);
                startActivity(intent);
            }
        });
    }

    @Override
    public void setValues() {

    }
}
