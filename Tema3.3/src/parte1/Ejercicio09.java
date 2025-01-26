package parte1;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio09 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variable entera donde guardaremos todo tipo de numeros: Como el número a
		// guardar y el número de estrella
		int numero;

		// Variable entera que usamos para obtener las claves de estrellas y números al
		// mostrarlas (Se va actualizando, se iguala a cada numero que vamos obteniendo)
		int numeroBajo = Integer.MIN_VALUE;

		// Variable booleana para saber si el usuario quiere introducir más o no
		boolean introducirOtro = false;

		// Treemap donde guardamos los numeros
		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		
		// Treemap onde guardamos las estrellas
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();

		// Do while para ir pidiendo euromillones
		do {

			// Bucle for para los numeros
			for (int i = 0; i < 5; i++) {

				// Pedimos el numero
				System.out.println("Introduzca el " + (i + 1) + " número");
				numero = sc.nextInt();

				// Si no aparece, lo insertamos con valor 1
				if (numeros.get(numero) == null) {

					numeros.put(numero, 1);

					// Si no, añadimos 1 al valor
				} else {

					numeros.put(numero, numeros.get(numero) + 1);

				}

			}

			// Hacemos lo mismo para las estrellas
			for (int i = 0; i < 2; i++) {

				// Pedimos la estrella
				System.out.println("Introduzca la " + (i + 1) + " estrella");
				numero = sc.nextInt();

				// Si no hay estrella, la guardamos con valor 1
				if (estrellas.get(numero) == null) {

					estrellas.put(numero, 1);

					// Si no, añadimos 1 al valor
				} else {

					estrellas.put(numero, estrellas.get(numero) + 1);

				}

			}

			// Hacemos un for para mostrar todos los numeros
			for (int i = 0; i < numeros.size(); i++) {

				// Guardamos en "numero" la clave siguiente a "numeroBajo"
				numero = numeros.higherKey(numeroBajo);
				
				// Guardamos el numero como el nuevo "numeroBajo"
				numeroBajo = numero;

				// Si está una sola vez mostramos el mensaje singular
				if (numeros.get(numero) == 1) {

					System.out.print(", el número " + numero + " está " + numeros.get(numero) + " vez");

					// Si no, en plural
				} else {

					System.out.print(", el número " + numero + " está " + numeros.get(numero) + " veces");

				}

			}

			System.out.print(".");

			// Repetimos exactamente lo mismo para las estrellas:
			System.out.println();
			System.out.println("En cuanto a las estrellas: ");

			numeroBajo = 0;
			numero = numeros.higherKey(numeroBajo);
			numeroBajo = numero;

			for (int i = 0; i < estrellas.size(); i++) {

				numero = estrellas.higherKey(numeroBajo);
				numeroBajo = numero;

				if (estrellas.get(numero) == 1) {

					System.out.print(", el número " + numero + " está " + estrellas.get(numero) + " vez");

				} else {

					System.out.print(", el número " + numero + " está " + estrellas.get(numero) + " veces");

				}

			}

			System.out.print(".");

			System.out.println();

			numeroBajo = 0;

			// Pedimos si quiere introducir otro
			System.out.println("¿Quiere introducir otro euromillón?");
			System.out.println("1. Sí");
			System.out.println("2. No");
			System.out.println();
			numero = sc.nextInt();

			// Si ha introducido 1, ponemos "introducirOtro" como true
			if (numero == 1) {

				introducirOtro = true;

				// Si no, "introducirOtro" será false
			} else {

				introducirOtro = false;

			}

			// Se repite si "introducirOtro" es true
		} while (introducirOtro);

		// Cerramos el scanner
		sc.close();

	}
}
