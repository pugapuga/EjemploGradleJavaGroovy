package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiClaseTest {

    @Test
    void getNombre() {
        MiClase miClase = new MiClase("Pepe");
        assertEquals("Pepe", miClase.getNombre());
    }

    @Test
    void setNombre() {
        MiClase miClase = new MiClase("Pepe");
        miClase.setNombre("Juan");
        assertEquals("Juan", miClase.getNombre());
    }
}