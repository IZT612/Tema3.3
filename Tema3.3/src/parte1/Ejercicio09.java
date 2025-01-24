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

		TreeMap<Integer, Integer> estrellas = new TreeMap<>();

		do {

			for (int i = 0; i < 5; i++) {

				System.out.println("Introduzca el " + (i + 1) + " número");
				numero = sc.nextInt();

				if (numeros.get(numero) == null) {

					numeros.put(numero, 1);

				} else {

					numeros.put(numero, numeros.get(numero) + 1);

				}

			}

			for (int i = 0; i < 2; i++) {

				System.out.println("Introduzca la " + (i + 1) + " estrella");
				numero = sc.nextInt();

				if (estrellas.get(numero) == null) {

					estrellas.put(numero, 1);

				} else {

					estrellas.put(numero, estrellas.get(numero) + 1);

				}

			}

			numero = numeros.higherKey(numeroBajo);
			numeroBajo = numero;

			if (numeros.get(numero) == 1) {

				System.out.print("El número " + numero + " se repite " + numeros.get(numero) + " vez");

			} else {

				System.out.print("El número " + numero + " se repite " + numeros.get(numero) + " veces");

			}

			for (int i = 0; i < numeros.size() - 1; i++) {

				numero = numeros.higherKey(numeroBajo);
				numeroBajo = numero;

				if (numeros.get(numero) == 1) {

					System.out.print(", el número " + numero + " se repite " + numeros.get(numero) + " vez");

				} else {

					System.out.print(", el número " + numero + " se repite " + numeros.get(numero) + " veces");

				}

			}

			System.out.print(".");

			System.out.println();
			System.out.println("En cuanto a las estrellas: ");

			numeroBajo = 0;
			numero = numeros.higherKey(numeroBajo);
			numeroBajo = numero;

			if (estrellas.get(numero) == 1) {

				System.out.print("El número " + numero + " se repite " + estrellas.get(numero) + " vez");

			} else {

				System.out.print("El número " + numero + " se repite " + estrellas.get(numero) + " veces");

			}

			for (int i = 0; i < estrellas.size() - 1; i++) {

				numero = estrellas.higherKey(numeroBajo);
				numeroBajo = numero;

				if (estrellas.get(numero) == 1) {

					System.out.print(", el número " + numero + " se repite " + estrellas.get(numero) + " vez");

				} else {

					System.out.print(", el número " + numero + " se repite " + estrellas.get(numero) + " veces");

				}

			}

			System.out.print(".");

			System.out.println();

			numeroBajo = 0;

			System.out.println("¿Quiere introducir otro euromillón?");
			System.out.println("1. Sí");
			System.out.println("2. No");
			System.out.println();
			numero = sc.nextInt();

			if (numero == 1) {

				introducirOtro = true;

			} else {

				introducirOtro = false;

			}

		} while (introducirOtro);

		sc.close();

	}
}
