package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	/*
	 * Pide dos números al usuario. Deberá mostrarse true si ambos números son
	 * iguales y false en caso contrario.
	 * 
	 */

	public static void main(String[] args) {
		
		// Creamos las variables. Solo necesitaremos dos de tipo INT
		int num1, num2;
		
		// Creamos el escaner
		Scanner key = new Scanner(System.in);
		
		// Pedimos las variables al usuario
		System.out.println("Deme dos números enteros por separado, si son iguales mostrará true sino false: ");
		
		num1 = key.nextInt();// Pedimos las variables de tipo INT
		num2 = key.nextInt();
		
		// Imprimimos el resultado en pantalla. Y directamente haremos aquí la operación
		// para saber si son iguales.
		System.out.println("El resultado es: " + (num1 != num2 ? "false" : "true"));
		
		// Cerramos el escaner
		key.close();
		
	}

}
