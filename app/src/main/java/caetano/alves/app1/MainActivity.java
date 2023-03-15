package caetano.alves.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar); //Capturando o botão de enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() { //Capturando o clique do botão
            @Override
            public void onClick(View view) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //Capturando a caixa de texto
                String texto = etDigiteAqui.getText().toString(); //Capturando o texto escrito na caixa de texto
                Intent intent = new Intent(MainActivity.this, NextActivity.class); //Criando a intenção de trocar de tela
                intent.putExtra("texto", texto); //Adicionando o texto capturado da caixa de texto em um dicionário que será levado com a intenção
                startActivity(intent); //Iniciando a intenção
            }
        });
    }
}