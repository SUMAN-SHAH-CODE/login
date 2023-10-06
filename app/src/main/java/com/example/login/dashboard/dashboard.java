package com.example.login.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.R;
import com.example.login.databinding.ActivityDashboardBinding;
import com.example.login.myprofile.myprofile;
import com.example.login.requestedpage.requestlistpage;

public class dashboard extends AppCompatActivity {
ActivityDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.requested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(dashboard.this, requestlistpage.class);
                startActivity(intent);
            }
        });
       binding.person.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(dashboard.this, myprofile.class);
               startActivity(intent);
           }
       });

    }
}