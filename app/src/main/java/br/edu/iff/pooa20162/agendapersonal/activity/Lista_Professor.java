package br.edu.iff.pooa20162.agendapersonal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.agendapersonal.R;
import br.edu.iff.pooa20162.agendapersonal.adapter.ProfessorAdapter;
import br.edu.iff.pooa20162.agendapersonal.model.Professor;

public class Lista_Professor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__professor);

        Intent intent = getIntent();

    }
    protected void onResume() {
        super.onResume();
        ListView lista = (ListView) findViewById(R.id.lvProfessor);

        final ArrayList<Professor> prof = (ArrayList<Professor>) Professor.listAll(Professor.class);

        ArrayAdapter adapter = new ProfessorAdapter(this, prof);
        lista.setAdapter(adapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Lista_Professor.this, Cadastrar_Academia.class);
                intent.putExtra("id", prof.get(i).getId().intValue());
                intent.putExtra("nome", prof.get(i).getNome());
                intent.putExtra("endereco", prof.get(i).getEndereco());
                intent.putExtra("telefone", prof.get(i).getTelefone());
                intent.putExtra("cpf", prof.get(i).getCpf());

                startActivity(intent);

            }
        });

    }
}
