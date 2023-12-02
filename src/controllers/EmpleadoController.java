package controllers;

import core.services.EmpleadoService;
import javax.swing.table.DefaultTableModel;
import models.Empleado;

public class EmpleadoController extends BaseController<Empleado, EmpleadoService> implements EmpleadoControllerInterface {

    public EmpleadoController() {
        lista.clear();
        service = new EmpleadoService();
    }

    @Override
    public DefaultTableModel listarEmpleados(String buscar) {
        DefaultTableModel modelo;
        String[] columnNames = {"Código", "Nombres", "Apellidos", "DNI", "Edad", "Sexo", "Telefono", "Rol", "Sueldo", "Estado", "Fecha creado", "Fecha actualizado"};
        Object[] data = new Object[columnNames.length];
        modelo = new DefaultTableModel(null, columnNames);

        for (Empleado oEmpleado : lista) {
            data[0] = oEmpleado.getIdEmpleado();
            data[1] = oEmpleado.getNombre();
            data[2] = oEmpleado.getApellidos();
            data[3] = oEmpleado.getNroDocumento();
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

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        Empleado oEmpleado = new Empleado(empleado);
        oEmpleado.setIdEmpleado(idAutoincrementado());
        lista.add(oEmpleado);
        return oEmpleado;
    }
}
