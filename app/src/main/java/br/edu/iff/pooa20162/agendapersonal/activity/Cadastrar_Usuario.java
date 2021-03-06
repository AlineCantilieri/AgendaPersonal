package br.edu.iff.pooa20162.agendapersonal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.iff.pooa20162.agendapersonal.R;

public class Cadastrar_Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar__usuario);

        Intent intent = getIntent();

        Button btCadastrarProfessor = (Button) findViewById(R.id.btCadastrarProfessor);
        btCadastrarProfessor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Usuario.this, Cadastrar_Professor.class);
                startActivity(intent);
            }

        });


        Button btCadastraraAcademia = (Button) findViewById(R.id.btCadastrarAcademia);
        btCadastraraAcademia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Usuario.this, Cadastrar_Academia.class);
                startActivity(intent);
            }

        });


        Button btCadastrarAluno = (Button) findViewById(R.id.btCadastrarAluno);
        btCadastrarAluno.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Usuario.this, Cadastrar_Aluno.class);
                startActivity(intent);
            }

        });

        Button btvoltar = (Button) findViewById(R.id.btvoltar);
        btvoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Usuario.this, Login.class);
                startActivity(intent);
            }

        });

    }
}