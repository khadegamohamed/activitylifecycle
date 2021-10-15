package com.example.learnandtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.textView);
        Intent ii =getIntent();

        String f=ii.getExtras().getString("first");
        String ff = ii.getExtras().getString("last");
        name.setText(f+"**"+ff);
    }
}