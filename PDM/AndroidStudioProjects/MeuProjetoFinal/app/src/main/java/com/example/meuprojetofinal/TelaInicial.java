package com.example.meuprojetofinal;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class TelaInicial extends AppCompatActivity {

    private TextView nomeUsuario; // Declarando o texteView
    private Button btn_deslogar; // Declarando o Button
    FirebaseFirestore db = FirebaseFirestore.getInstance(); // Declara o firestore para uso no método onStart
    String usuarioID; // Declaração de uma string para uso no método onStart


    @Override
    protected void onCreate(Bundle savedInstanceState) { //Método para iniciar o aplicativo
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        getSupportActionBar().hide(); // Para retirar a barra com o nome do aplicativo

        IniciarComponentes(); //Inicia o método agrupado de identificação dos componentes em java

        btn_deslogar.setOnClickListener(new View.OnClickListener() { // Evento de clique do botão
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();

                Intent ir_tela_login = new Intent(TelaInicial.this,TelaLogin.class); // Classe que troca de activity
                startActivity(ir_tela_login); // Inicia a troca de tela
                finish(); // Finaliza esta activity
            }
        });

    }

    @Override
    protected void onStart() { // Quando a aplicação inicia, ele executa a estrutura abaixo 'Ciclo de vida'
        super.onStart();

        usuarioID = FirebaseAuth.getInstance().getCurrentUser().getUid(); // Retirando do banco o usuário atual e passando para a String usuarioID

        DocumentReference documentReference = db.collection("Usuarios").document(usuarioID);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {

                if (value != null){
                    nomeUsuario.setText(value.getString("nome"));
                }
            }
        });

    }

    private void IniciarComponentes(){ // Método para capturar o Button e TextView do arquivo .xml para .java
        nomeUsuario = findViewById(R.id.texto_usuario);
        btn_deslogar = findViewById(R.id.botao_deslogar);

    }
}