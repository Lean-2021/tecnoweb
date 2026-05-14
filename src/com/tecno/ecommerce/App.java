package com.tecno.ecommerce;

import java.util.Scanner;

import com.tecno.ecommerce.exception.PrecioNegativoException;
import com.tecno.ecommerce.exception.ProductoNoDisponibleException;
import com.tecno.ecommerce.exception.StockInsuficienteException;
import com.tecno.ecommerce.service.ProductoService;
import com.tecno.ecommerce.ui.Menu;
import com.tecno.ecommerce.util.Validar;

public class App {
    public static void main(String[] args) throws Exception {

        ProductoService productoService = new ProductoService();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(sc, productoService);

        int opcionSeleccionada;

        do {
            menu.mostrarMenu();
            opcionSeleccionada = Validar.validarEntero(sc, "Seleccione una opción: ");

            try {
                switch (opcionSeleccionada) {
                    case 1:
                        menu.listarProductos();
                        break;
                    case 2:
                        menu.buscarProductoPorId();
                        break;
                    case 3:
                        menu.agregarProducto();
                        break;
                    case 4:
                        menu.actualizarProducto();
                        break;
                    case 5:
                        menu.eliminarProducto();
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                        break;
                }
            } catch (ProductoNoDisponibleException | StockInsuficienteException | PrecioNegativoException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Dato incorrecto: " + e.getMessage());
            }

        } while (opcionSeleccionada != 9);

    }
}
