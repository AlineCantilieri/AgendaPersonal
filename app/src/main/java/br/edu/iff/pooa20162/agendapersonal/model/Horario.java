package br.edu.iff.pooa20162.agendapersonal.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.orm.SugarRecord;

/**
 * Created by Adriana on 24/03/2017.
 */


public class Horario extends SugarRecord implements Parcelable{

    int hora, data;
    String modalidade;
    Professor professor;
    Academia academia;

    public Horario(int hora, int data, String modalidade, Professor professor, Academia academia) {
        super();
        this.hora = hora;
        this.modalidade = modalidade;
        this.data = data;
        this.professor = professor;
        this.academia = academia;
    }

    protected Horario(Parcel in) {
        hora = in.readInt();
        modalidade = in.readString();
        data = in.readInt();
        professor = in.readParcelable(Professor.class.getClassLoader());
        academia = in.readParcelable(Academia.class.getClassLoader());
    }

    public static final Creator<Horario> CREATOR = new Creator<Horario>() {
        @Override
        public Horario createFromParcel(Parcel in) {
            return new Horario(in);
        }

        @Override
        public Horario[] newArray(int size) {
            return new Horario[size];
        }
    };

    public int getHora() {
        return hora;
    }

    public int getData() {
        return data;
    }

    public String getModalidade() {
        return modalidade;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setModalidade(String modalidade) {this.modalidade = modalidade; }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
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
        dest.writeInt(hora);
        dest.writeInt(data);
        dest.writeParcelable(professor, flags);
        dest.writeParcelable(academia, flags);
        dest.writeString (modalidade);
    }
}
