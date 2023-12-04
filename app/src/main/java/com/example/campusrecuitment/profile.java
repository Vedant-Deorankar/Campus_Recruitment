package com.example.campusrecuitment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageView ivProfileImage = findViewById(R.id.ivProfileImage);
        Glide.with(this)
                .load(R.drawable.vedant)
                .circleCrop()
                .into(ivProfileImage);
    }
}