package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	// Escribe un programa que tome como entrada un número entero e indique qué
	// cantidad hay que sumarle para que sea múltiplo de 7. Por ejemplo, a 2 hay que
	// sumarle 5 para que sea múltiplo de 7. En el caso de 13 habría que sumarle 1.
	// Usa el operador módulo (%) para calcularlo.

	public static void main(String[] args) {
		// Creamos variables
		int num, num2;// Crearemos dos y la num2 será con la que imprimiremos el resultado.
		// Creamos un escaner
		Scanner key = new Scanner(System.in);
		// Pedimos un número
		System.out.println("Deme un número para saber si es múltiplo de 7: ");
		num = key.nextInt();// Con el escaner pedimos el número de tipo INT

		// Hacemos la operación para saber si cuanto hay que sumarle al número.
		num = num % 7;// Vemos si el número al dividirlo entre siete da resto 0
		num2 = 7 - num;// Después de eso le restamos al cociente que sería num el 7.

		// Imprimimos resultado
		System.out.println("La cantidad que hay que sumarle para que sea múltiplo de 7 es: " + num2);

		key.close();// Creamos un escaner
	}

}
