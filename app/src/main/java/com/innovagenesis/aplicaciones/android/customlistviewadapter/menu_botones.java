package com.innovagenesis.aplicaciones.android.customlistviewadapter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class menu_botones extends Fragment implements View.OnClickListener {

    View view;

    public menu_botones() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /** Cuando se esta en un fragment se debe crear un objeto de tipo view **
         ** para que los elementos tengan el contexto coreecto                 **/

        view = inflater.inflate(R.layout.fragment_menu_botones, container, false);

        Button btn1 = (Button) view.findViewById(R.id.btn1);
        Button btn2 = (Button) view.findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        /** Cada boton administra los layout **/

        int identificadorBtn = v.getId();
        Fragment fragment;

        switch (identificadorBtn) {

            case R.id.btn1: {
                /**                          IMPORTANTE                                          **
                /** Si usas un Toast en una actividad se usa this, pero si estas en un fragment  **
                 ** se usa getContext                                                            **/

                fragment = new ClaseListView();
                remplazarFragment(fragment).commit();
                Toast.makeText(getContext(), "Boton numero 1", Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.btn2: {
                fragment = new ClaseSpinner();
                remplazarFragment(fragment).commit();
                Toast.makeText(getContext(), "Boton numero 2", Toast.LENGTH_SHORT).show();
                break;
            }
        }

    }

    private FragmentTransaction remplazarFragment(Fragment fragment) {

        /** Cambia los fragments **/

        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.contenedor_fragments,fragment);
        return  ft;
    }


}
