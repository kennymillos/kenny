
package GUI.Empleado;



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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;


/**
 *
 * @author Kenny Londoño
 */
public class LegadaEmpleado extends javax.swing.JFrame {
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
    
    public LegadaEmpleado() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);

        
         DefaultTableModel modelo = new DefaultTableModel();
        jtHorario.setModel(modelo);

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Entrada_M");
        modelo.addColumn("Salida_M");
        modelo.addColumn("Entrada_T");
        modelo.addColumn("Salida_T");
        modelo.addColumn("Fecha");
        

        try (Connection con = getConection();
             PreparedStatement ps = con.prepareStatement("SELECT `Id`, `Nombre`, `Entrada_M`, `Salida_M`, `Entrada_T`, `Salida_T`, `Fecha` FROM `empleado1` ");
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

    private void limpiar(){
   
       txtEnM.setText(null);
        txtSaM.setText(null);
      txtEnT.setText(null);
      txtSaT.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pantalla = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHorario = new javax.swing.JTable();
        txtEnM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEnT = new javax.swing.JTextField();
        BtnModificar = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSaM = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        txtSaT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BtnModificar1 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtHorario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtHorario);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 800, 70));

        txtEnM.setBackground(new java.awt.Color(255, 255, 255));
        txtEnM.setBorder(null);
        txtEnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnMActionPerformed(evt);
            }
        });
        jPanel2.add(txtEnM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 200, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 128, 187));
        jLabel1.setText("Horario Jornada Mañana");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 128, 187));
        jLabel3.setText("Horario Jornada Tarde");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 180, -1));

        txtEnT.setBackground(new java.awt.Color(255, 255, 255));
        txtEnT.setBorder(null);
        jPanel2.add(txtEnT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 180, -1));

        BtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        BtnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BtnIniciarSesion.png"))); // NOI18N
        BtnModificar.setText("Guardar");
        BtnModificar.setContentAreaFilled(false);
        BtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 130, 40));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 200, 30));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 190, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Entrada");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 60, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Salida");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 50, 20));

        txtSaM.setBackground(new java.awt.Color(255, 255, 255));
        txtSaM.setBorder(null);
        txtSaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaMActionPerformed(evt);
            }
        });
        jPanel2.add(txtSaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 200, -1));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 200, 30));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 200, 30));

        txtSaT.setBackground(new java.awt.Color(255, 255, 255));
        txtSaT.setBorder(null);
        txtSaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaTActionPerformed(evt);
            }
        });
        jPanel2.add(txtSaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 200, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Entrada");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 60, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Salida");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 60, 20));

        BtnModificar1.setBackground(new java.awt.Color(255, 255, 255));
        BtnModificar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnModificar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BtnIniciarSesion.png"))); // NOI18N
        BtnModificar1.setText("Guardar");
        BtnModificar1.setContentAreaFilled(false);
        BtnModificar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModificar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        BtnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificar1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 130, 40));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BtnIniciarSesion.png"))); // NOI18N
        btnActualizar.setText("Actualizar Tabla");
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, 180, 40));

        pantalla.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1320, 620));

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
       Registro regAdm = new Registro();
       
       ShowFrame(regAdm);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudesActionPerformed
        Permisos soliAdm = new Permisos();
       
       ShowFrame(soliAdm);
    }//GEN-LAST:event_btnSolicitudesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         LegadaEmpleado empAdm = new LegadaEmpleado();
       
       ShowFrame(empAdm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      System.exit(0); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnMActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
       int Fila = jtHorario.getSelectedRow();
    if (Fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (txtEnM.getText().isEmpty() || txtSaM.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conn = getConection();
         PreparedStatement ps = conn.prepareStatement("UPDATE empleado1 SET Entrada_M = ?, Salida_M = ? WHERE Id")) {

        
        ps.setString(1, txtEnM.getText());
        ps.setString(2, txtSaM.getText());
      

        ps.executeUpdate();

        JOptionPane.showMessageDialog(this, "Horas Ingresada Correctamente");

       
        jtHorario.setValueAt(txtEnM.getText(), Fila, 3);
        jtHorario.setValueAt(txtSaM.getText(), Fila, 4);

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al Ingresar Horas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void txtSaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaMActionPerformed

    private void txtSaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaTActionPerformed

    private void BtnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificar1ActionPerformed
 int Fila = jtHorario.getSelectedRow();
    if (Fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (txtEnT.getText().isEmpty() || txtSaT.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conn = getConection();
         PreparedStatement ps = conn.prepareStatement("UPDATE empleado1 SET Entrada_T = ?, Salida_T = ? WHERE Id")) {

        
        ps.setString(1, txtEnT.getText());
        ps.setString(2, txtSaT.getText());
      

        ps.executeUpdate();

        JOptionPane.showMessageDialog(this, "Horas Ingresada Correctamente");

       
        jtHorario.setValueAt(txtEnT.getText(), Fila, 5);
        jtHorario.setValueAt(txtSaT.getText(), Fila, 6);

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al Ingresar Horas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }      
    }//GEN-LAST:event_BtnModificar1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ActualizarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

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
                new LegadaEmpleado().setVisible(true);
            }
        });
    }

   private void ShowFrame(JFrame frame) {
         frame.setSize(1320,660);
        frame.setLocation(0,0);
    
    frame.setVisible(true); // Muestra el frame
    frame.setLocationRelativeTo(null); // Centra el frame en la pantalla
    this.setVisible(false); // Oculta el frame actual
    }
    
    private void ActualizarTabla(){
     DefaultTableModel modelo = new DefaultTableModel();
        jtHorario.setModel(modelo);

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Entrada_M");
        modelo.addColumn("Salida_M");
        modelo.addColumn("Entrada_T");
        modelo.addColumn("Salida_T");
        modelo.addColumn("Fecha");
        

        try (Connection con = getConection();
             PreparedStatement ps = con.prepareStatement("SELECT `Id`, `Nombre`, `Entrada_M`, `Salida_M`, `Entrada_T`, `Salida_T`, `Fecha` FROM `empleado1` ");
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
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnModificar1;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSolicitudes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jtHorario;
    private javax.swing.JPanel pantalla;
    private javax.swing.JTextField txtEnM;
    private javax.swing.JTextField txtEnT;
    private javax.swing.JTextField txtSaM;
    private javax.swing.JTextField txtSaT;
    // End of variables declaration//GEN-END:variables
}
