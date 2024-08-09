
package GUI.Administrador.Paneles;

import static GUI.Main.InicioSesion.PASS;
import static GUI.Main.InicioSesion.URL;
import static GUI.Main.InicioSesion.USER;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
/**
 *
 * @author Kenny Londoño
 */
public class ModificarHorario extends javax.swing.JPanel {

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
         DefaultTableModel modelo = new DefaultTableModel();
        jtEmpleados.setModel(modelo);

        modelo.addColumn("Id");
        modelo.addColumn("Jornada");
        modelo.addColumn("Jornada Mañana");
        modelo.addColumn("Jornada Tarde");
         modelo.addColumn("Dias Laborados");
        

        // Cargar datos en la tabla
        try (Connection con = getConection();
             PreparedStatement ps = con.prepareStatement("SELECT `Id`, `Jornada`, `Jornada_Manana`, `Jornada_Tarde`, `Dias_Laborados` FROM `empleado1`");
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
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxJornada = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        content.add(txtJManana, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 200, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 128, 187));
        jLabel1.setText("Horario Jornada Mañana");
        content.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 128, 187));
        jLabel3.setText("Horario Jornada Tarde");
        content.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 180, -1));

        txtJTarde.setBackground(new java.awt.Color(255, 255, 255));
        txtJTarde.setBorder(null);
        content.add(txtJTarde, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 128, 187));
        jLabel4.setText("Jornada");
        content.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 60, -1));

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
        content.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 130, 40));

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

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setBorder(null);
        content.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(53, 128, 187));
        jLabel5.setText("Id");
        content.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 60, -1));

        cbxJornada.setBackground(new java.awt.Color(255, 255, 255));
        cbxJornada.setForeground(new java.awt.Color(204, 204, 204));
        cbxJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar ", "Mañana", "Tarde", "Mixta" }));
        content.add(cbxJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 120, -1));
        content.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 110, 30));
        content.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 200, 30));
        content.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 200, 30));

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 128, 187));
        jLabel2.setText("Dias a Laborar");
        content.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 450, -1));

        txtDias.setBackground(new java.awt.Color(255, 255, 255));
        txtDias.setBorder(null);
        content.add(txtDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 510, -1));
        content.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 510, 30));

        pantalla.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1320, 620));

        add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
   int fila = jtEmpleados.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtId.getText().isEmpty() ||txtId.getText().isEmpty()|| txtJManana.getText().isEmpty() || txtJTarde.getText().isEmpty() || cbxJornada.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = getConection();
             PreparedStatement ps = conn.prepareStatement("UPDATE control_horario SET Jornada = ?, Jornada_Manana = ?, Jornada_Tarde = ? Dias_Laborados=? WHERE Id = ?")) {

              ps.setString(1, txtId.getText());
            ps.setString(2, cbxJornada.getSelectedItem().toString());
            ps.setString(3, txtJManana.getText());
            ps.setString(4, txtJTarde.getText());
            ps.setString(5, txtDias.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Horario Modificado");

            
             jtEmpleados.setValueAt(txtId.getText(), fila, 1);
            jtEmpleados.setValueAt(cbxJornada.getSelectedItem().toString(), fila, 2);
            jtEmpleados.setValueAt(txtJManana.getText(), fila, 3);
            jtEmpleados.setValueAt(txtJTarde.getText(), fila, 4);
            jtEmpleados.setValueAt(txtDias.getText(), fila, 5);
             

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al Modificar Horarios: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String campo = txtId.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "WHERE Id = ?";
        }

        DefaultTableModel modelo = (DefaultTableModel) jtEmpleados.getModel();
        modelo.setRowCount(0);

        try (Connection con = getConection();
             PreparedStatement ps = con.prepareStatement("SELECT Id, Jornada, Jornada_Manana, Jornada_Tarde, Dias_Laborados FROM control_horario " + where)) {

            if (!"".equals(campo)) {
                ps.setString(1, campo);
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Object[] fila = new Object[5];
                    fila[0] = rs.getString("Id");
                  String jornada = rs.getString("Jornada");
        fila[1] = (jornada != null) ? jornada : "";
                    fila[2] = rs.getString("Jornada_Manana");
                    fila[3] = rs.getString("Jornada_Tarde");
                    fila[4] = rs.getString("Dias_Laborados");
                    modelo.addRow(fila);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar los datos del horario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   cargarTabla();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    private void cargarTabla(){
      DefaultTableModel modelo = new DefaultTableModel();
        jtEmpleados.setModel(modelo);

        modelo.addColumn("Id");
        modelo.addColumn("Jornada");
        modelo.addColumn("Jornada Mañana");
        modelo.addColumn("Jornada Tarde");
         modelo.addColumn("Dias Laborados");
        

        // Cargar datos en la tabla
        try (Connection con = getConection();
             PreparedStatement ps = con.prepareStatement("SELECT `Id`, `Jornada`, `Jornada_Manana`, `Jornada_Tarde`, `Dias_Laborados` FROM `empleado1`");
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
            System.err.println("Error al cargar datos: " + e.getMessage());}
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbxJornada;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jtEmpleados;
    private javax.swing.JPanel pantalla;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJManana;
    private javax.swing.JTextField txtJTarde;
    // End of variables declaration//GEN-END:variables
}
