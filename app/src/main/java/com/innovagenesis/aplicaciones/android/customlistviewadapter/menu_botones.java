package com.innovagenesis.aplicaciones.android.customlistviewadapter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Administra Botones del menu
 */
public class menu_botones extends Fragment implements View.OnClickListener {

    View view;

    public menu_botones() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_menu_botones, container, false);

        Button btn1 = (Button) view.findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        /** Cada boton administra los layout **/

        int identificadorBtn = v.getId();

        switch (identificadorBtn) {

            case R.id.btn1: {

                break;
            }
        }

    }
}
