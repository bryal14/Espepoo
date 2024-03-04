/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Bryan
 */
public abstract class vehiculos {

    String motor;

    String conductor;

    public vehiculos(String motor, String conductor) {
        this.motor = motor;

        this.conductor = conductor;
    }

    public void manejar() {
        System.out.println("Manejando....");
    }

    public void IngresarVehiculo() {
        System.out.println("");
    }
}
