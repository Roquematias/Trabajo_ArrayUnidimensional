package Actividades;

import java.util.Scanner;

public class Punto_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena de numeros separados por guiones: ");
        String input = scanner.nextLine();
        
        String[] numerosString = input.split("-");
        
        int suma = 0;
        int cantidad = numerosString.length;

        for (String numStr : numerosString) {
            suma += Integer.parseInt(numStr); 
        }

        double promedio = (double) suma / cantidad;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        
        scanner.close();
    }
}
