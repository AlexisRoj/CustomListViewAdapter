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



    }
}
