package com.example.AppSomarMudandoTela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText numero01, numero02;
    private Button bt_somar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        numero01 = findViewById(R.id.number1);
        numero02 = findViewById(R.id.number2);
        bt_somar = findViewById(R.id.btsomar);

        bt_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(String.valueOf(numero01.getText().toString()));
                int n2 = Integer.parseInt(String.valueOf(numero02.getText().toString()));
                int calcular = n1 + n2;
                Intent irActivity02 = new Intent(MainActivity.this,Activity2.class);
                Bundle soma = new Bundle();
                soma.putInt("resultado_soma",calcular);
                irActivity02.putExtras(soma);
                startActivity(irActivity02);
            }
        });
    }
}