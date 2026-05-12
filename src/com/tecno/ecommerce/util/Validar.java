package com.tecno.ecommerce.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.tecno.ecommerce.exception.PrecioNegativoException;
import com.tecno.ecommerce.exception.StockInsuficienteException;

public class Validar {

	// Validar que la entrada del usuario sea un número entero
	public static int validarEntero(Scanner sc, String mensaje) {
		int numero;
		while (true) {
			System.out.println(mensaje);
			try {
				numero = sc.nextInt();
				sc.nextLine();
				return numero;
			} catch (InputMismatchException e) {
				System.out.println("Entrada no válida. Ingrese el número de opción correcto.");
				sc.nextLine();
			}
		}
	}

	// Validar que el nombre no este vacio
	public static void validarNombre(String nombre) {
		if (nombre == null || nombre.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío.");
		}
	}

	// Validar que la categoría no este vacia
	public static void validarCategoria(String categoria) {
		if (categoria == null || categoria.trim().isEmpty()) {
			throw new IllegalArgumentException("La categoría no puede estar vacía.");
		}
	}

	// Validar que la descripción no este vacia
	public static void validarDescripcion(String descripcion) {
		if (descripcion == null || descripcion.trim().isEmpty()) {
			throw new IllegalArgumentException("La descripción no puede estar vacía.");
		}
	}

	// Validar que el precio sea un número positivo
	public static void validarPrecio(double precio) {
		if (precio < 0) {
			throw new PrecioNegativoException("El precio no puede ser negativo.");
		}
	}

	// Validar que el stock sea positivo
	public static void validarStock(int stock) {
		if (stock < 0) {
			throw new StockInsuficienteException("El stock no puede ser negativo.");
		}
	}

	// comprobar que se ingresen números enteros
	public static int leerEntero(Scanner sc, String mensaje) {
		int numero;
		while (true) {
			System.out.println(mensaje);
			try {
				numero = sc.nextInt();
				sc.nextLine();
				return numero;
			} catch (InputMismatchException e) {
				System.out.println("Entrada no válida. Ingrese un número entero.");
				sc.nextLine();
			}
		}
	}

	// comprobar que se ingresen números decimales
	public static double leerDecimal(Scanner sc, String mensaje) {
		double numero;
		while (true) {
			System.out.println(mensaje);
			try {
				numero = sc.nextDouble();
				sc.nextLine();
				return numero;
			} catch (InputMismatchException e) {
				System.out.println("Entrada no válida. Ingrese un número decimal.");
				sc.nextLine();
			}
		}
	}

	// leer cadenas de texto (String)
	public static String leerString(Scanner sc, String mensaje) {
		String texto;
		System.out.println(mensaje);
		texto = sc.nextLine();
		return texto;
	}
}
