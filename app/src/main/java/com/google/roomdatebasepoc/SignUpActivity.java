package com.google.roomdatebasepoc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.roomdatebasepoc.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}