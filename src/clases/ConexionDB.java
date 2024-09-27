package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
public class ConexionDB {
    // Declaramos la conexión a MySQL
    public static Connection con;
    
    // Declaramos los datos de conexión a la BD
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "Amezquita12$";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/humanresourcesdba?useSSL=false&serverTimezone=UTC";

    // Función que va a conectarse a mi BD de MySQL
    public Connection conectar() {
        con = null;
        try {
            // Cargar el driver
            Class.forName(DRIVER);

            // Establecer la conexión
            con = DriverManager.getConnection(URL, USER, PASS);

            if (con != null) {
                System.out.println("Conexión exitosa.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Driver no encontrado: " + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
        }
        return con;
    }
}
