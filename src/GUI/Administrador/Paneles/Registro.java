
package GUI.Administrador.Paneles;


import static GUI.Main.InicioSesion.PASS;
import static GUI.Main.InicioSesion.URL;
import static GUI.Main.InicioSesion.USER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;


/**
 *
 * @author Kenny Londoño
 */
public class Registro extends javax.swing.JPanel {
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
     
    public Registro() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JPanel();
        pantalla2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNacimiento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setBackground(new java.awt.Color(245, 245, 245));
        pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla2.setBackground(new java.awt.Color(255, 255, 255));
        pantalla2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 128, 178));
        jLabel1.setText("Id");
        pantalla2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setBorder(null);
        pantalla2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 128, 178));
        jLabel4.setText("N° Documento");
        pantalla2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 110, 20));

        txtDocumento.setBackground(new java.awt.Color(255, 255, 255));
        txtDocumento.setBorder(null);
        pantalla2.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 180, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        pantalla2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 420, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 128, 178));
        jLabel5.setText("Nombre");
        pantalla2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 90, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 128, 178));
        jLabel3.setText("Direccion");
        pantalla2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(null);
        pantalla2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 420, -1));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        pantalla2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 420, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(55, 128, 178));
        jLabel11.setText("Telefono");
        pantalla2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(55, 128, 178));
        jLabel6.setText("Email");
        pantalla2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 60, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        pantalla2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 420, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(55, 128, 178));
        jLabel7.setText("Nacimiento");
        pantalla2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        txtNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtNacimiento.setBorder(null);
        pantalla2.add(txtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 420, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(55, 128, 178));
        jLabel10.setText("Genero");
        pantalla2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        cbxGenero.setBackground(new java.awt.Color(255, 255, 255));
        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        pantalla2.add(cbxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 150, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(55, 128, 178));
        jLabel8.setText("Cargo");
        pantalla2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 80, -1));

        cbxCargo.setBackground(new java.awt.Color(255, 255, 255));
        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Supervisor(Administrador)", "Empleado" }));
        pantalla2.add(cbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
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
        pantalla2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 210, 60));

        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        pantalla2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 210, 60));

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pantalla2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 140, 210, 60));

        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnMenus.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        pantalla2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, 210, 60));

        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
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
        pantalla2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 280, 210, 60));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(55, 128, 178));
        jLabel9.setText("Contraseña");
        pantalla2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 90, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(55, 128, 178));
        jLabel12.setText("Usuario");
        pantalla2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 90, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        pantalla2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 280, -1));

        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setBorder(null);
        pantalla2.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 280, -1));
        pantalla2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 180, 20));
        pantalla2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 420, 20));
        pantalla2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, 20));
        pantalla2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 420, 20));
        pantalla2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 420, 20));
        pantalla2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 280, 20));
        pantalla2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 420, 20));
        pantalla2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 420, 20));
        pantalla2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 280, 20));

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pantalla2.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 90, 630));

        pantalla.add(pantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1320, 620));

        add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
   Connection con = null;
       
    try {
       
        con = getConection();

        
        ps = con.prepareStatement("SELECT * FROM personas WHERE Id = ?");
        ps.setString(1, txtId.getText());

       
        rs = ps.executeQuery();

        if (rs.next()) {
            
            txtId.setText(rs.getString("id"));
            txtNombre.setText(rs.getString("nombre"));
            txtDireccion.setText(rs.getString("direccion"));
            txtTelefono.setText(rs.getString("telefono"));
            txtEmail.setText(rs.getString("email"));
            txtNacimiento.setText(rs.getString("nacimiento"));
            cbxGenero.setSelectedItem(rs.getString("genero"));
            cbxCargo.setSelectedItem(rs.getString("cargo"));
            txtUsuario.setText(rs.getString("usuario"));
            txtContrasena.setText(rs.getString("contrasena"));
            
        } else {
           
            JOptionPane.showMessageDialog(this, "No existe usuario con esa Id", "Usuario no encontrado", JOptionPane.INFORMATION_MESSAGE);
            borrar(); 
        }
    } catch (SQLException e) {
        
        JOptionPane.showMessageDialog(this, "Error al buscar el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } finally {
        
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar recursos: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      borrar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      Connection con = null;
   
    
    try {
       
        int confirmation = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este usuario?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.YES_OPTION) {
            // Obtener la conexión
            con = getConection();

           
            ps = con.prepareStatement("DELETE FROM personas WHERE Id = ?");
            ps.setString(1, txtId.getText());

          
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
               
                JOptionPane.showMessageDialog(this, "Usuario eliminado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                borrar(); 
                btnEliminar.setEnabled(false); 
            } else {
               
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el usuario. Verifica que la ID sea correcta.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
    
        JOptionPane.showMessageDialog(this, "Error al eliminar el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } finally {
        
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar recursos: " + e.getMessage());
        }}
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Connection con=null;
        try{
            con = getConection();
            ps=con.prepareStatement("UPDATE personas SET Id=?, Nombre=?,Documento=?, Direccion=?,Telefono=?,Email=?, Nacimiento=?,Genero=?, Cargo=?,Usuario=?,Contrasena=? WHERE Id=?");

            ps.setString(1, txtId.getText());
            ps.setString(2,txtDocumento.getText());
            ps.setString(3,txtNombre.getText());
            ps.setString(4,txtDocumento.getText());
            ps.setString(5,txtDireccion.getText());
            ps.setString(6,txtTelefono.getText());
            ps.setString(7,txtEmail.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date parsedDate;
            try {
                parsedDate = dateFormat.parse(txtNacimiento.getText());
                ps.setDate(8, new java.sql.Date(parsedDate.getTime()));
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Fecha inválida. Use el formato yyyy-MM-dd.");
                return; // Salir del método si la fecha es inválida
            }
            ps.setString(9,cbxGenero.getSelectedItem().toString());
            ps.setString(10,cbxCargo.getSelectedItem().toString());
            ps.setString(11,txtUsuario.getText());
            ps.setString(12,txtContrasena.getText());
            

            int res =ps.executeUpdate();

           if(res>0){
                JOptionPane.showMessageDialog(null, "persona modificada");
              borrar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar persona");
             borrar();
            }
            con.close();

        }catch(Exception e){
           System.err.println(e);

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Connection con=null;
        try{
            con = getConection();
            ps=con.prepareStatement("INSERT INTO personas (Id, Nombre,NDocumento, Direccion,Telefono,Email, Nacimiento,Genero, Cargo,Usuario,Contrasena ) VALUES (?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1,txtId.getText());
            ps.setString(2,txtNombre.getText());
            ps.setString(3,txtDocumento.getText());
            ps.setString(4,txtDireccion.getText());
            ps.setString(5,txtTelefono.getText());
            ps.setString(6,txtEmail.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date parsedDate;
            try {
                parsedDate = dateFormat.parse(txtNacimiento.getText());
                ps.setDate(7, new java.sql.Date(parsedDate.getTime()));
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Fecha inválida. Use el formato yyyy-MM-dd.");
                return;
            }
            ps.setString(8,cbxGenero.getSelectedItem().toString());
            ps.setString(9,cbxCargo.getSelectedItem().toString());
            ps.setString(10,txtUsuario.getText());
            ps.setString(11,txtContrasena.getText());

            int res =ps.executeUpdate();

            if(res>0){
                JOptionPane.showMessageDialog(null, "persona guardada");
              borrar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar persona");
               borrar();
            }
            con.close();

        }catch(Exception e){
            System.err.println(e);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void borrar(){
        
    txtId.setText(null);
   txtDocumento.setText(null);
   txtNombre.setText(null);
   txtDocumento.setText(null);
   txtDireccion.setText(null);
   txtTelefono.setText(null);
   txtEmail.setText(null);
   txtNacimiento.setText(null);
   cbxGenero.setSelectedIndex(0);
   cbxCargo.setSelectedIndex(0);
   txtUsuario.setText(null);
  txtContrasena.setText(null);
    }
    
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel pantalla;
    private javax.swing.JPanel pantalla2;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
