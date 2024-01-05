/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_ejer;

/**
 *
 * @author Bryan
 */
public class pinguino extends Zoo {

    public pinguino(String nombre, int edad) {
        super(nombre, edad);
    }
    public void nadar(){
        System.out.println(this.nombre + "Nadando");   
    }
    public void pescar (){
        System.out.println(this.nombre + "Pescando");
    }
}
