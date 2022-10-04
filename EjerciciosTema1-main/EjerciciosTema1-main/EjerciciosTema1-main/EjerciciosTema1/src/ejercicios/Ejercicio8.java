package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Una empresa que gestiona un parque acuático te solicita una aplicación que
	 * les ayude a calcular el importe que hay que cobrar en la taquilla por la
	 * compra de una serie de entradas (cuyo número será introducido por el
	 * usuario). Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de
	 * adultos, que cuestan 20€. En el caso de que el importe total sea igual o
	 * superior a 100€, se aplicará automáticamente un bono descuento del 5%.
	 */

	public static void main(String[] args) {

		// Creamos las variables. Las haré en tipo double, ya que en este ejercicio
		// habrá decimales.
		double entradadulto, totalentradas, entradainfantil, descuento;
		final double ADULTO = 20;
		final double INFANTIL = 15.50;

		// Creamos el escaner
		Scanner key = new Scanner(System.in);

		// Pedimos las variables al usuario. En este caso pediremos cuantas entradas
		// quiere de cada tipo.
		System.out.println("Cuantas entradas quiere de cada tipo (Si no quiere ninguna indique 0): ");
		System.out.println("ADULTO: ");
		entradadulto = key.nextDouble();// Esta vez pedimos las variables de tipo Double.
		System.out.println("INFANTIL: ");
		entradainfantil = key.nextDouble();

		// Realizamos las operaciones. Le damos valor a las entradas multiplicando por
		// las constantes creadas.
		entradadulto = entradadulto * ADULTO;
		entradainfantil = entradainfantil * INFANTIL;
		totalentradas = entradadulto + entradainfantil;// Sumamos el resultado de las dos.
		descuento = totalentradas - (totalentradas * 0.5);

		// Imprimos el resultado
		System.out.println("El precio total de las entradas será: " + (totalentradas >= 100 ? descuento : totalentradas)
				+ "Euros");

		// Cerramos el escaner
		key.close();
	}

}
