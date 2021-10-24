package com.example.meuprojetofinal;
// Identificando algum valor digitado pelo usuário
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.os.Handler;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;

public class TelaLogin extends AppCompatActivity {

    private TextView cadastrar_usuario; // Declarando o texteView
    private EditText editar_email, editar_senha; //Declarando os EditText
    private Button btn_login; // Declarando o Button
    private ProgressBar progressBar; // Declarando a progressBar
    String[] mensagens = {"Preencha todos os campos"}; // Declarando um array de String

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Método para iniciar o aplicativo
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        getSupportActionBar().hide(); // Para retirar a barra com o nome do aplicativo
        IniciarComponentes(); //Inicia o método agrupado de identificação dos componentes em java

        cadastrar_usuario.setOnClickListener(new View.OnClickListener() { // Evento de clique no TextView
            @Override
            public void onClick(View view) {

                Intent cadastrar_usuario = new Intent(TelaLogin.this,TelaDeCadastro.class); // Troca de activity
                startActivity(cadastrar_usuario); // Inicia a classe Intent

            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() { // Evento de clique do botão
            @Override
            public void onClick(View v) {
                String email = editar_email.getText().toString(); // Identificando algum valor digitado pelo usuário
                String senha = editar_senha.getText().toString(); // Identificando algum valor digitado pelo usuário

                if(email.isEmpty() || senha.isEmpty()){ //Verificando se o usuário deixou algum EditText em branco ao clicar no botão
                    Snackbar mensagem = Snackbar.make(v, mensagens[0], Snackbar.LENGTH_SHORT); //Mensagem caso o usuário esqueça de preencher algum campo
                    mensagem.setBackgroundTint(Color.WHITE); // Cor de fundo da mensagem
                    mensagem.setTextColor(Color.BLACK); // Cor do texto da mensagem
                    mensagem.show(); // Executa o método show
                }else{
                    AutenticarUsuario(v); // Inicia o método que autentica o usuário
                }

            }
        });
    }

    @Override
    protected void onStart() { // Toda vez que iniciar o aplicativo, vai carregar o que está aqui dentro
        super.onStart();

        FirebaseUser usuarioAtual = FirebaseAuth.getInstance().getCurrentUser(); //Carrega a instância do usuário atual

        if (usuarioAtual != null){ // Se o usuário atual stiver logado, vai para a tela principal diretamente
            TelaPrincipal();
        }
    }

    private void AutenticarUsuario(View view){ // Método que vai autenticar o usuário
        String email = editar_email.getText().toString(); // Identificando algum valor digitado pelo usuário
        String senha = editar_senha.getText().toString(); // Identificando algum valor digitado pelo usuário

        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() { //Comando para verificar a autenticação
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){ // Caso a autenticação seja feita com sucesso
                    progressBar.setVisibility(View.VISIBLE); // Deixa a progresbar visível
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() { //Executa o método a seguir
                            TelaPrincipal();
                        }
                    },3000); // Tempo de apresentação da progressbar e executa o método Run
                }else{ // Caso apresente erros na autenticação
                    String erro;
                    try {
                        throw task.getException(); // Vai tentar obter uma exceção
                    }catch (FirebaseAuthWeakPasswordException e){ // Trata do erro de senha com menos de 8 caracteres
                        erro = "Digite uma senha com no mínimo 8 dígitos numéricos";
                    }catch (FirebaseAuthInvalidUserException e){ // Trata do erro de conta não cadastrada
                        erro = "Email não cadastrado";
                    }catch (FirebaseAuthInvalidCredentialsException e){ // Trata do erro de inserção de e-mail inexistênte
                        erro = "E-mail e/ou senha inválidos";
                    }catch (Exception e){ // Trata qualquer outro tipo de erro no cadastramento
                        erro = "Erro ao cadastrar usuário";
                    }

                    Snackbar mensagem = Snackbar.make(view,erro,Snackbar.LENGTH_SHORT); //Mensagem de erro dependendo da ocasião
                    mensagem.setBackgroundTint(Color.WHITE); // Cor de fundo da mensagem
                    mensagem.setTextColor(Color.BLACK); // Cor do texto da mensagem
                    mensagem.show(); // Executa a mensagem
                }
            }
        }); // Realizar o login de email cadastrado
    }

    private void TelaPrincipal(){ // Método que transfere essa activity para a Tela principal
        Intent ir_tela_principal = new Intent(TelaLogin.this,TelaInicial.class); // Classe que troca de activity
        startActivity(ir_tela_principal); // Inicia a troca de tela
        finish(); // Encerra essa activity
    }

    private void IniciarComponentes(){ // Método para capturar o Button, TextView, ProgressBar e os EditText do arquivo .xml para .java

        cadastrar_usuario = findViewById(R.id.texto_cadastrar);
        editar_email = findViewById(R.id.editar_email);
        editar_senha = findViewById(R.id.editar_senha);
        btn_login = findViewById(R.id.botao_entrar);
        progressBar = findViewById(R.id.progresso_login);
    }
}