package Actividades;

import java.util.Scanner;

public class Punto_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        System.out.println("Ingresa 10 numeros enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el numero que desea eliminar: ");
        int numeroBuscado = scanner.nextInt();

        int[] nuevoArray = new int[numeros.length];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != numeroBuscado) {
                nuevoArray[contador] = numeros[i];
                contador++;
            }
        }

        System.out.println("Arreglo resultante:");
        for (int i = 0; i < contador; i++) {
            System.out.print(nuevoArray[i] + " ");
        }

        scanner.close();
    }
}
