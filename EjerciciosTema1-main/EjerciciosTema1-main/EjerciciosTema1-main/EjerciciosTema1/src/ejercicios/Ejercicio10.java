package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	/*
	 * La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una
	 * competición donde cada participante escribe un algoritmo en un papel y lo
	 * lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del concurso
	 * es que la longitud del lanzamiento se mide en metros (con tantos decimales
	 * como se desee), pero para el ranking solo se tiene en cuenta la longitud en
	 * centímetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m,
	 * que son 1234,56 cm solo se contabilizan 1234 cm. Realiza un programa que
	 * solicite la longitud (en metros) de un lanzamiento y muestre la parte entera
	 * correspondiente en centímetros. Utiliza la conversión de tipos.
	 */

	public static void main(String[] args) {
		// Creamos variables
		double longitud;

		// Creamos el escaner
		Scanner key = new Scanner(System.in);

		// Pedimos la variable al usuario
		System.out.print("Deme la longitud del lanzamiento en metros si usa decimales sepárelo con una coma: ");
		longitud = key.nextDouble();

		// Realizamos la conversion de tipos a centímetros multiplicando por 100.
		longitud = longitud * 100;

		// Imprimimos el resultado por pantalla haciendo la conversión directamente a
		// int a la variable longitud.
		System.out.println("El resultado del es: " + (int) longitud + " centímetros");

		// Cerramos el escaner
		key.close();

	}

}
