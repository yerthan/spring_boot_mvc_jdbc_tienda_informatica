package org.iesvegademijas.tienda_informatica.modelo;

public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private int id_fabricanete;


    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, int id_fabricanete) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.id_fabricanete = id_fabricanete;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_fabricanete() {
        return id_fabricanete;
    }

    public void setId_fabricanete(int id_fabricanete) {
        this.id_fabricanete = id_fabricanete;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", id_fabricanete=" + id_fabricanete +
                '}';
    }
}
