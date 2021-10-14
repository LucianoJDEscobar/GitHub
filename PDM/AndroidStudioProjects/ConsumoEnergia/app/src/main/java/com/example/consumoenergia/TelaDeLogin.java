package com.example.consumoenergia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaDeLogin extends AppCompatActivity {

    private TextView cadastrar_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_login);

        getSupportActionBar().hide();
        IniciarTelas();

        cadastrar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastrar_usuario = new Intent(TelaDeLogin.this,TelaDeCadastro.class);
                startActivity(cadastrar_usuario);
            }
        });
    }

    private void IniciarTelas(){
        cadastrar_usuario = findViewById(R.id.texto_cadastrar);
    }
}