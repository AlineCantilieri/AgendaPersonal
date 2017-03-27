package br.edu.iff.pooa20162.agendapersonal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import br.edu.iff.pooa20162.agendapersonal.R;

public class ActvityAluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);


        Intent intent = getIntent();

        Button btAgendarAula = (Button) findViewById(R.id.btAgendarAula);
        btAgendarAula.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActvityAluno.this, ActivityAgendamento_Aula.class);
                startActivity(intent);
            }
        });

        Button btConsultarProfessor = (Button) findViewById(R.id.btConsultarProfessor);
        btConsultarProfessor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActvityAluno.this, Lista_Professor.class);
                startActivity(intent);
            }
        });

        Button btConsultarAcademia= (Button) findViewById(R.id.btConsultarAcademia);
        btConsultarAcademia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActvityAluno.this, Lista_Academia.class);
                startActivity(intent);
            }
        });


        Button btConsultarHorario= (Button) findViewById(R.id.btConsultarHorario);
        btConsultarHorario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActvityAluno.this, Lista_Horario.class);
                startActivity(intent);
            }
        });
    }
}
