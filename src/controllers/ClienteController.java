package controllers;

import models.Cliente;

public class ClienteController {

    public Cliente crearCliente() {
        Cliente cliente = new Cliente(0, 0, "", "", "", 0, "", 0);
        return cliente;
    }

    public Cliente actualizarCliente() {
        Cliente cliente = new Cliente(0, 0, "", "", "", 0, "", 0);
        return cliente;
    }

    public void eliminarCliente(int codigo) {
        Cliente cliente = new Cliente(0, 0, "", "", "", 0, "", 0);
    }
}
