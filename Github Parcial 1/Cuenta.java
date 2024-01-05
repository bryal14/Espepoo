/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_recuperacion;

/**
 *
 * @author Bryan
 */

public class Cuenta {
    String titular;
    int cantidad;

    public Cuenta(String titular, int cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public void ingresando(){
        System.out.println("Ingresando....");
    }
    public void retirando(){
        System.out.println("Retirando...");
    }
}
