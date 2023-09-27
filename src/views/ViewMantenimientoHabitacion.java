/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import controllers.HabitacionController;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Habitacion;

/**
 *
 * @author alex
 */
public class ViewMantenimientoHabitacion extends javax.swing.JInternalFrame {

    HabitacionController habitacionController = new HabitacionController();
    Habitacion habitacion, oHabitacion;
    String accion = null;

    /**
     * Creates new form ViewMantenimientoHabitacion
     */
    public ViewMantenimientoHabitacion() {
        initComponents();
        listarHabitaciones("");
        deshabilitarFormulario();
    }

    protected final void controlAccionFormulario() {
        switch (accion) {
            case "GUARDAR":
                lblIdHabitacion.setVisible(false);
                lblIdHabitacion.setEnabled(false);
                txtIdHabitacion.setVisible(false);
                txtIdHabitacion.setEnabled(false);
                btnGuardar.setText("Guardar");
                break;
            case "ACTUALIZAR":
                lblIdHabitacion.setVisible(true);
                lblIdHabitacion.setEnabled(false);
                txtIdHabitacion.setVisible(true);
                txtIdHabitacion.setEnabled(false);
                btnGuardar.setText("Actualizar");
                break;
            default:
                throw new Error("Error en la acción del formulario");
        }
    }

    protected final void deshabilitarFormulario() {

        lblIdHabitacion.setVisible(false);
        lblIdHabitacion.setEnabled(false);
        txtIdHabitacion.setVisible(false);
        txtIdHabitacion.setEnabled(false);

        txtDescripcion.setEnabled(false);
        cbxTipo.setEnabled(false);
        txtPrecio.setEnabled(false);
        cbxEstado.setEnabled(false);

        // --
        txtDescripcion.setText(null);
        txtPrecio.setText(null);

        // --
        btnNuevo.setEnabled(true);// Habilitar boton nuevo
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    protected final void habilitarFormulario() {

        txtDescripcion.setVisible(true);
        cbxTipo.setVisible(true);
        txtPrecio.setVisible(true);
        cbxEstado.setVisible(true);

        // --
        txtDescripcion.setEnabled(true);
        cbxTipo.setEnabled(true);
        txtPrecio.setEnabled(true);
        cbxEstado.setEnabled(true);

        // --
        txtDescripcion.setText(null);
        txtPrecio.setText(null);

        // --
        btnNuevo.setEnabled(false);// Deshabilitar boton nuevo
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    protected final void listarHabitaciones(String buscar) {
        DefaultTableModel modelo;
        modelo = habitacionController.listarHabitaciones(buscar);
        tblListado.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelListarReservas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListado = new javax.swing.JTable();
        jpanelCrearReserva = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        cbxEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblIdHabitacion = new javax.swing.JLabel();
        txtIdHabitacion = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jpanelListarReservas.setBackground(new java.awt.Color(255, 255, 204));
        jpanelListarReservas.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Habitaciones"));
        jpanelListarReservas.setPreferredSize(new java.awt.Dimension(600, 121));

        tblListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblListado);

        javax.swing.GroupLayout jpanelListarReservasLayout = new javax.swing.GroupLayout(jpanelListarReservas);
        jpanelListarReservas.setLayout(jpanelListarReservasLayout);
        jpanelListarReservasLayout.setHorizontalGroup(
            jpanelListarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelListarReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelListarReservasLayout.setVerticalGroup(
            jpanelListarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelListarReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jpanelCrearReserva.setBackground(new java.awt.Color(255, 204, 204));
        jpanelCrearReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Habitación"));
        jpanelCrearReserva.setToolTipText("");
        jpanelCrearReserva.setAutoscrolls(true);

        jLabel3.setText("Descripción");

        txtDescripcion.setText("Cama de 2 plazas y agua caliente");

        jLabel4.setText("Tipo");

        jLabel5.setText("Estado:");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Suite Presidencial", "Suite Matrimonial", "Luna de Miel" }));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Reservado", "Prestado" }));

        jLabel6.setText("Precio");

        txtPrecio.setText("229");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblIdHabitacion.setText("Código:");

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
                        .addComponent(btnCerrar))
                    .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(lblIdHabitacion))
                        .addGap(58, 58, 58)
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio)
                            .addComponent(cbxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdHabitacion))))
                .addContainerGap())
        );
        jpanelCrearReservaLayout.setVerticalGroup(
            jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdHabitacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnCerrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelCrearReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelListarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpanelListarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jpanelCrearReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        habitacion = new Habitacion();// Crear instancia
        habitacion.setDescripcion(txtDescripcion.getText());
        habitacion.setTipo(cbxTipo.getSelectedItem().toString());
        habitacion.setPrecio(Double.parseDouble(txtPrecio.getText()));
        habitacion.setEstado(cbxEstado.getSelectedItem().toString());

        if (accion.equals("GUARDAR")) {
            // Guardar habitación
            oHabitacion = habitacionController.crearHabitacion(habitacion);

            // Obtener ID nuevo
            habitacion.setIdHabitacion(oHabitacion.getIdHabitacion());

            // Notificar mensaje
            JOptionPane.showMessageDialog(rootPane, "Guardado con éxito");

            // Listar registros
            listarHabitaciones("");

            // Reiniciar formulario
            deshabilitarFormulario();
        } else if (accion.equals("ACTUALIZAR")) {
            // Obtener ID guardado
            habitacion.setIdHabitacion(Integer.parseInt(txtIdHabitacion.getText()));

            // Actualizar habitación
            habitacionController.actualizarHabitacion(habitacion);

            // Notificar mensaje
            JOptionPane.showMessageDialog(rootPane, "Actualizado con éxito");

            // Listar registros
            listarHabitaciones("");

            // Reiniciar formulario
            deshabilitarFormulario();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void tblListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadoMouseClicked
        // TODO add your handling code here:

        accion = "ACTUALIZAR";
        controlAccionFormulario();
        habilitarFormulario();

        int fila = tblListado.rowAtPoint(evt.getPoint());

        txtIdHabitacion.setText(tblListado.getValueAt(fila, 0).toString());
        txtDescripcion.setText(tblListado.getValueAt(fila, 1).toString());
        cbxTipo.setSelectedItem(tblListado.getValueAt(fila, 2).toString());
        txtPrecio.setText(tblListado.getValueAt(fila, 3).toString());
        cbxEstado.setSelectedItem(tblListado.getValueAt(fila, 4).toString());

    }//GEN-LAST:event_tblListadoMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:

        accion = "GUARDAR";
        controlAccionFormulario();
        habilitarFormulario();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:

        accion = "GUARDAR";
        controlAccionFormulario();
        deshabilitarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanelCrearReserva;
    private javax.swing.JPanel jpanelListarReservas;
    private javax.swing.JLabel lblIdHabitacion;
    private javax.swing.JTable tblListado;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdHabitacion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
