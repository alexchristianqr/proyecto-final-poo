
package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Reserva {
 
    private int codigo;
    private String tipo;
    private Date fechaIngreso;
    private Date fechaSalida;
    Habitacion habitacion = new Habitacion();  
    
    public Reserva(int codigo, String tipo, Date fechaIngreso, Date fechaSalida) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public Reserva() {
    }

    public long calcularDias(Date fechaIngreso,Date fechaSalida){
        SimpleDateFormat fechaf= new SimpleDateFormat("dd/mm/yyyy");
        long diasTotales= fechaSalida.getTime()-fechaIngreso.getTime();
        TimeUnit unidad=TimeUnit.DAYS;
        long dias =unidad.convert(diasTotales, TimeUnit.MILLISECONDS);
        return dias;
    }
    
    public double calcularCosto(long dias){
          double costo=0;
        costo =dias * habitacion.calcularPrecioBase();
        return costo;
    }
 
    public String mostrarInfo(){
        long dias = calcularDias(fechaIngreso, fechaSalida);
        return //"Reserva : \n"+
//                "Nombre de cliente: "+ 
//                "Apellido de cliente"+
                "Tipo de habitacion"+ habitacion.getTipo()+
                "Costo por habitacion"+habitacion.calcularPrecioBase()+
                "Fecha de ingreso"+fechaIngreso+
                "Fecha de salida"+fechaSalida+
                "Cantidad de dias"+ calcularDias(fechaIngreso, fechaSalida)+               
                "Costo Total"+ calcularCosto(dias)+ "\n"  ;
       
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
}
