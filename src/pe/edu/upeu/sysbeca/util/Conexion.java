/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.sysbeca.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alum.fial8
 */
public class Conexion {
    private static final String url="jdbc:mysql://localhost:3306/bd_almacen"; 
    private static final String driver="com.mysql.jdbc.Driver"; 
    private static final String user="root"; 
    private static final String clave="root";
    private static Connection cx=null;
    
    
    public static Connection getConexion(){
        try {
            Class.forName(driver);
            if(cx==null){
                cx = DriverManager.getConnection(url, user, clave);            
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    return cx;
    }
}
