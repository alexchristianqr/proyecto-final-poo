package views;

import com.toedter.calendar.JDateChooser;
import controllers.ReservaController;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Cliente;
import models.Empleado;
import models.Habitacion;
import models.Reserva;

public class ViewReserva extends javax.swing.JInternalFrame {

    static Cliente cliente = null;
    static Habitacion habitacion = null;
    static Empleado empleado = null;

    DialogListadoHabitaciones dialogListadoHabitaciones = new DialogListadoHabitaciones();
    DialogListadoClientes dialogListadoClientes = new DialogListadoClientes();
    DialogListadoEmpleados dialogListadoEmpleados = new DialogListadoEmpleados();
    ReservaController reservaController = new ReservaController();
    Reserva reserva, oReserva;
    String accion = null;
    Calendar calendar;

    /**
     * Creates new form viewReserva
     */
    public ViewReserva() {
        initComponents();
        listarReservas();
        deshabilitarFormulario();
    }

    static void refreshView() {
        if (habitacion != null) {
            txtNumeroHabitacion.setText("P." + habitacion.getNivel() + " - N°" + habitacion.getNumeroPiso());
        }

        if (cliente != null) {
            txtCliente.setText(cliente.getNombre());
        }

        if (empleado != null) {
            txtEmpleado.setText(empleado.getNombre());
        }
    }

    protected final void controlAccionFormulario() {
        switch (accion) {
            case "GUARDAR":
                lblIdReserva.setVisible(false);
                txtIdReserva.setVisible(false);
                txtIdReserva.setEnabled(false);

//                btnSeleccionarCliente.setEnabled(false);
//                btnSeleccionarEmpleado.setEnabled(false);
//                btnSeleccionarHabitacion.setEnabled(false);
//                txtCliente.setEnabled(false);
//                txtEmpleado.setEnabled(false);
//                txtNumeroHabitacion.setEnabled(false);
                btnGuardar.setText("Guardar");
                break;
            case "ACTUALIZAR":
                lblIdReserva.setVisible(true);
                txtIdReserva.setVisible(true);
                txtIdReserva.setEnabled(false);
                btnGuardar.setText("Actualizar");
                break;
            default:
                throw new Error("Error en la acción del formulario");
        }
    }

    protected final void deshabilitarFormulario() {

        lblIdReserva.setVisible(false);
        txtIdReserva.setVisible(false);
        txtIdReserva.setEnabled(false);
        // --
        txtCliente.setEnabled(false);
        txtEmpleado.setEnabled(false);
        txtNumeroHabitacion.setEnabled(false);
        txtTiempoReservado.setEnabled(false);
        txtCosto.setEnabled(false);
        cbxTipoReserva.setEnabled(false);
        cbxEstadoReserva.setEnabled(false);
        btnSeleccionarCliente.setEnabled(false);
        btnSeleccionarEmpleado.setEnabled(false);
        btnSeleccionarHabitacion.setEnabled(false);
        jdateFechaReserva.setEnabled(false);
        jdateFechaIngreso.setEnabled(false);
        jdateFechaSalida.setEnabled(false);
        // --
        btnNuevo.setEnabled(true);// Habilitar boton nuevo
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    protected final void habilitarFormulario() {

        txtCliente.setEnabled(true);
        txtEmpleado.setEnabled(true);
        txtNumeroHabitacion.setEnabled(true);
        txtTiempoReservado.setEnabled(true);
        txtCosto.setEnabled(true);
        cbxTipoReserva.setEnabled(true);
        cbxEstadoReserva.setEnabled(true);
        btnSeleccionarCliente.setEnabled(true);
        btnSeleccionarEmpleado.setEnabled(true);
        btnSeleccionarHabitacion.setEnabled(true);
        jdateFechaReserva.setEnabled(true);
        jdateFechaIngreso.setEnabled(true);
        jdateFechaSalida.setEnabled(true);

        // --
        btnNuevo.setEnabled(false);// Deshabilitar boton nuevo
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    protected final void listarReservas() {
        DefaultTableModel modelo = reservaController.listarReservas("");
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
        btnSeleccionarEmpleado = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTiempoReservado = new javax.swing.JTextField();
        lblIdReserva = new javax.swing.JLabel();
        txtIdReserva = new javax.swing.JTextField();
        jpanelListarReservas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListado = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reserva");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1200, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jpanelCrearReserva.setBackground(new java.awt.Color(255, 153, 102));
        jpanelCrearReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Reserva de Habitación"));
        jpanelCrearReserva.setToolTipText("");
        jpanelCrearReserva.setAutoscrolls(true);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Habitación:");

        txtNumeroHabitacion.setEditable(false);

        btnSeleccionarHabitacion.setText("...");
        btnSeleccionarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarHabitacionActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente:");

        txtCliente.setEditable(false);

        btnSeleccionarCliente.setText("...");
        btnSeleccionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Empleado:");

        txtEmpleado.setEditable(false);

        jLabel4.setText("Tipo de reserva:");

        jLabel5.setText("Estado reserva:");

        cbxTipoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "horas", "noche" }));

        cbxEstadoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "disponible", "reservado", "mantenimiento" }));

        jLabel6.setText("Costo:");

        txtCosto.setText("89");

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

        jLabel7.setText("Fecha de reserva:");

        jLabel8.setText("Fecha de entrada:");

        jLabel9.setText("Fecha de salida:");

        btnSeleccionarEmpleado.setText("...");
        btnSeleccionarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEmpleadoActionPerformed(evt);
            }
        });

        jLabel10.setText("Tiempo reservado:");

        txtTiempoReservado.setText("3");
        txtTiempoReservado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoReservadoActionPerformed(evt);
            }
        });

        lblIdReserva.setText("Codigo:");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCrearReservaLayout.createSequentialGroup()
                        .addComponent(lblIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdReserva))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCrearReservaLayout.createSequentialGroup()
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdateFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdateFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxEstadoReserva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCosto)
                            .addComponent(jdateFechaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTiempoReservado, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8)))
                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTipoReserva, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCrearReservaLayout.createSequentialGroup()
                                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumeroHabitacion))
                                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnSeleccionarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCrearReservaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSeleccionarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSeleccionarHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        jpanelCrearReservaLayout.setVerticalGroup(
            jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCrearReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdReserva)
                    .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(btnSeleccionarEmpleado)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTiempoReservado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxEstadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdateFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCrearReservaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addComponent(jdateFechaIngreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jdateFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnCerrar))
                .addContainerGap())
        );

        jpanelListarReservas.setBackground(new java.awt.Color(255, 255, 204));
        jpanelListarReservas.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Reservas"));
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
            .addGroup(jpanelListarReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelListarReservasLayout.setVerticalGroup(
            jpanelListarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelListarReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
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
                .addComponent(jpanelListarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
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

        reserva = new Reserva();// Crear instancia de la clase Reserva
        reserva.setIdCliente(cliente.getIdCliente());// ID del objeto Cliente
        reserva.setIdHabitacion(habitacion.getIdHabitacion());// ID del objeto Habitación
        reserva.setIdEmpleado(empleado.getIdEmpleado());// ID del objeto Empleado
        reserva.setTipo(cbxTipoReserva.getSelectedItem().toString());
        reserva.setTiempoReservado(txtTiempoReservado.getText());
        reserva.setCostoTotal(Double.parseDouble(txtCosto.getText()));
        reserva.setEstado(cbxEstadoReserva.getSelectedItem().toString());

        String formatoDeFecha = "yyyy-MM-dd HH:mm:ss";

        calendar = jdateFechaReserva.getCalendar();
        String fechaReserva = new SimpleDateFormat(formatoDeFecha).format(calendar.getTime());
        reserva.setFechaReservado(fechaReserva);

        calendar = jdateFechaIngreso.getCalendar();
        String fechaEntrada = new SimpleDateFormat(formatoDeFecha).format(calendar.getTime());
        reserva.setFechaEntrada(fechaEntrada);

        calendar = jdateFechaSalida.getCalendar();
        String fechaSalida = new SimpleDateFormat(formatoDeFecha).format(calendar.getTime());
        reserva.setFechaSalida(fechaSalida);

        if (accion.equals("GUARDAR")) {
            // Guardar reserva
            reservaController.crearReserva(reserva);

            // Notificar mensaje
            JOptionPane.showMessageDialog(rootPane, "Guardado con éxito");

            // Listar registros
            listarReservas();

            // Reiniciar formulario
            deshabilitarFormulario();
        } else if (accion.equals("ACTUALIZAR")) {
            // Obtener ID guardado
            reserva.setIdReserva(Integer.parseInt(txtIdReserva.getText()));

            // Actualizar habitación
            reservaController.actualizarReserva(reserva);

            // Notificar mensaje
            JOptionPane.showMessageDialog(rootPane, "Actualizado con éxito");

            // Listar registros
            listarReservas();

            // Reiniciar formulario
            deshabilitarFormulario();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSeleccionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarClienteActionPerformed
        // TODO add your handling code here:

        if (dialogListadoClientes.isVisible()) {
            dialogListadoClientes.toFront();
        } else {
            dialogListadoClientes.setVisible(true);
        }
        dialogListadoClientes.listarClientes();
    }//GEN-LAST:event_btnSeleccionarClienteActionPerformed

    private void btnSeleccionarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarHabitacionActionPerformed
        // TODO add your handling code here:

        if (dialogListadoHabitaciones.isVisible()) {
            dialogListadoHabitaciones.toFront();
        } else {
            dialogListadoHabitaciones.setVisible(true);
        }
        dialogListadoHabitaciones.listarHabitaciones();
    }//GEN-LAST:event_btnSeleccionarHabitacionActionPerformed

    private void btnSeleccionarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEmpleadoActionPerformed
        // TODO add your handling code here:

        if (dialogListadoEmpleados.isVisible()) {
            dialogListadoEmpleados.toFront();
        } else {
            dialogListadoEmpleados.setVisible(true);
        }
        dialogListadoEmpleados.listarHabitaciones();
    }//GEN-LAST:event_btnSeleccionarEmpleadoActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        System.out.println("Tamano en X: " + evt.getComponent().getWidth());
        System.out.println("Tamano en Y: " + evt.getComponent().getHeight());
    }//GEN-LAST:event_formComponentResized

    private void txtTiempoReservadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoReservadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoReservadoActionPerformed

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

    private void tblListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadoMouseClicked
        // TODO add your handling code here:
        accion = "ACTUALIZAR";
        controlAccionFormulario();
        habilitarFormulario();

        int fila = tblListado.rowAtPoint(evt.getPoint());

        txtIdReserva.setText(tblListado.getValueAt(fila, 0).toString());
        txtCliente.setText(tblListado.getValueAt(fila, 1).toString());
        txtEmpleado.setText(tblListado.getValueAt(fila, 2).toString());
        txtNumeroHabitacion.setText(tblListado.getValueAt(fila, 3).toString());

