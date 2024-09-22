package Actividades;

import java.util.Scanner;

public class Punto_03 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingresa el tamaño del arreglo: ");
			int tamaño = scanner.nextInt();
			
			System.out.print("Ingresa un numero para los multiplos: ");
			int numero = scanner.nextInt();
			
			int[] array = new int[tamaño];
			rellenarArray(array, numero);
			mostrarArray(array);
		}
    }
    
    public static void rellenarArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numero * (i + 1);
        }
    }
    
    public static void mostrarArray(int[] array) {
        System.out.println("Los multiplos son:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}
