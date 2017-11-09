package vistas;

import agenciaviaje.Cliente;
import agenciaviaje.Metodo;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame {

    private Metodo misMetodo;

    public void setMetodo(Metodo metodo) {
        misMetodo = metodo;
    }

    public MenuPrincipal() {
        setTitle("MODULO DE RESERVACION");
        setResizable(false);
        this.setLocation(200, 100);

        initComponents();
        this.cabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCliente = new javax.swing.JPanel();
        lblCodigoUnico = new javax.swing.JLabel();
        txtCodigoUnico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNumeroTarjeta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPorFrecuencia = new javax.swing.JTextField();
        txtPorMonto = new javax.swing.JTextField();
        btnNuevoCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtMovil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservacion = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtDireccionHabitacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCodigoUnico.setText("CODIGO UNICO ");

        jLabel1.setText("NOMBRES");

        jLabel2.setText("APELLIDOS");

        jLabel3.setText("TELEFONO");

        jLabel4.setText("NUMERO TARJETA");

        jLabel5.setText("FECHA NACIMIENTO");

        jLabel6.setText("CLASIFICACION");

        jLabel7.setText("POR FRECUENCA");

        jLabel8.setText("POR MONTO");

        txtPorFrecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorFrecuenciaActionPerformed(evt);
            }
        });

        btnNuevoCliente.setText("Nuevo");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        jButton1.setText("RESERVACION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel9.setText("MOVIL");

        tblReservacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblReservacion);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel10.setText("DIRECCION DE HABITACION");

        jLabel11.setText("ULTIMAS CINCO RESERVACIONES");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1))
                        .addGap(51, 51, 51))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                                .addComponent(jLabel5)
                                .addComponent(txtCodigoUnico, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(121, 121, 121))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscar)
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                                .addComponent(jLabel4)
                                                .addComponent(txtApellidos)
                                                .addComponent(txtMovil)
                                                .addGroup(panelClienteLayout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jLabel9))))
                                        .addGap(68, 68, 68)
                                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(txtPorFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(txtPorMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(51, Short.MAX_VALUE))))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(lblCodigoUnico)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(txtDireccionHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPorFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPorMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(lblCodigoUnico)
                        .addGap(1, 1, 1)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoUnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevoCliente)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPorFrecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorFrecuenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorFrecuenciaActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        NuevoCliente nc = new NuevoCliente();
        nc.setVisible(true);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.btnBuscar();
        this.mostrarReservacion();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        this.btnEliminar();
        this.limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        this.btnModificar();
//        this.limpiar();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Reservacion miReservacion = new Reservacion();
        miReservacion.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoUnico;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JTable tblReservacion;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigoUnico;
    private javax.swing.JTextField txtDireccionHabitacion;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtMovil;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroTarjeta;
    private javax.swing.JTextField txtPorFrecuencia;
    private javax.swing.JTextField txtPorMonto;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    
    public void cabeceraTabla() {
        Vector Vcabecera = new Vector();
        Vcabecera.addElement("codigo");
        Vcabecera.addElement("ID paquete");
        Vcabecera.addElement("ID cliente");
        Vcabecera.addElement("fecha reser");
        Vcabecera.addElement("fecha salida");
        Vcabecera.addElement("No dias");
        Vcabecera.addElement("Estado");
        Vcabecera.addElement("saldo pendiente");
        DefaultTableModel miTabla = new DefaultTableModel(Vcabecera, 0);
        tblReservacion.setModel(miTabla);
    }

    public void btnBuscar() {
        String codigo = this.txtCodigoUnico.getText();
        for (int i = 0; i < misMetodo.numeroCliente(); i++) {
            String codigoCliente = misMetodo.getClientes()[i].getCodigoUnico();
            if (codigo.equals(codigoCliente)) {
                this.txtNombres.setText(misMetodo.getClientes()[i].getNombres());
                this.txtApellidos.setText(misMetodo.getClientes()[i].getApellidos());
                this.txtNumeroTarjeta.setText(misMetodo.getClientes()[i].getNumeroTarjeta());
                this.txtFechaNacimiento.setText(misMetodo.getClientes()[i].getFechaNacimiento());
                this.txtTelefono.setText(misMetodo.getClientes()[i].getTelefono());
                this.txtMovil.setText(misMetodo.getClientes()[i].getMovil());
                this.txtDireccionHabitacion.setText(misMetodo.getClientes()[i].getdireccionHabitacion());
                this.txtPorFrecuencia.setText(misMetodo.getClientes()[i].getC_x_frecuencia());
                this.txtPorMonto.setText(misMetodo.getClientes()[i].getC_x_monto());
                break;
            } else {
                if (misMetodo.getClientes()[i].getCodigoUnico().equals("") && codigo.equals(String.valueOf(i))) {
                    JOptionPane.showMessageDialog(null, "EL CLIENTE NO EXISTE \n EN LA BASE DE DATOS");
                    break;
                }
                if (Integer.parseInt(codigo) < 1 || Integer.parseInt(codigo) >= misMetodo.numeroCliente()) {
                    JOptionPane.showMessageDialog(null, "EL CLIENTE NO EXISTE \n EN LA BASE DE DATOS");
                    break;
                }
            }

        }
    }

    public void btnEliminar() {

    }

    public void limpiar() {
        txtCodigoUnico.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccionHabitacion.setText("");
        txtFechaNacimiento.setText("");
        txtMovil.setText("");
        txtNumeroTarjeta.setText("");
        txtPorFrecuencia.setText("");
        txtPorMonto.setText("");
        txtTelefono.setText("");
    }

    public void btnModificar() {

    }

    public void mostrarReservacion() {
        tblReservacion.setModel(this.listaReservacion());
    }
    
    public DefaultTableModel listaReservacion() {
        String codigo1 = this.txtCodigoUnico.getText();
        Vector cabecera = new Vector();
        cabecera.addElement("codigo");
        cabecera.addElement("ID paquete");
        cabecera.addElement("ID cliente");
        cabecera.addElement("fecha reser");
        cabecera.addElement("fecha salida");
        cabecera.addElement("No dias");
        cabecera.addElement("Estado");
        cabecera.addElement("saldo pendiente");
        //vector que contene los codigos y nombres de las reservaciones
        //modelo de tabla para agregar el vector  en la posicion 0
        DefaultTableModel modeloTabla = new DefaultTableModel(cabecera, 0);

                for (int j = 0; j < misMetodo.numeroReservacion(); j++) {
                    Vector x = new Vector();
//                    String codigoclienteReser = misMetodo.getReservacion()[j].getCodigoCliente();
                    x.addElement(misMetodo.getReservacion()[j].getCodigoReservacion());
                    x.addElement(misMetodo.getReservacion()[j].getCodigoPaquete());
                    x.addElement(misMetodo.getReservacion()[j].getCodigoCliente());
                    x.addElement(misMetodo.getReservacion()[j].getFechaReservacion());
                    x.addElement(misMetodo.getReservacion()[j].getFechaSalida());
                    x.addElement(misMetodo.getReservacion()[j].getCantidadDiasViaje());
                    x.addElement(misMetodo.getReservacion()[j].getEstadoReservacion());
                    x.addElement(misMetodo.getReservacion()[j].getSaldoPendiente());
                    if (x.elementAt(2).equals(codigo1)) {
                        modeloTabla.addRow(x);
                    }
                }
        return modeloTabla;
    }

}


