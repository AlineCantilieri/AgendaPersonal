package br.edu.iff.pooa20162.agendapersonal.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.orm.SugarRecord;

/**
 * Created by Adriana on 24/03/2017.
 */
public class Professor extends SugarRecord implements Parcelable{

    String nome, telefone, cpf, endereco, cref;
    Academia academia;

    public Professor(String nome, String telefone, String cpf, String endereco, String cref) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cref = cref;

    }
    public Professor(){}

    protected Professor(Parcel in) {
        nome = in.readString();
        telefone = in.readString();
        cpf = in.readString();
        endereco = in.readString();
        cref = in.readString();
        academia = in.readParcelable(Academia.class.getClassLoader());
    }

    public static final Creator<Professor> CREATOR = new Creator<Professor>() {
        @Override
        public Professor createFromParcel(Parcel in) {
            return new Professor(in);
        }

        @Override
        public Professor[] newArray(int size) {
            return new Professor[size];
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(telefone);
        dest.writeString(cpf);
        dest.writeString(endereco);
        dest.writeString(cref);
        dest.writeParcelable(academia, flags);
    }
}
