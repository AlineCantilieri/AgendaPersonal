package br.edu.iff.pooa20162.agendapersonal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.agendapersonal.R;
import br.edu.iff.pooa20162.agendapersonal.model.Professor;

/**
 * Created by Adriana on 24/03/2017.
 */
public class ProfessorAdapter extends ArrayAdapter<Professor> {
    private final Context context;
    private final ArrayList<Professor> elementos;

    public ProfessorAdapter(Context context, ArrayList<Professor> elementos) {
        super(context, R.layout.linhapadrao, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linhapadrao, parent, false);
        TextView nome = (TextView) rowView.findViewById(R.id.textView);
        TextView endereco = (TextView) rowView.findViewById(R.id.textView2);
        TextView telefone = (TextView) rowView.findViewById(R.id.textView3);
        TextView cref = (TextView) rowView.findViewById(R.id.textView4);
        TextView cpf = (TextView) rowView.findViewById(R.id.textView4);
        nome.setText(elementos.get(position).getNome());
        endereco.setText(elementos.get(position).getEndereco());
        telefone.setText(elementos.get(position).getTelefone());
        cref.setText(elementos.get(position).getCref());
        cpf.setText(elementos.get(position).getCpf());
        return rowView;
    }
}
