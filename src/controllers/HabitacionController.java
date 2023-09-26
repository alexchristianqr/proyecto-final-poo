/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Habitacion;

/**
 *
 * @author alex
 */
public class HabitacionController {

    List<Habitacion> lista = new ArrayList<>();
    private int totalRegistros;

    public String mostrarInfo(int idHabitacion) {
        Habitacion oHabitacion = encontrarHabitacion(idHabitacion);

        return "ID: " + oHabitacion.getIdHabitacion()
                + "\tDescripcion: " + oHabitacion.getDescripcion()
                + "\tTipo: " + oHabitacion.getTipo()
                + "\tPrecio: " + oHabitacion.getPrecio()
                + "\tEstado: " + oHabitacion.getEstado() + " \n";
    }

    public DefaultTableModel listarHabitaciones(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"Id", "Descripción", "Tipo", "Precio", "Estado"};
        String[] registro = new String[5];
        modelo = new DefaultTableModel(null, titulos);

        totalRegistros = 0;

        try {

            for (Habitacion oHabitacion : lista) {
                registro[0] = Integer.toString(oHabitacion.getIdHabitacion());
                registro[1] = oHabitacion.getDescripcion();
                registro[2] = oHabitacion.getTipo();
                registro[3] = Double.toString(oHabitacion.getPrecio());
                registro[4] = oHabitacion.getEstado();
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registro);
            }

            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public int getNuevoId() {
        return lista.size() + 1;
    }

    public Habitacion crearHabitacion(Habitacion habitacion) {

        Habitacion oHabitacion = new Habitacion(habitacion);
        System.out.println("new ID: " + getNuevoId());
        int newIdHabitacion = getNuevoId();
        oHabitacion.setIdHabitacion(newIdHabitacion);

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
