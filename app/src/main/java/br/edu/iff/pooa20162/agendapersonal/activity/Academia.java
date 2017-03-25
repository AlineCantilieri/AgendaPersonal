package br.edu.iff.pooa20162.agendapersonal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.iff.pooa20162.agendapersonal.R;

public class Academia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academia);

        Intent intent = getIntent();

        Button btIncluirHorario = (Button) findViewById(R.id.btIncluirHorario);
        btIncluirHorario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Academia.this, Cadastrar_Horario.class);
                startActivity(intent);
            }
        });

        Button btConsultarHorario = (Button) findViewById(R.id.btConsultarHorario);
        btConsultarHorario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Academia.this, Lista_Horario.class);
                startActivity(intent);
            }
        });

        Button btConsultarProfessor = (Button) findViewById(R.id.btConsultarProfessor);
        btConsultarProfessor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Academia.this, Lista_Professor.class);
                startActivity(intent);
            }
        });

        Button btConsultarAluno = (Button) findViewById(R.id.btConsultarAluno);
        btConsultarAluno.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Academia.this, Lista_Aluno.class);
                startActivity(intent);
            }
        });

    }
}
