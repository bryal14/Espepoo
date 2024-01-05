/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main_examen;

/**
 *
 * @author Bryan
 */
import java.util.Scanner;
public class Main_examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona ("Bryan",12);
        Zoo zoo = new Zoo("AnimalPlanet",31);
        Visitante visitante = new Visitante(12345,"Juan",70);
        Cuidador cuidador = new Cuidador (00433250,"Bryan",56);
        Leon leon = new Leon ("Lion",5);
        Pinguino pinguino = new Pinguino ("Pingu",2);
        Boolean denuevo = true;
        
       do{
        try{
        System.out.println(" 1 Para Persona");       
        System.out.println("2 Para Visitante");
        System.out.println("3 para Cuidador");
        System.out.println("4 para Zoo");
        System.out.println("5 para Leon");
        System.out.println("6 para Pinguino");
        
       switch(scanner.nextInt()){
           
           case 1:
               System.out.println("Ingrese el nombre de la persona: ");
               String nombrePersona = scanner.next();
               System.out.println("Ingrese la edad de la persona: ");
               int edadPersona = scanner.nextInt();
               System.out.println("Ingrese la cedula de la persona");
               persona.setCedula(12);
               System.out.println("\nLa cedula de la persona es: " +  persona.getCedula());
               System.out.println("\nUsted realizara las siguientes acciones");
               persona.comer();
               persona.dormir();//limpiar el buffer despues de cada entrada y salida de texto
               
               
               
               scanner.nextLine(); //limpiar buffer
               break;
            case 2:
                System.out.println("Uted ha elegido al visitante");
                visitante.comprar();
                break;
            case 3:
                System.out.println("Usted ha elegido al cuidador");
                cuidador.alimentar();
                break;
            case 4:
                System.out.println("Ingrese el Nombre del ZOO: ");
                String nombreZoo = scanner.next();
                System.out.println("Ingrese su edad para entrar al Zoo");
                int edadZoo = scanner.nextInt();
                System.out.println("Ingrese su numero de registro: ");
                zoo.setNregistro(1234);
                System.out.println("\nEl numero de registro es: "+zoo.getNregistro());
                System.out.println("Los animales realizaran las siguientes opciones");
                zoo.comer();
                zoo.dormir();
                scanner.nextLine();
                break;
            case 5:
                System.out.println("Usted ha elegido Leon");
                System.out.println("El leon realiza las siguientes acciones\n");
                leon.cazar();
                leon.rugir();
                break;
            case 6:
                System.out.println("Usted ha elegido Pinguino: ");
                System.out.println("El pinguino realiza las siguientes acciones\n");
                pinguino.nadar();
                pinguino.pezcar();
                break;}
                denuevo = false;
        }catch (Exception e){
            System.out.println("\nNo ingreses cadenos en donde van numeros!!!\n");
            scanner.nextLine();}
        }while(denuevo);
    }
