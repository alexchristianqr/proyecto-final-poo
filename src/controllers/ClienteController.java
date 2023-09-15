package controllers;

import models.Cliente;

public class ClienteController {

    Cliente cliente;

    public Cliente crearCliente(int codigo, int dni, String nombre, String apellidos, String sexo, int edad, String ciudad, int telefono) {
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
