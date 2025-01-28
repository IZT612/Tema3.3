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

		do {

			System.out.println("Introduzca una opción: ");
			System.out.println("1. Añadir nuevo nombre a la lista.");
			System.out.println("2. Eliminar un nombre específico.");
			System.out.println("3. Ordenar la lista alfabéticamente.");
			System.out.println("4. Buscar un nombre en la lista.");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (opcion) {

			case 1 -> {

				System.out.println("Introduzca un nombre para insertarlo en la lista.");
				nombre = sc.nextLine();

				if (!nombres.contains(nombre)) {

					nombres.add(nombre);
					System.out.println("Nombre agregado exitosamente.");

				} else {

					System.out.println("Ese nombre ya está registrado.");

				}

				System.out.println();

			}

			case 2 -> {

				System.out.println("Introduzca un nombre para eliminarlo de la lista.");
				nombre = sc.nextLine();

				if (nombres.contains(nombre)) {

					nombres.remove(nombre);
					System.out.println("Nombre eliminado exitosamente.");

				} else {

					System.out.println("Este nombre no existe en la lista.");

				}

				System.out.println();

			}

			case 3 -> {

				if (!nombres.isEmpty()) {
					
					System.out.println("Lista antes de ser ordenada: \n" + nombres);
					nombres.sort(null);
					System.out.println("Lista despues de ser ordenada: \n" + nombres);

				} else {

					System.out.println("La lista está vacía, no hay nada que ordenar ni mostrar.");

				}

				System.out.println();

			}

			case 4 -> {

				System.out.println("Introduzca un nombre para buscar en la lista.");
				nombre = sc.nextLine();

				if (nombres.contains(nombre)) {

					System.out.println("El nombre se ha encontrado en la lista.");

				} else {

					System.out.println("El nombre no se encuentra en la lista.");

				}

				System.out.println();

			}

			}

		} while (opcion != 5);
		
		System.out.println("Saliendo del programa.");
		
		sc.close();

	}

}
