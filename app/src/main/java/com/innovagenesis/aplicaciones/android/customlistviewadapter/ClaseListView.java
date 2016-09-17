package com.innovagenesis.aplicaciones.android.customlistviewadapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.innovagenesis.aplicaciones.android.customlistviewadapter.adapter.DiaHoraioAdapter;
import com.innovagenesis.aplicaciones.android.customlistviewadapter.modelo.DiaHorario;

import java.util.ArrayList;
public class ClaseListView extends Fragment {

    public ClaseListView() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_list_view, container, false);

        /** hay que tener en cuenta que un fragmento representa pues como su nombre lo dice
         * y valga la redundancia un fragmento de la pantalla pero la activity sigue siendo
         * la que rige el control de esa pantalla */


        final String[] titulos = getActivity().getResources().getStringArray(R.array.horario_de_clases); //Realiza la captura de los titulos
        String[] subtitulos = getActivity().getResources().getStringArray(R.array.dias_semana); //Realiza la captura de los subtitulos

        ArrayList<DiaHorario> lista = new ArrayList<>(); /* Se crea la lista que va a contener los datos */

        /** Se recorre con el largo de cualquiera de los dos Array **/
        for (int i = 0; i < titulos.length; i++) {
            /** Se llena usando la Clase de Captura**/
            lista.add(new DiaHorario(titulos[i], subtitulos[i]));
        }
        DiaHoraioAdapter adapter = new DiaHoraioAdapter(getActivity(), lista);
        /** Se enlaza el listView y se crea el adapter*/


        ListView horario = (ListView) view.findViewById(R.id.listView);
        horario.setAdapter(adapter);

        horario.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView opcion = (TextView) view.findViewById(R.id.opcion);
                opcion.setText("Opcion" + titulos[i]); // Se le pasa el nombre que queramos

            }
        });


        return view;
    }

}