/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Bryan
 */
public class Motos extends vehiculos {

    int cilindraje;

    public Motos(int cilindraje, String motor, String conductor) {
        super(motor, conductor);
        this.cilindraje = cilindraje;
    }

    public void Whilie() {
        System.out.println("Se ha realizado un wilie....");
    }

}
