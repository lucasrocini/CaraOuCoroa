package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //recuperar os dados
        Bundle dados = getIntent().getExtras();

        int numero = dados.getInt("numero");
    }
}