package br.edu.iff.pooa20162.agendapersonal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.agendapersonal.R;
import br.edu.iff.pooa20162.agendapersonal.adapter.AlunoAdapter;
import br.edu.iff.pooa20162.agendapersonal.model.Aluno;

public class Lista_Aluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__aluno);

        Intent intent = getIntent();

        ListView lista = (ListView) findViewById(R.id.listaAluno);

        final ArrayList<Aluno> alunos = (ArrayList) Aluno.listAll(Aluno.class);

        AlunoAdapter adapter = new AlunoAdapter(this, alunos);
        lista.setAdapter(adapter);

    }
}
