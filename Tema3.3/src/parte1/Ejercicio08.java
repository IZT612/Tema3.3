package parte1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un HashMap donde guardaremos las cuentas
		HashMap<String, String> cuentas = new HashMap<>();

		// Variable que guarda la opcion escogida por el usuario
		int opcion = 0;

		// Variable String que guarda el nombre de usuario
		String usuario;

		// Variable String que guarda la contraseña 
		String contraseña;

		// Variable entera intentos que guarda cuantos intentos restantes quedan para iniciar sesión correctamente
		int intentos = 3;

		// Variable booleana que guarda si el usuario está logeado
		boolean logeado = false;

		// Variable booleana que guarda si el nombre ya está registrado 
		boolean nombreRegistrado = false;

		// Mostramos todas las opciones
		System.out.println("Introduzca la opción que quiere escoger");
		System.out.println();
		System.out.println("1. Registrarse");
		System.out.println("2. Login");
		System.out.println("3. Salir de la cuenta");
		System.out.println("0. Salir del programa");

		// Guardamos la opcion escogida en "opcion"
		opcion = sc.nextInt();
		sc.nextLine();
		System.out.println();

		// Mientras que la opcion no sea 0 se le preguntará constantemente al usuario
		while (opcion != 0) {

			// Hacemos un switch para hacer algo según la opción escogida
			switch (opcion) {

			// Si es la opción 1 (Registrarse):
			case 1 -> {

				// Si no está logeado
				if (!logeado) {

					// Bucle do-while que se repetirá si el nombre está registrado
					do {

						// Pedimos usuario y lo guardamos en "usuario"
						System.out.println("Introduzca un nombre para su cuenta");
						usuario = sc.nextLine();

						// Si en "cuentas" ya existe ese usuario
						if (cuentas.containsKey(usuario)) {

							// Indicamos que el nombre ya está registrado y ponemos "nombreRegistrado" como true
							System.out.println("Este usuario ya está registrado");
							nombreRegistrado = true;

							// Si no, "nombreRegistrado" se vuelve false
						} else {

							nombreRegistrado = false;

						}

					} while (nombreRegistrado);

					// Pedimos la contraseña y la guardamos en "contraseña"
					System.out.println("Ahora la contraseña");
					contraseña = sc.nextLine();

					// Insertamos el usuario y la contraseña
					cuentas.put(usuario, contraseña);

					// Si está logeado le indicamos que no puede registrarse si ya está logeado
				} else {

					System.out.println("No puede registrarse si ya está logeado");

				}

			}

			// Si ha escodigo el 2: (login):
			case 2 -> {

				// Si no está logeado
				if (!logeado) {

					// Entra a un bucle que se repite si no está logeado y los intentos son mayores a 0
					do {

						// Pedimos el usuario y lo introducimos en "usuario"
						System.out.println("Introduzca su usuario");
						usuario = sc.nextLine();

						// Pedimos la contraseña y la introducimos en "contraseña"
						System.out.println("Introduzca su contraseña");
						contraseña = sc.nextLine();

						// Si la contraseña no es igual a la que está guardada en "cuentas" junto al usuario
						if (!contraseña.equals(cuentas.get(usuario))) {

							// La contraseña es incorrecta, por lo que reducimos intentos y mostramos los intentos restantes
							System.out.println("La contraseña introducida es incorrecta");
							intentos--;
							System.out.println("Tiene " + intentos + " intentos restantes");

							// Si no
						} else {

							// Indicamos que ha accedido al área restringida (se ha logeado) y ponemos logeado como "true"
							System.out.println("Ha accedido al área restringida");
							System.out.println();
							logeado = true;

						}

					} while (!logeado && intentos > 0);

					// Si ya está logeado se lo indicamos
				} else {

					System.out.println("Ya está logeado");

				}

			}
			
			// Si ha escogido el 3 (cerrar sesión):
			case 3 -> {
				
				// Si no está logeado
				if (!logeado) {
					
					// Indicamos que primero tiene que logearse
					System.out.println("Primero debe estar logeado en una cuenta");
					System.out.println();
					
					// Y si lo está:
				} else {
					
					// Indicamos que ha salido de su cuenta y volvemos "logeado" como false
					System.out.println("Ha salido de su cuenta exitosamente");
					System.out.println();
					logeado = false;
					
				}
				
			}

			}

			// Volvemos a mostrar las posibles opciones
			System.out.println("Introduzca la opción que quiere escoger");
			System.out.println();
			System.out.println("1. Registrarse");
			System.out.println("2. Login");
			System.out.println("3. Salir de la cuenta");
			System.out.println("0. Salir del programa");

			// Guardamos la opción escogida en "opcion" 
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();

		}

		// Indicamos que ha salido del programa
		System.out.println("Has salido del programa");

		// Cerramos el scanner
		sc.close();

	}

}
