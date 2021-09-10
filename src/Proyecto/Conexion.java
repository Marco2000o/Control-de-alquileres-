/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private static java.sql.Connection conexion;

    public Conexion() throws ClassNotFoundException {
    String url = "jdbc:sqlserver://HOST\\SQLEXPRESS:1433;databaseName=;"
                    + "user = ;"
                    + "password= ;"
                    + "loginTimeout=30;";
        try {
            conexion = DriverManager.getConnection(url);
            if (conexion != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException e) {
            System.out.println("Ocurrio un error" + e.getMessage());
        }
    }

    public Connection getConnection() {
        return conexion;

    }
    public int Login(String User, String Pass){
    Integer resultado = 0;
        try {
            Statement ejecutor = conexion.createStatement();
            ResultSet rs = ejecutor.executeQuery("SELECT * FROM OPENQUERY(SQL, 'SELECT * FROM admin.usuarios') WHERE (usuario = '"+User+"' and contra  = '"+Pass+"')");
            if (rs.next()) {
                 JOptionPane.showMessageDialog(null, "Bienvenido");
              resultado = 1;
            }else {
            JOptionPane.showMessageDialog(null, "Error");
            resultado = 0;
            }
        } catch (Exception e) {
        }
    return resultado;
    }

  
}
