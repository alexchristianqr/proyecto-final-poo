/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ReservaController;
import java.util.Calendar;
import java.sql.Date;
import models.Reserva;

/**
 *
 * @author Alex
 */
public class ViewReserva extends javax.swing.JInternalFrame {

    ReservaController reservaController;
    Reserva reserva;
    Calendar calendar;
    int day, month, year;

    /**
     * Creates new form viewReserva
     */
    public ViewReserva() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelCrearReserva = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroHabitacion = new javax.swing.JTextField();
        btnSeleccionarHabitacion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnSeleccionarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxTipoReserva = new javax.swing.JComboBox<>();
        cbxEstadoReserva = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jdateFechaReserva = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jdateFechaIngreso = new com.toedter.calendar.JDateChooser();
        jdateFechaSalida = new com.toedter.calendar.JDateChooser();
        jpanelListarReservas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLista = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Reserva");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jpanelCrearReserva.setBackground(new java.awt.Color(255, 204, 204));
        jpanelCrearReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Reserva de Habitación"));
        jpanelCrearReserva.setForeground(new java.awt.Color(0, 0, 0));
        jpanelCrearReserva.setToolTipText("");
        jpanelCrearReserva.setAutoscrolls(true);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Habitación:");

        txtNumeroHabitacion.setEditable(false);
        txtNumeroHabitacion.setText("202");

        btnSeleccionarHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccionarHabitacion.setText("...");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente:");

        txtCliente.setEditable(false);
        txtCliente.setText("Maria Flores Gallardo");

        btnSeleccionarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccionarCliente.setText("...");

        jLabel3.setText("Empleado:");

        txtEmpleado.setText("Alex Quispe");

        jLabel4.setText("Tipo de reserva:");

        jLabel5.setText("Estado reserva:");

        cbxTipoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por horas", "Por noche", "Por día", "Por semana" }));

        cbxEstadoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Reservado", "Prestado" }));

        jLabel6.setText("Costo:");

        txtCosto.setText("229");

        btnNuevo.setText("Nuevo");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha de reserva:");

        jLabel8.setText("Fecha de ingreso:");

        jLabel9.setText("Fecha de salida:");

        javax.swing.GroupLayout jpanelCrearReservaLayout = new javax.swing.GroupLayout(jpanelCrearReserva);
        jpanelCrearReserva.setLayout(jpanelCrearReservaLayout);
        jpanelCrearReservaLayout.setHorizontalGroup(
            jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnCerrar)
                        .addContainerGap())
                    .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(28, 28, 28)
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumeroHabitacion)
                                    .addComponent(txtCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSeleccionarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSeleccionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCrearReservaLayout.createSequentialGroup()
                                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jdateFechaSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdateFechaIngreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdateFechaReserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxEstadoReserva, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxTipoReserva, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmpleado))
                                .addContainerGap())))))
        );
        jpanelCrearReservaLayout.setVerticalGroup(
            jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeleccionarHabitacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeleccionarCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbxEstadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jdateFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addComponent(jdateFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jdateFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnCerrar))
                .addContainerGap())
        );

        jpanelListarReservas.setBackground(new java.awt.Color(255, 255, 204));
        jpanelListarReservas.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Reservas"));
        jpanelListarReservas.setForeground(new java.awt.Color(0, 0, 0));
        jpanelListarReservas.setPreferredSize(new java.awt.Dimension(600, 121));

        txtLista.setBackground(new java.awt.Color(255, 255, 255));
        txtLista.setColumns(20);
        txtLista.setRows(5);
        jScrollPane1.setViewportView(txtLista);

        javax.swing.GroupLayout jpanelListarReservasLayout = new javax.swing.GroupLayout(jpanelListarReservas);
        jpanelListarReservas.setLayout(jpanelListarReservasLayout);
        jpanelListarReservasLayout.setHorizontalGroup(
            jpanelListarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelListarReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelListarReservasLayout.setVerticalGroup(
            jpanelListarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelListarReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelCrearReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelListarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpanelListarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addComponent(jpanelCrearReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        reserva = new Reserva();
        reserva.setIdCliente(1);
        reserva.setIdHabitacion(1);
        reserva.setIdEmpleado(1);

        calendar = jdateFechaReserva.getCalendar();
//        day = calendar.get(Calendar.DAY_OF_MONTH);
//        month = calendar.get(Calendar.MONTH);
//        year = calendar.get(Calendar.YEAR);
//        reserva.setFechaReservado(new Date(year, month, day));
        reserva.setFechaReservado("12/09/2023 16:11:03");
        System.out.println("aquiii" + reserva.getFechaReservado());

        calendar = jdateFechaIngreso.getCalendar();
//        day = calendar.get(Calendar.DAY_OF_MONTH);
//        month = calendar.get(Calendar.MONTH);
//        year = calendar.get(Calendar.YEAR);
//        reserva.setFechaCreado(new Date(year, month, day));
        reserva.setFechaIngreso("12/09/2023 16:11:03");

        calendar = jdateFechaSalida.getCalendar();
//        day = calendar.get(Calendar.DAY_OF_MONTH);
//        month = calendar.get(Calendar.MONTH);
//        year = calendar.get(Calendar.YEAR);
//        reserva.setFechaActualizado(new Date(year, month, day));
        reserva.setFechaSalida("12/09/2023 16:11:03");

        reserva.setEstado("Disponible");
        reserva.setTipo("Por horas");
        reservaController = new ReservaController();
        String mensaje = reservaController.reservar(reserva);
        txtLista.append(mensaje);

    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSeleccionarCliente;
    private javax.swing.JButton btnSeleccionarHabitacion;
    private javax.swing.JComboBox<String> cbxEstadoReserva;
    private javax.swing.JComboBox<String> cbxTipoReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdateFechaIngreso;
    private com.toedter.calendar.JDateChooser jdateFechaReserva;
    private com.toedter.calendar.JDateChooser jdateFechaSalida;
    private javax.swing.JPanel jpanelCrearReserva;
    private javax.swing.JPanel jpanelListarReservas;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextArea txtLista;
    private javax.swing.JTextField txtNumeroHabitacion;
    // End of variables declaration//GEN-END:variables
}
