/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad1;

/**
 *
 * @author alejandrocruz
 */
public class Punto3D extends Punto2D{
    private double z;
    
    Punto3D(double x ,double z,double y){  
        setX(x);
        setY(y);
        this.z = z;
    }
}
