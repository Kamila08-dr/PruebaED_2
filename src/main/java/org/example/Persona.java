/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * @author Kamila Dorregaray
 */

public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor por defecto que inicializa los valores
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor que recibe como parametro un Nif para crear persona con ese dato
     * @param nif Número Nif de la Persona
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor que crea una persona con todos los datos(atributos) proporcionado
     * @param nif Número Nif de la Persona
     * @param nombre Nombre de la Persona
     * @param genero Generos de la Persona
     * @param dia Dia de nacimiento de la persona
     * @param mes Mes de nacimiento de la persona
     * @param ano Año de nacimiento de la persona
     */
    public Persona(int nif, String nombre, char genero,
                   int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    /**
     * Devuelve el Nif de la Persona
     * @return Nif de la Persona
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Establece el Nif de la persona
     * @param nif nuevo Nif de la Persona
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Devuelve el Nombre de la Persona
     * @return Nombre de la Persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el Nombre de la persona
     * @param nombre nuevo Nombre de la Persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el Genero de la Persona
     * @return Genero de la Persona
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Establece el Genero de la persona
     * @param genero nuevo Genero de la Persona
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Devuelve el la fecha de Nacimiento de la Persona
     * @return fecha de Nacimiento de la Persona
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Establece la fecha de Nacimiento de la persona
     * @param nacimiento nueva decha de Nacimiento de la Persona
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Devuelve la edad de la Persona calculando con la fecha actual y la fecha de nacimiento
     * @return edad actual de la Persona
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Devuelve una string encadenada de la información recogida de la persona
     * @return Cadena con la informacion de la Persona
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Este metodo compara si dos Objetos personas son iguales
     * Se consideran igual se tienen el mismo Nif)
     * @param a Objeto de persona a comparar
     * @return Puede devolver false si no son iguales o true si lo son
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Sobreescribe el metodo equals para comparar si dos objetos Persona son iguales
     * @param obj Objeto de persona a comparar
     * @return Puede devolver false en caso de ser diferentes o nulos, o true si lo son
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Metodo de comparación para ordenar los objetos Persona según su Nif
     * @param o the object to be compared. La persona con la que se compara
     * @return -1 si esta persona es mayor que la otra
     * @return 0 si son iguales
     * @return 1 si esta persona es mayor
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}