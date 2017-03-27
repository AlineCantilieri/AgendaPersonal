package br.edu.iff.pooa20162.agendapersonal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.agendapersonal.R;
import br.edu.iff.pooa20162.agendapersonal.adapter.HorarioAdapter;
import br.edu.iff.pooa20162.agendapersonal.model.Horario;

public class Lista_Horario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__horario);

        Intent intent = getIntent();

        ListView lista = (ListView) findViewById(R.id.ListaHorario);

        final ArrayList<Horario> horarios = (ArrayList) Horario.listAll(Horario.class);

        HorarioAdapter adapter = new HorarioAdapter(this, horarios);
        lista.setAdapter(adapter);

    }
}
