package parte1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {

		// Hashmap donde guardamos productos y sus precios
		HashMap<String, Double> productos = new HashMap<>();

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Variable String donde guardamos los nombres de los productos individualmente
		String nombre = "";
		
		// Variable double donde guardamos el precio de los productos individualmente
		double precio;

		// Variable entera donde guardamos la opcion que escoge el usuario
		int opcion;

		// Do while por si no sale el usuario
		do {
			
			// Damos a elegir al usuario una opcion y la guardamos en "opcion"
			System.out.println("Seleccione una opción: ");
			System.out.println();
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("4. Listar existencias");
			System.out.println("0. Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();

			// Hacemos un switch para cada opcion
			switch (opcion) {
			
		// Dar de alta un producto
				case 1 -> {
	
					// Pedimos el nombre y lo guardamos en "nombre"
					System.out.print("Introduzca el nombre del producto: ");
					nombre = sc.nextLine();
	
					// Si ya existe lo indicamos
					if (productos.containsKey(nombre)) {
	
						System.out.println("Este producto ya existe.");
						System.out.println();
	
						// Si no, pedimos el precio y lo guardamos en "precio" y lo introducimos en "productos" con el nombre y precio guardados
					} else {
	
						System.out.print("Introduzca el precio del producto: ");
						precio = sc.nextDouble();
						productos.put(nombre, precio);
						
						// Informamos que se ha agreado correctamente
						System.out.println("Producto agregado.");
						System.out.println();
					}
				}

				// Dar de baja un producto
				case 2 -> {
					
					// Pedimos el nombre y lo guardamos en "nombre"
					System.out.print("Introduzca el nombre del producto a eliminar: ");
					nombre = sc.nextLine();
					
					// Si estestá lo eliminamos e informamos al usuario
					if (productos.containsKey(nombre)) {
						
						productos.remove(nombre);
						System.out.println("Producto eliminado.");
						System.out.println();
						
						// Si no, indicamos que el producto no existe
					} else {
						System.out.println("El producto no existe.");
						System.out.println();
					}
				}

				// Listar existencias
				case 4 -> {
					
					// Si "productos" está vacío lo indicamos
					if (productos.isEmpty()) {
						
						System.out.println("No hay productos registrados.");
						System.out.println();
						
						// Si no:
					} else {
						
						// Indicamos que vamos a mostrar la lista de productos
						System.out.println("Lista de productos:");
						
						// Hacemos un for each para recorrer todas las claves de productos guardandolas en un string "producto"
						for (String producto : productos.keySet()) {
							
							// Mostramos el producto y su precio
							System.out.println("- " + producto + " ($" + productos.get(producto) + ")");
						}
						
						System.out.println();
						
					}
				}
				
				//  Salir
				case 0 -> {
					
					// Informamos al usuario
					System.out.println("Saliendo de la aplicación.");
				}
			}
			
			// Se repite mientras que la opción no sea 0
		} while (opcion != 0);

		// Cerramos el scanner
		sc.close();
	}
}