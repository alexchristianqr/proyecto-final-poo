package controllers;

import models.Cliente;

public class ClienteController {

    Cliente cliente;

    public Cliente crearCliente(int codigo, String dni, String nombre, String apellidos, String sexo, String edad, String ciudad, String telefono) {
        cliente = new Cliente(codigo, dni, nombre, apellidos, sexo, edad, ciudad, telefono);
        return cliente;
    }

    public String mostrarInfo() {
        return "Codigo: " + cliente.getCodigo()
                + "\tDNI: " + cliente.getDni()
                + "\tNombres: " + cliente.getNombre()
                + "\tApellidos: " + cliente.getApellidos()
                + "\tSexo: " + cliente.getSexo()
                + "\tEdad: " + cliente.getEdad()
                + "\tCiudad: " + cliente.getCiudad()
                + "\tTelefono: " + cliente.getTelefono();

    }
}
