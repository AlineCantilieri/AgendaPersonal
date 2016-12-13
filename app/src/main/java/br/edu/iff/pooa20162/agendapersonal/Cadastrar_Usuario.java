package br.edu.iff.pooa20162.agendapersonal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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


        Button btCadastraraAluno = (Button) findViewById(R.id.btCadastrarAluno);
        btCadastraraAluno.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Usuario.this, Cadastrar_Aluno.class);
                startActivity(intent);
            }

        });


    }
}