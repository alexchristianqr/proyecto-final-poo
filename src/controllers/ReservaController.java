package controllers;

import javax.swing.table.DefaultTableModel;
import models.Reserva;

public class ReservaController extends BaseController<Reserva> {

    public DefaultTableModel listarReservas(String buscar) {
        DefaultTableModel modelo;
        String[] columnNames = {"Código", "Cliente", "Habitación", "Empleado", "Tipo", "Estado", "Total", "Fecha reserva", "Fecha ingreso", "Fecha salida", "Fecha creado", "Fecha actualizado"};
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

    public Reserva crearReserva(Reserva reserva) {
        Reserva oReserva = new Reserva(reserva);
        oReserva.setIdHabitacion(idAutoincrementado());
        lista.add(oReserva);
        return oReserva;
    }

}
