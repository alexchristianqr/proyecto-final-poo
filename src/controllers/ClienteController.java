package controllers;

import models.Cliente;

public class ClienteController {

    Cliente oCliente;

    public void crearCliente(Cliente cliente) {
        oCliente = new Cliente(cliente);
        oCliente.setIdPersona(1);
    }

    public String mostrarInfo() {
        return "Id: " + oCliente.getCodigo()
                + "\tDNI: " + oCliente.getDni()
                + "\tNombres: " + oCliente.getNombre()
                + "\tApellidos: " + oCliente.getApellidos()
                + "\tSexo: " + oCliente.getSexo()
                + "\tEdad: " + oCliente.getEdad()
                + "\tCiudad: " + oCliente.getCiudad()
                + "\tTelefono: " + oCliente.getTelefono() + " \n";

    }
}
