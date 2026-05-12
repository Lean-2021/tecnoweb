package com.tecno.ecommerce;

import java.util.Scanner;

import com.tecno.ecommerce.ui.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu(new Scanner(System.in), 0);
        menu.mostrarMenu();
    }
}
