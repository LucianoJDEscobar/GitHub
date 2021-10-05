package com.example.AppSomarMudandoTela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    private EditText resultado;
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        getSupportActionBar().hide(); // Para tirar a barra de ações
        botaoVoltar = findViewById(R.id.bt_return);
        resultado = findViewById(R.id.result);
        Intent vemMainActivity = getIntent();
        Bundle parametros = vemMainActivity.getExtras();
        int somaMainAcitivity = parametros.getInt("resultado_soma");
        resultado.setText("Resultado: "+somaMainAcitivity);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarTelaMain = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(voltarTelaMain);
            }
        });
    }
}