package views;

import controllers.ClienteController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Cliente;

public class ViewMantenimientoCliente extends javax.swing.JInternalFrame {

    ClienteController clienteController = new ClienteController();
    Cliente cliente, oCliente;
    String accion = null;

    public ViewMantenimientoCliente() {
        initComponents();
        listarClientes();
        deshabilitarFormulario();
    }

    protected final void controlAccionFormulario() {
        switch (accion) {
            case "GUARDAR":
                lblIdCliente.setVisible(false);
                lblIdCliente.setEnabled(false);
                txtIdCliente.setVisible(false);
                txtIdCliente.setEnabled(false);
                btnGuardar.setText("Guardar");
                break;
            case "ACTUALIZAR":
                lblIdCliente.setVisible(true);
                lblIdCliente.setEnabled(false);
                txtIdCliente.setVisible(true);
                txtIdCliente.setEnabled(false);
                btnGuardar.setText("Actualizar");
                break;
            default:
                throw new Error("Error en la acción del formulario");
        }
    }

    protected final void deshabilitarFormulario() {

        lblIdCliente.setVisible(false);
        lblIdCliente.setEnabled(false);
        txtIdCliente.setVisible(false);
        txtIdCliente.setEnabled(false);

        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtDni.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtEdad.setEnabled(false);
        rbnFemenino.setEnabled(false);
        rbnMasculino.setEnabled(false);
        cbxEstado.setEnabled(false);

        // --
        txtNombre.setText(null);
        txtApellidos.setText(null);
        txtDni.setText(null);
        txtTelefono.setText(null);
        txtEdad.setText(null);

        // --
        btnNuevo.setEnabled(true);// Habilitar boton nuevo
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }
    
     protected final void habilitarFormulario() {

        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtDni.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtEdad.setEnabled(true);
        rbnFemenino.setEnabled(true);
        rbnMasculino.setEnabled(true);
        cbxEstado.setEnabled(true);

        // --
        txtNombre.setText(null);
        txtApellidos.setText(null);
        txtDni.setText(null);
        txtTelefono.setText(null);
        txtEdad.setText(null);

        // --
        btnNuevo.setEnabled(false);// Deshabilitar boton nuevo
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    protected final void listarClientes() {
        DefaultTableModel modelo = clienteController.listarClientes("");
        tblListado.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jpanelCrearReserva = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCerrar1 = new javax.swing.JButton();
        rbnFemenino = new javax.swing.JRadioButton();
        rbnMasculino = new javax.swing.JRadioButton();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jpanelListarReservas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblListado = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cliente");

        jpanelCrearReserva.setBackground(new java.awt.Color(255, 204, 204));
        jpanelCrearReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Habitación"));
        jpanelCrearReserva.setToolTipText("");
        jpanelCrearReserva.setAutoscrolls(true);

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

        btnCerrar1.setText("Cerrar");
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnFemenino);
        rbnFemenino.setText("F");

        buttonGroup1.add(rbnMasculino);
        rbnMasculino.setText("M");

        lblIdCliente.setText("Código:");

        txtIdCliente.setText("1234");

        jLabel6.setText("Estado:");

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));

        jLabel1.setText("DNI:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Sexo:");

        jLabel5.setText("Edad:");

        jLabel7.setText("Telefono:");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnCerrar1))
                    .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCrearReservaLayout.createSequentialGroup()
                                    .addComponent(lblIdCliente)
                                    .addGap(72, 72, 72))
                                .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                                    .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                    .addGap(62, 62, 62)))
                            .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(76, 76, 76)))
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                                .addComponent(rbnFemenino)
                                .addGap(18, 18, 18)
                                .addComponent(rbnMasculino))
                            .addComponent(txtTelefono)
                            .addComponent(txtEdad)
                            .addComponent(txtApellidos)
                            .addComponent(txtNombre)
                            .addComponent(txtDni)
                            .addComponent(cbxEstado, 0, 219, Short.MAX_VALUE)
                            .addComponent(txtIdCliente))))
                .addContainerGap())
        );
        jpanelCrearReservaLayout.setVerticalGroup(
            jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCrearReservaLayout.createSequentialGroup()
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCrearReservaLayout.createSequentialGroup()
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbnFemenino)
                            .addComponent(rbnMasculino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnCerrar1))
                .addContainerGap())
        );

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
        tblListado.setShowGrid(false);
        tblListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblListado);

        javax.swing.GroupLayout jpanelListarReservasLayout = new javax.swing.GroupLayout(jpanelListarReservas);
        jpanelListarReservas.setLayout(jpanelListarReservasLayout);
        jpanelListarReservasLayout.setHorizontalGroup(
            jpanelListarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelListarReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelListarReservasLayout.setVerticalGroup(
            jpanelListarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelListarReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jpanelListarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpanelCrearReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelListarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:

        accion = "GUARDAR";
        controlAccionFormulario();
        deshabilitarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        cliente = new Cliente();// Crear instancia
        cliente.setDni(txtDni.getText());
        cliente.setNombre(txtNombre.getText());
        cliente.setApellidos(txtApellidos.getText());
        cliente.setEdad(txtEdad.getText());
        cliente.setTelefono(txtTelefono.getText());
        String sexo;
        if (rbnFemenino.isSelected() == true) {
            sexo = "Femenino";
        } else {
            sexo = "Masculino";
        }
        cliente.setSexo(sexo);
        cliente.setEstado(cbxEstado.getSelectedItem().toString());
        DateTimeFormatter formatoDeFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaActual = LocalDateTime.now().format(formatoDeFecha);
        cliente.setFechaCreado(fechaActual);
        cliente.setFechaActualizado(fechaActual);

        // Guardar cliente
        oCliente = clienteController.crearCliente(cliente);

        // Obtener ID nuevo
        cliente.setIdCliente(oCliente.getIdCliente());

        // Notificar mensaje
        JOptionPane.showMessageDialog(rootPane, "Guardado con éxito");

        // Listar registros
        listarClientes();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:

        accion = "GUARDAR";
        controlAccionFormulario();
        habilitarFormulario();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tblListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadoMouseClicked
        // TODO add your handling code here:

        accion = "ACTUALIZAR";
        controlAccionFormulario();
        habilitarFormulario();

        int fila = tblListado.rowAtPoint(evt.getPoint());

        txtIdCliente.setText(tblListado.getValueAt(fila, 0).toString());
        txtNombre.setText(tblListado.getValueAt(fila, 1).toString());
        txtApellidos.setText(tblListado.getValueAt(fila, 2).toString());
        txtDni.setText(tblListado.getValueAt(fila, 3).toString());
        txtEdad.setText(tblListado.getValueAt(fila, 4).toString());
        String sexo = tblListado.getValueAt(fila, 5).toString();
        if (sexo.equalsIgnoreCase("Femenino")) {
            rbnFemenino.setSelected(true);
        } else if (sexo.equalsIgnoreCase("Masculino")) {
            rbnMasculino.setSelected(true);
        }
        txtTelefono.setText(tblListado.getValueAt(fila, 6).toString());
        cbxEstado.setSelectedItem(tblListado.getValueAt(fila, 7).toString());
    }//GEN-LAST:event_tblListadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel jpanelCrearReserva;
    private javax.swing.JPanel jpanelListarReservas;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JRadioButton rbnFemenino;
    private javax.swing.JRadioButton rbnMasculino;
    private javax.swing.JTable tblListado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
