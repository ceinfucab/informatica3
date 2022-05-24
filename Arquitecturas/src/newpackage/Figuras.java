/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author DELL
 */
public abstract class Figuras {
    
    protected String codigo;
    protected String nombre;
    protected String color;
    protected double area;
    protected double base;
    protected double altura;
    protected double perimetro;
    protected double lado;
   
    public double calculoPerimetro(){
    perimetro = 2*lado+base;
    return perimetro;
        
    }
    
    public double calculoArea(){
    
    return area;
        
    }
    
    
    }
    
    

