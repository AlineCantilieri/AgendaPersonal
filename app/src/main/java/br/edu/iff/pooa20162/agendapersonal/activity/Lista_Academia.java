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
import br.edu.iff.pooa20162.agendapersonal.adapter.AcademiaAdapter;
import br.edu.iff.pooa20162.agendapersonal.model.*;
import br.edu.iff.pooa20162.agendapersonal.model.Academia;

public class Lista_Academia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__academia);

        Intent intent = getIntent();

    }

    protected void onResume() {
        super.onResume();
        ListView lista = (ListView) findViewById(R.id.lvAcademia);

        final ArrayList<Academia> acad = (ArrayList<Academia>)
                Academia.listAll(Academia.class);

        ArrayAdapter adapter = new AcademiaAdapter(this, acad);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Lista_Academia.this, Cadastrar_Academia.class);
                intent.putExtra("id", acad.get(i).getId().intValue());
                intent.putExtra("nome", acad.get(i).getNome());
                intent.putExtra("endereco", acad.get(i).getEndereco());
                intent.putExtra("telefone", acad.get(i).getTelefone());
                intent.putExtra("cnpj", acad.get(i).getCnpj());

                startActivity(intent);

            }
        });

    }
}