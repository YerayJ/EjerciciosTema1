package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Diseña una aplicación que solicite al usuario que introduzca una cantidad de
	 * segundos. La aplicación debe mostrar cuántas horas, minutos y segundos hay en
	 * el número de segundos introducidos por el usuario.
	 */

	public static void main(String[] args) {
		// Creamos las variables en este caso el número solicitado sera sg lo demas
		// será hora y min. También haré una variable auxiliar.
		int hora, min, sg, aux;

		// Creamos el escaner
		Scanner key = new Scanner(System.in);

		// Pedimos el numero al usuario
		System.out.println("Deme un número de segundos y le mostraré la hora en formato completo: ");
		sg = key.nextInt();

		// Creamos la operación. La idea sería dividir entre 60 y la hora entre 3600.
		hora = sg/3600 ;// Dividimos entre 3600 los segundos para pasar a la hora.
		//sg = (sg/3600*hora) - sg;
		min = (sg % 3600) / 60;// Dividimos entre 60 los segundos para pasar al minuto.

		// Ahora imprimiremos el resultado por pantalla.
		System.out.println("El resultado de los segundos pasados es: " + hora + ":" + min + ":" + sg);

	}

}
