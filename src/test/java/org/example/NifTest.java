package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test de la clase Nif
 */
class NifTest {

    Nif n=new Nif(12345679);
    Nif n2=new Nif(18478564);
    Nif n3=new Nif(12345679);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test para el metodo toString()
     * Verifica que la representación en cadena del Nif es la esperada.
     */
    @Test
    void testToString() {
        assertEquals("12345679-S", n.toString());
    }

    /**
     * Test para el metodo setNif(int)
     * Verifica que el metodo cambia correctamente el valor del Nif
     */
    @Test
    void setNif() {
        n.setNif(16161616);
        assertEquals("16161616-E", n.toString());
    }

    /**
     * Test para el metodo equals(Object)
     * Verifica que dos objetos Nif son iguales o diferentes correctamente.
     */
    @Test
    void testEquals() {
        assertAll("Iguales",
                ()->assertEquals(false, n.equals(n2)),
                ()->assertEquals(true, n.equals(n3)));

    }
}