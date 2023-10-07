package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Cliente;

public class ClienteController {

    List<Cliente> lista = new ArrayList<>();

    private int generarIdCliente() {
        return lista.size() + 1;
    }

    public DefaultTableModel listarClientes(String buscar) {
        DefaultTableModel modelo;
        String[] columnNames = {"Código", "Nombres", "Apellidos", "DNI", "Edad", "Sexo", "Telefono", "Estado", "Fecha creado", "Fecha actualizado"};
        Object[] data = new Object[columnNames.length];
        modelo = new DefaultTableModel(null, columnNames);

        for (Cliente oCliente : lista) {
            data[0] = oCliente.getIdCliente();
            data[1] = oCliente.getNombre();
            data[2] = oCliente.getApellidos();
            data[3] = oCliente.getDni();
            data[4] = oCliente.getEdad();
            data[5] = oCliente.getSexo();
            data[6] = oCliente.getTelefono();
            data[7] = oCliente.getEstado();
            data[8] = oCliente.getFechaCreado();
            data[9] = oCliente.getFechaActualizado();
            modelo.addRow(data);
        }

        return modelo;
    }

    public Cliente crearCliente(Cliente cliente) {
        Cliente oCliente = new Cliente(cliente);
        oCliente.setIdCliente(generarIdCliente());
        lista.add(oCliente);
        return oCliente;
    }

}
