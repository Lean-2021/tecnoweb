package com.tecno.ecommerce.ui;

import java.util.List;
import java.util.Scanner;

import com.tecno.ecommerce.model.Producto;
import com.tecno.ecommerce.service.ProductoService;
import com.tecno.ecommerce.util.Validar;

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
		System.out.println("*******************************************");
		System.out.println("Lista de productos:");
		List<Producto> productos = productoService.listarProductos();

		if (productos.isEmpty()) {
			System.out.println("No hay productos disponibles.");
			System.out.println("");
		} else {
			for (Producto producto : productos) {
				System.out.println(producto.toString());
			}
		}
	}

	// Agregar un nuevo producto
	public void agregarProducto() {
		System.out.println("******************************************");
		System.out.println("Agregar nuevo producto");
		String nombre = Validar.leerString(sc, "Nombre: ");
		String categoria = Validar.leerString(sc, "Categoría: ");
		String descripcion = Validar.leerString(sc, "Descripción: ");
		double precio = Validar.leerDecimal(sc, "Precio: ");
		int stock = Validar.leerEntero(sc, "Stock: ");

		// se crea la instancia de un nuevo producto con los datos ingresados por el
		// usuario y se agrega a la lista de productos
		Producto nuevoProducto = new Producto(nombre, categoria, descripcion, precio, stock);
		productoService.agregarProducto(nuevoProducto);

		System.out.println("Producto agregado exitosamente.");
	}

	// Buscar un producto por su ID
	public void buscarProductoPorId() {
		System.out.println("******************************************");
		System.out.println("Buscar producto por ID");
		int id = Validar.leerEntero(sc, "Ingrese el ID del producto: ");
		Producto producto = productoService.buscarProductoPorId(id);
		System.out.println("Producto encontrado: " + producto.toString());
	}

	// Actualizar un producto existente
	public void actualizarProducto() {
		System.out.println("******************************************");
		System.out.println("Actualizar producto existente");
		int id = Validar.leerEntero(sc, "Ingrese el ID del producto a actualizar: ");

		// Verificar que el producto existe antes de solicitar los nuevos datos al
		// usuario
		productoService.buscarProductoPorId(id);

		String nombre = Validar.leerString(sc, "Nombre: ");
		String categoria = Validar.leerString(sc, "Categoría: ");
		String descripcion = Validar.leerString(sc, "Descripción: ");
		double precio = Validar.leerDecimal(sc, "Precio: ");
		int stock = Validar.leerEntero(sc, "Stock: ");

		Producto productoActualizado = new Producto(nombre, categoria, descripcion, precio, stock);
		productoService.actualizarProducto(id, productoActualizado);

		System.out.println("Producto actualizado exitosamente.");
	}

	// Eliminar un producto por su ID
	public void eliminarProducto() {
		System.out.println("******************************************");
		System.out.println("Eliminar producto por ID");
		int id = Validar.leerEntero(sc, "Ingrese el ID del producto a eliminar: ");
		productoService.eliminarProducto(id);
		System.out.println("Producto eliminado exitosamente.");
	}

}
