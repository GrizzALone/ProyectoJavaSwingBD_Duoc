package vista;

import controlador.ClienteDAO;
import controlador.TrabajadorDAO;
import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Trabajador;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuMostrar = new javax.swing.JMenuItem();
        jmenu3 = new javax.swing.JMenu();
        menuIngresar = new javax.swing.JMenuItem();
        jmenu4 = new javax.swing.JMenu();
        menuCliRegis = new javax.swing.JMenuItem();
        menuCliMayor = new javax.swing.JMenuItem();
        menuTraContra = new javax.swing.JMenuItem();
        menuTotalGer = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuDocumentacion = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("¡Bienvenido a nuestro Banco!");

        jMenu1.setText("Archivo");

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ver");

        menuMostrar.setText("Mostrar datos");
        menuMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMostrarActionPerformed(evt);
            }
        });
        jMenu2.add(menuMostrar);

        jMenuBar1.add(jMenu2);

        jmenu3.setText("Insertar");

        menuIngresar.setText("Ingresar datos");
        menuIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIngresarActionPerformed(evt);
            }
        });
        jmenu3.add(menuIngresar);

        jMenuBar1.add(jmenu3);

        jmenu4.setText("Estadisticas");

        menuCliRegis.setText("Clientes registrados");
        menuCliRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCliRegisActionPerformed(evt);
            }
        });
        jmenu4.add(menuCliRegis);

        menuCliMayor.setText("Clientes con saldo mayor a $1000000");
        menuCliMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCliMayorActionPerformed(evt);
            }
        });
        jmenu4.add(menuCliMayor);

        menuTraContra.setText("Trabajadores contratos");
        menuTraContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTraContraActionPerformed(evt);
            }
        });
        jmenu4.add(menuTraContra);

        menuTotalGer.setText("Total de Gerentes");
        menuTotalGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTotalGerActionPerformed(evt);
            }
        });
        jmenu4.add(menuTotalGer);

        jMenuBar1.add(jmenu4);

        jMenu5.setText("Ayuda");

        menuDocumentacion.setText("Documentacion");
        menuDocumentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDocumentacionActionPerformed(evt);
            }
        });
        jMenu5.add(menuDocumentacion);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIngresarActionPerformed
        VentanaIngreso ven=new VentanaIngreso();
        ven.setTitle("Formulario de Ingreso");
        ven.setResizable(false);
        ven.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ven.setVisible(true);
        ven.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuIngresarActionPerformed

    private void menuMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMostrarActionPerformed
        VentanaMostrar ven=new VentanaMostrar();
        ven.setTitle("Mostrando datos");
        ven.setResizable(false);
        ven.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ven.setVisible(true);
        ven.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuMostrarActionPerformed

    private void menuCliRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCliRegisActionPerformed
        ClienteDAO cliDAO = new ClienteDAO();
        int cant = cliDAO.obtenerClientes().size();
        JOptionPane.showMessageDialog(this, "Hay "+cant+" cliente(s) registrados en la base de datos");
    }//GEN-LAST:event_menuCliRegisActionPerformed

    private void menuTraContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTraContraActionPerformed
        TrabajadorDAO traDAO = new TrabajadorDAO();
        int cant = traDAO.obtenerTrabajadores().size();
        JOptionPane.showMessageDialog(this, "Hay "+cant+" trabajadore(s) registrados en la base de datos");
    }//GEN-LAST:event_menuTraContraActionPerformed

    private void menuCliMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCliMayorActionPerformed
        ClienteDAO cliDAO = new ClienteDAO();
        ArrayList<Cliente> cc= cliDAO.obtenerClientes();
        int cont=0;
        for (int i = 0; i < cc.size(); i++) {
            if(cc.get(i).getSaldo()>=1000000){
                cont++;
            }
        }
        JOptionPane.showMessageDialog(this, "Hay "+cont+" cliente(s) con saldo mayor a $1000000 en la base de datos");
    }//GEN-LAST:event_menuCliMayorActionPerformed

    private void menuTotalGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTotalGerActionPerformed
        TrabajadorDAO traDAO = new TrabajadorDAO();
        ArrayList<Trabajador> tt= traDAO.obtenerTrabajadores();
        int cont=0;
        for (int i = 0; i < tt.size(); i++) {
            if(tt.get(i).getCargo().equalsIgnoreCase("Gerente")){
                cont++;
            }
        }
        JOptionPane.showMessageDialog(this, "Hay "+cont+" gerente(s) del banco registrados en la base de datos");
    }//GEN-LAST:event_menuTotalGerActionPerformed

    private void menuDocumentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDocumentacionActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://docs.google.com/document/d/1yXGa6LnOShhRzMdeWk43uAQBRv8T0pL2/edit?usp=drive_link&ouid=100705829876862545396&rtpof=true&sd=true"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_menuDocumentacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jmenu3;
    private javax.swing.JMenu jmenu4;
    private javax.swing.JMenuItem menuCliMayor;
    private javax.swing.JMenuItem menuCliRegis;
    private javax.swing.JMenuItem menuDocumentacion;
    private javax.swing.JMenuItem menuIngresar;
    private javax.swing.JMenuItem menuMostrar;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuTotalGer;
    private javax.swing.JMenuItem menuTraContra;
    // End of variables declaration//GEN-END:variables
}
