package com.estebanles.infoturista40.model;

public class itemList {
    private String titulo;
    private String descripcion;
    private int imgResourse;

    public itemList(String titulo, String descripcion, int imgResourse) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imgResourse = imgResourse;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImgResourse() {
        return imgResourse;
    }

}
