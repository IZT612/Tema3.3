package parte1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable string donde guardamos la respuesta del usuario
		String respuesta = "";
		
		// Colección LinkedHashNet donde guardamos todos los nombres introducidos
		LinkedHashSet<String> nombres = new LinkedHashSet<>();
		
		// Pedimos un nombre y lo guardamos en "respuesta"
		System.out.println("Introduzca un nombre, o 'fin' si quiere finalizar el programa");
		respuesta = sc.nextLine();
		
		// Si la respuesta no es "fin", entramos al bucle
		while (!respuesta.equals("fin")) {
			
			// Añadimos la respuesta a "nombres"
			nombres.add(respuesta);
			
			// Volvemos a pedir el nombre y lo guardamos en "respuesta"
			System.out.println("Introduzca un nombre, o 'fin' si quiere finalizar el programa");
			respuesta = sc.nextLine();
			
		}
		
		// Si el tamaño es 0, no se ha introducido nada, lo indicamos
		if (nombres.size() == 0) {
			
			System.out.println("No se han introducido nombres");
			
		// Si no, mostramos "nombres"
		} else {
			
			System.out.println(nombres);
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
