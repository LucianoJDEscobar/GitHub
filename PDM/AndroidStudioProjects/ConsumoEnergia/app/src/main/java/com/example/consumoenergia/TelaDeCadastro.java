package com.example.consumoenergia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaDeCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_cadastro);

        getSupportActionBar().hide();

    }
}