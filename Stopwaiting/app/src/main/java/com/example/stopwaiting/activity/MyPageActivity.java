package com.example.stopwaiting.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stopwaiting.R;
import com.example.stopwaiting.databinding.MypageBinding;

public class MyPageActivity extends AppCompatActivity {
    public static Activity myPageActivity;

    private MypageBinding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MypageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        myPageActivity = MyPageActivity.this;
        if (SettingInfoActivity.setting_info_Activity != null) {
            if (SettingTimeActivity.setting_time_Activity != null) {
                SettingTimeActivity.setting_time_Activity.finish();
            }
            SettingLocationActivity.setting_loc_Activity.finish();
            SettingInfoActivity.setting_info_Activity.finish();
        }
        Intent myIntent = getIntent();
        //TextView name = findViewById(R.id.txtMyName);
        binding.txtMyName.setText(((DataApplication) getApplication()).currentUser.getName() + " 님");

        //Button myWaiting = findViewById(R.id.btnMyWaiting);
        binding.btnMyWaiting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = myIntent;
                intent.setClass(MyPageActivity.this, CheckMyWaitingActivity.class);

                startActivity(intent);
            }
        });

        //Button createWaiting = findViewById(R.id.btnNewWaiting);
        binding.btnNewWaiting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = myIntent;
                intent.setClass(MyPageActivity.this, SettingLocationActivity.class);

                startActivity(intent);
            }
        });

        //Button manageWaiting = findViewById(R.id.btnManageWaiting);
        binding.btnManageWaiting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = myIntent;
                intent.setClass(MyPageActivity.this, ManageWaitingListActivity.class);

                startActivity(intent);
            }
        });

        //Button logout = findViewById(R.id.btnLogOut);
        binding.btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, LoginActivity.class);
                startActivity(intent);

                SharedPreferences sharedPreferences = getSharedPreferences("Login", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                
                MainActivity.mainActivity.finish();
                finish();
            }
        });

        binding.btnMyInfo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = myIntent;
                intent.setClass(MyPageActivity.this, MyInfoActivity.class);

                startActivity(intent);
            }
        });
    }
}