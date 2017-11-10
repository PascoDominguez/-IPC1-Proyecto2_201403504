package vistas;

import agenciaviaje.Metodo;
import agenciaviaje.r_cliente;
import agenciaviaje.R_reservacion;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Reporte extends javax.swing.JFrame {

    private Metodo misMetodo;
    public static int contador = 1;

    public void setMetodo(Metodo metodo) {
        misMetodo = metodo;
    }

    public Reporte() {
        this.setLocation(400, 150);
        this.setResizable(false);
        setTitle("MODULOS REPORTES");
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

        btnBitacora = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnReservaciones = new javax.swing.JButton();
        btnEstadistica = new javax.swing.JButton();
        btnCarcga = new javax.swing.JButton();
        btnNegocios = new javax.swing.JButton();
        btnEjecucion = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBitacora.setText("BITACORA");

        btnCliente.setText("CLIENTES");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnReservaciones.setText("RESERVACIONES");
        btnReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservacionesActionPerformed(evt);
            }
        });

        btnEstadistica.setText("ESTADISTICA");

        btnCarcga.setText("DE CARGAS");

        btnNegocios.setText("NEGOCIOS");

        btnEjecucion.setText("EJECUCION");

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNegocios, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCarcga, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBitacora, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBitacora, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarcga, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNegocios, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservacionesActionPerformed
        this.cargarreproteReservacion();
        this.reporteReservacion();
        this.abrirArchivo("reservacion.html");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservacionesActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        this.cargarReporteCliente();
        this.reporteCliente();
        this.abrirArchivo("cliente.html");
