package com.innovagenesis.aplicaciones.android.customlistviewadapter.modelo;


public class DiaHorario {

    /** Clase encargada de realizar la captura de datos con la que se
     * llena el ArrayList*/

    private String asignatura;
    private String dia;

    public DiaHorario(String asignatura, String dia) {
        this.asignatura = asignatura;
        this.dia = dia;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}