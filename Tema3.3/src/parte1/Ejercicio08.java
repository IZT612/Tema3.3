package parte1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<String, String> cuentas = new HashMap<>();

		int opcion = 0;

		String usuario;

		String contraseña;

		int intentos = 3;

		boolean logeado = false;

		boolean nombreRegistrado = false;

		System.out.println("Introduzca la opción que quiere escoger");
		System.out.println();
		System.out.println("1. Registrarse");
		System.out.println("2. Login");
		System.out.println("3. Salir de la cuenta");
		System.out.println("0. Salir del programa");

		opcion = sc.nextInt();
		sc.nextLine();
		System.out.println();

		while (opcion != 0) {

			switch (opcion) {

			case 1 -> {

				if (!logeado) {

					do {

						System.out.println("Introduzca un nombre para su cuenta");
						usuario = sc.nextLine();

						if (cuentas.containsKey(usuario)) {

							System.out.println("Este usuario ya está registrado");
							nombreRegistrado = true;

						} else {

							nombreRegistrado = false;

						}

					} while (nombreRegistrado);

					System.out.println("Ahora la contraseña");
					contraseña = sc.nextLine();

					cuentas.put(usuario, contraseña);

				} else {

					System.out.println("Ya está logeado");

				}

			}

			case 2 -> {

				if (!logeado) {

					do {

						System.out.println("Introduzca su usuario");
						usuario = sc.nextLine();

						System.out.println("Introduzca su contraseña");
						contraseña = sc.nextLine();

						if (!contraseña.equals(cuentas.get(usuario))) {

							System.out.println("La contraseña introducida es incorrecta");
							intentos--;
							System.out.println("Tiene " + intentos + " intentos restantes");

						} else {

							System.out.println("Ha accedido al área restringida");
							System.out.println();
							logeado = true;

						}

					} while (!logeado && intentos > 0);

				} else {

					System.out.println("Ya está logeado");

				}

			}
			
			case 3 -> {
				
				if (!logeado) {
					
					System.out.println("Primero debe estar logeado en una cuenta");
					System.out.println();
					
				} else {
					
					System.out.println("Ha salido de su cuenta exitosamente");
					System.out.println();
					logeado = false;
					
				}
				
			}

			}

			System.out.println("Introduzca la opción que quiere escoger");
			System.out.println();
			System.out.println("1. Registrarse");
			System.out.println("2. Login");
			System.out.println("3. Salir de la cuenta");
			System.out.println("0. Salir del programa");

			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();

		}

		System.out.println("Has salido del programa");

		sc.close();

	}

}
