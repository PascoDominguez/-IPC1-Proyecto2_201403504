/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import agenciaviaje.Asiento;
import agenciaviaje.Camarots;
import agenciaviaje.Cliente;
import agenciaviaje.Transporte;
import agenciaviaje.Cruceros;
import agenciaviaje.DestinoTuristico;
import agenciaviaje.EntidadFinanciera;
import agenciaviaje.Habitacion;
import agenciaviaje.LugareEspectaculo;
import agenciaviaje.Metodo;
import agenciaviaje.Paquetes;
import agenciaviaje.hotelesResorts;
import agenciaviaje.Reservacion;
import agenciaviaje.rentaAutos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author Pasco Dominguez
 */
public class Cargar extends javax.swing.JFrame {
    private Metodo misMetodo;

    public void setMetodo(Metodo metodo) {
        misMetodo = metodo;
    }

    /**
     * Creates new form Cargar
     */
    public Cargar() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTransporte = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHotelResorts = new javax.swing.JTextField();
        txtCruceros = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEntidadFinanciera = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPaquete = new javax.swing.JTextField();
        txtReservacion = new javax.swing.JTextField();
        txtRentaAutos = new javax.swing.JTextField();
        txtAsiento = new javax.swing.JTextField();
        txtHabitacion = new javax.swing.JTextField();
        txtCamarots = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ciente");

        btnCargar.setText("CARGAR");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        jLabel2.setText("trasnporte");

        jLabel3.setText("Hotel");

        jLabel4.setText("Cruceros");

        jLabel5.setText("Financiera");

        jLabel6.setText("DestinoT");

        jLabel7.setText("LugarE");

        jLabel8.setText("Paquete");

        jLabel9.setText("Reservacion");

        jLabel10.setText("R Autos");

        jLabel11.setText("Asiento");

        jLabel12.setText("Habitacion");