//        this.cargarReporteclienteDes();


    }//GEN-LAST:event_btnClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBitacora;
    private javax.swing.JButton btnCarcga;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEjecucion;
    private javax.swing.JButton btnEstadistica;
    private javax.swing.JButton btnNegocios;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReservaciones;
    // End of variables declaration//GEN-END:variables

    public void abrirArchivo(String archivo) {
        try {
            File reporte = new File(archivo);
            Desktop.getDesktop().open(reporte);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reporteCliente() {
        try {
            String rCliente = "cliente.html";
            File f = new File(rCliente);
            FileWriter fw = new FileWriter(f);
            BufferedWriter br = new BufferedWriter(fw);
            String cadenaHTML = "<html>"
                    + "    <head>"
                    + "    <body>"
                    //Ordenado ascendentemente por codigo de cliente
                    + "       <h1>TRAVEL S.A.</h1>"
                    + "       <center><h3>REPORTE DE CLIENTES</h3></center>"
                    + "       <center><h4>Ordenado ascendentemente por codigo de cliente</h4></center>"
                    + "       <center> <table border>"
                    + "            <tr>"
                    + "                <td>ID CLIENTE</td>"
                    + "                <td>NOMBRE</td>"
                    + "                <td>APELLIDO</td>"
                    + "                <td>DESTINO</td>"
                    + "                <td>MONTO</td>"
                    + "            </tr></center>";

            for (int x = 0; x < misMetodo.numeror_cliente(); x++) {

                if (x != 0) {
                    if (misMetodo.getr_cliente()[x].getDestino() != null) {
                        cadenaHTML += "            <tr>"
                                + "                <td>" + misMetodo.getr_cliente()[x].getIdcliente() + "</td>"
                                + "                <td>" + misMetodo.getr_cliente()[x].getNombre() + "</td>"
                                + "                <td>" + misMetodo.getr_cliente()[x].getApelldio() + "</td>"
                                + "                <td>" + misMetodo.getr_cliente()[x].getDestino() + "</td>"
                                + "                <td>" + misMetodo.getr_cliente()[x].getMonto() + "</td>"
                                + "            </tr>";
                    }
                }
            }

            cadenaHTML += "        </table>"
                    // Ordenado descendentemente por monto

                    + "       <center><h4>Odenado descendente mente por monto o costo del viaje</h4></center>"
                    + "       <center> <table border>"
                    + "            <tr>"
                    + "                <td>ID CLIENTE</td>"
                    + "                <td>NOMBRE</td>"
                    + "                <td>APELLIDO</td>"
                    + "                <td>DESTINO</td>"
                    + "                <td>MONTO</td>"
                    + "            </tr></center>";

            int[] vec = new int[100];

            Vector v = new Vector();
            for (int x = 0; x < misMetodo.numeror_cliente(); x++) {
                if (x != 0) {
                    if (misMetodo.getr_cliente()[x].getDestino() != null) {
                        v.addElement(Integer.parseInt(misMetodo.getr_cliente()[x].getMonto()));
                    }
                }
            }
            for (int i = 0; i < v.size(); i++) {
                vec[i] = (int) v.elementAt(i);
            }
            for (int i = 0; i < v.size(); i++) {
                System.out.println(vec[i]);
                for (int j = 0; j < v.size() - 1; j++) {
                    if (vec[j] < vec[j + 1]) {
                        int aux = vec[j];
                        vec[j] = vec[j + 1];
                        vec[j + 1] = aux;
                    }
                }
            }

            System.out.println("desendente");
            for (int i = 0; i < v.size(); i++) {
                for (int x = 0; x < misMetodo.numeror_cliente(); x++) {
                    if (misMetodo.getr_cliente()[x].getDestino() != null) {
                        if (String.valueOf(vec[i]).equals(misMetodo.getr_cliente()[x].getMonto())) {
                            cadenaHTML += "            <tr>"
                                    + "                <td>" + misMetodo.getr_cliente()[x].getIdcliente() + "</td>"
                                    + "                <td>" + misMetodo.getr_cliente()[x].getNombre() + "</td>"
                                    + "                <td>" + misMetodo.getr_cliente()[x].getApelldio() + "</td>"
                                    + "                <td>" + misMetodo.getr_cliente()[x].getDestino() + "</td>"
                                    + "                <td>" + misMetodo.getr_cliente()[x].getMonto() + "</td>"
                                    + "            </tr>";
                        }
                    }
                }
            }

            cadenaHTML += "        </table>"
                    + "    </body>"
                    + "</html>";

            br.write(cadenaHTML);

            br.close();

            fw.close();
        } catch (Exception e) {
        }
    }

    public void reporteReservacion() {
        try {
            String rCliente = "reservacion.html";
            File f = new File(rCliente);
            FileWriter fw = new FileWriter(f);
            BufferedWriter br = new BufferedWriter(fw);
            String cadenaHTML = "<html>"
                    + "    <head>"
                    + "    <body>"
                    //Ordenado ascendentemente por codigo de cliente
                    + "       <h1>TRAVEL S.A.</h1>"
                    + "       <center><h3>REPORTE DE RESERVACIONES</h3></center>"
                    + "       <center><h4>Ordenado ascendentemente por codigo de reservacion</h4></center>"
                    + "       <center> <table border>"
                    + "            <tr>"
                    + "                <td>ID RESERVACION</td>"
                    + "                <td>ID CLIENTE</td>"
                    + "                <td>NOMBRE</td>"
                    + "                <td>APELLIDO</td>"
                    + "                <td>COSTO VIAJE</td>"
                    + "                <td>MONTO RESERVACION</td>"
                    + "                <td>ESTADO</td>"
                    + "            </tr></center>";

            for (int x = 0; x < misMetodo.numR_reservacion(); x++) {

                if (x != 0) {
                    cadenaHTML += "            <tr>"
                            + "                <td>" + misMetodo.getR_reservacion()[x].getCodigoReser() + "</td>"
                            + "                <td>" + misMetodo.getR_reservacion()[x].getCodigocliente() + "</td>"
                            + "                <td>" + misMetodo.getR_reservacion()[x].getNombrecliente() + "</td>"
                            + "                <td>" + misMetodo.getR_reservacion()[x].getApellidoCliente() + "</td>"
                            + "                <td>" + misMetodo.getR_reservacion()[x].getCostoViaje() + "</td>"
                            + "                <td>" + misMetodo.getR_reservacion()[x].getMontoReservacion() + "</td>"
                            + "                <td>" + misMetodo.getR_reservacion()[x].getEstadoReservacion() + "</td>"
                            + "            </tr>";
                }
            }

            cadenaHTML += "        </table>"
                    // Ordenado descendentemente por monto

                    + "       <center><h4>Odenado descendente mente por monto o costo del viaje</h4></center>"
                    + "       <center> <table border>"
                    + "            <tr>"
                    + "                <td>ID RESERVACION</td>"
                    + "                <td>ID CLIENTE</td>"
                    + "                <td>NOMBRE</td>"
                    + "                <td>APELLIDO</td>"
                    + "                <td>COSTO VIAJE</td>"
                    + "                <td>MONTO RESERVACION</td>"
                    + "                <td>ESTADO</td>"
                    + "            </tr></center>";

            int[] vec = new int[100];

            Vector v = new Vector();
            for (int x = 0; x < misMetodo.numR_reservacion(); x++) {
                if (x != 0) {
//                    if (misMetodo.getr_cliente()[x].getDestino() != null) {
                    v.addElement(Integer.parseInt(misMetodo.getR_reservacion()[x].getCostoViaje()));
//                    }
                }
            }
            for (int i = 0; i < v.size(); i++) {
                vec[i] = (int) v.elementAt(i);
            }
            for (int i = 0; i < v.size(); i++) {
                for (int j = 0; j < v.size() - 1; j++) {
                    if (vec[j] < vec[j + 1]) {
                        int aux = vec[j];
                        vec[j] = vec[j + 1];
                        vec[j + 1] = aux;
                    }
                }
            }

            for (int i = 0; i < v.size(); i++) {
                System.out.print(vec[i]);
                System.out.println("");
                for (int x = 0; x < misMetodo.numR_reservacion(); x++) {
//                    if (misMetodo.getr_cliente()[x].getDestino() != null) {
                    if (String.valueOf(vec[i]).equals(misMetodo.getR_reservacion()[x].getCostoViaje())) {
                        cadenaHTML += "            <tr>"
                                + "                <td>" + misMetodo.getR_reservacion()[x].getCodigoReser() + "</td>"
                                + "                <td>" + misMetodo.getR_reservacion()[x].getCodigocliente() + "</td>"
                                + "                <td>" + misMetodo.getR_reservacion()[x].getNombrecliente() + "</td>"
                                + "                <td>" + misMetodo.getR_reservacion()[x].getApellidoCliente() + "</td>"
                                + "                <td>" + misMetodo.getR_reservacion()[x].getCostoViaje() + "</td>"
                                + "                <td>" + misMetodo.getR_reservacion()[x].getMontoReservacion() + "</td>"
                                + "                <td>" + misMetodo.getR_reservacion()[x].getEstadoReservacion() + "</td>"
                                + "            </tr>";
                    }
//                    }
                }
            }

            cadenaHTML += "        </table>"
                    + "    </body>"
                    + "</html>";

            br.write(cadenaHTML);

            br.close();

            fw.close();
        } catch (Exception e) {
        }
    }

    public void cargarReporteCliente() {
        for (int x = 0; x < misMetodo.numeroCliente(); x++) {
            String idCliente = misMetodo.getClientes()[x].getCodigoUnico();
            String nombre = misMetodo.getClientes()[x].getNombres();
            String apellido = misMetodo.getClientes()[x].getApellidos();
            String idReser = null;
            String idPaquete = null;
            String costopasaje = null;
            String idDestino = null;
            String nombreDestino = null;
            if (x != 0) {
                for (int i = 0; i < misMetodo.numeroReservacion(); i++) {
                    if (misMetodo.getClientes()[x].getCodigoUnico().equals(misMetodo.getReservacion()[i].getCodigoCliente())) {
                        idReser = misMetodo.getReservacion()[i].getCodigoReservacion();
                        idPaquete = misMetodo.getReservacion()[i].getCodigoPaquete();

                        for (int a = 0; a < misMetodo.numeroAsiento(); a++) {
                            if (misMetodo.getAsiento()[a].getCodigoReservacion().equals(idReser)) {
                                costopasaje = misMetodo.getAsiento()[a].getCosotPasaje();

                                for (int b = 0; b < misMetodo.numeroPaquetes(); b++) {
                                    if (misMetodo.getPaquetes()[b].getCodigoPaquete().equals(idPaquete)) {
                                        idDestino = misMetodo.getPaquetes()[b].getCodigoDestino();

                                        for (int j = 0; j < misMetodo.numeroDestinoTuristico(); j++) {
                                            if (misMetodo.getDestinoTuristico()[j].getCodigoDestino().equals(idDestino)) {
                                                nombreDestino = misMetodo.getDestinoTuristico()[j].getNombreDestino();
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }

            r_cliente mir_cliente = new r_cliente(idCliente, nombre, apellido, nombreDestino, costopasaje);
            misMetodo.agregarr_cliente(mir_cliente);

        }
    }

    public void cargarReporteclienteDes() {
        int[] vec = new int[100];

        Vector v = new Vector();
        for (int x = 0; x < misMetodo.numeror_cliente(); x++) {
            if (x != 0) {
                if (misMetodo.getr_cliente()[x].getDestino() != null) {
                    contador++;
                    v.addElement(Integer.parseInt(misMetodo.getr_cliente()[x].getMonto()));
                }
            }
        }
        for (int i = 0; i < v.size(); i++) {
            vec[i] = (int) v.elementAt(i);
        }
        for (int i = 0; i < v.size(); i++) {
            System.out.println(vec[i]);
            for (int j = 0; j < v.size() - 1; j++) {
                if (vec[i] < vec[i + 1]) {
                    int aux = vec[i];
                    vec[i] = vec[i + 1];
                    vec[i + 1] = aux;
                }
            }
        }

        System.out.println("desendente");
        for (int i = 0; i < v.size(); i++) {
            for (int x = 0; x < misMetodo.numeror_cliente(); x++) {
                if (misMetodo.getr_cliente()[x].getDestino() != null) {
                    if (String.valueOf(vec[i]).equals(misMetodo.getr_cliente()[x].getMonto())) {
                        System.out.print(misMetodo.getr_cliente()[x].getIdcliente());
                        System.out.print(misMetodo.getr_cliente()[x].getNombre());
                        System.out.print(misMetodo.getr_cliente()[x].getMonto());
                        System.out.println("");
                    }
                }
            }
        }

    }

    public void cargarreproteReservacion() {
        for (int x = 0; x < misMetodo.numeroReservacion(); x++) {
            String codigoReser = misMetodo.getReservacion()[x].getCodigoReservacion();
            String codigocliente = misMetodo.getReservacion()[x].getCodigoCliente();
            String nombrecliente = null;
            String apellidoCliente = null;
            String CostoViaje = null;
            String montoReservacion = null;
            String estadoReservacion = misMetodo.getReservacion()[x].getEstadoReservacion();
            String idPaquete = misMetodo.getReservacion()[x].getCodigoPaquete();

            if (x != 0) {
                for (int i = 0; i < misMetodo.numeroCliente(); i++) {
                    if (misMetodo.getClientes()[i].getCodigoUnico().equals(codigocliente)) {
                        nombrecliente = misMetodo.getClientes()[i].getNombres();
                        apellidoCliente = misMetodo.getClientes()[i].getApellidos();
                    }
                }
                for (int i = 0; i < misMetodo.numeroAsiento(); i++) {
                    if (misMetodo.getAsiento()[i].getCodigoReservacion().equals(codigoReser)) {
                        CostoViaje = misMetodo.getAsiento()[i].getCosotPasaje();
                    }
                }
                for (int i = 0; i < misMetodo.numeroCamarots(); i++) {
                    if (misMetodo.getCamarots()[i].getCodigoReservacion().equals(codigoReser)) {
                        CostoViaje = misMetodo.getCamarots()[i].getCostoPasaje();
                    }
                }
                for (int i = 0; i < misMetodo.numeroPaquetes(); i++) {
                    if (misMetodo.getPaquetes()[i].getCodigoPaquete().equals(idPaquete)) {
                        montoReservacion = misMetodo.getPaquetes()[i].getCostoTotalPasaje();
                    }
                }
            }
            R_reservacion miR_reservacion = new R_reservacion(
                    codigoReser, codigocliente, nombrecliente, apellidoCliente,
                    CostoViaje, montoReservacion, estadoReservacion
            );
            misMetodo.agregarR_reservacion(miR_reservacion);
        }
    }

}
