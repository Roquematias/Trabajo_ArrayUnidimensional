package Actividades;

import java.util.Scanner;

public class Punto_10 {
    public static char obtenerLetra(int numeroDNI) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
                         'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 
                         'L', 'C', 'K', 'E'};
        
        int posicion = numeroDNI % 23;
        
        return letras[posicion];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el numero de DNI (sin letra): ");
        int numeroDNI = scanner.nextInt();
        
        char letraDNI = obtenerLetra(numeroDNI);
        
        System.out.println("El DNI completo es: " + numeroDNI + letraDNI);
        
        scanner.close();
    }
}
