package com.example.apppronatec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getSimpleName();

    private EditText numero1, numero2; //Declaração de variável
    private Button btsmr; //Declaração de variável


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = findViewById(R.id.numero01); //Conversão de variável de .xml para .java
        numero2 = findViewById(R.id.numero02); //Conversão de variável de .xml para .java
        btsmr = findViewById(R.id.bt_somar); //Conversão de variável de .xml para o .java

        btsmr.setOnClickListener(new View.OnClickListener() { //Determinando a ação do click no botão SOMAR
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(String.valueOf(numero1.getText())); //Conversão de variável do tipo String para Int
                int n2 = Integer.parseInt(String.valueOf(numero2.getText())); //Conversão de variável do tipo String para Int
                int res2 = n1+n2;
                Intent ir_tela2 = new Intent(MainActivity.this,Tela02.class);
                ir_tela2.putExtra(LOG_TAG,res2);
                startActivity(ir_tela2);
            }
        });
       // Log.d(LOG_TAG, "Hello World");
    }
}