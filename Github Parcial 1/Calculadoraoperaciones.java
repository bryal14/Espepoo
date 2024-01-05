/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_areas;

/**
 *
 * @author Bryan
 */

import java.util.Scanner;

public class Calculadoraoperaciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione (1) para sumar\nPresione (2) para restar\nPresione (3) para multiplicar\nPresione (4) para dividir ");
        System.out.println("Ingrese la operación que desea realizar: ");

        int n1, n2;
        switch (scanner.nextInt()) {

            case 1:
                System.out.println("Ingrese el primer numero");
                n1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                n2 = scanner.nextInt();

                System.out.println("El resultado de la suma es: " + n1 + n2);
                break;
            case 2:
                System.out.println("Ingrese el primer numero");
                n1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                n2 = scanner.nextInt();
                
                System.out.println("El resultado de la resta es :");
                System.out.println(n1 - n2);

                break;
            case 3:
                System.out.println("Ingrese el primer numero");
                n1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                n2 = scanner.nextInt();

                System.out.println("El resultado de la multiplicacion es: " + n1 * n2);

                break;
            case 4:
                System.out.println("Ingrese el primer numero");
                n1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                n2 = scanner.nextInt();

                System.out.println("El resultado de la division es: " + n1 / n2);
                break;
        }

        // Cerrar el objeto Scanner después de usarlo para evitar posibles fugas de recursos
        scanner.close();
    }
}

