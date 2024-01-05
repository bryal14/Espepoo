/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exepciones;

/**
 *
 * @author Bryan
 */
import java.util.Scanner; 

public class Muestra_error {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        int n1,n2;
        System.out.println("Bienvenido al programa de divisiones");
        System.out.println("Ingrese un numero");
        n1 = sc.nextInt();
        System.out.println("Ingrese un segundo numero");
        n2 = sc.nextInt();
        
        if (n2 == 0){
            throw new ArithmeticException("Hey, recuerda que no es posible dividir para 0");
        }
        else {
            System.out.println("El resultado es: " + n1/n2);
        }
    }     
}
