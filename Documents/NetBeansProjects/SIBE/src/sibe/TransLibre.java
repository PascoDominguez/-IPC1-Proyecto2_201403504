package sibe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class TransLibre extends JFrame {

    private JPanel contentPane;
    private JLabel lblMonto, nombreUsuario;
    private JTextField txtMonto, txtNombreUsuario;
    private TextPrompt placeholder;
    private JButton btnTransferir, btnCancelar;

    //atributos
    private Datos misDatos;

    public void setDatos(Datos datos) {
        misDatos = datos;
    }

    public TransLibre() {
        this.init_component();
    }

    public void init_component() {

        setTitle("TRANSFERENCIA");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setLayout(null);
        this.contentPane.setSize(350, 250);

        this.nombreUsuario = new JLabel("NOMBRE DE USUARIO");
        this.nombreUsuario.setSize(150, 30);
        this.nombreUsuario.setLocation(10, 30);
        this.contentPane.add(nombreUsuario);

        this.txtNombreUsuario = new JTextField();
        this.placeholder = new TextPrompt("Nombre del Usuario", this.txtNombreUsuario);
        this.placeholder.setForeground(Color.black);
        this.placeholder.changeAlpha(0.4f);
        this.txtNombreUsuario.setSize(160, 30);
        this.txtNombreUsuario.setLocation(150, 30);
        this.contentPane.add(this.txtNombreUsuario);

        this.lblMonto = new JLabel("MONTO", (int) JLabel.LEFT_ALIGNMENT);
        this.lblMonto.setSize(150, 30);
        this.lblMonto.setLocation(10, 80);
        this.contentPane.add(lblMonto);

        this.txtMonto = new JTextField();
        this.placeholder = new TextPrompt("Monto a depositar", this.txtMonto);
        this.placeholder.setForeground(Color.black);
        this.placeholder.changeAlpha(0.4f);
        this.txtMonto.setSize(160, 30);
        this.txtMonto.setLocation(150, 80);
        this.contentPane.add(this.txtMonto);

        //BOTONES **********************************************************
        //boton transferir --------------------------------------
        this.btnTransferir = new JButton("TRANSFERIR");
        this.btnTransferir.setSize(105, 30);
        this.btnTransferir.setLocation(205, 150);
        this.btnTransferir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnTransferir(e);
            }
        });
        this.contentPane.add(this.btnTransferir);


    }


    public void btnTransferir(ActionEvent e) {
        btnTransferir();

    }

    public void btnTransferir() {
        for (int i = 0; i < misDatos.numeroCliente(); i++) {
            if (this.txtNombreUsuario.getText().equals(misDatos.getClientes()[i].getNombreUsuario())) {
                this.restarSaldo();
                
            } else {
                JOptionPane.showMessageDialog(this, "Nombre de Usuario Incorrecto");
            }
        }
        this.setVisible(false);
    }

    public void restarSaldo() {
        Double numero1 = Double.parseDouble(this.txtMonto.getText());
        Double numero2 = misDatos.getClientes()[misDatos.posicionCliente()].getSaldoInicial();
        if (numero2 >= numero1) {
            double saldoActual = numero2 - numero1;
            misDatos.getClientes()[misDatos.posicionCliente()].setSaldoInicial(saldoActual);
            JOptionPane.showConfirmDialog(null, "Desea imprimir Voucher");
        } else {
            JOptionPane.showMessageDialog(this, "FONDO INSUFICIENTE");
        }
    }
    

}
