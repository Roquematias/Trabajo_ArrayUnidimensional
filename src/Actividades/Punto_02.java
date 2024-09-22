package Actividades;

import java.util.Scanner;

public class Punto_02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int[] array = new int[5];

			for (int i = 0; i < array.length; i++) {
			    System.out.print("Ingresa el número " + (i + 1) + ": ");
			    array[i] = scanner.nextInt();
			}

			System.out.println("Los números ingresados son:");
			for (int num : array) {
			    System.out.println(num);
			}
		}
    }
}
