package controllers;

import java.beans.PropertyVetoException;
import views.ViewMenuPrincipal;

public class Main {

    public static void main(String[] args) throws PropertyVetoException {
        ViewMenuPrincipal viewMenuPrincipal = new ViewMenuPrincipal();// Crear objeto del JFrame principal
        viewMenuPrincipal.setExtendedState(ViewMenuPrincipal.MAXIMIZED_BOTH);
        viewMenuPrincipal.setVisible(true);// Visualizar frame
    }

    public static void test() {
        // Test
    }
}
