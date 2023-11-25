package models;

public class Empleado extends Persona {

    private int idEmpleado;
    private String rol;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(Empleado empleado) {
        super(empleado.getNroDocumento(), empleado.getNombre(), empleado.getApellidos(), empleado.getSexo(), empleado.getEdad(), empleado.getTelefono(), empleado.getEstado(), empleado.getFechaCreado(), empleado.getFechaActualizado());
        this.rol = empleado.getRol();
        this.sueldo = empleado.getSueldo();
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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
