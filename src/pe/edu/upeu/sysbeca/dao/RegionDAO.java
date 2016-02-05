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
import javax.swing.JOptionPane;
import pe.edu.upeu.sysbeca.interfaces.RegionInterface;
import pe.edu.upeu.sysbeca.model.Region;
import pe.edu.upeu.sysbeca.util.Conexion;

/**
 *
 * @author alum.fial8
 */
public class RegionDAO implements RegionInterface{
    private Statement st;
    private ResultSet rs;
    private Connection cx;
    private String sql;

    @Override
    public List<Region> listarRegion() {
        List<Region> lista = new ArrayList<>();
        sql = "Select *from region";
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Region r = new Region();
                r.setIdregion(rs.getInt("idregion"));
                r.setNom_region(rs.getString("region"));
                lista.add(r);
            }
        } catch (Exception e) {
            
        }
        return lista;
    }

    @Override
    public int ObtenerIdRegion(String nom) {
     
        sql = "select *from region where region='"+nom+"'";
        int id=0;
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                id = rs.getInt("idregion");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return id;
    }
}
