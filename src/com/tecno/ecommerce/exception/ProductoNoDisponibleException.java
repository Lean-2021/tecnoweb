package com.tecno.ecommerce.exception;

public class ProductoNoDisponibleException extends RuntimeException {
	public ProductoNoDisponibleException(String mensaje) {
		super(mensaje);
	}
}
