/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.EmpleadoController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Empleado;

/**
 *
 * @author treym
 */
public class ViewMantenimientoEmplead extends javax.swing.JInternalFrame {
    EmpleadoController empleadoController = new EmpleadoController();
    Empleado empleado, oEmpleado;
    String accion = null;
    DefaultTableModel modelo;

    public ViewMantenimientoEmplead() {
        initComponents();
        listarEmpleado();
        deshabilitarFormulario();
    }

    protected final void controlAccionFormulario() {
        switch (accion) {
            case "GUARDAR":
                lblIdEmpleado.setVisible(false);
                lblIdEmpleado.setEnabled(false);
                txtIdEmpleado.setVisible(false);
                txtIdEmpleado.setEnabled(false);
                btnGuardarEmpleado.setText("Guardar");
                break;
            case "ACTUALIZAR":
                lblIdEmpleado.setVisible(true);
                lblIdEmpleado.setEnabled(false);
                txtIdEmpleado.setVisible(true);
                txtIdEmpleado.setEnabled(false);
                btnGuardarEmpleado.setText("Actualizar");
                break;
            default:
                throw new Error("Error en la acción del formulario");
        }
    }

    protected final void deshabilitarFormulario() {

        lblIdEmpleado.setVisible(false);
        lblIdEmpleado.setEnabled(false);
        txtIdEmpleado.setVisible(false);
        txtIdEmpleado.setEnabled(false);

        txtNombreEmpleado.setEnabled(false);
        txtApellidosEmpleado.setEnabled(false);
        txtDniEmpleado.setEnabled(false);
        txtTelefonoEmpleado.setEnabled(false);
        txtEdadEmpleado.setEnabled(false);
        rbnFemeninoEmpleado.setEnabled(false);
        rbnMasculinoEmpleado.setEnabled(false);
        cbxEstadoEmpleado.setEnabled(false);
        txtRol.setEnabled(false);
        txtSueldo.setEnabled(false);
        // --
        txtNombreEmpleado.setText(null);
        txtApellidosEmpleado.setText(null);
        txtDniEmpleado.setText(null);
        txtTelefonoEmpleado.setText(null);
        txtEdadEmpleado.setText(null);

        // --
        btnNuevoEmpleado.setEnabled(true);// Habilitar boton nuevo
        btnGuardarEmpleado.setEnabled(false);
        btnCancelarEmpleado.setEnabled(false);
    }

    protected final void habilitarFormulario() {

        txtNombreEmpleado.setEnabled(true);
        txtApellidosEmpleado.setEnabled(true);
        txtDniEmpleado.setEnabled(true);
        txtTelefonoEmpleado.setEnabled(true);
        txtEdadEmpleado.setEnabled(true);
        rbnFemeninoEmpleado.setEnabled(true);
        rbnMasculinoEmpleado.setEnabled(true);
        cbxEstadoEmpleado.setEnabled(true);
        txtRol.setEnabled(true);
        txtSueldo.setEnabled(true);

        // --
        txtNombreEmpleado.setText(null);
        txtApellidosEmpleado.setText(null);
        txtDniEmpleado.setText(null);
        txtTelefonoEmpleado.setText(null);
        txtEdadEmpleado.setText(null);

        // --
        btnNuevoEmpleado.setEnabled(false);// Deshabilitar boton nuevo
        btnGuardarEmpleado.setEnabled(true);
        btnCancelarEmpleado.setEnabled(true);
    }

    protected final void listarEmpleado() {
        // Obtener modelo de controlador
        modelo = empleadoController.listarEmpleados("");

        // Cargar modelo en dialog
        DialogListadoEmpleados.modelo = modelo;

        tblListadoEmpleado.setModel(modelo);
    }
                     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblIdEmpleado = new javax.swing.JLabel();
        lblDniEmpleado = new javax.swing.JLabel();
        btnNuevoEmpleado = new javax.swing.JButton();
        btnGuardarEmpleado = new javax.swing.JButton();
        btnCancelarEmpleado = new javax.swing.JButton();
        btnCerrarEmpleado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        txtDniEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtApellidosEmpleado = new javax.swing.JTextField();
        txtEdadEmpleado = new javax.swing.JTextField();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        rbnFemeninoEmpleado = new javax.swing.JRadioButton();
        rbnMasculinoEmpleado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        cbxEstadoEmpleado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblListadoEmpleado = new javax.swing.JTable();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Empleados");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));

        lblIdEmpleado.setText("Código:");

        lblDniEmpleado.setText("DNI:");

