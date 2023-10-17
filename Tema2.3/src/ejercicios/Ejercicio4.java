package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable doned guardaremos el número que introduzca el usuario
		int num;
		
		// Le pedimos al usuario que nos diga un número
		System.out.println("Dime números y dire si es par o impar, escribe 0 para acabar:");
		num = sc.nextInt();
		
		// Comprobamos si el número es diferente de 0 para emtrar al bucle
		while (num != 0) {
			
			if(num % 2 == 0) { // Comprobamos si el número es par
				System.out.println("Tu número es par"); // Si es par mostramos un mensaje diciendo que es par
			} else { // En caso de que no sea par sera impar
				System.out.println("Tu número es impar"); // Mostramos el mensaje de que es impar
			}
			
			// le pedimos al usuario otro número
			System.out.println("Dime números y dire si es par o impar, escribe 0 para acabar:");
			num = sc.nextInt();
		}
		
		// Mostramos un mensaje cuando salga del bucle y haya terminado
		System.out.println("¡FIN!");
		
		// Cerramos el scanner
		sc.close();

	}

}
