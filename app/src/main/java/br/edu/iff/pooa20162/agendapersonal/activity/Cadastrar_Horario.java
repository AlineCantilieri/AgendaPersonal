package br.edu.iff.pooa20162.agendapersonal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

import br.edu.iff.pooa20162.agendapersonal.R;
import br.edu.iff.pooa20162.agendapersonal.model.Academia;
import br.edu.iff.pooa20162.agendapersonal.model.Horario;
import br.edu.iff.pooa20162.agendapersonal.model.Professor;

public class Cadastrar_Horario extends AppCompatActivity {
    Spinner spinnerProf, spinnerAcad;
    EditText ethora, etdata, etmodalidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar__horario);

        final ArrayList<Professor> profs  = (ArrayList) Professor.listAll(Professor.class);

        ArrayAdapter<Professor> adapter1 = new ArrayAdapter<Professor>(this, android.R.layout.simple_spinner_item, profs);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerProf = (Spinner) findViewById(R.id.spinnerProf);
        spinnerProf.setAdapter(adapter1);

        final ArrayList<Academia> acads  = (ArrayList) Academia.listAll(Academia.class);

        ArrayAdapter<Academia> adapter = new ArrayAdapter<Academia>(this, android.R.layout.simple_spinner_item, acads);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerAcad = (Spinner) findViewById(R.id.spinnerAcad);
        spinnerAcad.setAdapter(adapter);

        Button btCadastrar = (Button) findViewById(R.id.btCadastrar);
        btCadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Horario.this, ActivityProfessor.class);
                startActivity(intent);

                etdata = (EditText) findViewById(R.id.etx_data);
                ethora = (EditText) findViewById(R.id.etx_hora);
                etmodalidade = (EditText) findViewById(R.id.etx_modalidade);

                Professor prof = ((Professor)spinnerProf.getSelectedItem());
                Academia acad = ((Academia)spinnerAcad.getSelectedItem());

                Horario hor = new Horario(new Integer(ethora.getText().toString()), new Integer(etdata.getText().toString()), etmodalidade.getText().toString(), prof, acad);
                hor.save();
            }
        });

        Button btCancelar = (Button) findViewById(R.id.btCancelar);
        btCancelar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Horario.this, Login.class);
                startActivity(intent);
            }
        });

        Button btvoltar = (Button) findViewById(R.id.btvoltar);
        btvoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastrar_Horario.this, ActivityProfessor.class);
                startActivity(intent);
            }
        });
    }
}
