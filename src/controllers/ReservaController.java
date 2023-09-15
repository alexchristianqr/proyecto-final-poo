/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

//import java.sql.PreparedStatement;
//import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Reserva;

public class ReservaController {

    Reserva oReserva;

    public void reservar(Reserva reserva) {
        oReserva = new Reserva(reserva);
        oReserva.setIdReserva(1);
    }

    public String mostrarInfo() {
        return "Cliente: " + oReserva.getIdCliente()
                + "\t\tHabitacion: " + oReserva.getIdHabitacion()
                + "\t\tEmpleado: " + oReserva.getIdEmpleado()
                + "\t\tTipo: " + oReserva.getTipo()
                + "\t\tEstado: " + oReserva.getEstado()
                + "\t\tFecha de reserva: " + oReserva.getFechaReservado()
                + "\t\tFecha de ingreso: " + oReserva.getFechaIngreso()
                + "\t\tFecha de salida: " + oReserva.getFechaSalida() + " \n";
    }

}
