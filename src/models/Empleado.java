/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Luis
 */
public class Empleado extends Persona {

    String rol;
    double sueldo;

    public Empleado(String dni, String nombre, String apellidos, String sexo, String edad, String ciudad, String telefono, String rol, double sueldo) {
        super(dni, nombre, apellidos, sexo, edad, ciudad, telefono);
        this.rol = rol;
        this.sueldo = sueldo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
