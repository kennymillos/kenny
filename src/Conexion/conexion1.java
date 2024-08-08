package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion1 {

    final private String urlRoot = "localhost";
    final private String dbBase = "empresa";
    final private String urlPort = "jdbc:mysql://localhost:3306/" + dbBase;
    final private String dbUser = "root";
    final private String dbPass = "123456";
    public Connection con = null;
    public ResultSet resultSet;
    public Statement statement;
    
    public String getUrlRoot() {
        return urlRoot;
    }

    public String getDbBase() {
        return dbBase;
    }

    public String getUrlPort() {
        return urlPort;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public Statement getStatement() {
        return statement;
    }
    
    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.urlPort, this.dbUser, this.dbPass);
            statement = con.createStatement(); // Inicializa el Statement aquí
        } catch (SQLException e) {
            System.err.println("Error de SQL: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getCon() {
        return con;
    }
}
