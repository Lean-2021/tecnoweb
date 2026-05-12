package com.tecno.ecommerce;

import java.util.Scanner;

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

                    default:
                        break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

        } while (opcionSeleccionada != 9);

    }
}
