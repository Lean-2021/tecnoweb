package com.tecno.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import com.tecno.ecommerce.exception.ProductoNoDisponibleException;
import com.tecno.ecommerce.model.Producto;
import com.tecno.ecommerce.util.Validar;

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
		// Validar antes de guardar el producto si se ingresa texto en nombre, categoría
		// o descripción, si el precio es negativo o si el stock es negativo
		Validar.validarNombre(producto.getNombre());
		Validar.validarCategoria(producto.getCategoria());
		Validar.validarDescripcion(producto.getDescripcion());
		Validar.validarPrecio(producto.getPrecio());
		Validar.validarStock(producto.getStock());

		// se asigna un ID único al producto antes de agregarlo a la lista y luego se
		// incrementa el contador para el próximo producto
		producto.setId(contador_id);
		contador_id++;

		// se agrega el producto a la lista de productos
		productos.add(producto);
	}

	// Buscar un producto por su ID
	public Producto buscarProductoPorId(int id) {
		for (Producto producto : productos) {
			if (producto.getId() == id) {
				return producto;
			}
		}
		throw new ProductoNoDisponibleException("No se encontró un producto con el ID: " + id);

	}

	// Actualizar un producto existente
	public Producto actualizarProducto(int id, Producto productoActualizado) {
		Producto productoExistente = buscarProductoPorId(id);

		// Validar antes de actualizar el producto si se ingresa texto en nombre,
		// categoría
		// o descripción, si el precio es negativo o si el stock es negativo
		Validar.validarNombre(productoActualizado.getNombre());
		Validar.validarCategoria(productoActualizado.getCategoria());
		Validar.validarDescripcion(productoActualizado.getDescripcion());
		Validar.validarPrecio(productoActualizado.getPrecio());
		Validar.validarStock(productoActualizado.getStock());

		// se actualizan los campos del producto existente con los valores del producto
		// actualizado
		productoExistente.setNombre(productoActualizado.getNombre());
		productoExistente.setCategoria(productoActualizado.getCategoria());
		productoExistente.setDescripcion(productoActualizado.getDescripcion());
		productoExistente.setPrecio(productoActualizado.getPrecio());
		productoExistente.setStock(productoActualizado.getStock());

		// se devuelve el producto actualizado
		return productoExistente;
	}

	// Eliminar un producto por su ID
	public void eliminarProducto(int id) {
		Producto productoExistente = buscarProductoPorId(id);
		productos.remove(productoExistente);
	}
}
