package parte1;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Creamos el generador de numeros aleatorios
		Random rand = new Random();
		
		// Creamos el ArrayList de enteros donde guardaremos los numeros
		ArrayList<Integer> numeros = new ArrayList<>();
		
		// Bucle for que se repetirá 30 veces
		for (int i = 0; i < 30; i++) {
			
			// Añadimos un número aleatorio del 1 al 10
			numeros.add(rand.nextInt(1, 11));
			
		}
		
		// Ordenamos los numeros
		
		numeros.sort(null);
		
		// Mostramos los numeros
		System.out.println(numeros);

	}

}
