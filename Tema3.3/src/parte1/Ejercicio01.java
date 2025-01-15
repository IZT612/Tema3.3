package parte1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable entera donde guardaremos los numeros introducidos
		int numero;
		
		// Variable booleana donde guardaremos si se ha introducido algún par
		boolean par = false;
		
		// ArrayList donde guardaremos los números
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		
		// Pedimos un numero y lo guardamos en "numero"
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		
		// Bucle while donde se entra mientras que el numero sea mayor o igual a 0
		while (numero >= 0) {
			
			// Añadimos el número al ArrayList
			listaNumeros.add(numero);
			
			// Pedimos los datos de nuevo y los introducimos en "numero"
			System.out.println("Introduzca un número");
			numero = sc.nextInt();
			
		}
		
		// Hacemos un bucle que recorre el ArrayList
		for (int i = 0; i < listaNumeros.size(); i++) {
			
			// Si el número es par
			if (listaNumeros.get(i) % 2 == 0) {
				
				// Mostramos el índice y ponemos "par" como true
				System.out.print(i + " ");
				par = true;
				
			}
			
		}
		
		// Si el tamaño es 0 no se ha introducido nada
		if (listaNumeros.size() == 0) {
			System.out.println("No se ha introducido ningún número en la lista");
			
			// Si no es 0, y no se ha introducido ningun par se han introducido solo impares
		} else if (!par) {
			
			System.out.println("Se han introducido números pero todos son impares");
			
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
