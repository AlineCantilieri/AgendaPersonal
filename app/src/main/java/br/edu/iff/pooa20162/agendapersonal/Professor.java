package br.edu.iff.pooa20162.agendapersonal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Professor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);

        Intent intent = getIntent();

        Button btIncluirHorario = (Button) findViewById(R.id.btIncluirHorario);
        btIncluirHorario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Professor.this, Cadastrar_Horario.class);
                startActivity(intent);
            }
        });

        Button btConsultarHorario = (Button) findViewById(R.id.btConsultarHorario);
        btConsultarHorario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Professor.this, Lista_Horario.class);
                startActivity(intent);
            }
        });

        Button btConsultarAluno = (Button) findViewById(R.id.btConsultarAluno);
        btConsultarAluno.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Professor.this, Lista_Aluno.class);
                startActivity(intent);
            }
        });
        Button btConsultarAcademia = (Button) findViewById(R.id.btConsultarAcademia);
        btConsultarAcademia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Professor.this, Lista_Academia.class);
                startActivity(intent);
            }
        });
    }


}
