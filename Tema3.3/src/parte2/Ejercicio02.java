package parte2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Generador de numeros aleatorios
		Random rand = new Random();
		
		// Conjunto donde guardaremos los numeros
		LinkedHashSet<Integer> conjunto = new LinkedHashSet<>();
		
		// Variable entera donde guardaremos los numeros aleatorios individualmente
		int numeroAleatorio;
	
		// Bucle while para insertar numeros mientras que del tamaño del conjunto no sea 10
		while (conjunto.size() != 10) {
			
			// Guardamos un numero aleatorio del 1 al 20
			numeroAleatorio = rand.nextInt(1, 20);
			
			// Insertamos el numero en el conjunto
			conjunto.add(numeroAleatorio);
			
		}
		
		// Mostramos el conjunto
		System.out.println(conjunto);
		
	}

}
