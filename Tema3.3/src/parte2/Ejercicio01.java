package parte2;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Generador de numeros aleatorios
		Random rand = new Random();

		// Variable entera donde guardaremos los numeros aleatorios individualmente
		int numeroAleatorio;

		// Arraylist de enteros donde guardaremos los números
		ArrayList<Integer> lista = new ArrayList<>();

		// While para insertar numeros hasta que tenga tamaño 10
		while (lista.size() != 10) {

			// Guardo un numero aleatorio del 1 al 10 en "numeroAleatorio"
			numeroAleatorio = rand.nextInt(1, 11);

			// Si no lo contiene lo añado a "lista"
			if (!lista.contains(numeroAleatorio)) {

				lista.add(numeroAleatorio);

			}

		}

		// Mostramos la lista
		System.out.println(lista);

		// La ordenamos
		lista.sort(null);
		
		// Mostramos la lista
		System.out.println(lista);

	}

}
