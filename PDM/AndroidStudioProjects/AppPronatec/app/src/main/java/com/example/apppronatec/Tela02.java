package com.example.apppronatec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tela02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela02);
        Intent intent = getIntent();
        String LOG_TAG = intent.getStringExtra(MainActivity.LOG_TAG);
        TextView result = findViewById(R.id.resultado);
        result.setText(LOG_TAG);
    }
}