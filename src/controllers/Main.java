/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.ViewMenuPrincipal;

public class Main {

    public static void main(String[] args) {
        ViewMenuPrincipal viewMenuPrincipal = new ViewMenuPrincipal();// Crear objeto del JFrame principal
        viewMenuPrincipal.setExtendedState(ViewMenuPrincipal.MAXIMIZED_BOTH);
        viewMenuPrincipal.setVisible(true);// Visualizar frame

        test();
    }

    public static void test() {
        // Metodo no implementado
    }

}
