package com.example.login.searchdonor;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.login.R;
import com.example.login.databinding.ActivitySearchdonorBinding;
import com.example.login.requestedpage.requestlistpage;

public class searchdonor extends AppCompatActivity {
ActivitySearchdonorBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySearchdonorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(binding.checkBox.isChecked())
                {
                    String s=binding.address.getText().toString();
                }
                else{
                    String address=binding.address.getText().toString();
                }
                Intent intend=new Intent(searchdonor.this, requestlistpage.class);
                if(binding.checkBox.isChecked())
                {
                    String address=binding.address.getText().toString();
                }
                else{
                    String address=binding.address.getText().toString();
                }

                String patient=binding.patientName.getText().toString();
                String bloodgroup=binding.bloodgroup.getText().toString();
                String pints=binding.pints.getText().toString();
                String s=binding.address.getText().toString();
                intend.putExtra("bg",bloodgroup);
                intend.putExtra("p",pints);
                intend.putExtra("l",s);
                startActivity(intend);
            }

        });
    }
}