        jLabel13.setText("Camarots");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCargar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPaquete)
                            .addComponent(txtLugar)
                            .addComponent(txtDestino)
                            .addComponent(txtEntidadFinanciera)
                            .addComponent(txtCruceros)
                            .addComponent(txtcliente)
                            .addComponent(txtTransporte)
                            .addComponent(txtHotelResorts)
                            .addComponent(txtReservacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                            .addComponent(txtRentaAutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                            .addComponent(txtAsiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                            .addComponent(txtHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                            .addComponent(txtCamarots, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHotelResorts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCruceros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntidadFinanciera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRentaAutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCamarots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnCargar)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        this.carcgarCliente();
        this.cargarTransporte();
        this.cargarHotelesResorts();
        this.cargarCruceros();
        this.cargarEntidadFinanciera();
        this.cargarDestinoT();
        this.cargarLugarE();
        this.cargaPaquetes();
        this.cargaReservacion();
        this.cargarRentaAutos();
        this.cargarAsiento();
        this.cargarHabitacion();
        this.cargarCamarots();
        
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarActionPerformed

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
            java.util.logging.Logger.getLogger(Cargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cargar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField txtAsiento;
    private javax.swing.JTextField txtCamarots;
    private javax.swing.JTextField txtCruceros;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtEntidadFinanciera;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtHotelResorts;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtPaquete;
    private javax.swing.JTextField txtRentaAutos;
    private javax.swing.JTextField txtReservacion;
    private javax.swing.JTextField txtTransporte;
    private javax.swing.JTextField txtcliente;
    // End of variables declaration//GEN-END:variables

    public void carcgarCliente(){
        String cliente = this.txtcliente.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\Pasco Dominguez\\\\Desktop\\\\[IPC1]\\\\PROYECTOS\\\\Pro2\\\\ArchivosCSVPrueba\\\\05 Clientes.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigo = (String) x.elementAt(0);
                String nombre = (String) x.elementAt(1);
                String apellido = (String) x.elementAt(2);
                String numeroTarjeta = (String) x.elementAt(3);
                String fechaNacimiento = (String) x.elementAt(4);
                String telefono = (String) x.elementAt(5);
                String movil = (String) x.elementAt(6);
                String NoHabitacion = (String) x.elementAt(7);
                String C_Frecuencia = (String) x.elementAt(8);
                String c_monto = (String) x.elementAt(9);

                Cliente miCliente = new Cliente(codigo, nombre, apellido, numeroTarjeta, fechaNacimiento, telefono,
                movil, NoHabitacion,C_Frecuencia, c_monto);
                misMetodo.agregarcliente(miCliente);

            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void cargarTransporte(){
        String transporte = this.txtTransporte.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\01 AerolineasBuses.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigo = (String) x.elementAt(0);
                String horaSalida = (String) x.elementAt(1);
                String horaLlegada = (String) x.elementAt(2);
                String capacidadPasajero = (String) x.elementAt(3);
                String codigoDestino = (String) x.elementAt(4);

                Transporte miTransporte = new Transporte(codigo, horaSalida, horaLlegada, capacidadPasajero, codigoDestino);
                misMetodo.agregarTransporte(miTransporte);

            }
            br.close();
        } catch (Exception e) {
        }
    }

    public void cargarHotelesResorts(){
        String HotelesResorts = this.txtHotelResorts.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\02 HotelesResorts.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigoHospedaje = (String) x.elementAt(0);
                String direccionHospedaje = (String) x.elementAt(1);
                String totalCuatosDisponibles = (String) x.elementAt(2);
                String codigoDestino = (String) x.elementAt(3);

                hotelesResorts mihotelesResorts = new hotelesResorts(codigoHospedaje, direccionHospedaje, totalCuatosDisponibles, codigoDestino);
                misMetodo.agregarHotelesResorts(mihotelesResorts);
                

            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void cargarCruceros(){
        String cruceros = this.txtCruceros.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\03 Cruceros.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigoCrucero = (String) x.elementAt(0);
                String fechaSalida = (String) x.elementAt(1);
                String fechaLlegada = (String) x.elementAt(2);
                String capacidadTotalPasajero = (String) x.elementAt(3);
                String diasViajeCrucero = (String) x.elementAt(4);
                String descripcionCrucero = (String) x.elementAt(5);
                String codigoDestino = (String) x.elementAt(6);

                Cruceros miCruceros = new Cruceros(codigoCrucero, fechaSalida, fechaLlegada, capacidadTotalPasajero, 
                        diasViajeCrucero, descripcionCrucero,codigoDestino);
                misMetodo.agregarCruceros(miCruceros);

            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void cargarEntidadFinanciera(){
        String financiera = this.txtEntidadFinanciera.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\04 EntidadFinanciera.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigoEntidadFinanciera = (String) x.elementAt(0);
                String codigoCliente = (String) x.elementAt(1);
                String tipoTarjeta = (String) x.elementAt(2);
                String codigoTarjeta = (String) x.elementAt(3);
                String saldo = (String) x.elementAt(4);
                String montoMaximo = (String) x.elementAt(5);

                EntidadFinanciera miEntidadFinanciera = new EntidadFinanciera(codigoEntidadFinanciera, codigoCliente, tipoTarjeta, codigoTarjeta, 
                        saldo, montoMaximo);
                misMetodo.agregarEntidadFinanciera(miEntidadFinanciera);

            }
            br.close();
        } catch (Exception e) {
        }
    }
 
    public void cargarDestinoT(){
        String destinoT = this.txtDestino.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\06 DestinosTuristicos.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigoDestino = (String) x.elementAt(0);
                String paisDestino = (String) x.elementAt(1);
                String ciudadDestino = (String) x.elementAt(2);
                String direccionDestino = (String) x.elementAt(3);
                String nombreDestino = (String) x.elementAt(4);
                String descripcionDestino = (String) x.elementAt(5);
                String descripcionMedidasSeguridad = (String) x.elementAt(6);

                DestinoTuristico miDestinoTuristico = new DestinoTuristico(codigoDestino, 
                        paisDestino, ciudadDestino, direccionDestino, nombreDestino, descripcionDestino, descripcionMedidasSeguridad);
                misMetodo.agregarDestinoTuristico(miDestinoTuristico);

            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void cargarLugarE(){
        String lugar = this.txtLugar.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\07 LugaresE_E.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigoLugar = (String) x.elementAt(0);
                String nombreLugar = (String) x.elementAt(1);
                String descripcionLugar = (String) x.elementAt(2);
                String paisLugar = (String) x.elementAt(3);
                String ciudadLugar = (String) x.elementAt(4);
                String direccionLugar = (String) x.elementAt(5);
                String minEdadPermitido = (String) x.elementAt(6);
                String horainicioActividad = (String) x.elementAt(7);
                String horaFunciion = (String) x.elementAt(8);
                String recomendacionSeguridad = (String) x.elementAt(9);
                String codigoDestino = (String) x.elementAt(10);

                LugareEspectaculo miLugareEspectaculo = new LugareEspectaculo(codigoLugar, 
                        nombreLugar, descripcionLugar, paisLugar, ciudadLugar, direccionLugar, 
                        minEdadPermitido, horainicioActividad, horaFunciion, recomendacionSeguridad, codigoDestino);
                misMetodo.agregarLugareEspectaculo(miLugareEspectaculo);

            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void cargaPaquetes(){
        String paquete = this.txtPaquete.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\08 Paquetes.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigoPaquete = (String) x.elementAt(0);
                String tipoPaquete = (String) x.elementAt(1);
                String clasificacionPaquete = (String) x.elementAt(2);
                String cantidadViajero = (String) x.elementAt(3);
                String codigoTransporte = (String) x.elementAt(4);
                String codigoHospedaje = (String) x.elementAt(5);
                String codigoCrucero = (String) x.elementAt(6);
                String codigoRentadora = (String) x.elementAt(7);
                String codigoDestino = (String) x.elementAt(8);
                String codigoLugar = (String) x.elementAt(9);
                String costoTotalPasaje = (String) x.elementAt(10);

                Paquetes miPaquetes = new Paquetes(codigoPaquete, 
                        tipoPaquete, clasificacionPaquete, cantidadViajero, codigoTransporte, codigoHospedaje, 
                        codigoCrucero, codigoRentadora, codigoDestino, codigoLugar, costoTotalPasaje);
                misMetodo.agregarPaquetes(miPaquetes);

            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void cargaReservacion(){
        String reservacion = this.txtReservacion.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\09 Reservaciones.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigoReservacion = (String) x.elementAt(0);
                String codigoPaquete = (String) x.elementAt(1);
                String codigoCliente = (String) x.elementAt(2);
                String fechaReservacion = (String) x.elementAt(3);
                String fechaSalida = (String) x.elementAt(4);
                String cantidadDiasViaje = (String) x.elementAt(5);
                String estadoReservacion = (String) x.elementAt(6);
                String saldoPendiente = (String) x.elementAt(7);

                Reservacion miReservacion = new Reservacion(codigoReservacion, 
                        codigoPaquete, codigoCliente, fechaReservacion, fechaSalida, cantidadDiasViaje, 
                        estadoReservacion, saldoPendiente);
                misMetodo.agregarReservacion(miReservacion);

            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void cargarRentaAutos(){
        String rentaAutos = this.txtRentaAutos.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\10 RentaAutos.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigoEmpresa = (String) x.elementAt(0);
                String codigoCliente = (String) x.elementAt(1);
                String cantidadPasajero = (String) x.elementAt(2);
                String tipoTerreno = (String) x.elementAt(3);
                String diasUtilizar = (String) x.elementAt(4);
                String montoTotalRenta = (String) x.elementAt(5);
                String fechaEntrega = (String) x.elementAt(6);
                String fechaDevolucion = (String) x.elementAt(7);
                String condicionAseguradora = (String) x.elementAt(8);

                rentaAutos mirentaAutos = new rentaAutos(codigoEmpresa, 
                        codigoCliente, cantidadPasajero, tipoTerreno, diasUtilizar, montoTotalRenta, 
                        fechaEntrega, fechaDevolucion, condicionAseguradora);
                misMetodo.agregarrentaAutos(mirentaAutos);

            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void cargarAsiento(){
        String asiento = this.txtAsiento.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\11 Asientos.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigoTransporte = (String) x.elementAt(0);
                String codigoReservacion = (String) x.elementAt(1);
                String numeroAsientoViajero = (String) x.elementAt(2);
                String claseAsiento = (String) x.elementAt(3);
                String cosotPasaje = (String) x.elementAt(4);

                Asiento miAsiento = new Asiento(codigoTransporte, 
                        codigoReservacion, numeroAsientoViajero, claseAsiento, cosotPasaje);
                misMetodo.agregarAsiento(miAsiento);

            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void cargarHabitacion(){
        String habitacion = this.txtHabitacion.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\12 Habitaciones.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigoHospedaje = (String) x.elementAt(0);
                String numeroHabitacion = (String) x.elementAt(1);
                String codigoReservacion = (String) x.elementAt(2);
                String cantidadPersonasHabitacion = (String) x.elementAt(3);
                String costoHabitacion = (String) x.elementAt(4);
                String claseHabitacion = (String) x.elementAt(5);

                Habitacion miHabitacion = new Habitacion(codigoHospedaje, 
                        numeroHabitacion, codigoReservacion, cantidadPersonasHabitacion, costoHabitacion, claseHabitacion);
                misMetodo.agregarHabitacion(miHabitacion);

            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void cargarCamarots(){
        String camarots = this.txtCamarots.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pasco Dominguez\\Desktop\\[IPC1]\\PROYECTOS\\Pro2\\ArchivosCSVPrueba\\13 Camarotes.csv"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                StringTokenizer datos = new StringTokenizer(linea, ",");
                Vector x = new Vector();
                while (datos.hasMoreTokens()) {
                    x.addElement(datos.nextToken());
                }
                String codigoCrucero = (String) x.elementAt(0);
                String codigoReservacion = (String) x.elementAt(1);
                String numHabAsignadaViajero = (String) x.elementAt(2);
                String costoPasaje = (String) x.elementAt(3);

                Camarots miCamarots = new Camarots(codigoCrucero, 
                        codigoReservacion, numHabAsignadaViajero, costoPasaje);
                misMetodo.agregarCamarots(miCamarots);

            }
            br.close();
        } catch (Exception e) {
        }
    }
    
}