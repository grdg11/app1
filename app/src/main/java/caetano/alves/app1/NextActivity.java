package caetano.alves.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent intent = getIntent(); //Capturando a intenção de trocar de tela
        String texto = intent.getStringExtra("texto"); //Armazenando o texto que foi salvo no dicionário da intenção
        TextView tvExibir = findViewById(R.id.tvExibir); //Capturando o textView que exibirá o texto salvo
        tvExibir.setText(texto); //Atualizando o conteúdo do textView para o texto salvo
    }
}