package Vista;

import Controlador.Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TiempoCarreraView extends JFrame {

    // Componentes del formulario
    private JButton jButtonSalir;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JButton jButtonGuardar;
    private JButton jButtonEliminar;
    private JButton jButtonModificar;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    public Object btnModificar;
    public Object btnGuardar;
    public Object txtId;
    public Object getTex;
    // Constructor
    public TiempoCarreraView() {
        initComponents();
    }

    // Método para inicializar los componentes del formulario
    private void initComponents() {
        jButtonSalir = new JButton();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButtonGuardar = new JButton();
        jButtonEliminar = new JButton();
        jButtonModificar = new JButton();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jPanel1 = new JPanel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 255));
        setFont(new java.awt.Font("Cascadia Code", 0, 10));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(51, 102, 255));
        jButtonSalir.setFont(new java.awt.Font("Cascadia Code", 1, 12));
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.setToolTipText("");
        jButtonSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 2, 10));
        jLabel4.setText("(hh:mm:ss)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 70, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 241, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 317, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 317, -1));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 2, 12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese su Tiempo de carrera");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 11));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 2, 12));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese su distancia recorrida");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 2, 12));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese su frecuencia cardiaca (opcional)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jButtonGuardar.setBackground(new java.awt.Color(102, 255, 153));
        jButtonGuardar.setFont(new java.awt.Font("Cascadia Code", 0, 12));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jButtonEliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonEliminar.setFont(new java.awt.Font("Cascadia Code", 0, 12));
        jButtonEliminar.setText("Eliminar");
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jButtonModificar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonModificar.setFont(new java.awt.Font("Cascadia Code", 0, 12));
        jButtonModificar.setText("Modificar");
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 0, 12));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Running-Marca");
        jPanel1.add(jLabel5);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 300));

        pack();
    }

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiempoCarreraView().setVisible(true);
            }
        });
    }

    // Clase interna para el botón Guardar
    public class btnGuardar {

        public static void addActionListener(Controlador aThis) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public btnGuardar() {
            jButtonGuardar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lógica para el botón Guardar
                }
            });
        }
    }

    // Clase interna para el botón Modificar
    public class btnModificar {

        public static void addActionListener(Controlador aThis) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public btnModificar() {
            jButtonModificar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lógica para el botón Modificar
                }
            });
        }
    }

    // Clase interna para el botón Eliminar
    public class btnEliminar {

        public static void addActionListener(Controlador aThis) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public btnEliminar() {
            jButtonEliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lógica para el botón Eliminar
                }
            });
        }
    }

    public class txtTiempoCarrera {

        public static void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public txtTiempoCarrera() {
        }
    }
}
