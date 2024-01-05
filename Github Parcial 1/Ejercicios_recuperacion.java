/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios_recuperacion;

/**
 *
 * @author Bryan
 */

import java.util.Scanner;

public class Ejercicios_recuperacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        //*******************Ejecucion de ejercicio 1**************
        Cuenta cuenta = new Cuenta("Bryan",1234);
        int cantidad;
        
        System.out.println("*********************Banco General Rumiñahui**********************");
        System.out.println("Ingrese una cantidad");
        System.out.println("Si ingresa una cantidad mayor a 0 se hara un deposito de su cuenta: ");
        System.out.println("Si ingresa una cantidad menor a 0 o negativa se retirará la cantidad en valor absoluto de su cuenta");
        if(scanner.nextInt() >= 0){
            cuenta.ingresando();
        }
        
        else{
            cuenta.retirando();
        }*/
        
        
        
        /*
        //*******************Ejecucion de ejercicio 2**************
        Detector_mayoria_edad filtro = new Detector_mayoria_edad("Juan",1003587027);
        int edad;
        
        System.out.println("Buenos días bienvenido a Luma");
        
        System.out.println("Ingrese su cedula y su edad para poder ser analizado");
        
        System.out.println("Ingrese su cedula");
        String ciUsuario = scanner.next();
        System.out.println("Ingrese ahora su edad");
            
        if(scanner.nextInt()>=18){
            filtro.Entrada();
            System.out.println("Disfrute de nuestras instalaciones");
        }
        else{
            filtro.Noentrada();
            System.out.println("Para ingresar debe ser mayor de edad");
        }
        System.out.println("gracias por su visita :)");              
         */
        
        /*
        //*******************Ejecucion de ejercicio 3**************
        Password password = new Password("Bryan", 12345);
        Boolean repetir=true;
        
        do{
        System.out.println("Ingrese su nombre de usuario: ");
        String usuario = scanner.next();
        System.out.println("Ingrese la contraseña de mas de 3 digitos");
        if (scanner.nextInt() <= 100){
            password.noaceptado();
                    }
        else{
            
            password.aceptado();
            System.out.println("Su contraseña y usuario se han registrado exitosamente");
            repetir = false;
        }
        }while (repetir);*/
        
        
        /*
        //*******************Ejecucion de ejercicio 4**************
        Empleado empleado =new Empleado("Jorge");
        
        System.out.println("1 Productividad y ventas extraordinarias");
        System.out.println("2 Productividad y ventas regulares");
        System.out.println("3 Productividad y ventas pesimas");
        
        switch(scanner.nextInt()){
            case 1:
                empleado.ascenso();
                break;
            case 2:
                System.out.println("Aumentando el sueldo....");
                break;
            case 3:
                empleado.despido();
                break;
            default:
                System.out.println("Ingrese una opcion correcta, la elegida no existe");
                break;
        }*/
        
        
        /*
        //*******************Ejecucion de ejercicio 5**************
        System.out.println("**************Bienvenido a la calculadora de sumas**************");
        Suma suma= new Suma(123,12312);
        suma.suma();*/
    }
}
