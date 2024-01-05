/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_persistencia;

/**
 *
 * @author Bryan
 */
public class Gerente extends Empleado {

    String departamentto;

    public Gerente(String departamentto, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.departamentto = departamentto;
    }

}
