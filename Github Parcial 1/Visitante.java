/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_ejer;

/**
 *
 * @author Bryan
 */
public class Visitante extends Persona {
    int carnet;

    public Visitante(int carnet, String nombre, int edad) {
        super(nombre, edad);
        this.carnet = carnet;
    }
    public void comprar(){
        System.out.println(this.nombre + "Comprando...");
    }
    
}
