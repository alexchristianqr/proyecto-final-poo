package models;

public class Habitacion {

    private String tipo;
    private String descripcion;
    private double precio;

    public Habitacion(String tipo, String descripcion, double precio) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
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

    public Habitacion() {
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
}
