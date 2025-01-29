package parte2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Variable entera para guardar la opcion del usuario
		int opcion = 0;

		// Variable String para guardar los nombres individualmente
		String nombre;

		// ArrayList para guardar los nombres
		ArrayList<String> nombres = new ArrayList<>();

		// Bucle do while para pedir opciones constantemente hasta que introduzca la 5 (salir)
		do {

			// Mostramos las opciones y pedimos una, indtroduciendola en "opcion"
			System.out.println("Introduzca una opción: ");
			System.out.println("1. Añadir nuevo nombre a la lista.");
			System.out.println("2. Eliminar un nombre específico.");
			System.out.println("3. Ordenar la lista alfabéticamente.");
			System.out.println("4. Buscar un nombre en la lista.");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();

			// Switch para hacer cosas distintas según "opcion"
			switch (opcion) {

			// Si ha escogido la opcion 1 (Registrar nombre):
			case 1 -> {

				// Pedimos el nombre y lo guardamos en "nombre"
				System.out.println("Introduzca un nombre para insertarlo en la lista.");
				nombre = sc.nextLine();

				// Si el nombre no se encuentra ya en "nombres"
				if (!nombres.contains(nombre)) {

					// Lo añadimos
					nombres.add(nombre);
					System.out.println("Nombre agregado exitosamente.");

					// Si el nombre ya está en la lista:
				} else {

					// Informamos al usuario
					System.out.println("Ese nombre ya está registrado.");

				}

				System.out.println();

			}

			// Si ha escogido la opción 2 (Eliminar nombre):
			case 2 -> {

				// Pedimos un nombre y lo guardamos en "nombre"
				System.out.println("Introduzca un nombre para eliminarlo de la lista.");
				nombre = sc.nextLine();

				// Si el nombre se encuentra en "nombres":
				if (nombres.contains(nombre)) {
					
					// Borramos el nombre
					nombres.remove(nombre);
					System.out.println("Nombre eliminado exitosamente.");

					// Si no se encuentra en nombres, informamos al usuario
				} else {

					System.out.println("Este nombre no existe en la lista.");

				}

				System.out.println();

			}

			// Si ha escogido la opción 3 (Ordebar alfabéticamente):
			case 3 -> {

				// Si "nombres" no está vacío:
				if (!nombres.isEmpty()) {
					
					// Mostramos la lista desordenada
					System.out.println("Lista antes de ser ordenada: \n" + nombres);
					
					// Ordenamos la lista
					nombres.sort(null);
					
					// Mostramos la lista ya ordenada
					System.out.println("Lista despues de ser ordenada: \n" + nombres);

					// Si está vacía informamos al usuario
				} else {

					System.out.println("La lista está vacía, no hay nada que ordenar ni mostrar.");

				}

				System.out.println();

			}

			// Si ha escogido la opción 4 (buscar un nombre en la lista):
			case 4 -> {

				// Pedimos el nombre y lo guardamos en "nombre"
				System.out.println("Introduzca un nombre para buscar en la lista.");
				nombre = sc.nextLine();

				// Si el nombre está en la lista informamos al usuario de que se ha encontrado
				if (nombres.contains(nombre)) {

					System.out.println("El nombre se ha encontrado en la lista.");

					// Si no está, informamos al usuario que no se encuentra el nombre
				} else {

					System.out.println("El nombre no se encuentra en la lista.");

				}

				System.out.println();

			}

			}

			// En cuanto la opción sea 5, se sale del bucle
		} while (opcion != 5);
		
		// Informamos al usuario
		System.out.println("Saliendo del programa.");
		
		// Cerramos el scanner
		sc.close();

	}

}
