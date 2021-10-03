package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import javax.xml.xpath.XPathExpression;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button numeroZero,numeroUm,numeroDois,numeroTres,numeroQuatro,numeroCinco,numeroSeis,
            numeroSete,numeroOito,numeroNove,ponto,soma,subtracao,igual,divisao,multiplicacao,limpar;
    private TextView txtEspressao,txtResultado;
    private ImageView backspace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IniciarComponentes();
        getSupportActionBar().hide(); //Retira a barra de status
        numeroZero.setOnClickListener(this);
        numeroUm.setOnClickListener(this);
        numeroDois.setOnClickListener(this);
        numeroTres.setOnClickListener(this);
        numeroQuatro.setOnClickListener(this);
        numeroCinco.setOnClickListener(this);
        numeroSeis.setOnClickListener(this);
        numeroSete.setOnClickListener(this);
        numeroOito.setOnClickListener(this);
        numeroNove.setOnClickListener(this);
        ponto.setOnClickListener(this);
        soma.setOnClickListener(this);
        subtracao.setOnClickListener(this);
        igual.setOnClickListener(this);
        divisao.setOnClickListener(this);
        multiplicacao.setOnClickListener(this);

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtEspressao.setText("");
                txtResultado.setText("");
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView expressao = findViewById(R.id.txt_expressao);
                String string = expressao.getText().toString();
                if (!string.isEmpty()) {
                    byte var0 = 0;
                    int var1 = string.length()-1;
                    String txtExpressao = string.substring(var0,var1);
                    expressao.setText(txtExpressao);
                }
                txtResultado.setText("");
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Expression expressao = new ExpressionBuilder(txtEspressao.getText().toString()).build();
                    double resultado = expressao.evaluate();
                    long longResult = (long) resultado;

                    if (resultado == (double) longResult) {
                        txtResultado.setText((CharSequence) String.valueOf(longResult));
                    } else {
                        txtResultado.setText((CharSequence) String.valueOf(resultado));
                    }
                }catch (Exception e){

                }
            }
        });
    }

    private void IniciarComponentes(){
        numeroZero = findViewById(R.id.number_zero);
        numeroUm = findViewById(R.id.number_one);
        numeroDois = findViewById(R.id.number_two);
        numeroTres = findViewById(R.id.number_three);
        numeroQuatro = findViewById(R.id.number_four);
        numeroCinco = findViewById(R.id.number_five);
        numeroSeis = findViewById(R.id.number_six);
        numeroSete = findViewById(R.id.number_seven);
        numeroOito = findViewById(R.id.number_eigth);
        numeroNove = findViewById(R.id.number_nine);
        ponto = findViewById(R.id.number_virgula);
        soma = findViewById(R.id.plus);
        subtracao = findViewById(R.id.minus);
        igual = findViewById(R.id.equals);
        divisao = findViewById(R.id.bt_div);
        multiplicacao = findViewById(R.id.multiply);
        limpar = findViewById(R.id.bt_clean);
        txtResultado = findViewById(R.id.txt_resultado);
        txtEspressao = findViewById(R.id.txt_expressao);
        backspace = findViewById(R.id.backspace);
    }
    public void AcrescentarUmaExpressao (String string, boolean limpar_dados){
        if(txtResultado.getText().equals("")){
            txtEspressao.setText(" ");
        }
        if(limpar_dados){
            txtResultado.setText(" ");
            txtEspressao.append(string);
        }else{
            txtEspressao.append(txtResultado.getText());
            txtEspressao.append(string);
            txtResultado.setText(" ");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.number_zero:
                AcrescentarUmaExpressao("0",true);
                break;
            case R.id.number_one:
                AcrescentarUmaExpressao("1",true);
                break;
            case R.id.number_two:
                AcrescentarUmaExpressao("2",true);
                break;
            case R.id.number_three:
                AcrescentarUmaExpressao("3",true);
                break;
            case R.id.number_four:
                AcrescentarUmaExpressao("4",true);
                break;
            case R.id.number_five:
                AcrescentarUmaExpressao("5",true);
                break;
            case R.id.number_six:
                AcrescentarUmaExpressao("6",true);
                break;
            case R.id.number_seven:
                AcrescentarUmaExpressao("7",true);
                break;
            case R.id.number_eigth:
                AcrescentarUmaExpressao("8",true);
                break;
            case R.id.number_nine:
                AcrescentarUmaExpressao("9",true);
                break;
            case R.id.number_virgula:
                AcrescentarUmaExpressao(",",true);
                break;
            case R.id.plus:
                AcrescentarUmaExpressao("+",false);
                break;
            case R.id.minus:
                AcrescentarUmaExpressao("-",false);
                break;
            case R.id.bt_div:
                AcrescentarUmaExpressao("/",false);
                break;
            case R.id.multiply:
                AcrescentarUmaExpressao("*",false);
                break;
        }
    }
}