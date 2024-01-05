/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_ejer;

/**
 *
 * @author Bryan
 */
public class Zoo {
    
    String nombre;
    int edad;
    private int Nregistro;

    public Zoo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getNregistro() {
        return Nregistro;
    }

    public void setNregistro(int Nregistro) {
        this.Nregistro = Nregistro;
    }
    
    public void comer(){
        System.out.println(this.nombre + "Esta comiendo...");
    }
    
    public void dormir(){
        System.out.println(this.nombre + "Esta durmiendo...");
    }
}
