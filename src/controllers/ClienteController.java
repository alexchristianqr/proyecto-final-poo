package controllers;

import core.services.ClienteService;
import javax.swing.table.DefaultTableModel;
import models.Cliente;

public class ClienteController extends BaseController<Cliente, ClienteService> {

    public ClienteController() {
        lista.clear();
        service = new ClienteService();
    }

    public DefaultTableModel listarClientes(String buscar) {
        DefaultTableModel modelo;
        String[] columnNames = {"Código", "Nombres", "Apellidos", "DNI", "Edad", "Sexo", "Telefono", "Estado", "Fecha creado", "Fecha actualizado"};
        Object[] data = new Object[columnNames.length];
        modelo = new DefaultTableModel(null, columnNames);

        modelo = service.listarClientesService(modelo, data);

        return modelo;
    }

    public void crearCliente(Cliente cliente) {
        service.crearClienteService(cliente);
    }

//    public Cliente crearCliente(Cliente cliente) {
//
//        Cliente oCliente = new Cliente(cliente);
//        oCliente.setIdPersona(idAutoincrementado());
//        oCliente.setIdCliente(idAutoincrementado());
//        lista.add(oCliente);
//
//        return oCliente;
//    }
}
