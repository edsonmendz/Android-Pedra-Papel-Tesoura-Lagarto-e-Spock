package com.example.rockpaperscisorslizardandspock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecinoadoPedra(View view){

        this.opcaoSelecionada("pedra");

    }

    public void selecinoadoPapel(View view){

        this.opcaoSelecionada("papel");

    }

    public void selecinoadoTesoura(View view){

        this.opcaoSelecionada("tesoura");

    }

    public void selecinoadoLagarto(View view){

        this.opcaoSelecionada("lagarto");

    }

    public void selecinoadoSpock(View view){

        this.opcaoSelecionada("spock");

    }


    public void onClick(View view){

        startActivity( new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=OtzekNVWs30")));

    }


    public void opcaoSelecionada(String opcaoSelecionada) {

        ImageView imagemResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(5);
        String[] opcoes = { "pedra", "papel", "tesoura", "lagarto", "spock"};
        String opcaoApp = opcoes [numero];

        switch ( opcaoApp ) {
            case "pedra" :
                imagemResultado.setImageResource(R.drawable.rock);
                break;

            case "papel" :
                imagemResultado.setImageResource(R.drawable.paper);
                break;

            case "tesoura" :
                imagemResultado.setImageResource(R.drawable.scissors);
                break;

            case "lagarto" :
                imagemResultado.setImageResource(R.drawable.lizard);
                break;

            case "spock" :
                imagemResultado.setImageResource(R.drawable.spock);
                break;
        }

    if(

            (opcaoApp == "tesoura" && opcaoSelecionada == "papel") ||
            (opcaoApp == "tesoura" && opcaoSelecionada == "lagarto") ||
            (opcaoApp == "lagarto" && opcaoSelecionada == "papel") ||
            (opcaoApp == "lagarto" && opcaoSelecionada == "spock") ||
            (opcaoApp == "spock" && opcaoSelecionada == "pedra") ||
            (opcaoApp == "spock" && opcaoSelecionada == "tesoura") ||
            (opcaoApp == "pedra" && opcaoSelecionada == "tesoura") ||
            (opcaoApp == "pedra" && opcaoSelecionada == "lagarto") ||
            (opcaoApp == "papel" && opcaoSelecionada == "pedra") ||
            (opcaoApp == "papel" && opcaoSelecionada == "spock")

    ) {
        textResultado.setText(" Você perdeu :(");
        }

    else if (
            (opcaoSelecionada == "tesoura" && opcaoApp == "papel") ||
            (opcaoSelecionada == "tesoura" && opcaoApp == "lagarto") ||
            (opcaoSelecionada == "lagarto" && opcaoApp == "papel") ||
            (opcaoSelecionada == "lagarto" && opcaoApp == "spock") ||
            (opcaoSelecionada == "spock" && opcaoApp == "pedra") ||
            (opcaoSelecionada == "spock" && opcaoApp == "tesoura") ||
            (opcaoSelecionada == "pedra" && opcaoApp == "tesoura") ||
            (opcaoSelecionada == "pedra" && opcaoApp == "lagarto") ||
            (opcaoSelecionada == "papel" && opcaoApp == "pedra") ||
            (opcaoSelecionada == "papel" && opcaoApp == "spock")
    )
    {
        textResultado.setText(" Você Ganhou :)");

        }

    else {
        textResultado.setText(" Empatamos ;)");
        }

    }
}