/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Administrador.Paneles;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kris
 */
public class Permisos extends javax.swing.JPanel {

    /**
     * Creates new form Permisos1
     */
    public Permisos() {
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

        setMaximumSize(new java.awt.Dimension(1360, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 670));
    }// </editor-fold>//GEN-END:initComponents

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

//        try (Connection con = getConection();
//            PreparedStatement ps = con.prepareStatement("SELECT Codigo, Nombre, Motivo, Solicitud, Estado FROM permisos_inasistencias " + where)) {
//
//            if (!"".equals(campo)) {
//                ps.setString(1, campo);
//            }
//
//            try (ResultSet rs = ps.executeQuery()) {
//                int cantidadColumnas = rs.getMetaData().getColumnCount();
//
//                boolean userFound = false;
//                while (rs.next()) {
//                    userFound = true;
//                    Object[] filas = new Object[cantidadColumnas];
//                    for (int i = 0; i < cantidadColumnas; i++) {
//                        filas[i] = rs.getObject(i + 1);
//                    }
//                    modelo.addRow(filas);
//                }
//
//                if (!userFound) {
//                    JOptionPane.showMessageDialog(this, "El permiso no se encuentra en el sistema.", "Permiso no encontrado", JOptionPane.INFORMATION_MESSAGE);
//                }
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(this, "Error al buscar el permiso: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//            ex.printStackTrace();
//        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //cargarDatosTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
//        int Fila = jtPermisos.getSelectedRow();
//        if (Fila == -1) {
//            JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar el estado.", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        try (Connection conn = getConection();
//            PreparedStatement ps = conn.prepareStatement("UPDATE `permisos_inasistencias` SET `Estado` = ? WHERE `Codigo` = ?")) {
//
//            ps.setString(1, cbxEstado.getSelectedItem().toString());
//            ps.setString(2, txtCodigo.getText());
//
//            ps.executeUpdate();
//
//            JOptionPane.showMessageDialog(this, "Estado del permiso actualizado.");
//            jtPermisos.setValueAt(cbxEstado.getSelectedItem().toString(), Fila, 3);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(this, "Error al actualizar el estado del permiso: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//            System.out.println(ex.getMessage());
//        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jtPermisos;
    private javax.swing.JPanel pantalla;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
