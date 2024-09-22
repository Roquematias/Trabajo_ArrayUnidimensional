package Actividades;

import java.util.Random;

public class Punto_05 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * (rand.nextInt(50) + 1); 
            suma += array[i];
        }

        double promedio = suma / 20.0;
        int iguales = 0, mayores = 0, menores = 0;

        for (int num : array) {
            if (num == promedio) iguales++;
            if (num > promedio) mayores++;
            if (num < promedio) menores++;
        }

        System.out.println("Números generados: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Iguales al promedio: " + iguales);
        System.out.println("Mayores que el promedio: " + mayores);
        System.out.println("Menores que el promedio: " + menores);
    }
}

