/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deberuno;

/**
 *
 * @author Bryan
 */
import javax.swing.JOptionPane;

public class Deberuno {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*int numero,velocidad=50;

            numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad del vehiculo"));

            if(numero <= velocidad){
           JOptionPane.showMessageDialog(null, "La velocidad es adecuada");
            }
            else{
           JOptionPane.showMessageDialog(null, "El vehiculo sera multado");
            }
*/
        Perro p1= new Perro("Max", 5);
        p1.comer();
        p1.ladrar();
        p1.saltar();
        
        
        Gato p2= new Gato("Michu",6);
        p2.ronronear();
        p2.rasgar();
        p2.acostar();
        
        Persona p3 = new Persona("Josue",24);
        p3.comer();
        p3.dormir();
        p3.saltar();
        
        vehiculo p4 = new vehiculo("Mazda",50);
        p4.multa();
    }
}
