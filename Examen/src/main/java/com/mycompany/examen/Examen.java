/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen;

/**
 *
 * @author Bryan
 */
import java.util.ArrayList;
public class Examen {

    private static final ArrayList<String[]> examenList = new ArrayList<>();

    public static void main(String[] args) {
        // Método main no se utiliza para agregar datos al examen
        // Dejaremos este método vacío por ahora
    }

    public static void addToExamen(String car, String year, String error) {
        String[] data = {car, year, error};
        examenList.add(data);
        System.out.println("Datos guardados en el examen:");
        for (String[] entry : examenList) {
            System.out.println("Marca: " + entry[0] + ", Año de fabricación: " + entry[1] + ", Estado del motor: " + entry[2]);
        }
    }
}