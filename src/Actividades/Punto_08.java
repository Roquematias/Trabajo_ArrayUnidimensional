package Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Punto_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingresa 10 digitos enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int[] ascendente = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(ascendente);

        int[] descendente = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            descendente[i] = ascendente[numeros.length - 1 - i];
        }

        System.out.println("Arreglo en orden ascendente: " + Arrays.toString(ascendente));
        System.out.println("Arreglo en orden descendente: " + Arrays.toString(descendente));

        scanner.close();
    }
}
