package parte2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// hashmap donde guardaremos los nombres y los numeros en un set dentro
		HashMap<String, HashSet<Integer>> libreta = new HashMap<>();
		
		// Variable entera donde guardaremos la opcion del usuario
		int opcion = 0;
		
		// Variable string donde guardaremos el nombre
		String nombre = "";
		
		// Variable entera donde guardaremos el telefono
		int telefono = 0;
		
		// Do-while para volver a pedir la opcion 
		do {
			
			// Mostramos las opciones y guardamos la escogida en "opcion"
			System.out.println("Introduzca una opción:");
			System.out.println("1. Añadir persona.");
			System.out.println("2. Añadir teléfono a una persona.");
			System.out.println("3. Mostrar teléfonos.");
			System.out.println("4. Eliminar teléfono de una persona.");
			System.out.println("5. Eliminar persona.");
			System.out.println("6. Salir.");
			opcion =  sc.nextInt();
			sc.nextLine();
			
			// Hacemos un switch segun "opcioN"
			switch (opcion) {
			
			// Si ha escogido la 1 (Añadir persona):
			case 1 -> {
				
				// Pedimos el nombre y lo guardamos en "nombre"
				System.out.println("Introduzca el nombre de la persona a añadir.");
				nombre = sc.nextLine();
				
				// Si no se encuentra el nombre en la libreta, lo guardamos con los telefonos en nulo
				if (!libreta.containsKey(nombre)) {
					
					libreta.put(nombre, null);
					System.out.println("Persona añadida correctamente");
					
					// Si no, informamos al usuario
				} else {
					
					System.out.println("Esta persona ya se encuentra en la libreta.");
					
				}
				
				System.out.println();
				
			}
			
			// Si ha escogido la 2 (Añadir teléfono a una persona):
			case 2 -> {
				
				// Pedimos el nombre y lo guardamos en "nombre"
				System.out.println("Introduzca el nombre de la persona a la que le quiere añadir un teléfono.");
				nombre = sc.nextLine();
				
				// Si se encuentra en "libreta"
				if (libreta.containsKey(nombre)) {
					
					// Pedimos el telefono a añadir y lo introducimos en "telefono"
					System.out.println("Introduzca el teléfono a añadir.");
					telefono = sc.nextInt();
					sc.nextLine();
					
					// Añadimos un nuevo HashSet como valor de ese nombre en "libretas" si no se encontraba nada antes
					libreta.putIfAbsent(nombre, new HashSet<>());
					
					// Añadimos al HashSet el telefono
					libreta.get(nombre).add(telefono);

					// Si no se encuentra informamos al usuario
				} else {
					
					System.out.println("No se ha encontrado ese nombre en la libreta.");
					
				}
				
				System.out.println();
				
			}
			
			// Si ha escogido la 3 (Ver los telefonos):
			case 3 -> {
				
				// Pedimos el nombre y lo guardamos en "nombre"
				System.out.println("Introduzca el nombre de la persona de la que quiere ver los teléfonos.");
				nombre = sc.nextLine();
				
				// Si se encuentra, los mostramos
				if (libreta.containsKey(nombre)) {
					
					System.out.println(libreta.get(nombre));
					
					// Si no, informamos al usuario
				} else {
					
					System.out.println("No se ha encontrado ese nombre en la libreta.");
					
				}
				
				System.out.println();
				
			}
			
			// Si ha escogido la 4 (Eliminar un telefono):
			case 4 -> {

				// Pedimos el nombre y lo guardamos en "nombre"
				System.out.println("Introduzca el nombre de la persona a la que le quiere eliminar un teléfono.");
				nombre = sc.nextLine();
				
				// Si el nombre está en la libreta:
				if (libreta.containsKey(nombre)) {
					
					// Pedimos el telefono a eliminar y lo guardamos en "telefono"
					System.out.println("Introduzca el teléfono a eliminar.");
					telefono = sc.nextInt();
					sc.nextLine();
					
					// Borramos el telefono
					libreta.get(nombre).remove(telefono);
					
					// Si no se encuentra, informamos al usuario
				} else {
					
					System.out.println("No se ha encontrado ese nombre en la libreta.");
					
				}
				
				System.out.println();
				
			}
			
			// Si ha escogido la 5 (Eliminar a una persona):
			case 5 -> {
				
				// Pedimos el nombre y lo guardamos en "nombre"
				System.out.println("Introduzca el nombre de la persona a eliminar.");
				nombre = sc.nextLine();
				
				// Si se encuentra el nombre en la libreta, borramos el objeto
				if (libreta.containsKey(nombre)) {
					
					libreta.remove(nombre);
					System.out.println("Persona eliminada correctamente.");
					
					// Si no se encuentra, informamos al usuario
				} else {
					
					System.out.println("Esta persona no se encuentra en la libreta.");
					
				}
				
				System.out.println();
				
			}
			
			}
			
		} while (opcion != 6);
		
		// Informamos al usuario de que estamos saliendo del programa
		System.out.println("Saliendo del programa.");
		
		// Cerramos el scanner
		sc.close();
		
	}

}
