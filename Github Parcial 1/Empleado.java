/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_persistencia;

/**
 *
 * @author Bryan
 */
public class Empleado {

    String nombre;
    String apellido;
    int edad;
    private double salario;

    public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcular_bono() {

        return 0.10 * (salario);
    }

    public void mostrar_informacion(String data) {

        this.setSalario(120);

        System.out.println("El nombre es: " + this.nombre);
        System.out.println("El apellido es : " + this.apellido);
        System.out.println("La edad es : " + this.edad);
        System.out.println("El salario es : " + this.getSalario());

    }
}
