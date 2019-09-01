package com.tiva11.grepo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tiva11.grepo.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        binding.setLifecycleOwner(this);
    }
}
