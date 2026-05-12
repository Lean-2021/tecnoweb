package com.tecno.ecommerce.ui;

import java.util.List;
import java.util.Scanner;

import com.tecno.ecommerce.model.Producto;
import com.tecno.ecommerce.service.ProductoService;

public class Menu {

	private final Scanner sc;
	private final ProductoService productoService;

	// Se recibe el servicio correspondiente junto con el Scanner
	public Menu(Scanner sc, ProductoService productoService) {
		this.sc = sc;
		this.productoService = productoService;
	}

	// Mostrar el Menú principal de la aplicación
	public void mostrarMenu() {
		System.out.println("************************************************");
		System.out.println("Bienvenido a TecnoWEB");
		System.out.println("1 - Listar productos");
		System.out.println("2 - Buscar producto por ID");
		System.out.println("3 - Agregar producto");
		System.out.println("4 - Actualizar producto");
		System.out.println("5 - Eliminar producto");
		System.out.println("6 - Listar pedidos");
		System.out.println("7 - Crear pedido");
		System.out.println("8 - Eliminar pedido");
		System.out.println("9 - Salir");
		System.out.println("*************************************************");
	}

	// Listar todos los productos disponibles
	public void listarProductos() {
		System.out.println("Lista de productos:");
		List<Producto> productos = productoService.listarProductos();

		if (productos.isEmpty()) {
			System.out.println("No hay productos disponibles.");
			System.out.println("");
		} else {
			for (Producto producto : productos) {
				System.out.println(producto);
			}
		}
	}

}
