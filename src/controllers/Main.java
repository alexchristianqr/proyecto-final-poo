/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Habitacion;
import views.ViewMenuPrincipal;

public class Main {

    public static void main(String[] args) {
        ViewMenuPrincipal viewMenuPrincipal = new ViewMenuPrincipal();// Crear objeto del JFrame principal
        viewMenuPrincipal.setExtendedState(ViewMenuPrincipal.MAXIMIZED_BOTH); 
        viewMenuPrincipal.setVisible(true);// Visualizar frame
        
        test();
    }

    public static void test() {
        HabitacionController habitacionController = new HabitacionController();

        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("Swite presidencial de 1 cama de 2 plazas");
        habitacion.setPrecio(149.5);
        habitacion.setTipo("Suite");
        habitacionController.crearHabitacion(habitacion);

        Habitacion habitacion2 = new Habitacion();
        habitacion2.setDescripcion("Clasico presidencial de 1 cama de 2 plazas");
        habitacion2.setPrecio(109.75);
        habitacion2.setTipo("Clasico");
        habitacionController.crearHabitacion(habitacion2);

        Habitacion habitacion3 = new Habitacion();
        habitacion3.setDescripcion("Otro presidencial de 1 cama de 2 plazas");
        habitacion3.setPrecio(79.00);
        habitacion3.setTipo("Otro");
        habitacionController.crearHabitacion(habitacion3);

        habitacion3.setDescripcion("Lo cambieeee");
        habitacionController.actualizarHabitacion(3, habitacion3);

//        habitacionController.eliminarHabitacion(1);
//        habitacionController.eliminarHabitacion(2);
//        habitacionController.eliminarHabitacion(3);
        List<Habitacion> lista = habitacionController.listarHabitaciones();

        for (Habitacion habitacion1 : lista) {
            System.out.println(habitacion1.getIdHabitacion());
            System.out.println(habitacion1.getDescripcion());
            System.out.println(habitacion1.getPrecio());
            System.out.println(habitacion1.getTipo());
        }
    }

}
