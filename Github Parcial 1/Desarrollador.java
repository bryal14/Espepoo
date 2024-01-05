/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_persistencia;

/**
 *
 * @author Bryan
 */
public class Desarrollador extends Empleado {

    String lenguaje_programacion;

    public Desarrollador(String lenguaje_programacion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.lenguaje_programacion = lenguaje_programacion;
    }

}