//        int indexTipoReserva = tblListado.getValueAt(fila, 5).toString();
        cbxTipoReserva.setSelectedItem(tblListado.getValueAt(fila, 5).toString());

        txtTiempoReservado.setText(tblListado.getValueAt(fila, 6).toString());

        txtCosto.setText(tblListado.getValueAt(fila, 7).toString());
        cbxEstadoReserva.setSelectedItem(tblListado.getValueAt(fila, 8).toString());

        String formatoDeFecha = "yyyy-MM-dd HH:mm:ss";
        calendar = jdateFechaReserva.getCalendar();
        String fechaReserva = new SimpleDateFormat(formatoDeFecha).format(tblListado.getValueAt(fila, 9).toString());

//        jdateFechaReserva.setDate( calendar);
        jdateFechaIngreso.setDate(new Date(tblListado.getValueAt(fila, 10).toString()));
        jdateFechaSalida.setDate(new Date(tblListado.getValueAt(fila, 11).toString()));
    }//GEN-LAST:event_tblListadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSeleccionarCliente;
    private javax.swing.JButton btnSeleccionarEmpleado;
    private javax.swing.JButton btnSeleccionarHabitacion;
    private javax.swing.JComboBox<String> cbxEstadoReserva;
    private javax.swing.JComboBox<String> cbxTipoReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdateFechaIngreso;
    private com.toedter.calendar.JDateChooser jdateFechaReserva;
    private com.toedter.calendar.JDateChooser jdateFechaSalida;
    private javax.swing.JPanel jpanelCrearReserva;
    private javax.swing.JPanel jpanelListarReservas;
    private javax.swing.JLabel lblIdReserva;
    private javax.swing.JTable tblListado;
    private static javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCosto;
    private static javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtIdReserva;
    private static javax.swing.JTextField txtNumeroHabitacion;
    private javax.swing.JTextField txtTiempoReservado;
    // End of variables declaration//GEN-END:variables
}
