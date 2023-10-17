package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
				
		// Variable donde iremos sumando los números que se vaya introduciendo
		double suma = 0;
				
		// Variable donde guardaremos el número que se introduzca
		double num;
		
		// Variable donde guardaremos el número de veces que introducimos un número
		int cont = 0;
		
		// Variable doned guardaremos la media de los número introducidos
		double media;
				
		// Le pedimos un número al usuario
		System.out.println("Dime un número para ir sumando y pon un valor negativo para parar:");
		num = sc.nextInt();
			
		// Comprobamos que el número no sea menor a 0 para añadirlo a la variable suma y sumar 1 al contador
		while (num >= 0) {
			suma += num; // Se suma el número anteriormente introducido a la variable suma
			cont++; // Le sumamos 1 al contador por cada vez que entremos al bucle
			
			// Le pedimos otro número al usuario
			System.out.println("Dime un número para ir sumando y pon un valor negativo para parar:");
			num = sc.nextInt();
		}
		
		// Hacemos la media de los números introducidos
		media = suma / cont;
		
		// Mostramos la media de todos los números positivos introducidos
		System.out.println("La media de todos los números introducidos es de: " + media);

		// Cerramos el scanner
		sc.close();
	}

}
