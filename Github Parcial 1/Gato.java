/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leccion;

/**
 *
 * @author Bryan
 */
public class Gato extends Animales {
    String color_pelo;

    public Gato(String color_pelo, String nombre) {
        super(nombre);
        this.color_pelo = color_pelo;
    }
    public void trepar_arbol(){
        System.out.println( " trepando arbol....");
    }
    public void cazar_raton (){
        System.out.println( " cazando raton...");
    }
}
