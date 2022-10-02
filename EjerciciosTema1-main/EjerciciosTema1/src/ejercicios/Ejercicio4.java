package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	/*
	 * Crea un programa que pida la base y la altura de un triángulo y muestre su
	 * área. (AT = base*altura/2)
	 */

	public static void main(String[] args) {
		// Creamos las variables, en este caso la base, altura y el aréa.
		// (Como no especifica el tipo de valor le pondré int)
		int base, altura, area;
		// Creamos el escaner
		Scanner key = new Scanner(System.in);
		// Pedimos números, la base y la altura.
		System.out.println("Dame la base y la altura en número enteros y separado: ");
		base = key.nextInt();// Con el escaner pedimos el número de tipo INT
		altura = key.nextInt();
		;
		// Hacemos el área
		area = base * altura / 2;// Realizamos la simple fórmula del triángulo.

		// Imprimos el resultado por pantalla
		System.out.println("El resultado del área del triángulo es: " + area);

		key.close();// Creamos un escaner

	}

}
