/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leccion;

/**
 *
 * @author Bryan
 */
public abstract class Animales {
    String nombre;
    private int edad;

    public Animales(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void hacer_ruido (String ruido){
        System.out.println(" el animal hace ruido....");
    }
}
