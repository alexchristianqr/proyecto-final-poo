package controllers;

import models.Cliente;

public class ClienteController {

    public Cliente crearCliente(int codigo, int dni, String nombre, String apellidos, String sexo, int edad, String ciudad, int telefono) {
        Cliente cliente = new Cliente(codigo, dni, nombre, apellidos, sexo, edad, ciudad, telefono);
        return cliente;
    }

//    public Cliente actualizarCliente() {
//        Cliente cliente = new Cliente(0, 0, "", "", "", 0, "", 0);
//        return cliente;
//    }

////    public void eliminarCliente(int codigo) {
////        Cliente cliente = new Cliente(0, 0, "", "", "", 0, "", 0);
////    }
       
    
    public String mostrarCliente(Cliente cliente){
        return "Datos del Cliente\n"+
                "Codigo\t\t: "+ cliente.getCodigo()+
                "DNI\t\t: "+cliente.getDni()+
                "Nombres\t\t: "+cliente.getNombre()+
                "Apellidos\t\t:"+cliente.getApellidos()+
                "Sexo\t\t: "+cliente.getSexo()+
                "Edad\t\t:"+cliente.getEdad()+
                "Ciudad\t\t:"+cliente.getCiudad()+
                "Telefono\t\t:"+cliente.getTelefono();
                       
                
    }
}
