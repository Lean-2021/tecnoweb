package com.tecno.ecommerce.exception;

public class PrecioNegativoException extends RuntimeException {
	public PrecioNegativoException(String mensaje) {
		super(mensaje);
	}
}
