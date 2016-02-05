/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.sysbeca.model;

/**
 *
 * @author alum.fial8
 */
public class Distrito {
    private int iddistrito;
    private int idregion;
    private String nom_distrito;

    public Distrito() {
    }

    public Distrito(int idregion, String nom_distrito) {
        this.idregion = idregion;
        this.nom_distrito= nom_distrito;
    }

    public int getIddistrito() {
        return iddistrito;
    }

    public void setIddistrito(int iddistrito) {
        this.iddistrito = iddistrito;
    }

    public int getIdregion() {
        return idregion;
    }

    public void setIdregion(int idregion) {
        this.idregion = idregion;
    }

    public String getNom_distrito() {
        return nom_distrito;
    }

    public void setNom_distrito(String nom_distrito) {
        this.nom_distrito = nom_distrito;
    }
    
}
