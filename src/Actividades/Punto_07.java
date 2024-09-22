package Actividades;

import java.util.Scanner;

public class Punto_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int sumaPares = 0;
        int sumaImpares = 0;

        System.out.println("Ingresa 20 numeros enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i]; 
            } else {
                sumaImpares += numeros[i]; 
            }
        }

        System.out.println("Suma de los numeros pares: " + sumaPares);
        System.out.println("Suma de los numeros impares: " + sumaImpares);

        scanner.close();
    }
}
