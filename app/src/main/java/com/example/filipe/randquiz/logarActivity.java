package com.example.filipe.randquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.common.api.GoogleApiClient;

public class logarActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private Button btnLogar;
    private EditText txtLogin;
    private EditText txtSenha;
    private GoogleApiClient client;
    Intent it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logar);


        btnLogar = (Button) findViewById(R.id.btnEntrar);
        txtLogin=(EditText) findViewById(R.id.txtLogin);
        txtSenha=(EditText) findViewById(R.id.txtSenha);
        btnLogar.setOnClickListener(this);

        it = new Intent(this, Configuracoes.class);

    }
    public void onClick(View view) {
        if (txtLogin.getText().toString().equals("master") && txtSenha.getText().toString().equals("master")){
            startActivity(it);
        }
    }
}
