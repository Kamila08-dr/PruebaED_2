/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author Kamila Dorregaray
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    public TreeSet<Persona> getListaAlumnos() {
        return listaAlumnos;
    }

    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor que recibe el Nombre del Curso y inicializa el
     * TreeSet en donde se guardara la lista de Alumnos
     * @param nombre nombre del curso
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Devuele una cadena donde se muestran los Alumno de la asignatura
     * @return cadena con informacion de los Alumnos de la Asignatura
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Agrega un objeto de persona a listaAlumnos
     * @param p Objeto Persona que queremos agregar
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}