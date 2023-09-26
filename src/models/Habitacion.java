package models;

public class Habitacion {

    private int idHabitacion;
    private String descripcion;
    private String tipo;
    private double precio;
    private String estado;

    public Habitacion() {
    }

    public Habitacion(Habitacion habitacion) {
        this.descripcion = habitacion.getDescripcion();
        this.tipo = habitacion.getTipo();
        this.precio = habitacion.getPrecio();
        this.estado = habitacion.getEstado();
    }

    public double calcularPrecioBase() {
        double precioBase = 0;
        if (tipo.equalsIgnoreCase("simple")) {
            precioBase = 30;
        } else if (tipo.equalsIgnoreCase("matrimonial")) {
            precioBase = 40;
        } else {
            precioBase = 50;
        }
        return precioBase;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
