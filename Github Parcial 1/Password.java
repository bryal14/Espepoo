/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_recuperacion;

/**
 *
 * @author Bryan
 */
public class Password {
    String Usuario;
    int contraseña;

    public Password(String Usuario, int contraseña) {
        this.Usuario = Usuario;
        this.contraseña = contraseña;
    }
    
    public void aceptado(){
        System.out.println("Contraseña segura");
    }
    public void noaceptado(){
        System.out.println("Contraseña no segura");
    }
}
