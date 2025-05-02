package com.example.gaiacaporal;

public class ProductoModel {

    private String nombre;
    private String descripcion;
    private double precio;
    private String imagen;

    public ProductoModel(String nombre, String descripcion, double precio, String imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
    }
}
