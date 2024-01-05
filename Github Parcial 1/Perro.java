/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leccion;

/**
 *
 * @author Bryan
 */
public class Perro extends Animales {
    String raza;

    public Perro(String raza, String nombre) {
        super(nombre);
        this.raza = raza;
    }
    public void correr(){
        System.out.println( " corriendo....");
    }
    public void jugar (){
        System.out.println( " jugando...");
    }
}
