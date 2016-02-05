/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.sysbeca.test;

import pe.edu.upeu.sysbeca.model.Alumno;

/**
 *
 * @author alum.fial8
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        registrar();
    }
    public static void registrar(){
    Alumno a = new Alumno("Cesar", "Malaspina", "5465575", "Alameda");
    
        System.out.println("Nombres:" +a.getNombres());
        System.out.println("Apellidos:" +a.getApellidos());
        System.out.println("Telefono:" +a.getTelefono());
        System.out.println("Direccion:" +a.getDireccion());
        
    }
}
