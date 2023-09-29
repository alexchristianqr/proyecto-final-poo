package controllers;

import models.Cliente;

public class ClienteController {

    Cliente oCliente;

    public void crearCliente(Cliente cliente) {
        oCliente = new Cliente(cliente);
        oCliente.setIdCliente(1);
    }

    public String mostrarInfo() {
        return "Id: " + oCliente.getIdCliente()
                + "\tDNI: " + oCliente.getDni()
                + "\tNombres: " + oCliente.getNombre()
                + "\tApellidos: " + oCliente.getApellidos()
                + "\tSexo: " + oCliente.getSexo()
                + "\tEdad: " + oCliente.getEdad()
                + "\tTelefono: " + oCliente.getTelefono() + " \n";

    }
}
