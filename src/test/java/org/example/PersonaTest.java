package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    Persona p1 =new Persona(12345679,"Kamila",'M',8,03,2005);;
    Persona p2 =new Persona(16161616,"Karina",'M',15,04,1976);
    Persona p3 =new Persona(18478839);
    Nif n,d=new Nif(12345679);;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void TestGetNif() {
        assertEquals(n=new Nif(12345679), p1.getNif());
    }

    @Test
    void TestSetNif() {
        assertEquals(n=new Nif(18478839), p3.getNif());
    }

    @Test
    void TestGetNombre() {
        assertAll("Get Nombre",
                ()->assertEquals("Kamila", p1.getNombre()),
                ()->assertEquals("Karina", p2.getNombre()));
    }

    @Test
    void TestSetNombre() {
        p1.setNombre("Kami");
        p3.setNombre("Kari");
        assertAll("Set Nombre",
                ()->assertEquals("Kami", p1.getNombre()),
                ()->assertEquals("Kari", p3.getNombre()));
    }

    @Test
    void TestGetGenero() {
        assertAll("Genero",
                ()->assertEquals('M', p1.getGenero()),
                ()->assertEquals('M', p2.getGenero()));
    }

    @Test
    void TestSetGenero() {
        p3.setGenero('H');
        assertEquals('H', p3.getGenero());
    }

    @Test
    void TestGetNacimiento() {
        assertEquals(LocalDate.of(1976,04,15), p2.getNacimiento());
    }

    @Test
    void TestSetNacimiento() {
        p3.setNacimiento(LocalDate.of(1999,06,18));
        assertEquals(LocalDate.of(1999,06,18), p3.getNacimiento());
    }

    @Test
    void TestGetEdad() {
        assertAll("Edad",
                ()->assertEquals(20, p1.getEdad()),
                ()->assertEquals(48, p2.getEdad())
        );

    }

    @Test
    void testToString() {
        assertAll("To String",
                ()->assertEquals("12345679-S\tKamila\t\t\t20", p1.toString()),
                ()->assertEquals("16161616-E\tKarina\t\t\t48", p2.toString()));
    }

    @Test
    void testEquals() {
        assertAll("Equals",
                () -> assertEquals(false, p1.equals(p2)),
                () -> assertEquals(true, d.equals(p1.getNif())));
    }

    @Test
    void compareTo() {
        assertAll("compareTo",
                ()-> assertEquals(-4, p1.compareTo(p2)),
                ()->assertEquals(-6, p1.compareTo(p3)));
    }


}