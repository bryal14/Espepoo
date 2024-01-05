/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_recuperacion;

/**
 *
 * @author Bryan
 */
import java.util.Scanner;

public class Suma {
    Scanner scanner = new Scanner(System.in);
    int numero1 ;
    int numero2;

    public Suma(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public void suma(){
        System.out.println("Ingrese el numero 1: ");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el numero 2: ");
        numero2 = scanner.nextInt();
        System.out.println("El resultado de la suma es:");
        System.out.println(numero1 + numero2);
    }
}
