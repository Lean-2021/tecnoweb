package com.tecno.ecommerce.model;

public class Producto {

	private int id;
	private String nombre;
	private String categoria;
	private String descripcion;
	private double precio;
	private int stock;

	public Producto(String nombre, String categoria, String descripcion, double precio, int stock) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "{" +
				"ID: " + id + "," +
				"Nombre: " + nombre + "," +
				"Categoría: " + categoria + "," +
				"Descripción: " + descripcion + "," +
				"Precio: $" + precio + "," +
				"Stock: " + stock +
				"}";
	}

}
