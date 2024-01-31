/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//iteracion de listas de la mejor manera o de la manera más eficiente.
// como usarias programacion orientada a objetos con respecto al hackin etico 


package com.mycompany.iteracion;

public class Iteracion {

    public static void main(String[] args) {
       int[] miLista = new int[1000];
        for (int i = 0; i < miLista.length; i++) {
            miLista[i] = i + 1;
        }

        int objetivo = 50;

        busquedaBinariaConPosicion(miLista, objetivo);
        busquedaLinealConPosicion(miLista, objetivo);
    }

    public static void busquedaBinariaConPosicion(int[] lista, int objetivo) {
        long inicio = System.currentTimeMillis();
        int izquierda = 0;
        int derecha = lista.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            int valorMedio = lista[medio];

            if (valorMedio == objetivo) {
                long fin = System.currentTimeMillis();
                double tiempo = (fin - inicio) / 1000.0;
                System.out.println("Búsqueda binaria: El número " + objetivo + " se encuentra en la posición " + medio + ".");
                System.out.println("Tiempo de ejecución: " + tiempo + " segundos.");
                return;
            } else if (valorMedio < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        long fin = System.currentTimeMillis();
        double tiempo = (fin - inicio) / 1000.0;
        System.out.println("Búsqueda binaria: El número " + objetivo + " no se encuentra en la lista.");
        System.out.println("Tiempo de ejecución: " + tiempo + " segundos.");
    }

    public static void busquedaLinealConPosicion(int[] lista, int objetivo) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == objetivo) {
                long fin = System.currentTimeMillis();
                double tiempo = (fin - inicio) / 1000.0;
                System.out.println("Búsqueda lineal: El número " + objetivo + " se encuentra en la posición " + i + ".");
                System.out.println("Tiempo de ejecución: " + tiempo + " segundos.");
                return;
            }
        }

        long fin = System.currentTimeMillis();
        double tiempo = (fin - inicio) / 1000.0;
        System.out.println("Búsqueda lineal: El número " + objetivo + " no se encuentra en la lista.");
        System.out.println("Tiempo de ejecución: " + tiempo + " segundos.");
    }
}