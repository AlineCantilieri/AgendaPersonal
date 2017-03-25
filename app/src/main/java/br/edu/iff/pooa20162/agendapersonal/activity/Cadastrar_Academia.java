package br.edu.iff.pooa20162.agendapersonal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.edu.iff.pooa20162.agendapersonal.R;

public class Cadastrar_Academia extends AppCompatActivity {

    EditText etnome, etendereco, ettelefone, etcnpj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar__academia);

        Intent intent = getIntent();

        etnome = (EditText) findViewById(R.id.etx_nome);
        etendereco = (EditText) findViewById(R.id.et_endereco);
        etcnpj = (EditText) findViewById(R.id.et_cnpj);
        ettelefone = (EditText) findViewById(R.id.et_telefone);


        Button btCadastrar = (Button) findViewById(R.id.btCadastrar);
        btCadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Academia.this, Academia.class);
                startActivity(intent);

                br.edu.iff.pooa20162.agendapersonal.model.Academia acad = new br.edu.iff.pooa20162.agendapersonal.model.Academia(etnome.getText().toString(), etendereco.getText().toString(), ettelefone.getText().toString(), etcnpj.getText().toString());
                acad.save();
            }
        });

        Button btCancelar = (Button) findViewById(R.id.btCancelar);
        btCancelar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Academia.this, Login.class);
                startActivity(intent);
            }
        });

        Button btvoltar = (Button) findViewById(R.id.btvoltar);
        btvoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Academia.this, Cadastrar_Usuario.class);
                startActivity(intent);
            }
        });

    }
}
