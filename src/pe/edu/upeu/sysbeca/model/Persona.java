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
public class Persona {
    private String nombres;
    private String Apellidos;

    public Persona(String nombres, String Apellidos) {
        this.nombres = nombres;
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
}
