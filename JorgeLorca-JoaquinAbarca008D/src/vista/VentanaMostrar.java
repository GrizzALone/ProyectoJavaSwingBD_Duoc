package vista;

import controlador.ClienteDAO;
import controlador.TrabajadorDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Trabajador;

public class VentanaMostrar extends javax.swing.JFrame {

    public VentanaMostrar() {
        initComponents();
        limpiarTablaCli();
        limpiarTablaTra();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVerCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtRutCli = new javax.swing.JTextField();
        btnBuscarCli = new javax.swing.JButton();
        btnVolverCli = new javax.swing.JButton();
        btnEliminarCli = new javax.swing.JButton();
        btnModificarCli = new javax.swing.JButton();
        btnMostrarTodoCli = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtEdadMaxCli = new javax.swing.JTextField();
        txtEdadMinCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSaldoMin = new javax.swing.JTextField();
        txtSaldoMax = new javax.swing.JTextField();
        btnFiltrarCli = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLimpiarCli = new javax.swing.JButton();
        btnTransferir = new javax.swing.JButton();
        btnMigrarCli = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnModificarTra = new javax.swing.JButton();
        btnMostrarTodoTra = new javax.swing.JButton();
        btnEliminarTra = new javax.swing.JButton();
        btnVolverTra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtRutTra = new javax.swing.JTextField();
        btnBuscarTra = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtVerTrabajador = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtEdadMinTra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEdadMaxTra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSalarioMin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSalarioMax = new javax.swing.JTextField();
        btnFiltrarTra = new javax.swing.JButton();
        btnLimpiarTra = new javax.swing.JButton();
        btnMigrarTra = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(155, 190, 200));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(937, 387));

        jPanel3.setBackground(new java.awt.Color(214, 228, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtVerCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Rut", "Nombre", "Edad", "Telefono", "Saldo", "N° cuenta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtVerCliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Ingrese el rut:");

        txtRutCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtRutCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutCliActionPerformed(evt);
            }
        });

        btnBuscarCli.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnBuscarCli.setText("Buscar");
        btnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliActionPerformed(evt);
            }
        });

        btnVolverCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnVolverCli.setText("Volver");
        btnVolverCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverCliActionPerformed(evt);
            }
        });

        btnEliminarCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnEliminarCli.setText("Eliminar");
        btnEliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliActionPerformed(evt);
            }
        });

        btnModificarCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnModificarCli.setText("Modificar");
        btnModificarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCliActionPerformed(evt);
            }
        });

        btnMostrarTodoCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnMostrarTodoCli.setText("Mostrar Todo");
        btnMostrarTodoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoCliActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Edad minima");

        txtEdadMaxCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtEdadMaxCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadMaxCliActionPerformed(evt);
            }
        });

        txtEdadMinCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtEdadMinCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadMinCliActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Edad maxima");

        txtSaldoMin.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtSaldoMax.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnFiltrarCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnFiltrarCli.setText("Filtrar");
        btnFiltrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCliActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Saldo minimo");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Saldo maximo");

        btnLimpiarCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnLimpiarCli.setText("Limpiar");
        btnLimpiarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCliActionPerformed(evt);
            }
        });

        btnTransferir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnTransferir.setText("Transferir ($)");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        btnMigrarCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnMigrarCli.setText("Migrar");
        btnMigrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMigrarCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEdadMinCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtEdadMaxCli, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSaldoMin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSaldoMax, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnFiltrarCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEliminarCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarTodoCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVolverCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTransferir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMigrarCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(txtRutCli, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnBuscarCli)))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRutCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnModificarCli)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarTodoCli)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCli)
                        .addGap(31, 31, 31)
                        .addComponent(btnTransferir)
                        .addGap(34, 34, 34)
                        .addComponent(btnMigrarCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolverCli))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadMinCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadMaxCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaldoMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaldoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrarCli)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarCli)))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Cliente", jPanel3);

        jPanel4.setBackground(new java.awt.Color(214, 228, 255));

        btnModificarTra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnModificarTra.setText("Modificar");
        btnModificarTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTraActionPerformed(evt);
            }
        });

        btnMostrarTodoTra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnMostrarTodoTra.setText("Mostrar Todo");
        btnMostrarTodoTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoTraActionPerformed(evt);
            }
        });

        btnEliminarTra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnEliminarTra.setText("Eliminar");
        btnEliminarTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTraActionPerformed(evt);
            }
        });

        btnVolverTra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnVolverTra.setText("Volver");
        btnVolverTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverTraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese el rut:");

        txtRutTra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtRutTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutTraActionPerformed(evt);
            }
        });

        btnBuscarTra.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnBuscarTra.setText("Buscar");
        btnBuscarTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTraActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setPreferredSize(new java.awt.Dimension(614, 289));

        jtVerTrabajador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Rut", "Nombre", "Edad", "Telefono", "Sueldo Base", "Cargo", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtVerTrabajador);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Edad minima");

        txtEdadMinTra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtEdadMinTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadMinTraActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Edad maxima");

        txtEdadMaxTra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Salario minimo");

        txtSalarioMin.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Salario maximo");

        txtSalarioMax.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnFiltrarTra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnFiltrarTra.setText("Filtrar");
        btnFiltrarTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarTraActionPerformed(evt);
            }
        });

        btnLimpiarTra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnLimpiarTra.setText("Limpiar");
        btnLimpiarTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTraActionPerformed(evt);
            }
        });

        btnMigrarTra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnMigrarTra.setText("Migrar");
        btnMigrarTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMigrarTraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(txtEdadMinTra, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(txtEdadMaxTra)
                    .addComponent(jLabel9)
                    .addComponent(txtSalarioMin)
                    .addComponent(jLabel10)
                    .addComponent(txtSalarioMax)
                    .addComponent(btnLimpiarTra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnFiltrarTra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(txtRutTra, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnBuscarTra))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEliminarTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarTodoTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVolverTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarTra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMigrarTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRutTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTra))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnModificarTra)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarTodoTra)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarTra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMigrarTra)
                        .addGap(53, 53, 53)
                        .addComponent(btnVolverTra))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadMinTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadMaxTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalarioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalarioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrarTra)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarTra))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Trabajador", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutCliActionPerformed

    private void btnVolverCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverCliActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverCliActionPerformed

    private void btnMostrarTodoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoCliActionPerformed
        limpiarTablaCli();
        ClienteDAO cli = new ClienteDAO();
        ArrayList<Cliente> clientes = cli.obtenerClientes();
        if(clientes.size()==0){
            JOptionPane.showMessageDialog(this, "No hay clientes para mostrar");
        }else{
            DefaultTableModel dtm=(DefaultTableModel)jtVerCliente.getModel();
            String [][] datos=new String[clientes.size()][6];
            for (int i = 0; i < clientes.size(); i++) {
                datos[i][0]=clientes.get(i).getRut();
                datos[i][1]=clientes.get(i).getNombre();
                datos[i][2]=String.valueOf(clientes.get(i).getEdad());
                datos[i][3]=String.valueOf(clientes.get(i).getTelefono());
                datos[i][4]=String.valueOf(clientes.get(i).getSaldo());
                datos[i][5]=clientes.get(i).getNumCuenta();

                dtm.addRow(datos[i]);
            }
            jtVerCliente.setModel(dtm);
        }
    }//GEN-LAST:event_btnMostrarTodoCliActionPerformed

    private void btnBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliActionPerformed
        limpiarTablaCli();
        ClienteDAO cli = new ClienteDAO();
        Cliente cc = cli.buscarCliente(txtRutCli.getText());
        
        if(cc==null){
            JOptionPane.showMessageDialog(this, "No existe el rut del cliente");
        }else{
            DefaultTableModel dtm=(DefaultTableModel)jtVerCliente.getModel();
            String [] datos=new String[6];
            datos[0]=cc.getRut();
            datos[1]=cc.getNombre();
            datos[2]=String.valueOf(cc.getEdad());
            datos[3]=String.valueOf(cc.getTelefono());
            datos[4]=String.valueOf(cc.getSaldo());
            datos[5]=cc.getNumCuenta();
            
            dtm.addRow(datos);
            jtVerCliente.setModel(dtm);
        }
    }//GEN-LAST:event_btnBuscarCliActionPerformed

    private void btnModificarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCliActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)jtVerCliente.getModel();
        int fila=jtVerCliente.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe seleccionar el cliente");
        else
        {
            String rut=String.valueOf(jtVerCliente.getValueAt(fila, 0));
            String nombre=String.valueOf(jtVerCliente.getValueAt(fila, 1));
            int edad=Integer.parseInt(String.valueOf(jtVerCliente.getValueAt(fila, 2)));
            int telefono=Integer.parseInt(String.valueOf(jtVerCliente.getValueAt(fila, 3)));
            int saldo=Integer.parseInt(String.valueOf(jtVerCliente.getValueAt(fila, 4)));
            String numCuenta=String.valueOf(jtVerCliente.getValueAt(fila, 5));
            
            Cliente cc=new Cliente(rut, nombre, edad, telefono, saldo, numCuenta);
            ClienteDAO cliDAO=new ClienteDAO();
            cliDAO.modificarCliente(cc);
            JOptionPane.showMessageDialog(this, "Cliente modificado");
        }
    }//GEN-LAST:event_btnModificarCliActionPerformed

    private void btnEliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)jtVerCliente.getModel();
        int fila=jtVerCliente.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe seleccionar el cliente");
        else
        {
            String rut=String.valueOf(jtVerCliente.getValueAt(fila, 0));
            ClienteDAO cliDAO=new ClienteDAO();
            cliDAO.eliminarCliente(rut);
            JOptionPane.showMessageDialog(this,"Cliente Eliminado");
            dtm.removeRow(fila);
        }
    }//GEN-LAST:event_btnEliminarCliActionPerformed

    private void btnModificarTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTraActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)jtVerTrabajador.getModel();
        int fila=jtVerTrabajador.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe seleccionar el trabajador");
        else
        {
            String rut=String.valueOf(jtVerTrabajador.getValueAt(fila, 0));
            String nombre=String.valueOf(jtVerTrabajador.getValueAt(fila, 1));
            int edad=Integer.parseInt(String.valueOf(jtVerTrabajador.getValueAt(fila, 2)));
            int telefono=Integer.parseInt(String.valueOf(jtVerTrabajador.getValueAt(fila, 3)));
            int sueldoBase=Integer.parseInt(String.valueOf(jtVerTrabajador.getValueAt(fila, 4)));
            String cargo=String.valueOf(jtVerTrabajador.getValueAt(fila, 5));
            
            if(cargo.equals("Analista") || cargo.equals("Ejecutivo") || cargo.equals("Gerente") || cargo.equals("Cajero")){
                Trabajador tt=new Trabajador(rut, nombre, edad, telefono, sueldoBase, cargo);
                TrabajadorDAO traDAO=new TrabajadorDAO();
                traDAO.modificarTrabajador(tt);
                JOptionPane.showMessageDialog(this, "Trabajador modificado");
            }else{
                JOptionPane.showMessageDialog(this, "El cargo debe ser Administrativo, Ejecutivo, Gerente o Cajero, respetando mayusculas");
            }
        }
    }//GEN-LAST:event_btnModificarTraActionPerformed

    private void btnEliminarTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTraActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)jtVerTrabajador.getModel();
        int fila=jtVerTrabajador.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe seleccionar el trabajador");
        else
        {
            String rut=String.valueOf(jtVerTrabajador.getValueAt(fila, 0));
            TrabajadorDAO traDAO=new TrabajadorDAO();
            traDAO.eliminarTrabajador(rut);
            JOptionPane.showMessageDialog(this,"Trabajador Eliminado");
            dtm.removeRow(fila);
        }
    }//GEN-LAST:event_btnEliminarTraActionPerformed

    private void btnVolverTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverTraActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverTraActionPerformed

    private void txtRutTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutTraActionPerformed

    private void btnBuscarTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTraActionPerformed
        limpiarTablaTra();
        TrabajadorDAO tra=new TrabajadorDAO();
        Trabajador tt = tra.buscarTrabajador(txtRutTra.getText());
        
        if(tt==null){
            JOptionPane.showMessageDialog(this, "No existe el rut del Trabajador");
        }else{
            DefaultTableModel dtm=(DefaultTableModel)jtVerTrabajador.getModel();
            String [] datos=new String[7];
            datos[0]=tt.getRut();
            datos[1]=tt.getNombre();
            datos[2]=String.valueOf(tt.getEdad());
            datos[3]=String.valueOf(tt.getTelefono());
            datos[4]=String.valueOf(tt.getSueldoBase());
            datos[5]=tt.getCargo();
            datos[6]=String.valueOf(tt.calcularSueldo());
            
            dtm.addRow(datos);
            jtVerTrabajador.setModel(dtm);
        }
    }//GEN-LAST:event_btnBuscarTraActionPerformed

    private void btnMostrarTodoTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoTraActionPerformed
        limpiarTablaTra();
        TrabajadorDAO tra = new TrabajadorDAO();
        ArrayList<Trabajador> trabajadores = tra.obtenerTrabajadores();
        if(trabajadores.size()==0){
            JOptionPane.showMessageDialog(this, "No hay trabajadores para mostrar");
        }else{
            DefaultTableModel dtm=(DefaultTableModel)jtVerTrabajador.getModel();
            String [][] datos=new String[trabajadores.size()][7];
            for (int i = 0; i < trabajadores.size(); i++) {
                datos[i][0]=trabajadores.get(i).getRut();
                datos[i][1]=trabajadores.get(i).getNombre();
                datos[i][2]=String.valueOf(trabajadores.get(i).getEdad());
                datos[i][3]=String.valueOf(trabajadores.get(i).getTelefono());
                datos[i][4]=String.valueOf(trabajadores.get(i).getSueldoBase());
                datos[i][5]=trabajadores.get(i).getCargo();
                datos[i][6]=String.valueOf(trabajadores.get(i).calcularSueldo());

                dtm.addRow(datos[i]);
            }
            jtVerTrabajador.setModel(dtm);
        }
    }//GEN-LAST:event_btnMostrarTodoTraActionPerformed

    private void txtEdadMinCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadMinCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadMinCliActionPerformed

    private void btnFiltrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCliActionPerformed
        limpiarTablaCli();
        ClienteDAO cli = new ClienteDAO();
        ArrayList<Cliente> clientes = cli.obtenerClientes();
        
        if(clientes.size()==0){
            JOptionPane.showMessageDialog(this, "No hay clientes para mostrar");
        }else{
            
            int edadMin=0;
            if(!txtEdadMinCli.getText().isEmpty()){
                edadMin=Integer.parseInt(txtEdadMinCli.getText());
            }

            int edadMax=150;
            if(!txtEdadMaxCli.getText().isEmpty()){
                edadMax=Integer.parseInt(txtEdadMaxCli.getText());
            }

            int saldoMin=0;
            if(!txtSaldoMin.getText().isEmpty()){
                saldoMin=Integer.parseInt(txtSaldoMin.getText());
            }

            int saldoMax=999999999;
            if(!txtSaldoMax.getText().isEmpty()){
                saldoMax=Integer.parseInt(txtSaldoMax.getText());
            }

            for (int i = 0; i < clientes.size(); i++) {
                if(clientes.get(i).getEdad()<edadMin || clientes.get(i).getEdad()>edadMax){
                    clientes.remove(i);
                    i--;
                }
            }
            
            for (int i = 0; i < clientes.size(); i++) {
                if(clientes.get(i).getSaldo()<saldoMin || clientes.get(i).getSaldo()>saldoMax){
                    clientes.remove(i);
                    i--;
                }
            }
            
            DefaultTableModel dtm=(DefaultTableModel)jtVerCliente.getModel();
            String [][] datos=new String[clientes.size()][6];
            for (int i = 0; i < clientes.size(); i++) {
                datos[i][0]=clientes.get(i).getRut();
                datos[i][1]=clientes.get(i).getNombre();
                datos[i][2]=String.valueOf(clientes.get(i).getEdad());
                datos[i][3]=String.valueOf(clientes.get(i).getTelefono());
                datos[i][4]=String.valueOf(clientes.get(i).getSaldo());
                datos[i][5]=clientes.get(i).getNumCuenta();

                dtm.addRow(datos[i]);
            }
            jtVerCliente.setModel(dtm);
        }
    }//GEN-LAST:event_btnFiltrarCliActionPerformed

    private void txtEdadMaxCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadMaxCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadMaxCliActionPerformed

    private void txtEdadMinTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadMinTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadMinTraActionPerformed

    private void btnFiltrarTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarTraActionPerformed
        limpiarTablaTra();
        TrabajadorDAO tra = new TrabajadorDAO();
        ArrayList<Trabajador> trabajadores = tra.obtenerTrabajadores();
        
        if(trabajadores.size()==0){
            JOptionPane.showMessageDialog(this, "No hay trabajadores para mostrar");
        }else{
            
            int edadMin=0;
            if(!txtEdadMinTra.getText().isEmpty()){
                edadMin=Integer.parseInt(txtEdadMinTra.getText());
            }

            int edadMax=150;
            if(!txtEdadMaxTra.getText().isEmpty()){
                edadMax=Integer.parseInt(txtEdadMaxTra.getText());
            }

            int salarioMin=0;
            if(!txtSalarioMin.getText().isEmpty()){
                salarioMin=Integer.parseInt(txtSalarioMin.getText());
            }

            int salarioMax=999999999;
            if(!txtSalarioMax.getText().isEmpty()){
                salarioMax=Integer.parseInt(txtSalarioMax.getText());
            }

            for (int i = 0; i < trabajadores.size(); i++) {
                if(trabajadores.get(i).getEdad()<edadMin || trabajadores.get(i).getEdad()>edadMax){
                    trabajadores.remove(i);
                    i--;
                }
            }
            
            for (int i = 0; i < trabajadores.size(); i++) {
                if(trabajadores.get(i).calcularSueldo()<salarioMin || trabajadores.get(i).calcularSueldo()>salarioMax){
                    trabajadores.remove(i);
                    i--;
                }
            }
            
            DefaultTableModel dtm=(DefaultTableModel)jtVerTrabajador.getModel();
            String [][] datos=new String[trabajadores.size()][7];
            for (int i = 0; i < trabajadores.size(); i++) {
                datos[i][0]=trabajadores.get(i).getRut();
                datos[i][1]=trabajadores.get(i).getNombre();
                datos[i][2]=String.valueOf(trabajadores.get(i).getEdad());
                datos[i][3]=String.valueOf(trabajadores.get(i).getTelefono());
                datos[i][4]=String.valueOf(trabajadores.get(i).getSueldoBase());
                datos[i][5]=trabajadores.get(i).getCargo();
                datos[i][6]=String.valueOf(trabajadores.get(i).calcularSueldo());

                dtm.addRow(datos[i]);
            }
            jtVerTrabajador.setModel(dtm);
        }
    }//GEN-LAST:event_btnFiltrarTraActionPerformed

    private void btnLimpiarTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTraActionPerformed
        txtEdadMaxTra.setText("");
        txtEdadMinTra.setText("");
        txtSalarioMin.setText("");
        txtSalarioMax.setText("");
    }//GEN-LAST:event_btnLimpiarTraActionPerformed

    private void btnLimpiarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCliActionPerformed
        txtEdadMinCli.setText("");
        txtEdadMaxCli.setText("");
        txtSaldoMin.setText("");
        txtSaldoMax.setText("");
    }//GEN-LAST:event_btnLimpiarCliActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        VentanaTransferencia ven=new VentanaTransferencia();
        ven.setTitle("Transferencia");
        ven.setResizable(false);
        ven.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ven.setVisible(true);
        ven.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void btnMigrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMigrarCliActionPerformed
        VentanaMigrarCliente ven=new VentanaMigrarCliente();
        ven.setTitle("Migrando a Trabajador");
        ven.setResizable(false);
        ven.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ven.setVisible(true);
        ven.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMigrarCliActionPerformed

    private void btnMigrarTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMigrarTraActionPerformed
        VentanaMigrarTrabajador ven=new VentanaMigrarTrabajador();
        ven.setTitle("Migrando a Cliente");
        ven.setResizable(false);
        ven.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ven.setVisible(true);
        ven.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMigrarTraActionPerformed

    public void limpiarTablaCli(){
       DefaultTableModel dtm=(DefaultTableModel)jtVerCliente.getModel();
       int n=jtVerCliente.getRowCount()-1;
       for (int i = 0; i <=n; i++) {
           dtm.removeRow(dtm.getRowCount()-1);
       }
   }
    
    public void limpiarTablaTra(){
       DefaultTableModel dtm=(DefaultTableModel)jtVerTrabajador.getModel();
       int n=jtVerTrabajador.getRowCount()-1;
       for (int i = 0; i <=n; i++) {
           dtm.removeRow(dtm.getRowCount()-1);
       }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JButton btnBuscarTra;
    private javax.swing.JButton btnEliminarCli;
    private javax.swing.JButton btnEliminarTra;
    private javax.swing.JButton btnFiltrarCli;
    private javax.swing.JButton btnFiltrarTra;
    private javax.swing.JButton btnLimpiarCli;
    private javax.swing.JButton btnLimpiarTra;
    private javax.swing.JButton btnMigrarCli;
    private javax.swing.JButton btnMigrarTra;
    private javax.swing.JButton btnModificarCli;
    private javax.swing.JButton btnModificarTra;
    private javax.swing.JButton btnMostrarTodoCli;
    private javax.swing.JButton btnMostrarTodoTra;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnVolverCli;
    private javax.swing.JButton btnVolverTra;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable jtVerCliente;
    private javax.swing.JTable jtVerTrabajador;
    private javax.swing.JTextField txtEdadMaxCli;
    private javax.swing.JTextField txtEdadMaxTra;
    private javax.swing.JTextField txtEdadMinCli;
    private javax.swing.JTextField txtEdadMinTra;
    private javax.swing.JTextField txtRutCli;
    private javax.swing.JTextField txtRutTra;
    private javax.swing.JTextField txtSalarioMax;
    private javax.swing.JTextField txtSalarioMin;
    private javax.swing.JTextField txtSaldoMax;
    private javax.swing.JTextField txtSaldoMin;
    // End of variables declaration//GEN-END:variables
}
