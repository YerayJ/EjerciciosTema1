package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Modifica el ejercicio anterior para que, indicando dos números, por ejemplo,
	 * num1 y num2, diga qué cantidad hay que sumarle a num1 para que sea múltiplo
	 * de num2.
	 */

	public static void main(String[] args) {
		// Creamos variables
		int num1, num2;// Crearemos dos y la num2 será con la que imprimiremos el resultado.
		int aux;// Esta será la variable auxiliar para hacer operaciones.

		// Creamos un escaner
		Scanner key = new Scanner(System.in);

		// Pedimos dos números
		System.out.println("Deme dos números por separado: ");
		num1 = key.nextInt();// Con el escaner pedimos el número de tipo INT
		num2 = key.nextInt();

		// Hacemos la operación para saber si cuanto hay que sumarle al número.
		num1 = num1 % num2;// Vemos si el número al dividirlo entre siete da resto 0
		aux = num2 - num1;// Después de eso le restamos al cociente que sería num el 7.

		// Imprimimos resultado
		System.out.println("La cantidad que hay que sumarle para que num1 sea múltiplo de num2 es: " + aux);

		key.close();// Creamos un escaner
	}

}
