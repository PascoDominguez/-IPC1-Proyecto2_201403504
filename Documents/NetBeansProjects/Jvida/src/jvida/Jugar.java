package jvida;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jugar extends JFrame implements Runnable, ActionListener {

    private JPanel panel1;
    private JPanel panel2;
    private JTextField iteraciones;
    private JButton btnParar;
    private JButton btnJugar;
    private JSlider slVelocidad;
    public static int numero;
    IngresoTablero it;
    public int n = it.numero;
//    public int n = 30;
    JButton celdas[][] = new JButton[n][n];
    boolean celda_viva[][] = new boolean[n][n];
    boolean celda_viva_actualizada[][] = new boolean[n][n];
    ;
int cont_iteraciones = 0;
    boolean continuar = true;

    public Jugar() {
        this.init_component();
        panel2.setBackground(Color.BLACK);
        panel1.setBackground(Color.BLACK);
    }

    public void init_component() {
        setSize(800, 700);
        setLocationRelativeTo(null);
        setTitle("JUEGO DE LA VIDA");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel1 = new JPanel(new GridLayout(n, n)); //panel del tablero
        this.panel1.setSize(700, 550);
        this.panel1.setLocation(40, 10);
        
        this.panel2 = new JPanel(null);
        this.panel2.setSize(600, 600);
        this.panel2.add(panel1);
        getContentPane().add(panel2);
        // dibujar Tabla
        this.dibujarTabla();

        //BOTON START
        this.btnJugar = new JButton("START");
        this.btnJugar.setBounds(80, 575, 100, 30);
        this.btnJugar.addActionListener(this);
        this.panel2.add(this.btnJugar);

        //boton PARAR
        this.btnParar = new JButton("PAUSE");
        this.btnParar.setBounds(200, 575, 100, 30);
        this.btnParar.addActionListener(this);
        this.panel2.add(this.btnParar);

        //ITERACIONES
        this.iteraciones = new JTextField(" ");
        iteraciones.setBounds(400, 625, 100, 30);
        this.panel2.add(this.iteraciones);
        
        //Slider
        this.slVelocidad = new JSlider(JSlider.HORIZONTAL, 0, 100, 5);
        this.slVelocidad.setPaintLabels(true);
        this.slVelocidad.setMinorTickSpacing(5);
        this.slVelocidad.setMajorTickSpacing(10);
        this.slVelocidad.setBounds(400, 575, 335, 50);
        this.slVelocidad.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt){
                //aqui va el evento
                slVelocidad(evt);
            }
            
        });
        this.panel2.add(this.slVelocidad);
    }

    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (ae.getSource() == celdas[i][j]) {
                    if (celda_viva[i][j] == false) {
                        celdas[i][j].setBackground(java.awt.Color.yellow);
                        celda_viva[i][j] = true;
                    } else {
                        celdas[i][j].setBackground(java.awt.Color.BLACK);
                        celda_viva[i][j] = false;
                    }
                }
            }
        }

        if (ae.getSource() == btnJugar) {

            ejecutarHilo();
            continuar = true;

        }//boton calcular

        if (ae.getSource() == btnParar) {
            detenerHilo();
        }
    }	// evento

    public void run() {

        try {
            while (continuar == true) {

                cont_iteraciones++;

                for (int i = 0; i < (n - 1); i++) {
                    for (int j = 0; j < (n - 1); j++) {
                        int vivas = 0;
                        if (i > 0 && j > 0 && j < n - 1 && i < n - 1) {
                            if (celda_viva[i][j + 1] == true) {// 1,2derecha
                                vivas++;
                            }
                            if (celda_viva[i][j - 1] == true) {//1,0izquierda
                                vivas++;
                            }
                            if (celda_viva[i + 1][j] == true) {//0,1arriba
                                vivas++;
                            }
                            if (celda_viva[i - 1][j] == true) {// 2,1abajo
                                vivas++;
                            }
                            if (celda_viva[i - 1][j - 1] == true) {//0,0 //superior izquierda
                                vivas++;
                            }
                            if (celda_viva[i - 1][j + 1] == true) {//0,0//Superior derecha
                                vivas++;
                            }
                            if (celda_viva[i + 1][j - 1] == true) {//2,0 Inferior izquierda
                                vivas++;
                            }
                            if (celda_viva[i + 1][j + 1] == true) { //2,2 Inferior Derecho
                                vivas++;
                            }

                        }//if cerrar

                        //comenzamos con las reglas del juego	
                        if (celda_viva[i][j] == true) // si el botón esta activado
                        {

                            if (vivas == 2 || vivas == 3) {
                                celda_viva_actualizada[i][j] = true;
                                celdas[i][j].setBackground(java.awt.Color.yellow);

                            } else {
                                celda_viva_actualizada[i][j] = false;
                                celdas[i][j].setBackground(java.awt.Color.BLACK);

                            }
                        } else if (celda_viva[i][j] == false)//si el botón esta inactivo 
                        {
                            if (vivas == 3) {
                                celda_viva_actualizada[i][j] = true;
                                celdas[i][j].setBackground(java.awt.Color.yellow);

                            } else {
                                celda_viva_actualizada[i][j] = false;
                                celdas[i][j].setBackground(java.awt.Color.BLACK);
                            }

                        }
                    }//for
                }//for

                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - 1; j++) {

                        celda_viva[i][j] = celda_viva_actualizada[i][j];
                    }

                }

                iteraciones.setText(Integer.toString(cont_iteraciones));
//                Thread.sleep(100);
                try {
                    Thread.sleep(1000-10*(Jugar.numero));
                } catch (Exception e) {
                }
            }// while           	
        }//try
        catch (Exception e) {
        }// exception    	   		
    }//run	

    public void ejecutarHilo() {
        Thread hilo = new Thread(this);
        hilo.start();
    }

    public void detenerHilo() {
        continuar = false;
    }

    public void dibujarTabla() {
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas.length; j++) {

                celdas[i][j] = new JButton();
                celdas[i][j].setBackground(java.awt.Color.BLACK);
                panel1.add(celdas[i][j]);
                celdas[i][j].addActionListener(this);
                celda_viva[i][j] = false;

            }
        }
    }
    
    public void slVelocidad(MouseEvent evt){
        numero = this.slVelocidad.getValue();
        System.out.println(numero);
                
    }

}
