/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora.con.bucle;

/**
 *
 * @author Bryan
 */
import java.util.Scanner; //primero importamos la libreria para usar el scanner

public class CalculadoraConBucle{
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
    int n1,n2; //declaramos dos variables las cuales se van a sumar o restar
    Boolean repetir = true; //el booleano nos ayudará a finalizar el bucle en caso de que no sea verdad
    //por esa razón lo inicializamos como verdadero
        
    do{    //uso un bucle do para que cuando el booleano no sea verdad se finalize el programa
    try{ //con try atrapare el error cuando suceda y esto puede ocurrir dividiendo para 0 o ingresando strings
        System.out.println("---------MENU-----------");
        System.out.println("1 SUMA");
        System.out.println("2 RESTA");
        System.out.println("3 Multiplicacion");         //creo mi menu de opciones
        System.out.println("4 Division"); 
        System.out.println("Elija la operacion deseada");

        switch (op.nextInt()){
                case 1:
                    //aqui solo voy a sumar las variables antes mencionadas
                    System.out.println("Ingrese el primer numero"); 
                    n1 = op.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    n2 = op.nextInt();
                    System.out.println("El resultado de la suma es: ");
                    System.out.println(n1 + n2);
                    break;
                case 2:
                    //aqui solo voy a restar las variables antes mencionadas
                    System.out.println("Ingrese el primer numero"); 
                    n1 = op.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    n2 = op.nextInt();
                    System.out.println("El resultado de la resta es: ");
                    System.out.println(n1 - n2);
                    break;
                case 3:
                    //aqui solo voy a multiplicar las variables antes mencionadas
                    System.out.println("Ingrese el primer numero"); 
                    n1 = op.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    n2 = op.nextInt();
                    
                    System.out.println("El resultado de la multiplicacion es: ");
                    System.out.println(n1 * n2);
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero"); 
                    n1 = op.nextInt();                                  //hasta aqui solo estoy pidiendo que ingrese por teclado los datos
                    System.out.println("Ingrese el segundo numero");
                    n2 = op.nextInt();
                        if (n2 == 0){
                            throw new ArithmeticException("Hey, recuerda que no es posible dividir para 0");
                        }
                        else {          //mediante este if and else declaro que en caso de dividirse para 0 lanzo mi error de tipo ArithmeticException
                            System.out.println("El resultado es: " + n1/n2);
                        }
                break;
            
                default:        //con el defaul indico que si no se escogen las opciones del menu se cerrará el programa
                    System.out.println("La opcion no esta dentro del menu"); break;
            } 
        repetir= false; //si mi error ocurre mi booleano será falso 
   }catch(Exception e){ //atrapo mi error  e indico al usuario que pudo haber fallado
                System.out.println("\nSolo debes ingresar numeros, no letras \n, de no ser el caso no debes dividir para 0");
                 op.nextLine(); //no funcionaba mi codigo asi que decidi limpiar mi buffer 
        }
    }while (repetir); //gracias a mi booleano mi while repetira o no de ser el caso
        
    }
}






//Deber para mañana : en un doc de word colocar el link 
//del github y sus códigos que subieron al github, y hacer uno de excepciones ( calculadora ) 
//ingresando cadenas en lugar de números y la división para cero manejar todo por un While