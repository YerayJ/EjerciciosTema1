package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Diseña una aplicación que solicite al usuario que introduzca una cantidad de
	 * segundos. La aplicación debe mostrar cuántas horas, minutos y segundos hay en
	 * el número de segundos introducidos por el usuario.
	 */

	public static void main(String[] args) {
		// Creamos las variables en este caso los segundos, horas y minutos. También
		// haré una variable auxiliar para registrar el número del usuario.
		int hora, min, seg, aux;// Las crearé todas de tipo INT

		// Creamos el escaner
		Scanner key = new Scanner(System.in);

		// Pedimos el numero al usuario
		System.out.println("Deme un número de segundos y le mostraré la hora en formato completo: ");
		aux = key.nextInt();

		// Creamos la operación.
		hora = aux / 3600;// Dividimos entre 3600 los segundos para pasar a la hora.
		min = (aux % 3600) / 60;// Sacamos el resto que nos daría en segundos y lo dividimos entre 60 para sacar
								// los minutos.
		seg = (aux % 3600) - min * 60;// Sacamos el resto que nos daría en segundos y se lo restamos a la variable min
										// * 60, para que vuelva a conventirse en segundos.

		// Ahora imprimiremos el resultado por pantalla.
		System.out.println("El resultado de los segundos pasados es: " + hora + "h:" + min + "m:" + seg + "s");

		// Cerramos el escaner
		key.close();
	}

}
