/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leccion;

/**
 *
 * @author Bryan
 */
import java.util.Scanner;

public class Leccion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gato gato = new Gato ("Gris","Michu");
        Perro perro = new Perro ("Doberman","Max");
        
        System.out.println("1 para ingresar datos de animales");
        System.out.println("2 para ingresar datos del gato ");
        System.out.println("3 para ingresar datos del perro");
        
        switch(scanner.nextInt()){
            case 1:
                System.out.println("Ingrese el animal: ");
                String animalnombre = scanner.next();
                System.out.println("La edad del animal es : " );
                int edadAnimal = scanner.nextInt();
                System.out.println("Haciendo ruido");
                scanner.nextLine();
                break;
            case 2:
                System.out.println(" Ingrese el nombre del gato: ");
                String nombreGato = scanner.next();
                gato.setEdad(2);
                System.out.println("La edad del gato es : " + gato.getEdad());
                gato.cazar_raton();
                gato.trepar_arbol();
                scanner.nextLine();
                gato.hacer_ruido("Maulla");
                break;
            case 3:
                System.out.println("Ingrese el nombre del perro: ");
                String nombrePerro = scanner.next();
                perro.setEdad(4);
                System.out.println("La edad del perro es : " + perro.getEdad());
                perro.correr();
                perro.jugar();  
                perro.hacer_ruido("Ladra");
                scanner.nextLine();
                break;
        }
    }
}
