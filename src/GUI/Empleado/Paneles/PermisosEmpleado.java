/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Empleado.Paneles;

import Conexion.conexion1;
import static GUI.Empleado.MainJFrame.Dashboard.getConection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;



/**
 *
 * @author Kenny Londoño
 */
public class PermisosEmpleado extends javax.swing.JPanel {

    conexion1 bd = new conexion1();
      public static final String URL = "jdbc:mysql://localhost:3306/empresa";
    public static final String USER = "root";
    public static final String PASS = "123456";
    
    PreparedStatement ps;
    ResultSet rs;  
    public PermisosEmpleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtJustificacion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        cbxMotivo = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setBackground(new java.awt.Color(245, 245, 245));
        pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setText("Permisos");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 210, 50));

        txtJustificacion.setBackground(new java.awt.Color(255, 255, 255));
        txtJustificacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtJustificacion.setForeground(new java.awt.Color(204, 204, 204));
        txtJustificacion.setBorder(null);
        txtJustificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJustificacionActionPerformed(evt);
            }
        });
        jPanel2.add(txtJustificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 610, -1));

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
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 80, 160, 40));

        cbxMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Enfermedad", "Asunto Familiar", "Vacaciones" }));
        cbxMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMotivoActionPerformed(evt);
            }
        });
        jPanel2.add(cbxMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 630, 20));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 60, 630));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Selecciona el motivo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Justificación");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Ingresa tu Codigo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, -1));

        pantalla.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1270, 620));

        add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void txtJustificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJustificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJustificacionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("Update permisos_inasistencias SET Motivo=?, Solicitud=? where Id");

            ps.setString(1, cbxMotivo.getSelectedItem().toString());
            ps.setString(2, txtJustificacion.getText());
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Permiso Guardado");
                borrar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar el Permiso");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Guardar el Permiso: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMotivoActionPerformed

private void borrar(){
 cbxMotivo.setSelectedIndex(0);
 txtJustificacion.setText(null);
 
;


}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxMotivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel pantalla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtJustificacion;
    // End of variables declaration//GEN-END:variables
}
