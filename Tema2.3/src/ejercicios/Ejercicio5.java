package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde contaremos cuantos números escribe en total
		int cont = 0;
		
		// Variable donde guardaremos los números negativos totales
		int contMed = 0;
		
		// Variable donde guardaremos el número que introduzca el usuario
		double num;
		
		// Variable donde guardaremos el número total de 0
		int ceros = 0;
		
		// Variable donde guardaremos la media de los números negativos
		double media = 0;
		
		// Variable donde guardaremos la suma total de los números positivos
		int suma = 0;
		
		// Bucle que entraremos siempre y cuando no se ponga mas de 10 números
		while(cont < 10) {
			
			// Le pedimos al usuario un número
			System.out.println("Dime un número");
			num = sc.nextDouble();
			
			// Comprobamos si el número es positivo, negativo o es un cero
			if (num > 0) {
				suma += num;
			} else if (num < 0){
				media += num;
				contMed++;
			} else {
				ceros++;
			}
			
			// Añadimos 1 al número total de números escritos
			cont++;
		}
		
		// Hacemos la media de los números negativos
		media = media / contMed;
	
		// Mostramos el resultado de cada tipo
		System.out.println("La suma de números positivo es de: " + suma);
		System.out.println("La media de números negativos es de: " + media);
		System.out.println("El total de 0 es de: " + ceros);
		
		// Cerramos el scanner
		sc.close();

	}

}
