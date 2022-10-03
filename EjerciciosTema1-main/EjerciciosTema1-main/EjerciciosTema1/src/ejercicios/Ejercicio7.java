package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	/*
	 * Solicita al usuario tres distancias: La primera, medida en milímetros. La
	 * segunda, medida en centímetros. La última, medida en metros. Diseña un
	 * programa que muestre la suma de las tres longitudes introducidas (medida en
	 * centímetros).
	 */
	public static void main(String[] args) {
		// Creamos variables.
		int mm, cm, metros, suma;// mm serán los milimetros, cm los centrímetros, metros  y por último una para la operación.
		
		// Creamos el escaner
		Scanner key = new Scanner(System.in);
		
		// Pedimos los datos
		System.out.println("Deme 3 distancias, en milímetros, centímetros y metros. Cada una por separado");
		mm = key.nextInt();// Pedimos todas las variables de tipo INT.
		cm = key.nextInt();
		metros = key.nextInt();
		
		// Creamos la operación para pasar todo a centímetros.
		metros = metros * 100;// Según las unidades de medida para pasar de metros a cm multiplicamos por 100.
		mm = mm / 10;// Y los mm entre 10.
		suma = cm+mm+metros;// Ahora que está todo en centimetros lo sumamos.
		
		//Imprimimos el resultado.
		System.out.println("El resultado es: " + suma + " segundos");
		
		//Cerramos el escaner
		key.close();
		

	}

}
