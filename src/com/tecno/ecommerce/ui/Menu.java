package com.tecno.ecommerce.ui;

import java.util.Scanner;

public class Menu {

	private final Scanner sc;
	private final int option;

	// Se recibe el servicio correspondiente junto con el Scanner
	public Menu(Scanner sc, int option) {
		this.sc = sc;
		this.option = option;
	}

	public void mostrarMenu() {
		System.out.println("************************************************");
		System.out.println("Bienvenido a TecnoWEB");
		System.out.println("1 - Listar productos");
	}
}