/*

 public void btnModificar() {
 MenuPrincipal miMenuPrincipal = new MenuPrincipal();
 try {
 FileWriter fw = new FileWriter("ClientesPrueba.csv", true);
 BufferedWriter bw = new BufferedWriter(fw);
 PrintWriter pw = new PrintWriter(bw);
 BufferedReader br = new BufferedReader(new FileReader("05 Clientes.csv"));
 String linea = "";
 while ((linea = br.readLine()) != null) {
 StringTokenizer datos = new StringTokenizer(linea, ",");
 Vector x = new Vector();
 while (datos.hasMoreTokens()) {
 x.addElement(datos.nextToken());
 }

 if (!x.elementAt(0).equals(this.txtCodigoUnico.getText())) {
 pw.println(linea);
 } else {
 String codigo = this.txtCodigoUnico.getText();
 String nombre = this.txtNombres.getText();
 String apellido = this.txtApellidos.getText();
 String telefono = this.txtTelefono.getText();
 String movil = this.txtMovil.getText();
 String numeroTarjeta = this.txtNumeroTarjeta.getText();
 String fechaNacimiento = this.txtFechaNacimiento.getText();
 String DireccionHabitacion = this.txtDireccionHabitacion.getText();
 String c_x_frecuencia = this.txtPorFrecuencia.getText();
 String c_x_monto = this.txtPorMonto.getText();

 miCliente.setCodigoUnico(codigo);
 miCliente.setNombres(nombre);
 miCliente.setApellidos(apellido);
 miCliente.setNumeroTarjeta(numeroTarjeta);
 miCliente.setFechaNacimiento(fechaNacimiento);
 miCliente.setTelefono(telefono);
 miCliente.setMovil(movil);
 miCliente.setdireccionHabitacion(DireccionHabitacion);
 miCliente.setC_x_frecuencia(c_x_frecuencia);
 miCliente.setC_x_monto(c_x_monto);
 //****se envia en la clase menu principal para que pueda meter los datos de los clientes
 pw.print(miCliente.getCodigoUnico());
 pw.print("," + miCliente.getNombres());
 pw.print("," + miCliente.getApellidos());
 pw.print("," + miCliente.getNumeroTarjeta());
 pw.print("," + miCliente.getFechaNacimiento());
 pw.print("," + miCliente.getTelefono());
 pw.print("," + miCliente.getMovil());
 pw.print("," + miCliente.getdireccionHabitacion());
 pw.print("," + miCliente.getC_x_frecuencia());
 pw.println("," + miCliente.getC_x_monto());

 }
 }
 pw.close();
 br.close();
 } catch (Exception e) {
 }
 }
    
 // funcion para mostrar datos en un Jtable
 public DefaultTableModel listaReservacion() {
 Vector cabecera = new Vector();
 cabecera.addElement("codigo");
 cabecera.addElement("ID paquete");
 cabecera.addElement("ID cliente");
 cabecera.addElement("fecha reser");
 cabecera.addElement("fecha salida");
 cabecera.addElement("No dias");
 cabecera.addElement("Estado");
 cabecera.addElement("saldo pendiente");
 //vector que contene los codigos y nombres de las reservaciones
 //modelo de tabla para agregar el vector  en la posicion 0
 DefaultTableModel modeloTabla = new DefaultTableModel(cabecera, 0);
 try {
 FileReader fr = new FileReader("09 Reservaciones.csv");
 BufferedReader br = new BufferedReader(fr);
 String d;
 while ((d = br.readLine()) != null) {
 StringTokenizer datos = new StringTokenizer(d, ",");
 Vector x = new Vector();
 while (datos.hasMoreTokens()) {
 x.addElement(datos.nextToken());
 }
 if (x.elementAt(2).equals(this.txtCodigoUnico.getText())) {
 modeloTabla.addRow(x);
 }
 }
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
 }
 return modeloTabla;
 }
 */