        btnNuevoEmpleado.setText("Nuevo");
        btnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadoActionPerformed(evt);
            }
        });

        btnGuardarEmpleado.setText("Guardar");
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });

        btnCancelarEmpleado.setText("Cancelar");
        btnCancelarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmpleadoActionPerformed(evt);
            }
        });

        btnCerrarEmpleado.setText("Cerrar");
        btnCerrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarEmpleadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Edad:");

        jLabel7.setText("Teléfono:");

        txtEdadEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadEmpleadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnFemeninoEmpleado);
        rbnFemeninoEmpleado.setText("F");

        buttonGroup1.add(rbnMasculinoEmpleado);
        rbnMasculinoEmpleado.setText("M");

        jLabel1.setText("Rol:");

        jLabel2.setText("Sueldo:");

        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        cbxEstadoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Labora", "No labora" }));

        jLabel8.setText("Estado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdEmpleado)
                            .addComponent(lblDniEmpleado)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxEstadoEmpleado, 0, 155, Short.MAX_VALUE)
                            .addComponent(txtIdEmpleado)
                            .addComponent(txtDniEmpleado)
                            .addComponent(txtNombreEmpleado)
                            .addComponent(txtApellidosEmpleado)
                            .addComponent(txtEdadEmpleado)
                            .addComponent(txtTelefonoEmpleado)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbnFemeninoEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbnMasculinoEmpleado))
                            .addComponent(txtRol)
                            .addComponent(txtSueldo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNuevoEmpleado)
                            .addComponent(btnCancelarEmpleado))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarEmpleado)
                            .addComponent(btnCerrarEmpleado))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdEmpleado)
                            .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDniEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDniEmpleado))
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbnFemeninoEmpleado)
                            .addComponent(rbnMasculinoEmpleado)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(txtEdadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEstadoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoEmpleado)
                    .addComponent(btnGuardarEmpleado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarEmpleado)
                    .addComponent(btnCerrarEmpleado))
                .addGap(12, 12, 12))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleados"));

        tblListadoEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        tblListadoEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListadoEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblListadoEmpleado);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListadoEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadoEmpleadoMouseClicked
        // TODO add your handling code here:

        accion = "ACTUALIZAR";
        controlAccionFormulario();
        habilitarFormulario();

        int fila = tblListadoEmpleado.rowAtPoint(evt.getPoint());

        txtIdEmpleado.setText(tblListadoEmpleado.getValueAt(fila, 0).toString());
        txtNombreEmpleado.setText(tblListadoEmpleado.getValueAt(fila, 1).toString());
        txtApellidosEmpleado.setText(tblListadoEmpleado.getValueAt(fila, 2).toString());
        txtDniEmpleado.setText(tblListadoEmpleado.getValueAt(fila, 3).toString());
        txtEdadEmpleado.setText(tblListadoEmpleado.getValueAt(fila, 4).toString());
        String sexo = tblListadoEmpleado.getValueAt(fila, 5).toString();
        if (sexo.equalsIgnoreCase("Femenino")) {
            rbnFemeninoEmpleado.setSelected(true);
        } else if (sexo.equalsIgnoreCase("Masculino")) {
            rbnMasculinoEmpleado.setSelected(true);
        }
        txtTelefonoEmpleado.setText(tblListadoEmpleado.getValueAt(fila, 6).toString());
        txtRol.setText(tblListadoEmpleado.getValueAt(fila, 7).toString());
        txtSueldo.setText(tblListadoEmpleado.getValueAt(fila, 8).toString());
        cbxEstadoEmpleado.setSelectedItem(tblListadoEmpleado.getValueAt(fila, 9).toString());
    }//GEN-LAST:event_tblListadoEmpleadoMouseClicked

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void txtEdadEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadEmpleadoActionPerformed

    private void btnCerrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarEmpleadoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarEmpleadoActionPerformed

    private void btnCancelarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmpleadoActionPerformed
        // TODO add your handling code here:
        accion = "GUARDAR";
        controlAccionFormulario();
        deshabilitarFormulario();
    }//GEN-LAST:event_btnCancelarEmpleadoActionPerformed

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
        // TODO add your handling code here:
        empleado = new Empleado();// Crear instancia
        empleado.setDni(txtDniEmpleado.getText());
        empleado.setNombre(txtNombreEmpleado.getText());
        empleado.setApellidos(txtApellidosEmpleado.getText());
        empleado.setEdad(txtEdadEmpleado.getText());
        empleado.setTelefono(txtTelefonoEmpleado.getText());
        empleado.setEstado(cbxEstadoEmpleado.getSelectedItem().toString());
        String sexo;
        if (rbnFemeninoEmpleado.isSelected() == true) {
            sexo = "Femenino";
        } else {
            sexo = "Masculino";
        }
        empleado.setSexo(sexo);
        empleado.setRol(txtRol.getText());
        empleado.setSueldo((Double.parseDouble(txtSueldo.getText())));
        DateTimeFormatter formatoDeFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaActual = LocalDateTime.now().format(formatoDeFecha);
        empleado.setFechaCreado(fechaActual);
        empleado.setFechaActualizado(fechaActual);

        // Guardar cliente
        oEmpleado = empleadoController.crearEmpleado(empleado);

        // Obtener ID nuevo
        empleado.setIdEmpleado(oEmpleado.getIdEmpleado());

        // Notificar mensaje
        JOptionPane.showMessageDialog(rootPane, "Guardado con éxito");

        // Listar registros
        listarEmpleado();
    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed
        // TODO add your handling code here:
        accion = "GUARDAR";
        controlAccionFormulario();
        habilitarFormulario();
    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEmpleado;
    private javax.swing.JButton btnCerrarEmpleado;
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JButton btnNuevoEmpleado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxEstadoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDniEmpleado;
    private javax.swing.JLabel lblIdEmpleado;
    private javax.swing.JRadioButton rbnFemeninoEmpleado;
    private javax.swing.JRadioButton rbnMasculinoEmpleado;
    private javax.swing.JTable tblListadoEmpleado;
    private javax.swing.JTextField txtApellidosEmpleado;
    private javax.swing.JTextField txtDniEmpleado;
    private javax.swing.JTextField txtEdadEmpleado;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefonoEmpleado;
    // End of variables declaration//GEN-END:variables
}
