package parte1;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TreeMap<String, String> diccionario = new TreeMap<>();

		int opcion = 0;

		String palabra;

		String word;

		diccionario.put("Hola", "Hello");
		diccionario.put("Patata", "Potato");
		diccionario.put("Coleccion", "Collection");
		diccionario.put("Hamburguesa", "Burger");
		diccionario.put("España", "Spain");
		diccionario.put("Jamon", "Ham");
		diccionario.put("Mermelada", "Jam");
		diccionario.put("Palabra", "Word");
		diccionario.put("Aleatorio", "Random");
		diccionario.put("Nombre", "Name");
		
		System.out.println("Introduzca la opción que quiere escoger");
		System.out.println();
		System.out.println("1. Insertar palabra");
		System.out.println("2. Buscar palabra");
		System.out.println("0. Salir del programa");

		opcion = sc.nextInt();
		sc.nextLine();

		while (opcion != 0) {

			switch (opcion) {

			case 1 -> {

				System.out.println("Introduzca la palabra en español");
				palabra = sc.nextLine();

				System.out.println("Ahora su traducción al inglés");
				word = sc.nextLine();

				diccionario.put(palabra, word);

			}

			case 2 -> {

				System.out.println("¿Qué palabra quiere buscar?");
				palabra = sc.nextLine();

				System.out.println("La traducción de " + palabra + " es: " + diccionario.get(palabra));
				System.out.println();
			}

			}

			System.out.println("Introduzca la opción que quiere escoger");
			System.out.println();
			System.out.println("1. Insertar palabra");
			System.out.println("2. Buscar palabra");
			System.out.println("0. Salir del programa");

			opcion = sc.nextInt();
			sc.nextLine();

		}
		
		System.out.println("Has salido del programa");

		sc.close();

	}

}
