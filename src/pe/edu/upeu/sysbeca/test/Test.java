/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.sysbeca.test;

import java.awt.Rectangle;
import pe.edu.upeu.sysbeca.model.Alumno;
import pe.edu.upeu.sysbeca.model.Rectangulo;
import pe.edu.upeu.sysbeca.model.Triangulo;

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
        calcular_area();
    }
    public static void registrar(){
    Alumno a = new Alumno("Cesar", "Malaspina", "5465575", "Alameda");
    
        System.out.println("Nombres:" +a.getNombres());
        System.out.println("Apellidos:" +a.getApellidos());
        System.out.println("Telefono:" +a.getTelefono());
        System.out.println("Direccion:" +a.getDireccion());
        
    }
    public static void calcular_area(){
        Rectangulo r = new Rectangulo(10, 5);
        Triangulo t = new Triangulo(2, 15);
        double r1, t1;
        r1 = r.area();
        t1 = t.area();
        System.out.println("El area del rectangulo es: "+ r1);
        System.out.println("El area del Triangulo es: "+ t1);
    }
    
}
