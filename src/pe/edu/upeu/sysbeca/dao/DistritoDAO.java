/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.sysbeca.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.sysbeca.interfaces.DistritoInterface;
import pe.edu.upeu.sysbeca.model.Distrito;
import pe.edu.upeu.sysbeca.model.Region;
import pe.edu.upeu.sysbeca.util.Conexion;

/**
 *
 * @author alum.fial8
 */
public class DistritoDAO implements DistritoInterface{
    private Statement st;
    private ResultSet rs;
    private Connection cx;
    private String sql;

    @Override
    public List<Distrito> listarDistrito() {
        List<Distrito> lista = new ArrayList<>();
        sql = "select *from distrito";
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Distrito d = new Distrito();
                d.setIddistrito(rs.getInt("iddistrito"));
                d.setIdregion(rs.getInt("idregion"));
                d.setNom_distrito(rs.getString("distrito"));
                lista.add(d);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public boolean registrarDistrito(Distrito d) {
        boolean op= false;
        sql = "INSERT INTO  distrito (iddistrito,idregion ,distrito)VALUES (null,"
          +d.getIdregion()+",'"+d.getNom_distrito()+"')";
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
           int a = st.executeUpdate(sql);
           if(a>0){
               op = true;
           }
        } catch (Exception e) {
        }
       return op;
    }
    
}
