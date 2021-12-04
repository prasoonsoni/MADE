package com.aiproject.made;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button checkMask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkMask = findViewById(R.id.checkMask);

        checkMask.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, CheckMaskActivity.class));
        });
    }
}