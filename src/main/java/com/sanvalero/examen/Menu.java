package com.sanvalero.examen;

public class Menu {
    private String nombreMenu;
    private String descripcionMenu;
    private double precio;
    private long foto;

    public Menu() {
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public String getDescripcionMenu() {
        return descripcionMenu;
    }

    public void setDescripcionMenu(String descripcionMenu) {
        this.descripcionMenu = descripcionMenu;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getFoto() {
        return foto;
    }

    public void setFoto(long foto) {
        this.foto = foto;
    }
}
