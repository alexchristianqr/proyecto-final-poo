package controllers;

import javax.swing.table.DefaultTableModel;
import models.Cliente;

public interface ClienteControllerInterface {
    DefaultTableModel listarClientes(String buscar);
    Cliente crearCliente(Cliente cliente);
}
