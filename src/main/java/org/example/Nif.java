/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author Kamila Dorregaray
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    /**
     * Caracteres almacenados que contienen letras asociadas
     * a la division del Dni entre 23
     */
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
            'C', 'K', 'E'};

    /**
     * Metodo principal para calcular la letra del DNI a partir
     * de los numeros por los que esta compuesto
     * @param numero Dni de la parsona a calcular
     * @return letra del DNI calculada
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Constructor por defecto que no recibe nada e inicializa los parametros
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor no recibe por parametro el número de DNI e inicializa el constructor
     * @param numero DNI de la Persona a crear
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Devuelve la representacion del DNI, en número y letra
     * @return cadena que contiene el DNI completo
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    /**
     * Establece el numero de DNI y automaticamente la letra correspondiente
     * @param numero numero de nif que se le asignara
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Compara dos objetos NIF para comprobar si son iguales, son
     * iguales si tienen mismo número y letra
     * @param obj Objeto que se va a comparar
     * @return true en caso de que los objetos nif sean iguales
     * @return false en caso de que los objetos nif sean diferentes o nulos
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
