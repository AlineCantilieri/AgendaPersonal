package br.edu.iff.pooa20162.agendapersonal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.agendapersonal.R;
import br.edu.iff.pooa20162.agendapersonal.model.AgendamentoAula;

/**
 * Created by Adriana on 27/03/2017.
 */
public class AgendamentoAulaAdapter extends ArrayAdapter<AgendamentoAula> {
private final Context context;
private final ArrayList<AgendamentoAula> elementos;

public AgendamentoAulaAdapter(Context context, ArrayList<AgendamentoAula> elementos) {
        super(context, R.layout.linhapadrao, elementos);
        this.context = context;
        this.elementos = elementos;
        }

@Override
public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linhapadrao, parent, false);
        TextView modalidade = (TextView) rowView.findViewById(R.id.textView);
        TextView data = (TextView) rowView.findViewById(R.id.textView2);
        modalidade.setText(elementos.get(position).getModalidade());
        data.setText(elementos.get(position).getData());
        return rowView;
        }
}
