/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.sysbeca.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import pe.edu.upeu.sysbeca.interfaces.UsuarioInterface;
import pe.edu.upeu.sysbeca.util.Conexion;

/**
 *
 * @author alum.fial8
 */
public class UsuarioDao implements UsuarioInterface {
    Connection cx;
    Statement statement;
    String sql;
    ResultSet rs;
    
    @Override
    public boolean autentificarUsuario(String user, String clave) {
        boolean op=false;
        sql ="select *from usuario where usuario='"+user+"' and clave='"+clave+"'";
        try {
            cx = Conexion.getConexion();
            statement = cx.createStatement();
            rs = statement.executeQuery(sql);
            while(rs.next()){
                op = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return op;
    }
    
}
