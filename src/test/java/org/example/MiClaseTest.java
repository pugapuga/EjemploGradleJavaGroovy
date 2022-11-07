package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiClaseTest {

    @Test
    void getNombre() {
        MiClase miClase = new MiClase("Pepe", 20);
        assertEquals("Pepe", miClase.getNombre());
    }

    @Test
    void setNombre() {
        MiClase miClase = new MiClase("Pepe", 20);
        miClase.setNombre("Juan");
        assertEquals("Juan", miClase.getNombre());
    }

    @Test
    void getEdad() {
        MiClase miClase = new MiClase("Pepe", 20);
        assertEquals(20, miClase.getEdad());
    }

    @Test
    void setEdad() {
        MiClase miClase = new MiClase("Pepe", 20);
        miClase.setEdad(30);
        assertEquals(30, miClase.getEdad());
    }
}