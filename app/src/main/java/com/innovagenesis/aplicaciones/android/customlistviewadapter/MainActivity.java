package com.innovagenesis.aplicaciones.android.customlistviewadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.innovagenesis.aplicaciones.android.customlistviewadapter.adapter.DiaHoraioAdapter;
import com.innovagenesis.aplicaciones.android.customlistviewadapter.modelo.DiaHorario;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] titulos = getResources().getStringArray(R.array.horario_de_clases); //Realiza la captura de los titulos
        String[] subtitulos = getResources().getStringArray(R.array.dias_semana); //Realiza la captura de los subtitulos

        /** Se crea la lista que va a contener los datos **/
        final ArrayList<DiaHorario> lista = new ArrayList<>();

        /** Se recorre con el largo de cualquiera de los dos Array **/

        for (int i = 0; i < titulos.length; i++) {

            /** Se llena usando la Clase de Captura**/
            lista.add(new DiaHorario(titulos[i], subtitulos[i]));
        }

        DiaHoraioAdapter adapter = new DiaHoraioAdapter(this, lista);

        /** Se enlaza el listView y se crea el adapter*/

        final ListView horario = (ListView) findViewById(R.id.listView);
        horario.setAdapter(adapter);

        horario.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView opcion = (TextView)findViewById(R.id.opcion);
                opcion.setText("Opcion" + titulos[i]); // Se le pasa el nombre que queramos

            }
        });

    }
}
