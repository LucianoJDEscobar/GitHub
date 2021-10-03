package com.example.mudandodetela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btIrTela02, btFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btIrTela02 = findViewById(R.id.trocar_tela);
        btFinalizar = findViewById(R.id.finalizar);

        btFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btIrTela02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir_tela02 = new Intent(getApplicationContext(),TelaSecundaria2.class);
                startActivity(ir_tela02);
            }
        });
    }
}