/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

//import java.sql.PreparedStatement;
//import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Reserva;

/**
 *
 * @author alex
 */
//public class ReservaController extends DatabaseController {
public class ReservaController {

//    private String querySQL = "";
    public String reservar(Reserva reserva) {

        try {
            Reserva oReserva = new Reserva(reserva);
            oReserva.setIdReserva(1);
            System.out.println("El id es: " + oReserva.getIdReserva());
            return reserva.mostrarInfo();
//            querySQL = "";
//            PreparedStatement ps = connection.prepareStatement(querySQL);
//            System.out.println("El id de reserva creada es: " + reserva.getIdReserva());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return null;

    }

}
