package com.sanvalero.examen;

public class Restaurante {
    private String nombreRestaurante;
    private String descripcion;
    private String tipoRestaurante;
    private String direccionRestaurante;
    private String horario;

    public Restaurante() {
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoRestaurante() {
        return tipoRestaurante;
    }

    public void setTipoRestaurante(String tipoRestaurante) {
        this.tipoRestaurante = tipoRestaurante;
    }

    public String getDireccionRestaurante() {
        return direccionRestaurante;
    }

    public void setDireccionRestaurante(String direccionRestaurante) {
        this.direccionRestaurante = direccionRestaurante;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
