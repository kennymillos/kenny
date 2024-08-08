
package GUI;


import GUI.*;
import static GUI.InicioSesion.PASS;
import static GUI.InicioSesion.URL;
import static GUI.InicioSesion.USER;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Kenny Londoño
 */
public class Permisos extends javax.swing.JFrame {
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
    
    public Permisos() {
        initComponents();
        cargarDatosTabla();
    }
    
    private void limpiarcajas(){
   
       txtCodigo.setText(null);         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pantalla = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPermisos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        cbxEstado = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnRegistro = new javax.swing.JButton();
        btnSolicitudes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
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
        content.setForeground(new java.awt.Color(204, 204, 204));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setText("Permisos");
        content.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 210, 50));

        jtPermisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtPermisos);

        content.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 760, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Codigo");
        content.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 50, -1));

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigo.setBorder(null);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        content.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 90, -1));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 102, 204));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        content.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 110, 150, 40));

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 102, 204));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        content.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 160, 150, 40));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 102, 204));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        content.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 210, 150, 40));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Aprobada", "Denegada" }));
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });
        content.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, -1, -1));
        content.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 110, -1));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        content.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 60, 630));

        pantalla.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1270, 620));

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
        btnSolicitudes.setText("Solicitudes");
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
        jButton1.setText("Empleados- Horarios");
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("KENCLOCK");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, -1));
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
       Registro registroFrame = new Registro();
       ShowFrame(registroFrame);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudesActionPerformed
        Permisos permisosFrame = new Permisos(); // Crea una nueva instancia del frame de permisos
    ShowFrame(permisosFrame);
    }//GEN-LAST:event_btnSolicitudesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ModificarHorario modificarHorarioFrame = new ModificarHorario(); // Crea una nueva instancia del frame de modificar horario
    ShowFrame(modificarHorarioFrame); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      System.exit(0); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String campo = txtCodigo.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "WHERE Codigo = ?";
        }

        DefaultTableModel modelo = new DefaultTableModel();
        jtPermisos.setModel(modelo);

        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Motivo");
        modelo.addColumn("Solicitud");
        modelo.addColumn("Estado");

        int[] anchos = {50, 20, 50, 20};
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            jtPermisos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try (Connection con = getConection();
             PreparedStatement ps = con.prepareStatement("SELECT Codigo, Nombre, Motivo, Solicitud, Estado FROM permisos_inasistencias " + where)) {

            if (!"".equals(campo)) {
                ps.setString(1, campo);
            }

            try (ResultSet rs = ps.executeQuery()) {
                int cantidadColumnas = rs.getMetaData().getColumnCount();

                boolean userFound = false;
                while (rs.next()) {
                    userFound = true;
                    Object[] filas = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }

                if (!userFound) {
                    JOptionPane.showMessageDialog(this, "El permiso no se encuentra en el sistema.", "Permiso no encontrado", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar el permiso: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
cargarDatosTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int Fila = jtPermisos.getSelectedRow();
        if (Fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar el estado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = getConection();
            PreparedStatement ps = conn.prepareStatement("UPDATE `permisos_inasistencias` SET `Estado` = ? WHERE `Codigo` = ?")) {

            ps.setString(1, cbxEstado.getSelectedItem().toString());
            ps.setString(2, txtCodigo.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Estado del permiso actualizado.");
            jtPermisos.setValueAt(cbxEstado.getSelectedItem().toString(), Fila, 3);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el estado del permiso: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed

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
            java.util.logging.Logger.getLogger(Permisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Permisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Permisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Permisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Permisos().setVisible(true);
            }
        });
    }

    
    private void ShowFrame(JFrame frame) {
      frame.setExtendedState(this.MAXIMIZED_BOTH);
        frame.setLocation(0,0);
    
    frame.setVisible(true); // Muestra el frame
    frame.setLocationRelativeTo(null); // Centra el frame en la pantalla
    this.setVisible(false); // Oculta el frame actual
    }
    
    private void cargarDatosTabla() {
     DefaultTableModel modelo = new DefaultTableModel();
        jtPermisos.setModel(modelo);

        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Motivo");
        modelo.addColumn("Solicitud");
        modelo.addColumn("Estado");

        try (Connection con = getConection();
             PreparedStatement ps = con.prepareStatement("SELECT Codigo, Nombre, Motivo, Solicitud, Estado  FROM permisos_inasistencias");
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
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSolicitudes;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTable jtPermisos;
    private javax.swing.JPanel pantalla;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
