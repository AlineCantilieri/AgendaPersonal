package br.edu.iff.pooa20162.agendapersonal.activity;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.edu.iff.pooa20162.agendapersonal.R;

public class Cadastrar_Aluno extends AppCompatActivity {
    EditText etnome, etendereco, etcpf, ettelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar__aluno);

        Intent intent = getIntent();

        etnome = (EditText) findViewById(R.id.etx_nome);
        etendereco = (EditText) findViewById(R.id.et_endereco);
        etcpf = (EditText) findViewById(R.id.et_cpf);
        ettelefone = (EditText) findViewById(R.id.et_telefone);


        Button btCadastrar = (Button) findViewById(R.id.btCadastrar);
        btCadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Aluno.this, ActvityAluno.class);
                startActivity(intent);

                br.edu.iff.pooa20162.agendapersonal.model.Aluno al = new br.edu.iff.pooa20162.agendapersonal.model.Aluno(etnome.getText().toString(), ettelefone.getText().toString(), etcpf.getText().toString(), etendereco.getText().toString());
                al.save();
            }
        });

        Button btCancelar = (Button) findViewById(R.id.btCancelar);
        btCancelar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Aluno.this, Login.class);
                startActivity(intent);
            }
        });

        Button btvoltar = (Button) findViewById(R.id.btvoltar);
        btvoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Aluno.this, Cadastrar_Usuario.class);
                startActivity(intent);
            }
        });


    }
}
