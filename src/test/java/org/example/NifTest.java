package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void testToString() {
        assertEquals("12345679-S", n.toString());
    }

    @Test
    void setNif() {
        n.setNif(16161616);
        assertEquals("16161616-E", n.toString());
    }

    @Test
    void testEquals() {
        assertAll("Iguales",
                ()->assertEquals(false, n.equals(n2)),
                ()->assertEquals(true, n.equals(n3)));
    }
    }
}