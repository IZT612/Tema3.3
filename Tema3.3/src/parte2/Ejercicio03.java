package parte2;

import java.util.TreeMap;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// TreeMap donde guardamos las letras y las veces que se repiten
		TreeMap<Character, Integer> letras = new TreeMap<>();
		
		// Variable char donde guardamos los caracteres individualmente
		char caracter;
		
		// Variable entera donde guardamos las veces que se repite cada caracter individualmente
		int veces;
		
		// La frase a recorrer
		String frase = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";
		
		// Bucle for para recorrer la frase
		for (int i = 0; i < frase.length(); i++) {
			
			// Reiniciamos "veces" a 0
			veces = 0;
			
			// Guardamos el caracter
			caracter = frase.charAt(i);
			
			// Si el caracter es una letra proseguimos:
			if (Character.isLetter(caracter)) {
				
				// Si ya está en "letras" sumaremos 1 a las veces que está:
				if (letras.containsKey(caracter)) {
					
					// Guardamos en "veces" las veces ya repetidas
					veces = letras.get(caracter);
					
					// Volvemos a añadir el caracter con la nueva cantidad de veces
					letras.put(caracter, ++veces);
					
					// Si no está, lo añadimos
				} else {
					
					// Insertamos el caracter con valor 1
					letras.put(caracter, 1);
					
				}
				
			}
			
		}
		
		// Mostramos "letras"
		System.out.println(letras);

	}

}
