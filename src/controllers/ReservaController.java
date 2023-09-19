/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.Reserva;

public class ReservaController {

    Reserva oReserva;

    public void crearReserva(Reserva reserva) {
        oReserva = new Reserva(reserva);
        oReserva.setIdReserva(1);
    }

    public String mostrarInfo() {
        return "Reserva: " + oReserva.getIdReserva()
                + "Cliente: " + oReserva.getIdCliente()
                + "\tHabitacion: " + oReserva.getIdHabitacion()
                + "\tEmpleado: " + oReserva.getIdEmpleado()
                + "\tTipo: " + oReserva.getTipo()
                + "\tEstado: " + oReserva.getEstado()
                + "\tFecha de reserva: " + oReserva.getFechaReservado()
                + "\tFecha de ingreso: " + oReserva.getFechaIngreso()
                + "\tFecha de salida: " + oReserva.getFechaSalida() + " \n";
    }

}
