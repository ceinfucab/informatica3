/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author DELL
 */
public class Jefes extends Persona{
 
    public Jefes(String codigo, String nombre, String direccion, int telefono) {
        super(codigo, nombre, direccion, telefono);
    }

     
   @Override
   public String mostrarDatos(){
        return "Codigo: "+codigo+"Nombre: "+nombre+"direccion: "+direccion+"telefono"+telefono;
    }
    
    
    
}
