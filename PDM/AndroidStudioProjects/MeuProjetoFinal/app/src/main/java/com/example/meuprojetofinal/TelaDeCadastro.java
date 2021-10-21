package com.example.meuprojetofinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;

public class TelaDeCadastro extends AppCompatActivity {

    private EditText editar_nome, editar_email, editar_senha; // Declarando os EditText do método IniciarComponentes
    private Button btn_cadastrar; // Declarando o Button do método IniciarComponentes
    String[] mensagens =  {"Preencha todos os campos","Cadastro realizado com sucesso"}; //Array de mensagens para o usuário
    String usuarioID; // Declarando string global para obter o nome do usuário atual do banco de dados
    @Override
    protected void onCreate(Bundle savedInstanceState) { //Aonde inicia minha aplicação
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_cadastro);

        getSupportActionBar().hide(); // Para retirar a barra com o nome do aplicativo
        IniciarComponentes(); //Inicia o método agrupado de identificação dos componentes em java

        btn_cadastrar.setOnClickListener(new View.OnClickListener() { // Evento de clique do botão
            @Override
            public void onClick(View v) {

                String nome = editar_nome.getText().toString(); // Identificando algum valor digitado pelo usuário
                String email = editar_email.getText().toString(); // Identificando algum valor digitado pelo usuário
                String senha = editar_senha.getText().toString(); // Identificando algum valor digitado pelo usuário

                if(nome.isEmpty() || email.isEmpty() || senha.isEmpty()){ //Verificando se o usuário deixou algum EditText em branco ao clicar no botão
                    Snackbar mensagem = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT); //Mensagem caso o usuário esqueça de preencher algum campo
                    mensagem.setBackgroundTint(Color.WHITE); // Cor de fundo da mensagem
                    mensagem.setTextColor(Color.BLACK); // Cor do texto da mensagem
                    mensagem.show(); // Executa o método show
                }else {
                    CadastrarUsuario(v); // Inicia o método para cadastrar o usuário
                }
            }
        });
    }

    private void SalvarDadosUsuario(){

        String nome = editar_nome.getText().toString();  // Identificando algum valor digitado pelo usuário

        FirebaseFirestore db = FirebaseFirestore.getInstance(); //Inicializa o Cloud Firestone
        Map<String, Object> user = new HashMap<>(); //Adiciona ao banco de dados
        user.put("nome", nome); // Recuperando o nome do usuário com a chave nome já cadastrada no banco de dados

        usuarioID = FirebaseAuth.getInstance().getCurrentUser().getUid(); // Usuário atual

        DocumentReference documentReference = db.collection("Usuarios").document(usuarioID); // Documento de referência para inserir o ID do usuário
                documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) { //Se os dados forem salvos com sucesso, imprime na tela a mensagem
                        Log.d("db", "Sucesso ao salvar os dados");
                    }
                })
                .addOnFailureListener(new OnFailureListener() { //Se os dados não forem salvos, imprime na tela
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d("db_error", "Erro ao salvar os dados" + e.toString());
                    }
                });

    }

    private void IniciarComponentes(){ // Método para capturar o Button e os EditText do arquivo .xml para .java
        editar_nome = findViewById(R.id.editar_novo_usuario);
        editar_email = findViewById(R.id.editar_novo_email);
        editar_senha = findViewById(R.id.editar_nova_senha);
        btn_cadastrar = findViewById(R.id.botao_cadastrar);
    }

    private void CadastrarUsuario(View v){ // Método para cadastrar o usuário

        String email = editar_email.getText().toString();
        String senha = editar_senha.getText().toString();

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() { //Autenticação de um novo usuário com uso da plataforma FIREBASE do GOOGLE
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) { // Objeto responsável pelo cadastro e autenticação de usuário

                if(task.isSuccessful()){ // Caso o cadastro obtiver sucesso, executa esta etapa da estrutura

                    SalvarDadosUsuario(); // Salva o nome do usuário no banco de dados

                    Snackbar mensagem = Snackbar.make(v,mensagens[1],Snackbar.LENGTH_SHORT); //Mensagem caso seja cadastrado com sucesso
                    mensagem.setBackgroundTint(Color.WHITE); // Cor de fundo da mensagem
                    mensagem.setTextColor(Color.BLACK); // Cor do texto da mensagem
                    mensagem.show(); // Executa a mensagem

                    Intent ir_tela_login = new Intent(TelaDeCadastro.this,TelaLogin.class);
                    startActivity(ir_tela_login);
                    finish();
                }else{ // Estrutura para tratar as exceções, mensagens de erro
                    String erro;
                    try {
                        throw task.getException(); // Vai tentar obter uma exceção
                    }catch (FirebaseAuthWeakPasswordException e){ // Trata do erro de senha com menos de 8 caracteres
                        erro = "Digite uma senha com no mínimo 8 dígitos numéricos";
                    }catch (FirebaseAuthUserCollisionException e){ // Trata do erro de conta já cadastrada
                        erro = "Esta conta ja está cadastrada";
                    }catch (FirebaseAuthInvalidCredentialsException e){ // Trata do erro de inserção de e-mail inexistênte
                        erro = "E-mail inválido";
                    }catch (Exception e){ // Trata qualquer outro tipo de erro no cadastramento
                        erro = "Erro ao cadastrar usuário";
                    }

                    Snackbar mensagem = Snackbar.make(v,erro,Snackbar.LENGTH_SHORT); //Mensagem de erro dependendo da ocasião
                    mensagem.setBackgroundTint(Color.WHITE); // Cor de fundo da mensagem
                    mensagem.setTextColor(Color.BLACK); // Cor do texto da mensagem
                    mensagem.show(); // Executa a mensagem
                }
            }
        });
    }
}