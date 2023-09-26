/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Habitacion;

/**
 *
 * @author alex
 */
public class HabitacionController {

    List<Habitacion> lista = new ArrayList<>();

    public List<Habitacion> listarHabitaciones() {
        return lista;
    }

    public int getNuevoId() {
        return lista.size() + 1;
    }

    public void crearHabitacion(Habitacion habitacion) {

        Habitacion oHabitacion = new Habitacion(habitacion);
        int newIdHabitacion = getNuevoId();
        oHabitacion.setIdHabitacion(newIdHabitacion);

        lista.add(oHabitacion);
    }

    public Habitacion encontrarHabitacion(int idHabitacion) {

        for (Habitacion oHabitacion : lista) {
            if (oHabitacion.getIdHabitacion() == idHabitacion) {
                return oHabitacion;
            }
        }

        return null;
    }

    public void actualizarHabitacion(int idHabitacion, Habitacion habitacion) {

        for (Habitacion oHabitacion : lista) {
            if (oHabitacion.getIdHabitacion() == idHabitacion) {
                oHabitacion.setDescripcion(habitacion.getDescripcion());
                oHabitacion.setPrecio(habitacion.getPrecio());
                oHabitacion.setTipo(habitacion.getTipo());
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
