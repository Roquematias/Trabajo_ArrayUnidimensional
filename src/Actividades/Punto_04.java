package Actividades;

import java.util.Scanner;

public class Punto_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[20];
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        double mayor = array[0];
        double menor = array[0];
        
        for (double num : array) {
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }

        double rango = mayor - menor;

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Rango: " + rango);
        
        scanner.close();
    }
}
