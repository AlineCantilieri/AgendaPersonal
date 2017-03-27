package br.edu.iff.pooa20162.agendapersonal.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.orm.SugarRecord;

/**
 * Created by Adriana on 24/03/2017.
 */

public class Academia extends SugarRecord implements Parcelable {

    String nome, endereco, telefone, cnpj;

    public Academia(String nome, String endereco, String telefone, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }
    public Academia(){}

    protected Academia(Parcel in) {
        nome = in.readString();
        endereco = in.readString();
        telefone = in.readString();
        cnpj = in.readString();
    }

    public static final Creator<Academia> CREATOR = new Creator<Academia>() {
        @Override
        public Academia createFromParcel(Parcel in) {
            return new Academia(in);
        }

        @Override
        public Academia[] newArray(int size) {
            return new Academia[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(endereco);
        dest.writeString(telefone);
        dest.writeString(cnpj);
    }
    public String toString()
    {
        return this.nome;
    }
}

