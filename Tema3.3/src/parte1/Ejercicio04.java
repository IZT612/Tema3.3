package parte1;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Creamos el generador de numeros aleatorios
		Random rand = new Random();
		
		// Creamos una colección TreeSet de enteros donde guardaremos los numeros
		TreeSet<Integer> numeros = new TreeSet<>();
		
		// Hacemos un bucle while que se repetirá mientras el tamaño de "numeros" sea menor a 20
		while (numeros.size() < 20) {
			
			// Añadimos un número menor que 10
			numeros.add(rand.nextInt(Integer.MIN_VALUE, 10));
			
		}
		
		// Mostramos numeros
		System.out.println(numeros);

	}

}
