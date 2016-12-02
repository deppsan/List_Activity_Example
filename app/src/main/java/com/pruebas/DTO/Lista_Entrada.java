package com.pruebas.DTO;

/**
 * Created by ricar on 02/12/2016.
 */

public class Lista_Entrada {
    private int idImage;
    private String textoEncima;
    private String textoDebajo;

    public Lista_Entrada(int idImage, String textoEncima, String textoDebajo) {
        this.idImage = idImage;
        this.textoEncima = textoEncima;
        this.textoDebajo = textoDebajo;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getTextoEncima() {
        return textoEncima;
    }

    public void setTextoEncima(String textoEncima) {
        this.textoEncima = textoEncima;
    }

    public String getTextoDebajo() {
        return textoDebajo;
    }

    public void setTextoDebajo(String textoDebajo) {
        this.textoDebajo = textoDebajo;
    }
}
