package core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1/world";
    private static final String USER = "root";
    private static final String PASSWORD = "3VmMWsbo,$9w";

    public static Connection obtenerConexion() {
        try {
            Class.forName(DRIVER_NAME);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void cerrarConexion(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                // e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

    public static void cerrarConsulta(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                // e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }


}
