/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_ejer;

/**
 *
 * @author Bryan
 */
public class Cuidador extends Persona {
    int Nid;

    public Cuidador(int Nid, String nombre, int edad) {
        super(nombre, edad);
        this.Nid = Nid;
    }
    public void alimentar (){
        System.out.println(this.nombre + " Alimentando animales....");
    }
    
}
    

