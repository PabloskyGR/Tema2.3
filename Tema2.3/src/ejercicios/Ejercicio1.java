package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde iremos sumando los números que se vaya introduciendo
		int suma = 0;
		
		// Variable donde guardaremos el número que se introduzca
		int num;
		
		// Le pedimos un número al usuario
		System.out.println("Dime un número para ir sumando y pon un valor negativo para parar:");
		num = sc.nextInt();
		
		// Comprobamos que el número no sea menor a 0 para añadirlo a la variable suma
		while (num >= 0) {
			suma += num; // Se suma el número anteriormente introducido a la variable suma
			
			// Le pedimos otro número al usuario
			System.out.println("Dime un número para ir sumando y pon un valor negativo para parar:");
			num = sc.nextInt();
		}
		
		// Mostramos la suma de todos los números positivos introducidos
		System.out.println("La suma de todos los números introducidos es de: " + suma);

		// Cerramos el scanner
		sc.close();
	}

}
