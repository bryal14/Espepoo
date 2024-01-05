/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.calculadora_areas;

/**
 *
 * @author Bryan
 */
import java.util.Scanner;

public class Sucursales {

    public static void main(String args[]) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese a que Sucursal desea ingresar");
        System.out.println("Presione (1) para Sucursal \nPresione (2) para Sucursal II\nPresione (3) para Sucursal III");
        int n1, n2;
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Usted Ingreso a la Sucursal 1\n los productos que contiene la sucursal son :");
                System.out.println("Carne de res\n");
                System.out.println("Pollo\n");
                System.out.println("Embutidos (chorizo, salchichón, morcilla)\n");
                System.out.println("Cerdo\n");
                System.out.println("Ternera\n");
                break;
            case 2:
                System.out.println("Usted Ingreso a la Sucursal II\n los productos que contiene la sucursal son :");
                System.out.println("Esparragos\n");
                System.out.println("Lechugas \n");
                System.out.println("Repollo\n");
                System.out.println("Espinacas\n");
                System.out.println("Alphaca\n");
                break;
            case 3:
                System.out.println("Usted Ingreso a la Sucursal III\n los productos que contiene la sucursal son :");
                System.out.println("Pan enrrollado\n");
                System.out.println("Pan de almidón\n");
                System.out.println("Pan con dulce de piña\n");
                System.out.println("Pasteles personalizados\n");
                System.out.println("Donas de chocolate\n");
                break;
        }

        // Cerrar el objeto Scanner después de usarlo para evitar posibles fugas de recursos
        scanner.close();
    }
}

