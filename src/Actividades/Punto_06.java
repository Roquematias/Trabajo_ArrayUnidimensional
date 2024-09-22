package Actividades;

import java.util.Random;
import java.util.Scanner;

public class Punto_06 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1; 
        }

        System.out.println("Arreglo generado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        boolean encontrado = false; 

        do {
            System.out.print("Ingresa el valor que deseas buscar: ");
            String respuesta = scanner.nextLine();

            int valorBuscado;
            try {
                valorBuscado = Integer.parseInt(respuesta);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un numero válido.");
                continue;
            }

            encontrado = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == valorBuscado) {
                    System.out.println("Valor encontrado en la posición: " + i);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Valor no encontrado en el arreglo.");
            }

        } while (!encontrado);

        System.out.println("Programa terminado.");
        scanner.close();
    }
}
