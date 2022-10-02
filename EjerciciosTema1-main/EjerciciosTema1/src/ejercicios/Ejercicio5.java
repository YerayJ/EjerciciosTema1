package ejercicios;

import java.util.Scanner;

/*
 * Dado el siguiente polinomio de segundo grado:
 * y=ax2+bx+c
 *	Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor correspondiente de y.
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos las variables solicitadas en el ejercicio.
		int a, b, c, x, y;
		// Creamos el escaner
		Scanner key = new Scanner(System.in);
		// Y pedimos las variables solicitadas por el ejercicio.
		System.out.println("Deme los coeficientes a, b, c y x en ese orden y separados: ");
		a = key.nextInt();// Con el escaner pedimos el número de tipo INT
		b = key.nextInt();
		c = key.nextInt();
		x = key.nextInt();
		// A continuación haremos el polinomio.
		y = a * x ^ 2 + b * x + c;// Con el operador ^2 haremos el elevado al cuadrado. Realmente esto no
									// funcionaría en versiones de java antiguas, pero como estamos usando java 17
									// funciona.

		// Imprimos el resultado por pantalla.
		System.out.println("El resultado del polinomio es: " + y);
		// Cerramos el escaner
		key.close();
	}

}
