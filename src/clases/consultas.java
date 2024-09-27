/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class consultas {

    // Método para guardar un usuario en la base de datos
    public void guardarUsuario(String user, String password) {
        ConexionDB d = new ConexionDB();
        Connection conexion = null;
        Statement st = null;

        String sql = "INSERT INTO usuarios(user, password) VALUES (?, ?)";

        try {
            conexion = d.conectar();  // Obtener conexión
            if (conexion != null) {
                st = conexion.createStatement();
                PreparedStatement pst = conexion.prepareStatement(sql);
                pst.setString(1, user);
                pst.setString(2, password);
                int rs = pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario: " + e.getMessage());
        } finally {
            // Cerrar el Statement y la conexión
            try {
                if (st != null) st.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para consultar un usuario en la base de datos
    public void consultarUsuario(String user, String password) {
        ConexionDB d = new ConexionDB();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        String sql = "SELECT user, password FROM usuarios WHERE user = ? AND password = ?";

        try {
            cn = d.conectar();  // Obtener conexión
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1, user);
                pst.setString(2, password);

                rs = pst.executeQuery();

                if (rs.next()) {
                    String userCorrecto = rs.getString("user");
                    String passwordCorrecto = rs.getString("password");

                if (user.equals(userCorrecto) && password.equals(passwordCorrecto)) {
                    JOptionPane.showMessageDialog(null, "Bienvenid@ " + user);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
} else {
    // Caso en el que no se encontró ningún registro
    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
}
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar el usuario: " + e.getMessage());
        } finally {
            // Cerrar ResultSet, PreparedStatement y conexión
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // Método para obtener la contraseña de un usuario en la base de datos
public String obtenerContraseñaPorUsuario(String user) {
    ConexionDB d = new ConexionDB();
    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String contraseña = null;

    String sql = "SELECT password FROM usuarios WHERE user = ?";

    try {
        cn = d.conectar();  // Obtener conexión
        if (cn != null) {
            pst = cn.prepareStatement(sql);
            pst.setString(1, user);

            rs = pst.executeQuery();

            if (rs.next()) {
                contraseña = rs.getString("password");
            } else {
                // Enviar un mensaje informando que el usuario no se encontró
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        }
    } catch (SQLException e) {
        // Enviar un mensaje de error en caso de excepción
        JOptionPane.showMessageDialog(null, "Error al obtener la contraseña: " + e.getMessage());
    } finally {
        // Cerrar ResultSet, PreparedStatement y conexión
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (cn != null) cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return contraseña; // Retorna la contraseña o null si no se encuentra el usuario
}
// Método para verificar si un usuario ya existe en la base de datos
    public boolean usuarioExiste(String user) {
        ConexionDB d = new ConexionDB();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean existe = false;

        String sql = "SELECT user FROM usuarios WHERE user = ?";

        try {
            cn = d.conectar();  // Obtener conexión
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1, user);
                rs = pst.executeQuery();

                // Si el resultado tiene al menos una fila, el usuario existe
                existe = rs.next();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar el usuario: " + e.getMessage());
        } finally {
            // Cerrar ResultSet, PreparedStatement y conexión
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return existe;
    }

}

