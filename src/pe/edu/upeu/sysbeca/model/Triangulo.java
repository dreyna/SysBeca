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
public class Triangulo extends Figura{
 private double base;
 private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
 

    @Override
    public double area() {
        return 0.5*base*altura;
        
    }
    
}
