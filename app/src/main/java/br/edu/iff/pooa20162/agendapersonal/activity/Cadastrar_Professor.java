package br.edu.iff.pooa20162.agendapersonal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.edu.iff.pooa20162.agendapersonal.R;
import br.edu.iff.pooa20162.agendapersonal.model.Professor;

public class Cadastrar_Professor extends AppCompatActivity {

    EditText etnome, etendereco, etcpf, ettelefone, etcref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar__professor);

        Intent intent = getIntent();

        etnome = (EditText) findViewById(R.id.etx_nome);
        etendereco = (EditText) findViewById(R.id.et_endereco);
        etcpf = (EditText) findViewById(R.id.et_cpf);
        ettelefone = (EditText) findViewById(R.id.et_telefone);
        etcref = (EditText) findViewById(R.id.et_cref);


        Button btCadastrar = (Button) findViewById(R.id.btCadastrar);
        btCadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Professor prof = new Professor(etnome.getText().toString(), ettelefone.getText().toString(), etcpf.getText().toString(), etendereco.getText().toString(), etcref.getText().toString());
                prof.save();

                Intent intent = new Intent(Cadastrar_Professor.this, Professor.class);
                startActivity(intent);
            }
        });

        Button btCancelar = (Button) findViewById(R.id.btCancelar);
        btCancelar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Professor.this, Login.class);
                startActivity(intent);
            }
        });

        Button btvoltar = (Button) findViewById(R.id.btvoltar);
        btvoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Professor.this, Cadastrar_Usuario.class);
                startActivity(intent);
            }
        });

    }
}
