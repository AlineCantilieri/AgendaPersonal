package br.edu.iff.pooa20162.agendapersonal.model;

import com.orm.SugarRecord;

/**
 * Created by Adriana on 24/03/2017.
 */


public class AgendamentoAula extends SugarRecord{
    String modalidade, valor, data;
    Horario horario;
    Aluno aluno;

    public AgendamentoAula(String modalidade, String valor, String data,
                           Horario horario, Aluno aluno) {
        this.modalidade = modalidade;
        this.valor = valor;
        this.data = data;
        this.horario = horario;
        this.aluno = aluno;
    }
    public AgendamentoAula(){}
    public String getModalidade() {
        return modalidade;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Horario getHorario() {
        return horario;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}

