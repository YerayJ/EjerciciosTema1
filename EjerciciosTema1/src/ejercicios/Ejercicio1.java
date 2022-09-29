package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Realizar un programa que pida como entrada un número con decimales y lo
	 * muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())
	 */
	
	public static void main(String[] args) {
		//Creamos variables
		double num;
		//Creamos escaner
		Scanner key =  new Scanner(System.in);
		//Pedimos el numero de entrada con decimales
		System.out.println("Deme un número con decimales: ");
		num = key.nextDouble( );
		//Le sumamos 0.5 para que cada vez que el número sobrepase llegue a la siguiente cifra.
		num += 0.5;
		//Imprimimos el resultado por pantalla.
		System.out.println("El número redondeado es: " + (int) num);
		
	}

}
