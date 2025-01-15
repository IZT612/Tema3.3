package parte1;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Generador de numeros random
		Random rand = new Random();
		
		// Variable entera "tamaño" que se genera aleatoriamente entre 5 y 10 (ambos incluidos)
		int tamaño = rand.nextInt(5, 11);
		
		// Variable entera donde se guardan los numeros aleatorios individualmente
		int numero;
		
		// Variable entera donde se guarda el valor minimo 
		int minimo = Integer.MAX_VALUE;
		
		// Variable entera donde se guarda el valor maximo
		int maximo = Integer.MIN_VALUE;
		
		// Variable entera donde se guarda la suma de los numeros
		int suma = 0;
		
		// Variable double donde se guarda la media de los numeros
		double media;
		
		// ArrayList de enteros donde guardamos todos los numeros
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		
		// bucle for para recorrer el ArrayList según el tamaño generado
		for (int i = 0; i < tamaño; i++) {
			
			// Generamos un numero aleatorio entre 0 y 100 (incluido) y lo guardamos en el ArrayList
			numero = rand.nextInt(0, 101);
			listaNumeros.add(numero);
			
			// Si el número es mayor al actual máximo, este se guarda como el nuevo máximo
			if (numero > maximo) {
				
				maximo = numero;
				
			}
			
			// Si el número es mayor al actual mínimo, este se guarda como el nuevo mínimo
			if (numero < minimo) {
				
				minimo = numero;
				
			}
			
			// Sumamos todos los números
			suma += numero;
			
		}
		
		// Calculamos la media
		media = (double) suma / tamaño;
		
		// Mostramos todos los resultados
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + media);
		System.out.println("El máximo es: " + maximo);
		System.out.println("El mínimo es: " + minimo);

	}

}
