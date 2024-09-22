package Actividades;

import java.util.Scanner;

public class Punto_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array1 = new int[5];
        int[] array2 = new int[10];
        int[] array3 = new int[5];

        System.out.println("Ingrese 5 valores para el primer arreglo:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese 10 valores para el segundo arreglo:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            int suma = 0;
            for (int j = 0; j < array2.length; j++) {
                suma += array1[i] * array2[j]; 
            }
            array3[i] = suma; 
        }

        System.out.println("Primer arreglo: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }

        System.out.println("\nSegundo arreglo: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }

        System.out.println("\nTercer arreglo (suma de multiplicaciones): ");
        for (int num : array3) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
