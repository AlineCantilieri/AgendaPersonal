package br.edu.iff.pooa20162.agendapersonal.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.orm.SugarApp;
import com.orm.SugarRecord;

/**
 * Created by Adriana on 24/03/2017.
 */


public class Aluno extends SugarRecord implements Parcelable{

    String nome, telefone, endereco, cpf;

    public Aluno(String nome, String telefone, String cpf, String endereco) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    public Aluno(){}

    protected Aluno(Parcel in) {
        nome = in.readString();
        telefone = in.readString();
        endereco = in.readString();
        cpf = in.readString();
    }

    public static final Creator<Aluno> CREATOR = new Creator<Aluno>() {
        @Override
        public Aluno createFromParcel(Parcel in) {
            return new Aluno(in);
        }

        @Override
        public Aluno[] newArray(int size) {
            return new Aluno[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(telefone);
        dest.writeString(endereco);
        dest.writeString(cpf);
    }
}

