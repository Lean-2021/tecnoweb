package com.tecno.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import com.tecno.ecommerce.model.Producto;

public class ProductoService {

	private List<Producto> productos = new ArrayList<>();
	private static int contador_id = 1;

	// Operaciones CRUD para productos

	// Listar todos los productos
	public List<Producto> listarProductos() {
		return productos;
	}

	// Agregar un nuevo producto
	public void agregarProducto(Producto producto) {

		producto.setId(contador_id);
		contador_id++;

		productos.add(producto);
	}
}
