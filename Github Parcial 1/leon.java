/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_ejer;

/**
 *
 * @author Bryan
 */
public class leon  extends Zoo {
    String vacuna;

    public leon(String vacuna, String nombre, int edad) {
        super(nombre, edad);
        this.vacuna = vacuna;
    }
    public void rugir(){
        System.out.println(this.nombre + "Rugiendo...");
    }
}
