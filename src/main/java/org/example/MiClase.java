package org.example;

public class MiClase {
    private String nombre;

    public MiClase(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "MiClase{" + "nombre=" + nombre + '}';
    }
}
