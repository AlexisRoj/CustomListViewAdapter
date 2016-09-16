package com.innovagenesis.aplicaciones.android.customlistviewadapter.adapter;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.innovagenesis.aplicaciones.android.customlistviewadapter.R;
import com.innovagenesis.aplicaciones.android.customlistviewadapter.modelo.DiaHorario;

import java.util.List;


public class DiaHoraioAdapter extends ArrayAdapter<DiaHorario>{

    public DiaHoraioAdapter(Context context, List<DiaHorario> objects) {
        super(context, R.layout.list_template, objects);
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        /** Instancia el layout y llena el listView*/

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.list_template, null);

        /**Se unsa el templante para cargar el ListAdapter personalizado*/

        TextView titulo = (TextView) item.findViewById(R.id.titulo);
        TextView subtitulo = (TextView) item.findViewById(R.id.subtitulo);

        titulo.setText(getItem(position).getAsignatura());
        subtitulo.setText(getItem(position).getDia());

        return item;
    }
}
