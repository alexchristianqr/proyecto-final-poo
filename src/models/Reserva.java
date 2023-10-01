package models;

public class Reserva {

    private int idReserva;
    private int idCliente;
    private Cliente cliente;
    private int idHabitacion;
    private Habitacion habitacion;
    private int idEmpleado;
    private Empleado empleado;
    private String tipo;
    private String estado;
    private String fechaCreado;
    private String fechaActualizado;
    private String fechaReservado, fechaIngreso, fechaSalida;
    private double costoTotal;

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
        this.cliente = reserva.cliente;
        this.habitacion = reserva.habitacion;
        this.empleado = reserva.empleado;
        this.costoTotal = reserva.costoTotal;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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
