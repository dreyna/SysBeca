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
public class Alumno extends Persona{
    private String telefono;
    private String direccion;

    public Alumno(String nombres, String Apellidos, String telefono, String direccion) {
        super(nombres, Apellidos);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

   
    
}
