package parte2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Creamos el scanenr
		Scanner sc = new Scanner(System.in);
		
		// HashMap para guardar las series (nombre como string, y valoracion como double)
		HashMap<String, Double> series = new HashMap<>();
		
		// Variable entera para guardar la opcion escogida por el usuario
		int opcion = 0;
		
		// Variable string para guardar el nombre de la serie
		String nombre;
		
		// Variable double para guardar la valoracion de la serie
		double valoracion;
		
		// Bucle do-while para pedir opciones y realizarlas hasta que introduzca la de salir (4)
		do {
			
			// Mostramos las  opciones y guardamos la escogida en "opcion"
			System.out.println("Introduzca una opción:");
			System.out.println("1. Agregar serie.");
			System.out.println("2. Buscar serie.");
			System.out.println("3. Eliminar serie.");
			System.out.println("4. Salir.");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			// Hacemos un switch según "opcion"
			switch (opcion) {
			
			// Si ha escogido la primera (agregar serie)
			case 1 -> {
				
				// Pedimos el nombre y lo guardamos en "nombre"
				System.out.println("Introduzca el nombre de la serie a introducir.");
				nombre = sc.nextLine();
				
				// Si no se encuentra en "series":
				if (!series.containsKey(nombre)) {
					
					// Pedimos la valoración y la guardamos en "valoracion"
					System.out.println("Introduzca la valoración de la serie.");
					valoracion = sc.nextDouble();
					sc.nextLine();
					
					// Introducimos la serie con su nombre y valoracion en "series"
					series.put(nombre, valoracion);
					System.out.println("Serie introducida correctamente.");
					
					// Si ya está, informamos al usuario
				} else {
					
					System.out.println("Esta serie ya se encuentra en la lista.");
					
				}
				
				System.out.println();
				
			}
			
			// Si ha escogido la opcion 2 (Buscar serie):
			case 2 -> {
				
				// Pedimos el nombre de la serie y lo guardamos en "nombre"
				System.out.println("Introduzca el nombre de la serie a buscar.");
				nombre = sc.nextLine();
				
				// Si se encuentra, informamos al usuario de que se ha encontrado y mostramos su valoracion
				if (series.containsKey(nombre)) {
					
					System.out.println("La serie se ha encontrado, tiene una valoración de: \n" + series.get(nombre));
					
					// Si no se encuentra, informamos al usuario de que no se encuentra en la lista
				} else {
					
					System.out.println("La serie no se encuentra en la lista.");
					
				}
				
				System.out.println();
				
			}
			
			// Si ha escogido la opción 3 (Eliminar una serie):
			case 3 -> {
				
				// Pedimos el nombre y lo guardamos en "nombre"
				System.out.println("Introduzca el nombre de la serie a eliminar.");
				nombre = sc.nextLine();
				
				// Si se encuentra la serie en "series" la eliminamos
				if (series.containsKey(nombre)) {
					
					series.remove(nombre);
					System.out.println("La serie ha sido eliminada correctamente.");
					
					// Si no se encuentra en la lista, informamos al usuario
				} else {
					
					System.out.println("Esta serie no se encuentra en la lista.");
					
				}
				
				System.out.println();
				
			}
			
			}
			
			// Se pedirán opciones hasta que introduzca la opción 4
		} while (opcion != 4);
		
		// Informamos al usuario
		System.out.println("Saliendo del programa");
		
		// Cerramos el scanner
		sc.close();

	}

}
