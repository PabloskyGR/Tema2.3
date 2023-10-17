package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que introduzca el usuario
		int num;
		
		// Variable donde iremos guardando el número de veces que se introduce un número positivo
		int cont = 0;

		// Le pedimos al usuario un número
		System.out.println("Dime números y cuando quieras parar introduce un negativo: ");
		num = sc.nextInt();
		
		// Con el bucle comprobamos si el número introducido no es menor de 0 y así vamos sumando 1 al contador por cada número introducido positivo
		while(num >= 0) {
			cont++; // Vamos sumando 1 por cada vez que entremos al bucle
			
			// Le pedimos al usuario otro número
			System.out.println("Dime números y cuando quieras parar introduce un negativo: ");
			num = sc.nextInt();
		}
		
		// Mostramos la cantidad de veces que se ha introducido un número positivo
		System.out.println("Se ha introducido un total de " + cont + " números positivos");
		
		// Cerramos el scanner
		sc.close();
	}

}
