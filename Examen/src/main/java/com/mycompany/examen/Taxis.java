/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Bryan
 */
public class Taxis extends vehiculos {

    String psajeros;

    public Taxis(String psajeros, String motor, String conductor) {
        super(motor, conductor);
        this.psajeros = psajeros;
    }

    public void recogerPasajeros() {
        System.out.println("Se han recogido a los pasajeros....");
    }
}
