package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    Curso curso = new Curso("ASIR");
    Curso curso2 = new Curso("DAM");

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void TestGetNombre() {
        assertAll(
                ()->assertEquals("ASIR", curso.getNombre()),
                ()->assertEquals("DAM", curso2.getNombre())
        );
    }

    @Test
    void TestAniadirAlumno() {

        Persona alumno =new Persona(12345679,"Kamila",'M',8,03,2005);
        int tamañoInicial = curso.getListaAlumnos().size();
        curso.aniadirAlumno(alumno);
        assertEquals(tamañoInicial + 1, curso.getListaAlumnos().size());

    }
}