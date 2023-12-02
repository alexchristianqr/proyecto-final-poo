package controllers;

import core.services.HabitacionService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
import models.Habitacion;

public class HabitacionController extends BaseController<Habitacion, HabitacionService> {

    public HabitacionController() {
        lista.clear();
        service = new HabitacionService();
    }

    public DefaultTableModel listarHabitaciones(String buscar) {
        DefaultTableModel modelo;
        String[] columnNames = {"Código", "Descripción", "Tipo", "Precio", "Estado", "Fecha creado", "Fecha actualizado"};
        Object[] data = new Object[columnNames.length];
        modelo = new DefaultTableModel(null, columnNames);

        for (Habitacion oHabitacion : lista) {
            data[0] = oHabitacion.getIdHabitacion();
            data[1] = oHabitacion.getDescripcion();
            data[2] = oHabitacion.getTipo();
            data[3] = oHabitacion.getPrecio();
            data[4] = oHabitacion.getEstado();
            data[5] = oHabitacion.getFechaCreado();
            data[6] = oHabitacion.getFechaActualizado();
            modelo.addRow(data);
        }

        return modelo;
    }

    public Habitacion crearHabitacion(Habitacion habitacion) {
        Habitacion oHabitacion = new Habitacion(habitacion);
        oHabitacion.setIdHabitacion(idAutoincrementado());
        lista.add(oHabitacion);
        return oHabitacion;
    }

    public Habitacion encontrarHabitacion(int idHabitacion) {
        for (Habitacion oHabitacion : lista) {
            if (oHabitacion.getIdHabitacion() == idHabitacion) {
                return oHabitacion;
            }
        }
        return null;
    }

    public void actualizarHabitacion(Habitacion habitacion) {
        for (Habitacion oHabitacion : lista) {
            if (oHabitacion.getIdHabitacion() == habitacion.getIdHabitacion()) {
                oHabitacion.setDescripcion(habitacion.getDescripcion());
                oHabitacion.setPrecio(habitacion.getPrecio());
                oHabitacion.setTipo(habitacion.getTipo());
                oHabitacion.setEstado(habitacion.getEstado());
                DateTimeFormatter formatoDeFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String fechaActual = LocalDateTime.now().format(formatoDeFecha);
                oHabitacion.setFechaActualizado(fechaActual);
                break;
            }
        }
    }

    public void eliminarHabitacion(int idHabitacion) {
        for (Habitacion oHabitacion : lista) {
            if (oHabitacion.getIdHabitacion() == idHabitacion) {
                lista.remove(oHabitacion);
                break;
            }
        }
    }
}
