
package GUI;



import static GUI.InicioSesion.PASS;
import static GUI.InicioSesion.URL;
import static GUI.InicioSesion.USER;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;



/**
 *
 * @author Kenny Londoño
 */
public class ModificarHorario extends javax.swing.JFrame {
PreparedStatement ps;
    ResultSet rs;
   
     public static Connection getConection() {
        Connection con = null;
try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
     }
    
    public ModificarHorario() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);

         DefaultTableModel modelo = new DefaultTableModel();
        jtEmpleados.setModel(modelo);

        modelo.addColumn("Id");
        modelo.addColumn("Jornada");
        modelo.addColumn("Jornada_Manana");
        modelo.addColumn("Jornada_Tarde");

        try (Connection con = getConection();
             PreparedStatement ps = con.prepareStatement("SELECT Id, Jornada, Jornada_Manana, Jornada_Tarde  FROM control_horario");
             ResultSet rs = ps.executeQuery()) {

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar datos: " + e.getMessage());
        }
        
    }

    private void cargarDatosTabla() {
    DefaultTableModel modelo = new DefaultTableModel();
    jtEmpleados.setModel(modelo);

        modelo.addColumn("Id");
        modelo.addColumn("Jornada");
        modelo.addColumn("Jornada_Manana");
        modelo.addColumn("Jornada_Tarde");

    try (Connection con = getConection();
         PreparedStatement ps = con.prepareStatement("SELECT Id, Jornada, Jornada_Manana, Jornada_Tarde  FROM control_horario");
         ResultSet rs = ps.executeQuery()) {

        ResultSetMetaData rsMd = rs.getMetaData();
        int cantidadColumnas = rsMd.getColumnCount();

        while (rs.next()) {
            Object[] filas = new Object[cantidadColumnas];
            for (int i = 0; i < cantidadColumnas; i++) {
                filas[i] = rs.getObject(i + 1);
            }
            modelo.addRow(filas);
        }
    } catch (SQLException e) {
        System.err.println("Error al cargar datos: " + e.getMessage());
    }


    }

    
    private void limpiarcajas(){
   
       txtCodigo.setText(null);
        txtJManana.setText(null);
      txtJTarde.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pantalla = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleados = new javax.swing.JTable();
        txtJManana = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtJTarde = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxJornada = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnSolicitudes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(53, 128, 178));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setBackground(new java.awt.Color(245, 245, 245));
        pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtEmpleados);

        content.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 730, 70));

        txtJManana.setBackground(new java.awt.Color(255, 255, 255));
        txtJManana.setBorder(null);
        txtJManana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJMananaActionPerformed(evt);
            }
        });
        content.add(txtJManana, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 200, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 128, 187));
        jLabel1.setText("Horario Jornada Mañana");
        content.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 128, 187));
        jLabel3.setText("Horario Jornada Tarde");
        content.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 180, -1));

        txtJTarde.setBackground(new java.awt.Color(255, 255, 255));
        txtJTarde.setBorder(null);
        content.add(txtJTarde, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 128, 187));
        jLabel4.setText("Jornada");
        content.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 60, -1));

        BtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        BtnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BtnIniciarSesion.png"))); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.setContentAreaFilled(false);
        BtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        content.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 443, 130, 40));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BtnIniciarSesion.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        btnBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        content.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 80, 100, 40));

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        content.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(53, 128, 187));
        jLabel5.setText("Codigo");
        content.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 60, -1));

        cbxJornada.setBackground(new java.awt.Color(255, 255, 255));
        cbxJornada.setForeground(new java.awt.Color(204, 204, 204));
        cbxJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar ", "Mañana", "Tarde", "Mixta" }));
        content.add(cbxJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 120, -1));
        content.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 110, 30));
        content.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 200, 30));
        content.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 200, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BtnIniciarSesion.png"))); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setInheritsPopupMenu(true);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        content.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 130, 100, 40));

        pantalla.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1320, 620));

        jPanel1.add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 1360, 670));

        btnRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registro");
        btnRegistro.setBorder(null);
        btnRegistro.setContentAreaFilled(false);
        btnRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 60));

        btnSolicitudes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSolicitudes.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitudes.setText("Solitudes");
        btnSolicitudes.setBorder(null);
        btnSolicitudes.setContentAreaFilled(false);
        btnSolicitudes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSolicitudes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        btnSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudesActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 60));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Empleados");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 60));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar Sesión");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 260, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 110, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
       Registro p1 = new Registro();
       
       ShowJFrame(p1);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudesActionPerformed
        Permisos soliAdm = new Permisos();
       
       ShowJFrame(soliAdm);
    }//GEN-LAST:event_btnSolicitudesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ModificarHorario empAdm = new ModificarHorario();
       
       ShowJFrame(empAdm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      System.exit(0); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtJMananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJMananaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJMananaActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
       int Fila = jtEmpleados.getSelectedRow();
    if (Fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (txtCodigo.getText().isEmpty() || txtJManana.getText().isEmpty() || txtJTarde.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conn = getConection();
         PreparedStatement ps = conn.prepareStatement("UPDATE control_horario SET Jornada = ?, Jornada_Manana = ?, Jornada_Tarde = ? WHERE Id")) {

        ps.setString(1, cbxJornada.getSelectedItem().toString()); 
        ps.setString(2, txtJManana.getText());
        ps.setString(3, txtJTarde.getText());
      

        ps.executeUpdate();

        JOptionPane.showMessageDialog(this, "Horario Modificado");

        jtEmpleados.setValueAt(cbxJornada.getSelectedItem().toString(), Fila, 1);
        jtEmpleados.setValueAt(txtJManana.getText(), Fila, 2);
        jtEmpleados.setValueAt(txtJTarde.getText(), Fila, 3);

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al Modificar Horarios: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String campo = txtCodigo.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "WHERE Codigo = ?";
        }

        DefaultTableModel modelo = new DefaultTableModel();
        jtEmpleados.setModel(modelo);

        modelo.addColumn("Codigo");
        modelo.addColumn("Jornada");
        modelo.addColumn("Jornada Mañana");
        modelo.addColumn("Jornada Tarde");

        int[] anchos = {50, 20, 50,20 };
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            jtEmpleados.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try (Connection con = getConection();
             PreparedStatement ps = con.prepareStatement("SELECT Codigo, Jornada_Manana, Jornada_Tarde FROM control_horario " + where)) {

            if (!"".equals(campo)) {
                ps.setString(1, campo);
            }

            try (ResultSet rs = ps.executeQuery()) {
                int cantidadColumnas = rs.getMetaData().getColumnCount();

                while (rs.next()) {
                    Object[] filas = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar los empleados: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      cargarDatosTabla();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarHorario().setVisible(true);
            }
        });
    }

   private void ShowJFrame(JFrame p) {
   content.removeAll();
   content.add(p, BorderLayout.CENTER);
   content.revalidate();
   content.repaint();
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSolicitudes;
    private javax.swing.JComboBox<String> cbxJornada;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jtEmpleados;
    private javax.swing.JPanel pantalla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtJManana;
    private javax.swing.JTextField txtJTarde;
    // End of variables declaration//GEN-END:variables
}
