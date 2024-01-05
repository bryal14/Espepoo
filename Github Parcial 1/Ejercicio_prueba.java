/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio_persistencia;

/**
 *
 * @author Bryan
 */
import java.util.Scanner;

public class Ejercicio_prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = new Empleado ("Bryan","Almeida",30);
        Desarrollador desarrolador = new Desarrollador("Python", "Bryan", "Alm", 50);
        Gerente gerente = new Gerente ("finanzas", "Bryan", "Huerta",35);
   
        System.out.println("1 para Empleado");
        System.out.println("2 para Desarrollador");
        System.out.println("3 Gerente ");
        
        switch (scanner.nextInt()){
            case 1 :
                System.out.println(" La informacion del Empleado es: ");
                empleado.mostrar_informacion("empleado comun");
                break;
            case 2 :
                System.out.println(" La informacion del Desarrollador es :");
                desarrolador.mostrar_informacion("empleado especifico");
                break;
            case 3 :
                System.out.println(" La informacion del De es :");
                desarrolador.mostrar_informacion("Aspirante a jefe");
                break;
        }
                
    }
}
