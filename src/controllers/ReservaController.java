/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Reserva;

public class ReservaController {

    List<Reserva> lista = new ArrayList<>();

    public DefaultTableModel listarReservas(String buscar) {
        DefaultTableModel modelo;
        String[] columnNames = {"Código", "Cliente", "Habitación", "Empleado", "Tipo", "Estado","Total", "Fecha reserva", "Fecha ingreso", "Fecha salida", "Fecha creado", "Fecha actualizado"};
        Object[] data = new Object[columnNames.length];
        modelo = new DefaultTableModel(null, columnNames);

        for (Reserva oReserva : lista) {
            data[0] = oReserva.getIdReserva();
            data[1] = oReserva.getCliente().getIdCliente();
            data[2] = oReserva.getHabitacion().getIdHabitacion();
            data[3] = oReserva.getEmpleado().getIdEmpleado();
            data[4] = oReserva.getTipo();
            data[5] = oReserva.getEstado();
            data[6] = oReserva.getCostoTotal();
            data[7] = oReserva.getFechaReservado();
            data[8] = oReserva.getFechaIngreso();
            data[9] = oReserva.getFechaSalida();
            data[10] = oReserva.getFechaCreado();
            data[11] = oReserva.getFechaActualizado();
            modelo.addRow(data);
        }

        return modelo;
    }

    private int generarIdReserva() {
        return lista.size() + 1;
    }

    public Reserva crearReserva(Reserva reserva) {
        Reserva oReserva = new Reserva(reserva);
        oReserva.setIdHabitacion(generarIdReserva());
        lista.add(oReserva);
        return oReserva;
    }

//    public String mostrarInfo() {
//        return "Reserva: " + oReserva.getIdReserva()
//                + "Cliente: " + oReserva.getIdCliente()
//                + "\tHabitacion: " + oReserva.getIdHabitacion()
//                + "\tEmpleado: " + oReserva.getIdEmpleado()
//                + "\tTipo: " + oReserva.getTipo()
//                + "\tEstado: " + oReserva.getEstado()
//                + "\tFecha de reserva: " + oReserva.getFechaReservado()
//                + "\tFecha de ingreso: " + oReserva.getFechaIngreso()
//                + "\tFecha de salida: " + oReserva.getFechaSalida() + " \n";
//    }
}
