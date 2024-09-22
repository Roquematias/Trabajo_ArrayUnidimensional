package Actividades;

public class Punto_01 {
	//Si tratamos de acceder un elemento que este fuera del tamaño del array el programa se detendra y mostrara un mensaje de error (IndexOutOfBoundsException.) que indica que se a intentado acceder a un indice que no exixse en el array
		//EJEMPLO
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(array[5]); 
    }
}
