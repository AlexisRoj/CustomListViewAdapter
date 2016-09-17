package com.innovagenesis.aplicaciones.android.customlistviewadapter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.innovagenesis.aplicaciones.android.customlistviewadapter.adapter.DiaHoraioAdapter;
import com.innovagenesis.aplicaciones.android.customlistviewadapter.modelo.DiaHorario;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListView extends Fragment {


    public ListView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        String[] titulos = getActivity().getResources().getStringArray(R.array.horario_de_clases); //Realiza la captura de los titulos

        String[] subtitulos = getActivity().getResources().getStringArray(R.array.dias_semana); //Realiza la captura de los subtitulos

        /** Se crea la lista que va a contener los datos **/
        ArrayList<DiaHorario> lista = new ArrayList<>();

        /** Se recorre con el largo de cualquiera de los dos Array **/

        for (int i = 0; i < titulos.length; i++) {

            /** Se llena usando la Clase de Captura**/
            lista.add(new DiaHorario(titulos[i], subtitulos[i]));
        }

        DiaHoraioAdapter adapter = new DiaHoraioAdapter(getActivity(), lista);

        /** Se enlaza el listView y se crea el adapter*/


        ListView horario = (ListView) findViewById(R.id.listView);
        horario.setAdapter(adapter);

        horario.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView opcion = (TextView) findViewById(R.id.opcion);
                opcion.setText("Opcion" + titulos[i]); // Se le pasa el nombre que queramos

            }
        });

        return inflater.inflate(R.layout.fragment_list_view, container, false);
    }

}
