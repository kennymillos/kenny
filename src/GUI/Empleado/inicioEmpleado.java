package GUI.Empleado;





import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Kenny Londoño
 */
public class inicioEmpleado extends javax.swing.JFrame {

     public static final String URL = "jdbc:mysql://localhost:3306/empresa";
    public static final String USER = "root";
    public static final String PASS = "123456";
    
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

  public inicioEmpleado() {

        this.setExtendedState(this.MAXIMIZED_BOTH); 
       initComponents();
         DefaultTableModel modelo = new DefaultTableModel();
        jtEmpleados.setModel(modelo);

        modelo.addColumn("Codigo");
        modelo.addColumn("Jornada M");
        modelo.addColumn("Jornada T");
        modelo.addColumn("Entrada M");
        modelo.addColumn("Salida M");
        modelo.addColumn("Jornada T");
        modelo.addColumn("Entrada T");
        modelo.addColumn("Salida T");
         modelo.addColumn("Horas Laboradas");
        modelo.addColumn("Horas Extras");

        try (Connection con = getConection();
             PreparedStatement ps = con.prepareStatement("SELECT Codigo, Jornada_M, Entrada_M, Salida_M, Entrada_T, Salida_T, Horas_laboradas, Horas_Extras FROM Control_Horario");
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

        jPanel1 = new javax.swing.JPanel();
        pantalla = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEntrada_T = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleados = new javax.swing.JTable();
        txtSalida_T = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGuardar = new javax.swing.JButton();
        txtEntrada_M = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSalida_M = new javax.swing.JTextField();
        txtGuardar1 = new javax.swing.JButton();
        btnSolicitudes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setBackground(new java.awt.Color(255, 255, 255));
        pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Hora de Entrada");
        pantalla.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 210, -1));
        pantalla.add(txtEntrada_T, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 220, -1));

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

        pantalla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 860, 300));
        pantalla.add(txtSalida_T, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Hora de Salida");
        pantalla.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 210, -1));

        txtGuardar.setText("Guardar");
        txtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardarActionPerformed(evt);
            }
        });
        pantalla.add(txtGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, -1, -1));

        txtEntrada_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntrada_MActionPerformed(evt);
            }
        });
        pantalla.add(txtEntrada_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 220, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Hora de Entrada");
        pantalla.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 210, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Hora de Salida");
        pantalla.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 210, -1));
        pantalla.add(txtSalida_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 210, -1));

        txtGuardar1.setText("Guardar");
        pantalla.add(txtGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, -1, -1));

        jPanel1.add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 1320, 660));

        btnSolicitudes.setText("Solitudes");
        btnSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudesActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 60));

        jButton2.setText("Cerrar Sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 260, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("HOLA! ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1148, 26, 330, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("KENCLOCK");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, -1));

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

    private void btnSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudesActionPerformed
       
    }//GEN-LAST:event_btnSolicitudesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      System.exit(0); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardarActionPerformed
       
    }//GEN-LAST:event_txtGuardarActionPerformed

    private void txtEntrada_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntrada_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntrada_MActionPerformed

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
            java.util.logging.Logger.getLogger(inicioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioEmpleado().setVisible(true);
            }
        });
    }

    private void ShowPanel(JFrame p){
        p.setSize(1320,660);
        p.setLocation(0,0);
        
        pantalla.removeAll();
        pantalla.add(p.getContentPane(), BorderLayout.CENTER);
        pantalla.revalidate();
        pantalla.repaint();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSolicitudes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEmpleados;
    private javax.swing.JPanel pantalla;
    private javax.swing.JTextField txtEntrada_M;
    private javax.swing.JTextField txtEntrada_T;
    private javax.swing.JButton txtGuardar;
    private javax.swing.JButton txtGuardar1;
    private javax.swing.JTextField txtSalida_M;
    private javax.swing.JTextField txtSalida_T;
    // End of variables declaration//GEN-END:variables
}
