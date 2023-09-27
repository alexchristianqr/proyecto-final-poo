/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.Button;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import models.Habitacion;

/**
 *
 * @author alex
 */
public class HabitacionController {

    List<Habitacion> lista = new ArrayList<>();

    public DefaultTableModel listarHabitaciones(String buscar) {
        DefaultTableModel modelo;
        String[] columnNames = {"Id", "Descripción", "Tipo", "Precio", "Estado"};
        Object[] data = new Object[columnNames.length];
        modelo = new DefaultTableModel(null, columnNames);

        for (Habitacion oHabitacion : lista) {
            data[0] = oHabitacion.getIdHabitacion();
            data[1] = oHabitacion.getDescripcion();
            data[2] = oHabitacion.getTipo();
            data[3] = oHabitacion.getPrecio();
            data[4] = oHabitacion.getEstado();
            modelo.addRow(data);
        }

        return modelo;
    }

    public int generarIdHabitacion() {
        return lista.size() + 1;
    }

    public Habitacion crearHabitacion(Habitacion habitacion) {
        Habitacion oHabitacion = new Habitacion(habitacion);
        oHabitacion.setIdHabitacion(generarIdHabitacion());
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
