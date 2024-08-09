package Conexion;

/**
 *
 * @author Kenny Londoño
 */
public class conexionMysql12 {
    
    public static void main(String[] args) {
        conexion1 dbc = new conexion1();

        // Obtener detalles de conexión
        final String urlRoot = dbc.getUrlRoot(); // Asegúrate de que esta sea la dirección del servidor
        final String urlPort = dbc.getUrlPort(); // Asegúrate de que esta sea la configuración del puerto
        final String dbUser = dbc.getDbUser();
        final String dbPassword = dbc.getDbPass();
        final String dbBase = dbc.getDbBase();

        // Imprimir detalles de conexión (para depuración)
        System.out.println("---------------------------------------------------");
        System.out.println("| URL: " + "jdbc:mysql://" + urlRoot + ":" + urlPort +
            "/" + dbBase + " |");
        System.out.println("| DBUSER: " + dbUser + " |");
        System.out.println("| DBPASSWORD: " + dbPassword + " |");
        System.out.println("---------------------------------------------------");

        // Establecer conexión
        dbc.conectar(); 

        try {
            if (dbc.con != null) {
                dbc.statement = dbc.con.createStatement();
                dbc.resultSet = dbc.statement.executeQuery("SELECT * FROM personas");
                System.out.println("QUERY FROM [" + dbBase + "] COMMAND {SELECT * FROM personas}");

                while (dbc.resultSet.next()) {
                    // Imprimir la información de la tabla
                    System.out.println(
                        "ID: " + dbc.resultSet.getString("codigo") + "\n" +
                        "NOMBRE: " + dbc.resultSet.getString("nombre") + "\n" +
                        "DOCUMENTO: " + dbc.resultSet.getString("id") + "\n" +
                        "TELEFONO: " + dbc.resultSet.getString("direccion") + "\n" +
                       "EMAIL: " + dbc.resultSet.getString("email") + "\n" +
                        "CARGO: " + dbc.resultSet.getString("cargo") + "\n" +
                        "USUARIO: " + dbc.resultSet.getString("usuario") + "\n" +
                        "CONTRASENA: " + dbc.resultSet.getString("contrasena") + "\n"
                    );
                }
            } else {
                System.err.println("ERROR: La conexión a la base de datos no se ha establecido.");
            }
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        } finally {
            // Cierra los recursos para evitar fugas de memoria
            try {
                if (dbc.resultSet != null) dbc.resultSet.close();
                if (dbc.statement != null) dbc.statement.close();
                if (dbc.con != null) dbc.con.close();
            } catch (Exception e) {
                System.err.println("ERROR al cerrar recursos: " + e);
            }
        }
    }
}
