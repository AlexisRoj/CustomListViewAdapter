package com.innovagenesis.aplicaciones.android.customlistviewadapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClaseSpinner extends Fragment {

    public ClaseSpinner() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /** Spinner Simple cuando un arrayAdapter se llama desde el main se usa this,
         * pero si se llama desde un fragment se usa el getActivity**/

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (getActivity(), R.array.horario_de_clases, android.R.layout.simple_spinner_item);

        return inflater.inflate(R.layout.fragment_spinner, container, false);
    }

}
