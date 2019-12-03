package com.kishor.picassotest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private String ImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String imageUri = "https://i.imgur.com/tGbaZCY.jpg";
        android.widget.ImageView ivBasicImage = (ImageView) findViewById(R.id.ImageView);
        Picasso.with(this).load(imageUri).into(ivBasicImage);

    }
}
