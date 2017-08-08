package com.kfnoon.sideeye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //If not find devices, it will return here
        startActivity(new Intent(MainActivity.this,InitActivity.class));
    }

}
