/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Empleado;

/**
 *
 * @author alex
 */
public class EmpleadoController {

    List<Empleado> lista = new ArrayList<>();

    private int generarIdEmpleado() {
        return lista.size() + 1;
    }

    public DefaultTableModel listarEmpleado(String buscar) {
        DefaultTableModel modelo;
        String[] columnNames = {"Código", "Nombres", "Apellidos", "DNI", "Edad", "Sexo", "Telefono", "Rol", "Sueldo", "Estado", "Fecha creado", "Fecha actualizado"};
        Object[] data = new Object[columnNames.length];
        modelo = new DefaultTableModel(null, columnNames);

        for (Empleado oEmpleado : lista) {
            data[0] = oEmpleado.getIdEmpleado();
            data[1] = oEmpleado.getNombre();
            data[2] = oEmpleado.getApellidos();
            data[3] = oEmpleado.getDni();
            data[4] = oEmpleado.getEdad();
            data[5] = oEmpleado.getSexo();
            data[6] = oEmpleado.getTelefono();
            data[7] = oEmpleado.getRol();
            data[8] = oEmpleado.getSueldo();
            data[9] = oEmpleado.getEstado();
            data[10] = oEmpleado.getFechaCreado();
            data[11] = oEmpleado.getFechaActualizado();
            modelo.addRow(data);
        }

        return modelo;
    }

    public Empleado crearEmpleado(Empleado empleado) {
        Empleado oEmpleado = new Empleado(empleado);
        oEmpleado.setIdEmpleado(generarIdEmpleado());
        lista.add(oEmpleado);
        return oEmpleado;
    }
}
