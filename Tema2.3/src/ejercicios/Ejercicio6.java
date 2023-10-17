package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int alumnos = 0;
		
		double edad;
		
		double sumEdad = 0;
		
		double medEdad;
		
		int mayorEdad = 0;
		
		System.out.println("Dime una edad de un alumno (Pon un número negativo para salir):");
		edad = sc.nextInt();
		
		while (edad > 0) {
			if (edad >= 18) {
				mayorEdad++;
			}
			
			sumEdad += edad;
			System.out.println("Dime una edad de un alumno (Pon un número negativo para salir):");
			edad = sc.nextInt();
			
			alumnos++;
		}
		medEdad = sumEdad / alumnos;
		
		System.out.println("La suma de las edades es de: " + sumEdad + "\n" +
						   "La media de las edades es de: " + medEdad + "\n" +
						   "Hay un total de " + mayorEdad + " alumnos mayores de edad");
		
		sc.close();
		

	}

}
