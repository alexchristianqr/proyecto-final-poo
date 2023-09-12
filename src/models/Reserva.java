package models;

import java.sql.Date;

public class Reserva {

    private int idReserva;
    private int idCliente;
    private int idHabitacion;
    private int idEmpleado;
    private String tipo;
    private String estado;
//    private Date fechaReservado,fechaCreado,fechaActualizado;
    private String fechaReservado, fechaCreado, fechaActualizado, fechaIngreso, fechaSalida;

    public Reserva() {
    }

    public Reserva(Reserva reserva) {
        this.idCliente = reserva.idCliente;
        this.idHabitacion = reserva.idHabitacion;
        this.idEmpleado = reserva.idEmpleado;
        this.tipo = reserva.tipo;
        this.fechaReservado = reserva.fechaReservado;
        this.fechaIngreso = reserva.fechaIngreso;
        this.fechaSalida = reserva.fechaSalida;
        this.estado = reserva.estado;
    }

    public String mostrarInfo() {
        return "Cliente: " + idCliente
                + "\t\tHabitacion: " + idHabitacion
                + "\t\tEmpleado: " + idEmpleado
                + "\t\tTipo: " + tipo
                + "\t\tEstado: " + estado
                + "\t\tFecha de reserva: " + fechaReservado
                + "\t\tFecha de ingreso: " + fechaIngreso
                + "\t\tFecha de salida: " + fechaSalida + " \n";
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaReservado() {
        return fechaReservado;
    }

    public void setFechaReservado(String fechaReservado) {
        this.fechaReservado = fechaReservado;
    }

    public String getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(String fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public String getFechaActualizado() {
        return fechaActualizado;
    }

    public void setFechaActualizado(String fechaActualizado) {
        this.fechaActualizado = fechaActualizado;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

}
