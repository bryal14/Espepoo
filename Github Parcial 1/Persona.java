/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_ejer;

/**
 *
 * @author Bryan
 */
public class Persona {
    String nombre;
    int edad;
    private String cedula;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void comer (){
        System.out.println(this.nombre + "Esta comiendo....");
    }
    public void dormir(){
        System.out.println(this.nombre + "Esta durmiendo...");
    }
}
    
    

