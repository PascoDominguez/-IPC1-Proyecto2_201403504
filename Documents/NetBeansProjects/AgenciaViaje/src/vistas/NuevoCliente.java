package vistas;

import agenciaviaje.Cliente;
import agenciaviaje.Metodo;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class NuevoCliente extends javax.swing.JFrame {


    private Metodo misMetodo;

    public void setMetodo(Metodo metodo) {
        misMetodo = metodo;
    }

    public NuevoCliente() {
        setTitle("NUEVO CLIENTE");
        this.setLocation(400, 200);
        setResizable(false);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
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
        jLabel9 = new javax.swing.JLabel();
        txtDireccionHabitacion = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMovil = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPorFrecuencia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPorMonto = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCodigoUnico.setText("CODIGO UNICO ");

        jLabel1.setText("NOMBRES");

        jLabel2.setText("APELLIDOS");

        jLabel3.setText("TELEFONO");

        jLabel4.setText("NUMERO TARJETA");

        jLabel5.setText("FECHA NACIMIENTO");

        jLabel9.setText("DIRECCION HABITACION");

        txtDireccionHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionHabitacionActionPerformed(evt);
            }
        });

        btnInsertar.setText("insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("MOVIL");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel7.setText("CLASIFICACION");

        jLabel8.setText("POR FRECUENCIA");

        jLabel10.setText("POR MONTO");

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
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lblCodigoUnico)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelClienteLayout.createSequentialGroup()
                                            .addComponent(txtCodigoUnico, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPorFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addComponent(btnInsertar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminar))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelClienteLayout.createSequentialGroup()
                                            .addComponent(btnCancelar)
                                            .addGap(4, 4, 4)
                                            .addComponent(btnRegresar))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPorMonto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                            .addComponent(txtDireccionHabitacion, javax.swing.GroupLayout.Alignment.LEADING))))))
                        .addContainerGap(59, Short.MAX_VALUE))))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCodigoUnico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoUnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPorFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegresar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        try {
            this.agregarCliente();
            JOptionPane.showMessageDialog(null, "CLIENTE AGREGADO");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        this.limpiar();

    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtDireccionHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionHabitacionActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.buscarCliente();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
//        JOptionPane.showMessageDialog(null, "DESEA MODIFICAR EL CLIENTE?");
        this.ModificarCliente();
        this.limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.btnEliminar();
        this.limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
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
    private javax.swing.JLabel lblCodigoUnico;
    private javax.swing.JPanel panelCliente;
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

    private void agregarCliente() {
        String c_x_frecuencia = "Anual";
        String c_x_monto = null;
        Cliente miClinete = new Cliente(
                this.txtCodigoUnico.getText(),
                this.txtNombres.getText(),
                this.txtApellidos.getText(),
                this.txtTelefono.getText(),
                this.txtMovil.getText(),
                this.txtNumeroTarjeta.getText(),
                this.txtFechaNacimiento.getText(),
                this.txtDireccionHabitacion.getText(),
                c_x_frecuencia,
                c_x_monto
        );

        misMetodo.agregarcliente(miClinete);

    }

    private void buscarCliente() {
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
                if (Integer.parseInt(codigo) < 1 || Integer.parseInt(codigo) >=misMetodo.numeroCliente()) {
                    JOptionPane.showMessageDialog(null, "EL CLIENTE NO EXISTE \n EN LA BASE DE DATOS");
                    break;
                }
            }

        }

    }

    private void ModificarCliente() {
        String codigo = this.txtCodigoUnico.getText();
        for (int i = 0; i < misMetodo.numeroCliente(); i++) {
            String codigoCliente = misMetodo.getClientes()[i].getCodigoUnico();
            if (codigo.equals(codigoCliente)) {
                misMetodo.getClientes()[i].setCodigoUnico(this.txtCodigoUnico.getText());
                misMetodo.getClientes()[i].setNombres(this.txtNombres.getText());
                misMetodo.getClientes()[i].setApellidos(this.txtApellidos.getText());
                misMetodo.getClientes()[i].setTelefono(this.txtTelefono.getText());
                misMetodo.getClientes()[i].setMovil(this.txtMovil.getText());
                misMetodo.getClientes()[i].setNumeroTarjeta(this.txtNumeroTarjeta.getText());
                misMetodo.getClientes()[i].setFechaNacimiento(this.txtFechaNacimiento.getText());
                misMetodo.getClientes()[i].setdireccionHabitacion(this.txtDireccionHabitacion.getText());
                misMetodo.getClientes()[i].setC_x_frecuencia(this.txtPorFrecuencia.getText());
                misMetodo.getClientes()[i].setC_x_monto(this.txtPorMonto.getText());
                JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO");
            }
        }
    }

    private void limpiar() {
        this.txtCodigoUnico.setText("");
        this.txtNombres.setText("");
        this.txtApellidos.setText("");
        this.txtNumeroTarjeta.setText("");
        this.txtFechaNacimiento.setText("");
        this.txtTelefono.setText("");
        this.txtMovil.setText("");
        this.txtDireccionHabitacion.setText("");
        this.txtPorMonto.setText("");
        this.txtPorFrecuencia.setText("");
    }

    private void btnEliminar() {
        String codigo = this.txtCodigoUnico.getText();
        for (int i = 0; i < misMetodo.numeroCliente(); i++) {
            String codigoCliente = misMetodo.getClientes()[i].getCodigoUnico();
            if (codigo.equals(codigoCliente)) {
                misMetodo.getClientes()[i].setCodigoUnico("");
                misMetodo.getClientes()[i].setNombres("");
                misMetodo.getClientes()[i].setApellidos("");
                misMetodo.getClientes()[i].setTelefono("");
                misMetodo.getClientes()[i].setMovil("");
                misMetodo.getClientes()[i].setNumeroTarjeta("");
                misMetodo.getClientes()[i].setFechaNacimiento("");
                misMetodo.getClientes()[i].setdireccionHabitacion("");
                misMetodo.getClientes()[i].setC_x_frecuencia("");
                misMetodo.getClientes()[i].setC_x_monto("");
                JOptionPane.showMessageDialog(null, "ELIMINADO CON EXITO");
            }
        }
    }

}

/*
 private void agregarCliente(){
 String codigo = this.txtCodigoUnico.getText();
 String nombre = this.txtNombres.getText();
 String apellido = this.txtApellidos.getText();
 String telefono = this.txtTelefono.getText();
 String movil = this.txtMovil.getText();
 String numeroTarjeta = this.txtNumeroTarjeta.getText();
 String fechaNacimiento = this.txtFechaNacimiento.getText();
 String DireccionHabitacion = this.txtDireccionHabitacion.getText();
 String c_x_frecuencia = "Anual";
        
 miCliente.setCodigoUnico(codigo);
 miCliente.setNombres(nombre);
 miCliente.setApellidos(apellido);
 miCliente.setNumeroTarjeta(numeroTarjeta);
 miCliente.setFechaNacimiento(fechaNacimiento);
 miCliente.setTelefono(telefono);
 miCliente.setMovil(movil);
 miCliente.setdireccionHabitacion(DireccionHabitacion);
 miCliente.setC_x_frecuencia(c_x_frecuencia);
        
 miMetodo.guardarArchivo(miCliente);
 }
 */
