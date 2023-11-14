package controllers;

import core.services.IProviderDB;
import core.services.LocalDBService;
import views.ViewMenuPrincipal;

public class Main {

    public static void main(String[] args) {
        ViewMenuPrincipal viewMenuPrincipal = new ViewMenuPrincipal();// Crear objeto del JFrame principal
        viewMenuPrincipal.setExtendedState(ViewMenuPrincipal.MAXIMIZED_BOTH);
        viewMenuPrincipal.setVisible(true);// Visualizar frame

        test();
    }

    public static void test() {
        IProviderDB proveedor = new LocalDBService();
        proveedor.cargarDB();
        String[] midata = {"alex"};
        proveedor.guardarDB(midata);
    }

}
